package com.google.googlex.gcam.hdrplus;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.BlackLevelPattern;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OisSample;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import com.google.googlex.gcam.AeMetadata;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.AwbMetadata;
import com.google.googlex.gcam.DngColorCalibration;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.DngNoiseModel;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GeometricCalibration;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.LiveHdrMetadata;
import com.google.googlex.gcam.MeshTranslation;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.OisMetadata;
import com.google.googlex.gcam.OisPosition;
import com.google.googlex.gcam.OisPositionVector;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.QcIlluminantVector;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.WeightedNormalizedRect;
import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.WeightedPixelRect;
import com.google.googlex.gcam.WeightedPixelRectVector;
import com.google.googlex.gcam.androidutils.MathUtils;
import com.google.googlex.gcam.imagemetadata.IspAwbMetadataConverter;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import defpackage.*;

public class MetadataConverter {
    public static final float ANTIBANDING_50HZ_PERIOD_MS = 10.0f;
    public static final float ANTIBANDING_60HZ_PERIOD_MS = 8.333333f;
    public static final float ANTIBANDING_EXPOSURE_TIME_TOLERANCE_MS = 0.05f;
    public static final int APPLICATION_MODE_UNKNOWN = -1;
    public static final int COLOR_SPACE_TRANSFORM_MATRIX_NUM_ELEMENTS = 9;
    public static final int COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR = 10000;
    public static final int CONTROL_POST_RAW_SENSITIVITY_BOOST_UNITY = 100;
    public static final String GCAM_SOFTWARE_TAG = "HDR+";
    public static final String TAG = MetadataConverter.class.getSimpleName();
    public static final nda deviceProperties = nda.a();
    public final ncz apiProperties = ncz.a();
    public final myz cameraHardwareManager;
    public final myo characteristics;
    public final int faceDetectMode;

    static class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$android$libraries$camera$framework$characteristics$Facing;
        public static final /* synthetic */ int[] $SwitchMap$com$google$googlex$gcam$hdrplus$MetadataConverter$LandmarkIndex;

        static {
            int[] iArr = new int[mzg.values().length];
            $SwitchMap$com$google$android$libraries$camera$framework$characteristics$Facing = iArr;
            try {
                iArr[mzg.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$android$libraries$camera$framework$characteristics$Facing[mzg.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$android$libraries$camera$framework$characteristics$Facing[mzg.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[LandmarkIndex.values().length];
            $SwitchMap$com$google$googlex$gcam$hdrplus$MetadataConverter$LandmarkIndex = iArr2;
            try {
                iArr2[LandmarkIndex.LEFT_EYE.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$googlex$gcam$hdrplus$MetadataConverter$LandmarkIndex[LandmarkIndex.RIGHT_EYE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$googlex$gcam$hdrplus$MetadataConverter$LandmarkIndex[LandmarkIndex.MOUTH_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface RequestBuilderUpdater {
        void setParam(CaptureRequest.Key key, Object obj);
    }

    private static long msFloatToNs(float f) {
        return (long) (f * 1000000.0f);
    }

    private static float nsToMsFloat(long j) {
        return ((float) j) / 1000000.0f;
    }

    public MetadataConverter(myo myoVar, myz myzVar) {
        this.characteristics = myoVar;
        this.cameraHardwareManager = myzVar;
        if (deviceProperties.d() || deviceProperties.e()) {
            this.faceDetectMode = mzf.EXTENDED.e;
        } else {
            this.faceDetectMode = myoVar.h().e;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    enum LandmarkIndex {
        LEFT_EYE(0),
        RIGHT_EYE(1),
        MOUTH_CENTER(45);
        
        public final int index;

        public int getIndex() {
            return this.index;
        }

        LandmarkIndex(int i) {
            this.index = i;
        }

        public Point getLandmarkLocation(Face face) {
            mzg mzgVar = mzg.FRONT;
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return null;
                    }
                    return face.getMouthPosition();
                }
                return face.getRightEyePosition();
            }
            return face.getLeftEyePosition();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class ExtendedFaces {
        public int[] faceLandmarkCounts;
        public byte[] faceLandmarkIds;
        public float[] faceLandmarkXy;
        public Face[] faces;

        public ExtendedFaces(ndn ndnVar) {
            this.faces = (Face[]) ndnVar.a(CaptureResult.STATISTICS_FACES);
            if (lao.m == null || lao.n == null || lao.o == null) {
                return;
            }
            this.faceLandmarkCounts = (int[]) ndnVar.a(lao.m);
            this.faceLandmarkIds = (byte[]) ndnVar.a(lao.n);
            this.faceLandmarkXy = (float[]) ndnVar.a(lao.o);
        }

        public boolean facesAvailable() {
            Face[] faceArr = this.faces;
            return faceArr != null && faceArr.length > 0;
        }

        public int[] getFaceLandmarkCounts() {
            return this.faceLandmarkCounts;
        }

        public byte[] getFaceLandmarkIds() {
            return this.faceLandmarkIds;
        }

        public float[] getFaceLandmarkXy() {
            return this.faceLandmarkXy;
        }

        public Face[] getFaces() {
            return this.faces;
        }

        public ExtendedFaces(Face[] faceArr) {
            this.faces = faceArr;
        }

        public boolean extendedFacesAvailable() {
            int[] iArr;
            return facesAvailable() && (iArr = this.faceLandmarkCounts) != null && iArr.length == this.faces.length;
        }
    }

    private static void appendMeteringRectanglesAsGcamWeightedNormalizedRects(MeteringRectangle[] meteringRectangleArr, Rect rect, float f, float f2, Rect rect2, WeightedNormalizedRectVector weightedNormalizedRectVector) {
        WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
        weightedNormalizedRect.setWeight(1.0f);
        weightedNormalizedRect.setRect(new NormalizedRect());
        weightedNormalizedRectVector.add(weightedNormalizedRect);
        if (meteringRectangleArr != null) {
            for (int i = 0; i < meteringRectangleArr.length; i++) {
                if (meteringRectangleArr[i].getMeteringWeight() != 0) {
                    WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                    Rect rect3 = meteringRectangleArr[i].getRect();
                    float exactCenterX = rect3.exactCenterX();
                    float exactCenterY = rect3.exactCenterY();
                    float min = 0.5f * f * Math.min(rect.width(), rect.height());
                    int width = rect2.width();
                    int height = rect2.height();
                    int width2 = rect2.width();
                    int height2 = rect2.height();
                    NormalizedRect rect4 = weightedNormalizedRect2.getRect();
                    rect4.setX0(MathUtils.clamp((exactCenterX - min) / width, 0.0f, 1.0f));
                    rect4.setY0(MathUtils.clamp((exactCenterY - min) / height, 0.0f, 1.0f));
                    rect4.setX1(MathUtils.clamp((exactCenterX + min) / width2, 0.0f, 1.0f));
                    rect4.setY1(MathUtils.clamp((exactCenterY + min) / height2, 0.0f, 1.0f));
                    weightedNormalizedRect2.setWeight(f2);
                    weightedNormalizedRectVector.add(weightedNormalizedRect2);
                }
            }
        }
    }

    private static void appendMeteringRectanglesAsGcamWeightedPixelRects(MeteringRectangle[] meteringRectangleArr, boolean z, WeightedPixelRectVector weightedPixelRectVector) {
        if (meteringRectangleArr != null) {
            for (MeteringRectangle meteringRectangle : meteringRectangleArr) {
                if (z || meteringRectangle.getMeteringWeight() != 0) {
                    WeightedPixelRect weightedPixelRect = new WeightedPixelRect();
                    Rect rect = meteringRectangle.getRect();
                    PixelRect rect2 = weightedPixelRect.getRect();
                    rect2.setX0(rect.left);
                    rect2.setX1(rect.right);
                    rect2.setY0(rect.top);
                    rect2.setY1(rect.bottom);
                    weightedPixelRect.setWeight(meteringRectangle.getMeteringWeight());
                    weightedPixelRectVector.add(weightedPixelRect);
                }
            }
        }
    }

    private static void convertPhysicalToGcamFrameMetadata(myo myoVar, ndr ndrVar, FrameMetadata frameMetadata) {
        updateFaceInfo(myoVar, new ExtendedFaces(ndrVar), frameMetadata.getFaces());
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AE_REGIONS), false, frameMetadata.getAe().getMetering_rectangles());
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AWB_REGIONS), false, frameMetadata.getAwb().getMetering_rectangles());
        appendMeteringRectanglesAsGcamWeightedPixelRects((MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AF_REGIONS), true, frameMetadata.getAf().getMetering_rectangles());
    }

    private static int convertToBayerPattern(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        String str = TAG;
                        StringBuilder sb = new StringBuilder(93);
                        sb.append("convertToBayerPattern: unsupported color filter arrangement: ");
                        sb.append(i);
                        sb.append(", returning kInvalid.");
                        Log.w(str, sb.toString());
                        return 0;
                    }
                    return 2;
                }
                return 4;
            }
            return 3;
        }
        return 1;
    }

    public static ColorSpaceTransform convertToColorSpaceTransform(float[] fArr) {
        qdu.a(fArr.length == 9, "ccm must have length %s.", 9);
        Rational[] rationalArr = new Rational[9];
        for (int i = 0; i < 9; i++) {
            rationalArr[i] = new Rational((int) (fArr[i] * 10000.0f), 10000);
        }
        return new ColorSpaceTransform(rationalArr);
    }

    private static float[] convertToFloatArray(ColorSpaceTransform colorSpaceTransform) {
        Rational[] rationalArr = new Rational[9];
        colorSpaceTransform.copyElements(rationalArr, 0);
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = rationalArr[i].floatValue();
        }
        return fArr;
    }

    public FrameMetadata convertToGcamFrameMetadata(ndr ndrVar) {
        return convertToGcamFrameMetadata(ndrVar, null);
    }

    public FrameMetadata convertToGcamFrameMetadata(ndr ndrVar, GyroSampleVector gyroSampleVector) {
        float[] fArr;
        int length;
        float[] fArr2;
        myo physicalCharacteristics = getPhysicalCharacteristics(ndrVar);
        FrameMetadata frameMetadata = new FrameMetadata();
        ndr physicalMetadata = getPhysicalMetadata(ndrVar, physicalCharacteristics.M().a);
        convertPhysicalToGcamFrameMetadata(physicalCharacteristics, physicalMetadata, frameMetadata);
        frameMetadata.setMesh_warp(getMeshWarp((Rect) qdu.d((Rect) physicalMetadata.a(CaptureResult.SCALER_CROP_REGION)), ndrVar));
        getOisMetadata(ndrVar).ifPresent(MetadataConverter$$Lambda$0.get$Lambda(frameMetadata));
        if (gyroSampleVector != null) {
            frameMetadata.setGyro_samples(gyroSampleVector);
        }
        setGeometricCalibration(physicalCharacteristics, ndrVar, frameMetadata);
        frameMetadata.setSensor_id(getGcamSensorId(physicalCharacteristics, ndrVar));
        frameMetadata.setActual_exposure_time_ms(getExposureTimeMs(ndrVar));
        float[] analogAndDigitalGain = getAnalogAndDigitalGain(physicalCharacteristics, ndrVar);
        frameMetadata.setActual_analog_gain(analogAndDigitalGain[0]);
        frameMetadata.setApplied_digital_gain(analogAndDigitalGain[1]);
        Integer num = (Integer) ndrVar.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        if (num != null) {
            frameMetadata.setPost_raw_digital_gain(num.intValue() / 100.0f);
        }
        int intValue = ((Integer) ndrVar.a(CaptureResult.FLASH_MODE)).intValue();
        if (intValue == 1 || intValue == 2) {
            frameMetadata.setFlash(1);
        } else {
            frameMetadata.setFlash(0);
        }
        frameMetadata.setWb(getAwbInfoCaptured(ndrVar));
        Rational[] rationalArr = (Rational[]) ndrVar.a(CaptureResult.SENSOR_NEUTRAL_COLOR_POINT);
        frameMetadata.setNeutral_point(new float[]{rationalArr[0].floatValue(), rationalArr[1].floatValue(), rationalArr[2].floatValue()});
        Boolean bool = (Boolean) ndrVar.a(CaptureResult.BLACK_LEVEL_LOCK);
        if (bool == null) {
            bool = false;
        }
        frameMetadata.setWas_black_level_locked(bool.booleanValue());
        frameMetadata.setTimestamp_ns(((Long) ndrVar.a(CaptureResult.SENSOR_TIMESTAMP)).longValue());
        frameMetadata.setSensor_temp(GcamModule.getKSensorTempUnknown());
        if (this.apiProperties.f || (!deviceProperties.d() && !deviceProperties.e())) {
            Integer num2 = (Integer) ndrVar.a(CaptureResult.STATISTICS_SCENE_FLICKER);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 1) {
                        frameMetadata.setScene_flicker(2);
                    } else if (intValue2 == 2) {
                        frameMetadata.setScene_flicker(3);
                    } else {
                        Log.e(TAG, "Unexpected STATISTICS_SCENE_FLICKER type!");
                    }
                } else {
                    frameMetadata.setScene_flicker(1);
                }
            }
        } else {
            float exposureTimeMs = getExposureTimeMs(ndrVar);
            if (isProbablyUsingAntibanding(exposureTimeMs, 8.333333f)) {
                frameMetadata.setScene_flicker(3);
            } else if (isProbablyUsingAntibanding(exposureTimeMs, 10.0f)) {
                frameMetadata.setScene_flicker(2);
            } else {
                frameMetadata.setScene_flicker(1);
            }
        }
        Pair[] pairArr = (Pair[]) ndrVar.a(CaptureResult.SENSOR_NOISE_PROFILE);
        DngNoiseModel[] dngNoiseModelArr = new DngNoiseModel[4];
        for (int i = 0; i < 4; i++) {
            DngNoiseModel dngNoiseModel = new DngNoiseModel();
            dngNoiseModelArr[i] = dngNoiseModel;
            dngNoiseModel.setScale(((Double) pairArr[i].first).floatValue());
            dngNoiseModelArr[i].setOffset(((Double) pairArr[i].second).floatValue());
        }
        frameMetadata.setDng_noise_model_bayer(dngNoiseModelArr);
        float[] fArr3 = (float[]) ndrVar.a(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
        if (fArr3 != null) {
            frameMetadata.setBlack_levels_bayer(fArr3);
        } else {
            BlackLevelPattern blackLevelPattern = (BlackLevelPattern) physicalCharacteristics.a(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
            if (blackLevelPattern != null) {
                float[] fArr4 = new float[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    fArr4[i2] = blackLevelPattern.getOffsetForIndex(i2 & 1, i2 >> 1);
                }
                frameMetadata.setBlack_levels_bayer(fArr4);
            }
        }
        Float f = (Float) ndrVar.a(CaptureResult.LENS_FOCUS_DISTANCE);
        Integer num3 = (Integer) physicalCharacteristics.a(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
        if (f != null && num3 != null && (num3.intValue() == 2 || num3.intValue() == 1)) {
            frameMetadata.setFocus_distance_diopters(f.floatValue());
        }
        Float f2 = (Float) ndrVar.a(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            frameMetadata.setFocal_length_mm(f2.floatValue());
        }
        Float f3 = (Float) ndrVar.a(CaptureResult.LENS_APERTURE);
        if (f3 != null) {
            frameMetadata.setF_number(f3.floatValue());
        }
        LiveHdrMetadata liveHdrMetadata = new LiveHdrMetadata();
        if (lap.d != null && (fArr2 = (float[]) ndrVar.a(lap.d)) != null && fArr2.length > 0) {
            liveHdrMetadata.setMax_hdr_ratio_override(fArr2[0]);
            liveHdrMetadata.setManual_short_tet_override(fArr2[1]);
            liveHdrMetadata.setManual_long_tet_override(fArr2[2]);
            liveHdrMetadata.setGcam_ae_touch_weight_scale(fArr2[3]);
            liveHdrMetadata.setManual_ec_short(fArr2[4]);
            liveHdrMetadata.setManual_ec_long(fArr2[5]);
        }
        if (lap.b != null && (fArr = (float[]) ndrVar.a(lap.b)) != null && (length = fArr.length) > 0) {
            liveHdrMetadata.setIdeal_short_tet(fArr[0]);
            liveHdrMetadata.setIdeal_long_tet(fArr[1]);
            liveHdrMetadata.setFinal_short_tet(fArr[2]);
            liveHdrMetadata.setFinal_long_tet(fArr[3]);
            liveHdrMetadata.setPure_fraction_of_pixels_from_long_exposure(fArr[4]);
            liveHdrMetadata.setWeighted_fraction_of_pixels_from_long_exposure(fArr[5]);
            liveHdrMetadata.setLog_scene_brightness(fArr[6]);
            liveHdrMetadata.setPredicted_image_brightness(fArr[7]);
            liveHdrMetadata.setMotion_magnitude_pix(fArr[8]);
            liveHdrMetadata.setMetering_interval_ms(fArr[9]);
            liveHdrMetadata.setFiltered_motion_speed_pix_per_ms(fArr[10]);
            liveHdrMetadata.setViewfinder_short_tet(fArr[11]);
            liveHdrMetadata.setViewfinder_long_tet(fArr[12]);
            if (length > 13) {
                liveHdrMetadata.setSafe_underexposure(fArr[13]);
            }
        }
        frameMetadata.setLive_hdr(liveHdrMetadata);
        frameMetadata.setControl_mode(((Integer) ndrVar.a(CaptureResult.CONTROL_MODE)).intValue());
        AeMetadata ae = frameMetadata.getAe();
        ae.setMode(((Integer) ndrVar.a(CaptureResult.CONTROL_AE_MODE)).intValue());
        ae.setLock(((Boolean) ndrVar.a(CaptureResult.CONTROL_AE_LOCK)).booleanValue());
        ae.setState(((Integer) ndrVar.a(CaptureResult.CONTROL_AE_STATE)).intValue());
        Integer num4 = (Integer) ndrVar.a(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        if (num4 != null) {
            ae.setPrecapture_trigger(num4.intValue());
        }
        ae.setExposure_compensation(getExposureCompensationStops(((Integer) ndrVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()));
        AwbMetadata awb = frameMetadata.getAwb();
        awb.setMode(((Integer) ndrVar.a(CaptureResult.CONTROL_AWB_MODE)).intValue());
        awb.setLock(((Boolean) ndrVar.a(CaptureResult.CONTROL_AWB_LOCK)).booleanValue());
        awb.setState(((Integer) ndrVar.a(CaptureResult.CONTROL_AWB_STATE)).intValue());
        AfMetadata af = frameMetadata.getAf();
        af.setMode(((Integer) ndrVar.a(CaptureResult.CONTROL_AF_MODE)).intValue());
        af.setState(((Integer) ndrVar.a(CaptureResult.CONTROL_AF_STATE)).intValue());
        af.setTrigger(((Integer) ndrVar.a(CaptureResult.CONTROL_AF_TRIGGER)).intValue());
        Integer num5 = (Integer) ndrVar.a(CaptureResult.LENS_STATE);
        if (num5 != null) {
            frameMetadata.setLens_state(num5.intValue());
        }
        if (lan.i != null) {
            frameMetadata.setExposure_time_boost(((Float) ndrVar.a(lan.i)).floatValue());
        }
        if (lao.t != null) {
            try {
                byte[] bArr = (byte[]) ndrVar.a(lao.t);
                if (bArr != null) {
                    frameMetadata.setIsp_metadata(IspAwbMetadataConverter.deserializeFromAwbBgStatVendorTag(bArr));
                }
            } catch (RuntimeException e) {
                Log.e(TAG, "Error retrieving EXPERIMENTAL_BGSTATS_AWB", e);
            }
        }
        if (frameMetadata.getSensor_id() == 7) {
            GcamModule.ApplySensorBinning(2, true, false, frameMetadata);
        }
        return frameMetadata;
    }

    public FrameMetadataKey convertToGcamFrameMetadataKey(ndn ndnVar) {
        Long l = (Long) ndnVar.a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            return new FrameMetadataKey(l.longValue(), getGcamSensorId(getPhysicalCharacteristics(ndnVar), ndnVar));
        }
        return null;
    }

    public static StaticMetadata convertToGcamStaticMetadata(myo myoVar) {
        StaticMetadata staticMetadata = new StaticMetadata();
        staticMetadata.setMake(Build.MANUFACTURER);
        staticMetadata.setModel(Build.MODEL);
        staticMetadata.setDevice(Build.DEVICE);
        String a = ndb.a.a("ro.revision");
        if (a != null && !a.isEmpty()) {
            staticMetadata.setHardware_revision(a);
        }
        String valueOf = String.valueOf(GcamModule.GetVersion());
        staticMetadata.setSoftware(valueOf.length() == 0 ? new String("HDR+ ") : "HDR+ ".concat(valueOf));
        staticMetadata.setDevice_os_version(Build.FINGERPRINT);
        staticMetadata.setSensor_id(getGcamSensorId(myoVar));
        staticMetadata.setHas_flash(myoVar.I());
        staticMetadata.setLens_facing(convertToLensFacing(myoVar.N()));
        List<Float> i = myoVar.i();
        qdu.a(!i.isEmpty(), "Cameras must have at least one focal length.");
        FloatVector floatVector = new FloatVector();
        for (Float f : i) {
            floatVector.add(f.floatValue());
        }
        staticMetadata.setAvailable_focal_lengths_mm(floatVector);
        float[] fArr = (float[]) myoVar.b(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        qdu.a(fArr.length > 0, "Cameras must have at least one f-number (aperture size).");
        FloatVector floatVector2 = new FloatVector();
        for (float f2 : fArr) {
            floatVector2.add(f2);
        }
        staticMetadata.setAvailable_f_numbers(floatVector2);
        staticMetadata.setWhite_level(((Integer) myoVar.a(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL)).intValue());
        Rect[] rectArr = (Rect[]) myoVar.a(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
        if (rectArr != null) {
            PixelRectVector pixelRectVector = new PixelRectVector();
            for (Rect rect : rectArr) {
                PixelRect pixelRect = new PixelRect();
                pixelRect.setX0(rect.left);
                pixelRect.setX1(rect.right);
                pixelRect.setY0(rect.top);
                pixelRect.setY1(rect.bottom);
                pixelRectVector.add(pixelRect);
            }
            staticMetadata.setOptically_black_regions(pixelRectVector);
        }
        staticMetadata.setBayer_pattern(convertToBayerPattern(((Integer) myoVar.b(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue()));
        long[] jArr = {((Long) ((Range) myoVar.b(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getLower()).longValue(), ((Long) ((Range) myoVar.b(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getUpper()).longValue()};
        float[] fArr2 = {nsToMsFloat(jArr[0]), nsToMsFloat(jArr[1])};
        Float maxExposureTimeMsForRawCapture = getMaxExposureTimeMsForRawCapture(myoVar);
        if (maxExposureTimeMsForRawCapture != null) {
            fArr2[1] = Math.max(maxExposureTimeMsForRawCapture.floatValue(), fArr2[0]);
        }
        staticMetadata.setExposure_time_range_ms(fArr2);
        int[] iArr = {((Integer) ((Range) myoVar.b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue(), ((Integer) ((Range) myoVar.b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getUpper()).intValue()};
        int intValue = ((Integer) myoVar.b(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        staticMetadata.setIso_range(iArr);
        staticMetadata.setMax_analog_iso(intValue);
        DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        Integer num = (Integer) myoVar.a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (num != null) {
            float[] convertToFloatArray = convertToFloatArray((ColorSpaceTransform) myoVar.b(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1));
            float[] convertToFloatArray2 = convertToFloatArray((ColorSpaceTransform) myoVar.b(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
            DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.setIlluminant(num.intValue());
            dngColorCalibration.setXyz_to_model_rgb(convertToFloatArray);
            dngColorCalibration.setModel_rgb_to_device_rgb(convertToFloatArray2);
            dngColorCalibrationVector.add(dngColorCalibration);
        }
        Byte b = (Byte) myoVar.a(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b != null) {
            float[] convertToFloatArray3 = convertToFloatArray((ColorSpaceTransform) myoVar.b(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2));
            float[] convertToFloatArray4 = convertToFloatArray((ColorSpaceTransform) myoVar.b(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2));
            DngColorCalibration dngColorCalibration2 = new DngColorCalibration();
            dngColorCalibration2.setIlluminant(b.byteValue());
            dngColorCalibration2.setXyz_to_model_rgb(convertToFloatArray3);
            dngColorCalibration2.setModel_rgb_to_device_rgb(convertToFloatArray4);
            dngColorCalibrationVector.add(dngColorCalibration2);
        }
        staticMetadata.setDng_color_calibration(dngColorCalibrationVector);
        staticMetadata.setQc_color_calibration(getQcColorCalibration(myoVar));
        SizeF sizeF = (SizeF) myoVar.b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        staticMetadata.setSensor_physical_width_mm(sizeF.getWidth());
        staticMetadata.setSensor_physical_height_mm(sizeF.getHeight());
        Size size = (Size) myoVar.b(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        staticMetadata.setPixel_array_width(size.getWidth());
        staticMetadata.setPixel_array_height(size.getHeight());
        Rect rect2 = (Rect) myoVar.b(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        PixelRect pixelRect2 = new PixelRect();
        pixelRect2.setX0(rect2.left);
        pixelRect2.setX1(rect2.right);
        pixelRect2.setY0(rect2.top);
        pixelRect2.setY1(rect2.bottom);
        staticMetadata.setActive_area(pixelRect2);
        mzu gcamRawFormat = getGcamRawFormat(myoVar);
        staticMetadata.setFrame_raw_max_width(gcamRawFormat.b.a);
        staticMetadata.setFrame_raw_max_height(gcamRawFormat.b.b);
        staticMetadata.setRaw_bits_per_pixel(ImageFormat.getBitsPerPixel(gcamRawFormat.a));
        staticMetadata.setFrame_readout_time_ms(nsToMsFloat(getReadoutTimeNs(myoVar)));
        for (int i2 : (int[]) myoVar.b(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION)) {
            if (i2 == 1) {
                staticMetadata.setHas_ois(true);
            }
        }
        return staticMetadata;
    }

    private static int convertToLensFacing(mzg mzgVar) {
        mzg mzgVar2 = mzg.FRONT;
        LandmarkIndex landmarkIndex = LandmarkIndex.LEFT_EYE;
        int ordinal = mzgVar.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    return -1;
                }
            }
            return i;
        }
        return 0;
    }

    private static NormalizedRect convertToNormalizedRect(Rect rect, Rect rect2) {
        NormalizedRect normalizedRect = new NormalizedRect();
        float width = 1.0f / rect2.width();
        float height = 1.0f / rect2.height();
        normalizedRect.setX0(rect.left * width);
        normalizedRect.setY0(rect.top * height);
        normalizedRect.setX1(rect.right * width);
        normalizedRect.setY1(rect.bottom * height);
        return normalizedRect;
    }

    public SpatialGainMap convertToSpatialGainMap(ndn ndnVar) {
        LensShadingMap lensShadingMap = (LensShadingMap) ndnVar.a(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            int intValue = ((Integer) ndnVar.b().a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE)).intValue();
            String str = TAG;
            StringBuilder sb = new StringBuilder(112);
            sb.append("android.statistics.lensShadingMap was null, returning the empty SpatialGainMap(). Requested mode was ");
            sb.append(intValue);
            Log.w(str, sb.toString());
            return new SpatialGainMap();
        }
        int columnCount = lensShadingMap.getColumnCount();
        int rowCount = lensShadingMap.getRowCount();
        SpatialGainMap spatialGainMap = new SpatialGainMap(columnCount, rowCount, true, false);
        int[] evenOddSourceIndicesForCfa = getEvenOddSourceIndicesForCfa(((Integer) getPhysicalCharacteristics(ndnVar).b(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
        for (int i = 0; i < 4; i++) {
            int i2 = evenOddSourceIndicesForCfa[i];
            for (int i3 = 0; i3 < rowCount; i3++) {
                for (int i4 = 0; i4 < columnCount; i4++) {
                    spatialGainMap.WriteRggb(i4, i3, i, lensShadingMap.getGainFactor(i2, i4, i3));
                }
            }
        }
        return spatialGainMap;
    }

    private static float[] getAnalogAndDigitalGain(myo myoVar, ndn ndnVar) {
        float f;
        int intValue = ((Integer) ndnVar.a(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        int intValue2 = ((Integer) ((Range) myoVar.b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        int intValue3 = ((Integer) myoVar.b(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        float f2 = 1.0f;
        if (intValue <= intValue3) {
            f = intValue / intValue2;
        } else {
            float f3 = intValue3;
            f = f3 / intValue2;
            f2 = Math.max(intValue / f3, 1.0f);
        }
        return new float[]{f, f2};
    }

    private static Integer getApplicationMode(ndn ndnVar) {
        if (!deviceProperties.f() || ndnVar == null) {
            return -1;
        }
        return (Integer) ndnVar.a(CaptureResult.CONTROL_SCENE_MODE);
    }

    private static float[] getAwbGains(ndn ndnVar, int[] iArr) {
        float[] fArr = new float[4];
        RggbChannelVector rggbChannelVector = (RggbChannelVector) ndnVar.a(CaptureResult.COLOR_CORRECTION_GAINS);
        if (rggbChannelVector != null) {
            for (int i = 0; i < 4; i++) {
                fArr[i] = rggbChannelVector.getComponent(iArr[i]);
            }
            return fArr;
        }
        Log.w(TAG, "CaptureResult missing COLOR_CORRECTION_GAINS.");
        Arrays.fill(fArr, 1.0f);
        return fArr;
    }

    public AwbInfo getAwbInfoCaptured(ndn ndnVar) {
        AwbInfo awbInfo = new AwbInfo();
        awbInfo.setGains(getAwbGains(ndnVar, getEvenOddSourceIndicesForCfa(((Integer) getPhysicalCharacteristics(ndnVar).b(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue())));
        awbInfo.setRgb2rgb(getAwbRgb2Rgb(ndnVar));
        return awbInfo;
    }

    private static float[] getAwbRgb2Rgb(ndn ndnVar) {
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) ndnVar.a(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform == null) {
            Log.w(TAG, "CaptureResult missing COLOR_CORRECTION_TRANSFORM.");
            return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return convertToFloatArray(colorSpaceTransform);
    }

    private static int[] getEvenOddSourceIndicesForCfa(int i) {
        if (i == 0 || i == 1) {
            return new int[]{0, 1, 2, 3};
        }
        if (i == 2 || i == 3) {
            return new int[]{0, 2, 1, 3};
        }
        throw new IllegalArgumentException("CameraCharacteristics: unsupported colorFilterArrangment");
    }

    public float getExposureCompensationStops(int i) {
        Rational rational = (Rational) this.characteristics.b(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        return new Rational(i * rational.getNumerator(), rational.getDenominator()).floatValue();
    }

    private static float getExposureTimeMs(ndn ndnVar) {
        return nsToMsFloat(((Long) ndnVar.a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue());
    }

    public static mzu getGcamRawFormat(myo myoVar) {
        List a = myoVar.a(37);
        List a2 = myoVar.a(38);
        List a3 = myoVar.a(32);
        if (!a.isEmpty()) {
            return new mzu(37, fpp.a(a));
        }
        if (!a2.isEmpty()) {
            return new mzu(38, fpp.a(a2));
        }
        if (a3.isEmpty()) {
            throw new IllegalArgumentException("No HDR+ compatible raw format supported.");
        }
        return new mzu(32, fpp.a(a3));
    }

    public static int getGcamSensorId(myo myoVar) {
        return getGcamSensorId(myoVar, null);
    }

    public static int getGcamSensorId(myo myoVar, ndn ndnVar) {
        mzg N = myoVar.N();
        boolean C = myoVar.C();
        List J = myoVar.J();
        Float f = (C || J.size() != 1) ? ndnVar == null ? null : (Float) ndnVar.a(CaptureResult.LENS_FOCAL_LENGTH) : (Float) J.get(0);
        if (N != mzg.BACK) {
            if (C && f == null) {
                return 3;
            }
            if (f == null || f.floatValue() >= 2.1d) {
                return (f == null || ((double) f.floatValue()) <= 4.3d) ? 1 : 6;
            }
            return 2;
        } else if (C && f == null) {
            return 5;
        } else {
            if (f == null || f.floatValue() <= 5.0d) {
                return 0;
            }
            return isBinnedTelephoto(ndnVar) ? 7 : 4;
        }
    }

    public static int getImageRotation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return 2;
                    }
                    throw new IllegalArgumentException("Rotation must be one of {0, 90, 180, 270}.");
                }
                return 1;
            }
            return 0;
        }
        return 3;
    }

    private static Float getMaxExposureTimeMsForRawCapture(myo myoVar) {
        if (myoVar.N() == mzg.BACK) {
            if (deviceProperties.b()) {
                return Float.valueOf(2000.0f);
            }
            if (deviceProperties.f()) {
                int gcamSensorId = getGcamSensorId(myoVar);
                if (gcamSensorId == 0) {
                    return Float.valueOf(32000.0f);
                }
                if (gcamSensorId == 4 || gcamSensorId == 5) {
                    return Float.valueOf(24000.0f);
                }
            }
            return null;
        }
        return null;
    }

    public static MeshWarp getMeshWarp(Rect rect, ndn ndnVar) {
        MeshWarp meshWarp = new MeshWarp();
        if (lap.k != null && lap.i != null && lap.j != null && (lap.l == null || ndnVar.a(lap.l) == null || !((Boolean) ndnVar.a(lap.l)).booleanValue())) {
            float[] fArr = (float[]) ndnVar.a(lap.k);
            int[] iArr = (int[]) ndnVar.a(lap.i);
            int[] iArr2 = (int[]) ndnVar.a(lap.j);
            if (fArr != null && iArr != null && iArr.length == 2 && iArr2 != null && iArr2.length == 4) {
                int length = fArr.length;
                int i = iArr[0] * iArr[1];
                if (length == i + i) {
                    FloatVector floatVector = new FloatVector();
                    for (float f : fArr) {
                        floatVector.add(f);
                    }
                    meshWarp.setMesh_warp_data(floatVector);
                    meshWarp.setGrid_cols(iArr[0]);
                    meshWarp.setGrid_rows(iArr[1]);
                    PixelRect pixelRect = new PixelRect();
                    pixelRect.setX0(iArr2[0]);
                    pixelRect.setY0(iArr2[1]);
                    pixelRect.setX1(iArr2[0] + iArr2[2]);
                    pixelRect.setY1(iArr2[1] + iArr2[3]);
                    meshWarp.setMesh_warp_crop_region(pixelRect);
                    qdu.a(!rect.isEmpty(), "Invalid physical scaler crop region: %s", rect);
                    PixelRect pixelRect2 = new PixelRect();
                    pixelRect2.setX0(rect.left);
                    pixelRect2.setX1(rect.right);
                    pixelRect2.setY0(rect.top);
                    pixelRect2.setY1(rect.bottom);
                    meshWarp.setMesh_warp_dst_region(pixelRect2);
                } else {
                    Log.e(TAG, String.format("Mesh data length (%d) and grid dimension (%dx%dx2) mismatch.", Integer.valueOf(length), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
                }
            }
        }
        return meshWarp;
    }

    private static Optional getOisMetadata(ndn ndnVar) {
        Integer num = (Integer) ndnVar.a(CaptureResult.STATISTICS_OIS_DATA_MODE);
        if (num == null || num.intValue() == 0) {
            return Optional.empty();
        }
        Integer num2 = (Integer) ndnVar.a(CaptureResult.LENS_OPTICAL_STABILIZATION_MODE);
        Long l = (Long) ndnVar.a(CaptureResult.SENSOR_TIMESTAMP);
        OisSample[] oisSampleArr = (OisSample[]) ndnVar.a(CaptureResult.STATISTICS_OIS_SAMPLES);
        if (l == null || oisSampleArr == null) {
            return Optional.empty();
        }
        OisMetadata oisMetadata = new OisMetadata();
        oisMetadata.setLens_optical_stabilization_mode(num2.intValue());
        oisMetadata.setTimestamp_ois_clock_ns(l.longValue());
        OisPositionVector ois_positions = oisMetadata.getOis_positions();
        for (OisSample oisSample : oisSampleArr) {
            OisPosition oisPosition = new OisPosition();
            oisPosition.setTimestamp_ns(oisSample.getTimestamp());
            oisPosition.setShift_pixel_x(oisSample.getXshift());
            oisPosition.setShift_pixel_y(oisSample.getYshift());
            ois_positions.add(oisPosition);
        }
        return Optional.of(oisMetadata);
    }

    public myo getPhysicalCharacteristics(ndn ndnVar) {
        if (this.characteristics.C()) {
            if (deviceProperties.d() || deviceProperties.f()) {
                Float f = (Float) ndnVar.a(CaptureResult.LENS_FOCAL_LENGTH);
                qdu.c(f, "Could not retrieve focal length.");
                for (mzc mzcVar : this.characteristics.H()) {
                    myo b = this.cameraHardwareManager.b(mzcVar);
                    List i = b.i();
                    qdu.a(i.size() == 1, "Physical cameras must be single focal length.");
                    float floatValue = ((Float) i.get(0)).floatValue();
                    if (f != null && f.floatValue() == floatValue) {
                        return b;
                    }
                }
                qdu.a(false, (Object) "Physical camera with matching focal length not found.");
                return this.characteristics;
            }
            qdu.a(false, (Object) "Logical camera, but mapping to physical camera is unknown.");
        }
        return this.characteristics;
    }

    private static ndr getPhysicalMetadata(ndr ndrVar, String str) {
        Map e = ndrVar.e();
        if (e.isEmpty()) {
            return ndrVar;
        }
        ndn ndnVar = (ndn) e.get(str);
        if (ndnVar == null) {
            String str2 = TAG;
            String valueOf = String.valueOf(str);
            Log.w(str2, valueOf.length() == 0 ? new String("Physical metadata is null for images from camera ") : "Physical metadata is null for images from camera ".concat(valueOf));
            return ndrVar;
        }
        return new ndq(ndnVar);
    }

    private static QcColorCalibration getQcColorCalibration(myo myoVar) {
        QcColorCalibration qcColorCalibration = new QcColorCalibration();
        try {
            if (lan.k == null) {
                Log.w(TAG, "EEPROM_WB_CALIB is not available");
                return new QcColorCalibration();
            }
            Integer num = (Integer) myoVar.a(lan.k);
            if (num != null) {
                int intValue = num.intValue();
                String.format("EEPROM_WB_CALIB is available, found %d illuminants", Integer.valueOf(intValue));
                if (intValue <= 0) {
                    Log.w(TAG, "EEPROM_WB_CALIB available, but has no calibrated illuminants");
                    return new QcColorCalibration();
                }
                float[] fArr = (float[]) myoVar.b(lan.l);
                float[] fArr2 = (float[]) myoVar.b(lan.m);
                if (fArr.length == intValue && fArr2.length == intValue) {
                    QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
                    for (int i = 0; i < intValue; i++) {
                        QcColorCalibration.IlluminantData illuminantData = new QcColorCalibration.IlluminantData();
                        illuminantData.setRg_ratio(fArr[i]);
                        illuminantData.setBg_ratio(fArr2[i]);
                        qcIlluminantVector.add(illuminantData);
                    }
                    qcColorCalibration.setIlluminant_data(qcIlluminantVector);
                    if (lan.n != null) {
                        qcColorCalibration.setGrgb_ratio(((Float) myoVar.b(lan.n)).floatValue());
                    } else {
                        Log.w(TAG, "EEPROM_WB_CALIB_GR_OVER_GB_RATIO is not available. Setting the value to 1.0f.");
                        qcColorCalibration.setGrgb_ratio(1.0f);
                    }
                    return qcColorCalibration;
                }
                Log.w(TAG, "The r/g and b/g ratio data is corrupted");
                return new QcColorCalibration();
            }
            Log.w(TAG, "The EEPROM_WB_CALIB is not available");
            return new QcColorCalibration();
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "EEPROM_WB keys do not exist");
            return new QcColorCalibration();
        }
    }

    public static long getReadoutTimeNs(myo myoVar) {
        mzu gcamRawFormat = getGcamRawFormat(myoVar);
        return myoVar.a(gcamRawFormat.a, gcamRawFormat.b);
    }

    public long getReadoutTimeNs(ndn ndnVar) {
        return getReadoutTimeNs(getPhysicalCharacteristics(ndnVar));
    }

    public static int[] getRedBlueSourceIndicesForCfa(int i) {
        return getEvenOddSourceIndicesForCfa(i);
    }

    public float getTotalExposureTime(ndn ndnVar) {
        return nsToMsFloat(((Long) ndnVar.a(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue()) * (((Integer) ndnVar.a(CaptureResult.SENSOR_SENSITIVITY)).intValue() / ((Integer) ((Range) getPhysicalCharacteristics(ndnVar).b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue());
    }

    public float getViewfinderTotalExposureTime(ndn ndnVar) {
        float f;
        if (ndnVar != null) {
            float totalExposureTime = getTotalExposureTime(ndnVar);
            Integer num = (Integer) ndnVar.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num == null) {
                f = 1.0f;
            } else {
                f = num.intValue() / 100.0f;
            }
            return totalExposureTime * f;
        }
        throw new IllegalArgumentException("source should not be null");
    }

    private static boolean isBinnedTelephoto(ndn ndnVar) {
        return getApplicationMode(ndnVar).intValue() == 3;
    }

    private static boolean isProbablyUsingAntibanding(float f, float f2) {
        if (f >= (-0.05f) + f2) {
            float f3 = f / f2;
            if (Math.abs(f3 - Math.round(f3)) * f2 < 0.05f) {
                return true;
            }
        }
        return false;
    }

    private static void setGeometricCalibration(myo myoVar, ndn ndnVar, FrameMetadata frameMetadata) {
        qdu.a(!myoVar.C(), "Logical cameras not supported.");
        GeometricCalibrationVector geometricCalibrationVector = new GeometricCalibrationVector();
        float[] fArr = (float[]) ndnVar.a(CaptureResult.LENS_DISTORTION);
        float[] fArr2 = (float[]) ndnVar.a(CaptureResult.LENS_INTRINSIC_CALIBRATION);
        float[] fArr3 = (float[]) ndnVar.a(CaptureResult.LENS_POSE_ROTATION);
        float[] fArr4 = (float[]) ndnVar.a(CaptureResult.LENS_POSE_TRANSLATION);
        if (fArr == null) {
            fArr = (float[]) myoVar.a(CameraCharacteristics.LENS_DISTORTION);
        }
        if (fArr2 == null) {
            fArr2 = (float[]) myoVar.a(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
        }
        if (fArr3 == null) {
            fArr3 = (float[]) myoVar.a(CameraCharacteristics.LENS_POSE_ROTATION);
        }
        if (fArr4 == null) {
            fArr4 = (float[]) myoVar.a(CameraCharacteristics.LENS_POSE_TRANSLATION);
        }
        if (fArr != null || fArr2 != null || fArr3 != null || fArr4 != null) {
            GeometricCalibration geometricCalibration = new GeometricCalibration();
            geometricCalibration.setQuality(0);
            if (fArr != null) {
                geometricCalibration.setLens_distortion(fArr);
            }
            if (fArr2 != null) {
                geometricCalibration.setLens_intrinsic_calibration(fArr2);
            }
            if (fArr3 != null) {
                geometricCalibration.setLens_pose_rotation(fArr3);
            }
            if (fArr4 != null) {
                geometricCalibration.setLens_pose_translation(fArr4);
            }
            geometricCalibrationVector.add(geometricCalibration);
        }
        if (lao.b != null && lao.c != null && lao.d != null && lao.e != null && lao.f != null) {
            float[] fArr5 = (float[]) myoVar.a(lao.b);
            float[] fArr6 = (float[]) myoVar.a(lao.c);
            float[] fArr7 = (float[]) myoVar.a(lao.d);
            int[] iArr = (int[]) myoVar.a(lao.e);
            int[] iArr2 = (int[]) myoVar.a(lao.f);
            if (fArr5 != null && fArr6 != null && fArr7 != null && iArr != null && iArr2 != null) {
                GeometricCalibration geometricCalibration2 = new GeometricCalibration();
                geometricCalibration2.setQuality(1);
                float[] lens_distortion = geometricCalibration2.getLens_distortion();
                lens_distortion[0] = fArr5[0];
                lens_distortion[1] = fArr5[1];
                lens_distortion[2] = fArr5[2];
                lens_distortion[3] = fArr5[6];
                lens_distortion[4] = fArr5[7];
                geometricCalibration2.setLens_distortion(lens_distortion);
                float[] lens_distortion_extended = geometricCalibration2.getLens_distortion_extended();
                lens_distortion_extended[0] = fArr5[3];
                lens_distortion_extended[1] = fArr5[4];
                lens_distortion_extended[2] = fArr5[5];
                lens_distortion_extended[3] = fArr5[8];
                lens_distortion_extended[4] = fArr5[9];
                lens_distortion_extended[5] = fArr5[10];
                lens_distortion_extended[6] = fArr5[11];
                geometricCalibration2.setLens_distortion_extended(lens_distortion_extended);
                float[] lens_intrinsic_calibration = geometricCalibration2.getLens_intrinsic_calibration();
                lens_intrinsic_calibration[0] = fArr7[0];
                lens_intrinsic_calibration[1] = fArr7[1];
                lens_intrinsic_calibration[2] = fArr6[0];
                lens_intrinsic_calibration[3] = fArr6[1];
                lens_intrinsic_calibration[4] = 0.0f;
                geometricCalibration2.setLens_intrinsic_calibration(lens_intrinsic_calibration);
                geometricCalibration2.setActive_rectangle(iArr);
                geometricCalibration2.setValid_rectangle(iArr2);
                geometricCalibrationVector.add(geometricCalibration2);
            }
        }
        frameMetadata.setGeometric_calibration(geometricCalibrationVector);
    }

    private static boolean skipManualAwbSettings(ndn ndnVar) {
        return getApplicationMode(ndnVar).intValue() == 5;
    }

    private static boolean translateAeCrop(Rect rect, Rect rect2, MeshWarp meshWarp) {
        MeshTranslation TranslationHint = meshWarp.TranslationHint();
        Rect rect3 = new Rect(rect);
        rect3.offset(rect2.left - TranslationHint.getX(), rect2.top - TranslationHint.getY());
        if (rect2.contains(rect3)) {
            rect.set(rect3);
            rect.offset(-rect2.left, -rect2.top);
            return true;
        }
        int a = rgk.a(rect3.left, rect2.left, rect2.right - rect3.width());
        int a2 = rgk.a(rect3.top, rect2.top, rect2.bottom - rect3.height());
        rect.set(new Rect(a, a2, rect3.width() + a, rect3.height() + a2));
        rect.offset(-rect2.left, -rect2.top);
        return false;
    }

    public void updateAeShotParams(AeShotParams aeShotParams, ndr ndrVar, float f, float f2, mjs mjsVar) {
        myo physicalCharacteristics = getPhysicalCharacteristics(ndrVar);
        ndr physicalMetadata = getPhysicalMetadata(ndrVar, physicalCharacteristics.M().a);
        updatePhysicalAeShotParams(aeShotParams, physicalCharacteristics, physicalMetadata, f, f2, getMeshWarp((Rect) qdu.d((Rect) physicalMetadata.a(CaptureResult.SCALER_CROP_REGION)), ndrVar), mjsVar);
    }

    private static void updateFaceInfo(myo myoVar, ExtendedFaces extendedFaces, FaceInfoVector faceInfoVector) {
        int i;
        Rect rect = (Rect) myoVar.b(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        int width = rect.width();
        int height = rect.height();
        Face[] faces = extendedFaces.getFaces();
        if (faces != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < faces.length; i3++) {
                Face face = faces[i3];
                Rect bounds = face.getBounds();
                float f = width;
                float exactCenterX = bounds.exactCenterX() / f;
                float f2 = height;
                float exactCenterY = bounds.exactCenterY() / f2;
                float width2 = (bounds.width() + bounds.height()) / 2.0f;
                float f3 = width <= height ? width2 / f2 : width2 / f;
                float score = (face.getScore() - 1) / 99.0f;
                if (exactCenterX >= 0.0f) {
                    if (exactCenterX <= 1.0f && exactCenterY >= 0.0f && exactCenterY <= 1.0f && f3 >= 0.0f && f3 <= 1.0f && score >= 0.0f && score <= 1.0f) {
                        FaceInfo faceInfo = new FaceInfo();
                        faceInfo.setPos_x(exactCenterX);
                        faceInfo.setPos_y(exactCenterY);
                        faceInfo.setSize(f3);
                        faceInfo.setConfidence(score);
                        if (extendedFaces.extendedFacesAvailable()) {
                            float[] faceLandmarkXy = extendedFaces.getFaceLandmarkXy();
                            byte[] faceLandmarkIds = extendedFaces.getFaceLandmarkIds();
                            int[] faceLandmarkCounts = extendedFaces.getFaceLandmarkCounts();
                            if (faceLandmarkXy != null && faceLandmarkIds != null && faceLandmarkCounts != null) {
                                int i4 = 0;
                                while (true) {
                                    i = faceLandmarkCounts[i3];
                                    if (i4 >= i) {
                                        break;
                                    }
                                    FaceInfo.Landmark landmark = new FaceInfo.Landmark();
                                    int i5 = i2 + i4;
                                    int i6 = i5 + i5;
                                    landmark.setX(faceLandmarkXy[i6] / f);
                                    landmark.setY(faceLandmarkXy[i6 + 1] / f2);
                                    faceInfo.getLandmarks().set(faceLandmarkIds[i5], landmark);
                                    i4++;
                                }
                                i2 += i;
                            }
                        } else {
                            for (LandmarkIndex landmarkIndex : LandmarkIndex.values()) {
                                updateNormalizedLandmark(face, landmarkIndex, width, height, faceInfo);
                            }
                        }
                        faceInfoVector.add(faceInfo);
                    }
                }
                Log.w(TAG, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", Integer.valueOf(bounds.left), Integer.valueOf(bounds.top), Integer.valueOf(bounds.right), Integer.valueOf(bounds.bottom), Integer.valueOf(face.getScore())));
            }
        }
    }

    public void updateFromFrameRequest(FrameRequest frameRequest, ndr ndrVar, RequestBuilderUpdater requestBuilderUpdater) {
        myo physicalCharacteristics = getPhysicalCharacteristics(ndrVar);
        float desired_exposure_time_ms = frameRequest.getDesired_exposure_time_ms();
        float desired_analog_gain = frameRequest.getDesired_analog_gain();
        float desired_digital_gain = frameRequest.getDesired_digital_gain();
        requestBuilderUpdater.setParam(CaptureRequest.CONTROL_MODE, 1);
        requestBuilderUpdater.setParam(CaptureRequest.CONTROL_AE_MODE, 0);
        requestBuilderUpdater.setParam(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(msFloatToNs(desired_exposure_time_ms)));
        requestBuilderUpdater.setParam(CaptureRequest.SENSOR_FRAME_DURATION, 0L);
        requestBuilderUpdater.setParam(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf((int) (desired_digital_gain * desired_analog_gain * ((Integer) ((Range) physicalCharacteristics.b(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue())));
        requestBuilderUpdater.setParam(CaptureRequest.BLACK_LEVEL_LOCK, Boolean.valueOf(frameRequest.getTry_to_lock_black_level()));
        if (!skipManualAwbSettings(ndrVar)) {
            requestBuilderUpdater.setParam(CaptureRequest.CONTROL_AWB_MODE, 0);
            requestBuilderUpdater.setParam(CaptureRequest.COLOR_CORRECTION_MODE, 0);
            AwbInfo awb = frameRequest.getAwb();
            if (!awb.Check()) {
                Log.w(TAG, "updateFromFrameRequest - invalid AwbInfo");
            }
            int[] redBlueSourceIndicesForCfa = getRedBlueSourceIndicesForCfa(((Integer) physicalCharacteristics.b(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue());
            float[] gains = awb.getGains();
            requestBuilderUpdater.setParam(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(gains[redBlueSourceIndicesForCfa[0]], gains[redBlueSourceIndicesForCfa[1]], gains[redBlueSourceIndicesForCfa[2]], gains[redBlueSourceIndicesForCfa[3]]));
            requestBuilderUpdater.setParam(CaptureRequest.COLOR_CORRECTION_TRANSFORM, convertToColorSpaceTransform(awb.getRgb2rgb()));
        }
        requestBuilderUpdater.setParam(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1);
        requestBuilderUpdater.setParam(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1);
        requestBuilderUpdater.setParam(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.faceDetectMode));
        requestBuilderUpdater.setParam(CaptureRequest.EDGE_MODE, 0);
        requestBuilderUpdater.setParam(CaptureRequest.NOISE_REDUCTION_MODE, 0);
    }

    private static void updateNormalizedLandmark(Face face, LandmarkIndex landmarkIndex, int i, int i2, FaceInfo faceInfo) {
        Point landmarkLocation = landmarkIndex.getLandmarkLocation(face);
        if (landmarkLocation != null) {
            FaceInfo.Landmark landmark = new FaceInfo.Landmark();
            landmark.setX(landmarkLocation.x / i);
            landmark.setY(landmarkLocation.y / i2);
            faceInfo.getLandmarks().set(landmarkIndex.getIndex(), landmark);
        }
    }

    private static void updatePhysicalAeShotParams(AeShotParams aeShotParams, myo myoVar, ndr ndrVar, float f, float f2, MeshWarp meshWarp, mjs mjsVar) {
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AE_REGIONS);
        Rect rect = (Rect) qdu.d((Rect) ndrVar.a(CaptureResult.SCALER_CROP_REGION));
        qdu.a(!rect.isEmpty(), "Invalid scaler crop region: %s", rect);
        Rect rect2 = (Rect) myoVar.b(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        Rect a = mix.a(mjsVar).a(rect);
        if (!translateAeCrop(a, rect2, meshWarp)) {
            Log.w(TAG, "translateAeCrop failed because translation exceeds active array.");
        }
        aeShotParams.setCrop(convertToNormalizedRect(a, rect2));
        appendMeteringRectanglesAsGcamWeightedNormalizedRects(meteringRectangleArr, a, f, f2, rect2, aeShotParams.getWeighted_metering_areas());
    }
}
