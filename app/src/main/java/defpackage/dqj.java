package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientExifMetadata;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GenerateRgbImageOptions;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.LockedBitmap;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotCallbacks;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.ViewfinderProcessingOptions;
import com.google.googlex.gcam.clientallocator.UniqueYuvClientAllocator;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.hdrplus.ImageConverter;
import com.google.googlex.gcam.hdrplus.ImageProxyAndHardwareBufferReleaseCallback;
import com.google.googlex.gcam.hdrplus.InputView;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import com.google.googlex.gcam.image.ImageUtils;
import java.io.File;
import java.util.Iterator;

final class dqj implements dqg {
    private static final String c = liu.a("HdrPlusSession");
    private final dpa A;
    private final dqe B;
    private final mcs C;
    private final mkg D;
    private final mkn E;
    public final drc b;
    private final String d;
    private final Gcam e;
    private final HdrPlusInterface f = new HdrPlusInterface();
    private final dop g;
    private final cin h;
    private final mcs i;
    private final drf j;
    private final DisplayMetrics k;
    private final MetadataConverter l;
    private final ImageConverter m;
    private final myo n;
    private final mjs o;
    private final rhd p;
    private final ezm q;
    private final mba r;
    private final gep s;
    private final rhd t;
    private String u;
    private final izm v;
    private final cjn w;
    private final crb x;
    private final dow y;
    private final doe z;

    @Override // defpackage.dqg
    public dop a() {
        return this.g;
    }

    public dqj(DisplayMetrics displayMetrics, dop dopVar, drc drcVar, MetadataConverter metadataConverter, ImageConverter imageConverter, myo myoVar, gct gctVar, gtb gtbVar, Gcam gcam, ViewfinderProcessingOptions viewfinderProcessingOptions, rhd rhdVar, cin cinVar, ezm ezmVar, mba mbaVar, gep gepVar, drf drfVar, rhd rhdVar2, izm izmVar, cjn cjnVar, crb crbVar, dow dowVar, doe doeVar, dpa dpaVar, dqe dqeVar, mdl mdlVar, mkg mkgVar, mkn mknVar) {
        new mch(new AeResults());
        this.k = displayMetrics;
        this.g = dopVar;
        this.b = drcVar;
        this.l = metadataConverter;
        this.m = imageConverter;
        this.n = myoVar;
        this.e = gcam;
        this.i = gctVar.b;
        this.h = cinVar;
        this.q = ezmVar;
        this.r = mbaVar;
        this.s = gepVar;
        this.j = drfVar;
        this.t = rhdVar2;
        this.v = izmVar;
        this.w = cjnVar;
        this.x = crbVar;
        this.y = dowVar;
        this.z = doeVar;
        this.C = mdlVar;
        this.A = dpaVar;
        this.B = dqeVar;
        this.o = gtbVar.b;
        this.p = rhdVar;
        this.u = null;
        this.E = mknVar;
        this.D = mkgVar.a("HdrPlusSession");
        this.d = GcamModule.getKRequestCameraTele();
        gcam.ConfigureViewfinderProcessing(viewfinderProcessingOptions);
    }

    @Override // defpackage.dqg
    public void d(dse dseVar) {
        int a = dseVar.a();
        this.E.b("AbortShot-" + a);
        this.e.AbortShot(a);
        this.E.a();
    }

    @Override // defpackage.dqg
    public void a(dse dseVar, int i, ndr ndrVar, neb nebVar, neb nebVar2) {
        Pair create;
        ImageProxyAndHardwareBufferReleaseCallback.Key register;
        InputView inputView;
        this.E.b("AddPayloadFrame-" + i);
        GyroSampleVector b = b((ndn) ndrVar);
        this.E.b("metadata");
        FrameMetadata frameMetadata = new FrameMetadata();
        if (ndrVar != null) {
            frameMetadata = a(ndrVar, b);
        }
        FrameMetadata frameMetadata2 = frameMetadata;
        if (nebVar != null) {
            if (!this.h.c(cjb.r)) {
                cin cinVar = this.h;
                ciq ciqVar = ciu.a;
                cinVar.b();
            } else {
                String sb2 = "  Result frame " +
                        i;
                bgg.a(sb2, ndrVar, new File((String) qdu.d(this.u), "payload_burst_actual_hal3.txt"));
            }
        }
        dseVar.e.add((Long) qdu.d((Long) ndrVar.a(CaptureResult.SENSOR_TIMESTAMP)));
        dseVar.d.add(ndrVar);
        SpatialGainMap convertToSpatialGainMap = this.l.convertToSpatialGainMap(ndrVar);
        this.E.a();
        drc drcVar = this.b;
        if (nebVar == null) {
            create = Pair.create(new InputView(GcamModule.getKInvalidImageId(), new RawWriteView()), new InputView(GcamModule.getKInvalidImageId(), 0L));
        } else {
            qdu.b(drcVar.c.isCompatibleRawFormat(nebVar.b()), "Incompatible Raw image format: %s", nebVar.b());
            HardwareBuffer g = nebVar.g();
            if (g != null) {
                register = drcVar.e.register(nebVar, g);
                inputView = new InputView(register.hardwareBufferId, AndroidJniUtils.getAHardwareBufferPtr(g));
            } else {
                register = drcVar.e.register(nebVar);
                inputView = new InputView(GcamModule.getKInvalidImageId(), 0L);
            }
            create = Pair.create(new InputView(register.imageId, drcVar.c.wrapRawWriteView(nebVar)), inputView);
        }
        InputView a = this.b.a(nebVar2);
        if (!this.e.AddPayloadFrame(dseVar.a(), frameMetadata2, convertToSpatialGainMap, ((InputView) create.first).imageId, (RawWriteView) ((InputView) create.first).view, a.imageId, (InterleavedWriteViewU16) a.view, ((InputView) create.second).imageId, ((Long) ((InputView) create.second).view).longValue())) {
            liu.a(c, fpp.a("addPayloadFrame for shot %d failed, closing input images at frame index %d.", Integer.valueOf(dseVar.a()), Integer.valueOf(i)));
            if (nebVar != null) {
                nebVar.close();
            }
            if (nebVar2 != null) {
                nebVar2.close();
            }
        }
        this.E.a();
    }

    @Override // defpackage.dqg
    public void a(int i, grj grjVar, neb nebVar, ndr ndrVar) {
        drg a = a(grjVar, nebVar, ndrVar, this.o);
        this.f.addViewfinderFrame(Gcam.getCPtr(this.e), i, FrameMetadata.getCPtr(a.b()), SpatialGainMap.getCPtr(a.c()), AeShotParams.getCPtr(a.d()), RawWriteView.getCPtr(a.a()), new dqh(nebVar));
    }

    @Override // defpackage.dqg
    public void b(dse dseVar) {
        a(dseVar, new BurstSpec());
    }

    @Override // defpackage.dqg
    public void a(dse dseVar, BurstSpec burstSpec) {
        int a = dseVar.a();
        this.E.b("BeginPayloadFrames-" + a);
        this.e.BeginPayloadFrames(dseVar.a(), burstSpec);
        this.E.a();
    }

    @Override // defpackage.dqg
    public BurstSpec b(dse dseVar, grj grjVar, neb nebVar, ndr ndrVar) throws mmh {
        this.D.b("buildAfBurstSpec()");
        b();
        drg drgVar = (drg) qdu.d(a(grjVar, nebVar, ndrVar, this.o));
        if (drgVar.b() == null || drgVar.a() == null || drgVar.c() == null) {
            this.D.c("buildAfBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
            return new BurstSpec();
        }
        return this.e.BuildAfBurstSpec(dseVar.a(), drgVar.a(), drgVar.b(), drgVar.c());
    }

    @Override // defpackage.dqg
    public BurstSpec a(dse dseVar, grj grjVar, neb nebVar, ndr ndrVar) throws mmh {
        this.D.b("buildPayloadBurstSpec()");
        b();
        drg drgVar = (drg) qdu.d(a(grjVar, nebVar, ndrVar, this.o));
        if (drgVar.b() == null || drgVar.a() == null || drgVar.c() == null) {
            this.D.c("buildPayloadBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
            return new BurstSpec();
        }
        return this.e.BuildPayloadBurstSpec(dseVar.a(), drgVar.a(), drgVar.b(), drgVar.c());
    }

    private void b() throws mmh {
        if (this.r.a()) {
            throw new mmh("Camera already closed");
        }
    }

    @Override // defpackage.dqg
    public AeResults a(drg drgVar) {
        AeShotParams d = drgVar.d();
        RawWriteView a = drgVar.a();
        FrameMetadata b = drgVar.b();
        SpatialGainMap c2 = drgVar.c();
        int c3 = c(b.getSensor_id());
        return Gcam.ComputeAeResults(this.e.GetStaticMetadata(c3), this.e.GetTuning(c3), d, a, b, c2, false);
    }

    @Override // defpackage.dqg
    public FrameMetadata a(ndr ndrVar, GyroSampleVector gyroSampleVector) {
        if (!this.h.c(ciu.A)) {
            return this.l.convertToGcamFrameMetadata(ndrVar, gyroSampleVector);
        }
        FrameMetadataKey convertToGcamFrameMetadataKey = this.l.convertToGcamFrameMetadataKey(ndrVar);
        if (convertToGcamFrameMetadataKey == null) {
            return this.l.convertToGcamFrameMetadata(ndrVar, gyroSampleVector);
        }
        FrameMetadata frameMetadata = new FrameMetadata();
        return !this.e.OverrideFrameMetadata(convertToGcamFrameMetadataKey, frameMetadata) ? this.l.convertToGcamFrameMetadata(ndrVar, gyroSampleVector) : frameMetadata;
    }

    @Override // defpackage.dqg
    public drg a(grj grjVar, neb nebVar, ndr ndrVar, mjs mjsVar) {
        qdu.d(nebVar);
        qdu.d(this.m.isCompatibleRawFormat(nebVar.b()));
        RawWriteView wrapRawWriteView = this.m.wrapRawWriteView(nebVar);
        FrameMetadata convertToGcamFrameMetadata = this.l.convertToGcamFrameMetadata(ndrVar, b((ndn) ndrVar));
        dng dngVar = new dng(wrapRawWriteView, convertToGcamFrameMetadata, this.l.convertToSpatialGainMap(ndrVar), a(this.l.getExposureCompensationStops(((Integer) qdu.d((Integer) ndrVar.a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION))).intValue()), grjVar), convertToGcamFrameMetadata.getActual_exposure_time_ms() * convertToGcamFrameMetadata.getActual_analog_gain() * convertToGcamFrameMetadata.getApplied_digital_gain() * convertToGcamFrameMetadata.getPost_raw_digital_gain());
        this.l.updateAeShotParams(dngVar.a, ndrVar, 0.1225f, this.h.f(cim.a), mjsVar);
        return dngVar;
    }

    private AeShotParams a(float f, grj grjVar) {
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.setExposure_compensation(f);
        aeShotParams.setTarget_width(this.o.a);
        aeShotParams.setTarget_height(this.o.b);
        if (this.j == drf.PORTRAIT) {
            aeShotParams.setUx_mode(3);
        } else if (this.j == drf.LONG_EXPOSURE) {
            aeShotParams.setUx_mode(4);
        } else if (this.j != drf.REGULAR) {
            throw new IllegalStateException(String.format("Unknown HdrPlusType: %s.", this.j));
        } else {
            if (grjVar == grj.AUTO || grjVar == grj.OFF) {
                aeShotParams.setUx_mode(1);
            } else if (grjVar == grj.ON) {
                aeShotParams.setUx_mode(2);
            }
        }
        aeShotParams.setSpoofed_touch_rectangle(mmk.a());
        return aeShotParams;
    }

    private ShotParams a(float f, int i, grj grjVar, gri griVar, int i2, boolean z, boolean z2) {
        ShotParams shotParams = new ShotParams();
        shotParams.setImage_rotation(doe.a(i));
        shotParams.setManually_rotate_final_jpg(true);
        shotParams.setSave_merged_dng(z);
        shotParams.setCompress_merged_dng(true);
        AeShotParams a = a(f, grjVar);
        shotParams.setAe(a);
        if (this.j == drf.PORTRAIT) {
            shotParams.setResampling_method_override(0);
            shotParams.getAe().setTarget_width(0);
            shotParams.getAe().setTarget_height(0);
            if (this.e.GetStaticMetadata(i2).getSensor_id() == 0) {
                shotParams.getAe().setMerged_crop(hwd.a);
            }
        }
        cin cinVar = this.h;
        ciq ciqVar = ciu.a;
        cinVar.c();
        this.h.b();
        if (!this.g.a.d(cit.V)) {
            shotParams.setIcc_output_profile_override(1);
        }
        shotParams.setFlash_mode(griVar != gri.AUTO ? griVar != gri.ON ? 2 : 1 : 0);
        shotParams.setAllow_temporal_binning(dop.b(this.h));
        this.h.b();
        shotParams.setRecompute_wb_on_base_frame(this.h.d(ciu.s) && ((a.getUx_mode() == 2 && this.h.d(ciu.l)) || this.j == drf.LONG_EXPOSURE));
        this.h.b();
        boolean z3 = dop.a(this.h) && this.j != drf.PORTRAIT && (((Float) this.C.a()).floatValue() >= 1.2f || (this.j == drf.LONG_EXPOSURE && this.h.d(ciu.y)) || (this.e.GetStaticMetadata(i2).getSensor_id() == 4 && this.h.d(ciu.x)));
        this.h.b();
        shotParams.setAllow_sabre(z3);
        int nonzsl_frame_count_override = shotParams.getNonzsl_frame_count_override();
        this.h.b();
        if (z3 && this.j != drf.LONG_EXPOSURE) {
            nonzsl_frame_count_override = Math.max(nonzsl_frame_count_override, ((Integer) this.h.a(ciu.j).b()).intValue());
        }
        if (this.j == drf.LONG_EXPOSURE) {
            int intValue = ((Integer) qdu.d((Integer) this.n.a(CameraCharacteristics.LENS_FACING))).intValue();
            nonzsl_frame_count_override = (z3 && intValue == 1) ? Math.max(nonzsl_frame_count_override, 15) : Math.max(nonzsl_frame_count_override, 13);
            shotParams.setNonzsl_motion_ef_enabled(this.g.a());
            this.g.a.b();
            shotParams.setTripod_max_total_capture_time_ms(this.e.GetTuning(i2).getPhysical_stability_params().getMax_handheld_shot_capture_time_ms());
            if (this.g.a.c(ciu.n) && this.A.a()) {
                if (intValue == 1) {
                    shotParams.setDevice_is_on_tripod(true);
                    Iterator it = this.B.b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            shotParams.setTripod_max_total_capture_time_ms(Float.POSITIVE_INFINITY);
                            break;
                        } else if (((Long) it.next()).longValue() >= dqe.a) {
                            shotParams.setTripod_max_total_capture_time_ms(15000.0f);
                            shotParams.setTripod_max_exposure_time_ms(1000.0f);
                            break;
                        }
                    }
                }
                Float f2 = (Float) this.h.g(ciu.p).c();
                if (f2 != null) {
                    shotParams.setTripod_max_exposure_time_ms(f2.floatValue() * 1000.0f);
                }
            }
            dop dopVar = this.g;
            if (dopVar.a.a(ciu.b).a() && ((Integer) dopVar.a.a(ciu.b).b()).intValue() > 0) {
                shotParams.setPsaf_frame_count(((Integer) this.h.a(ciu.b).a((Object) 0)).intValue());
                pjz g = this.h.g(ciu.t);
                if (g.a()) {
                    shotParams.setPsaf_log_scene_brightness_threshold_override(((Float) g.b()).floatValue());
                }
            }
        }
        shotParams.setAllow_base_frame_reuse(z2);
        shotParams.setNonzsl_frame_count_override(nonzsl_frame_count_override);
        shotParams.setOptimize_sky(this.g.a.c(ciu.o));
        shotParams.setNonzsl_extended_base_frame_selection(this.h.c());
        return shotParams;
    }

    @Override // defpackage.dqg
    public boolean c(dse dseVar) {
        ClientExifMetadata clientExifMetadata;
        kfv a;
        int a2 = dseVar.a();
        mkn mknVar = this.E;
        String sb = "EndPayloadFrames-" +
                a2;
        mknVar.b(sb);
        this.E.b("location");
        pjz d = this.q.d();
        if (!d.a()) {
            clientExifMetadata = null;
        } else {
            Location location = (Location) d.b();
            LocationData locationData = new LocationData();
            locationData.setAltitude(location.getAltitude());
            locationData.setDegree_of_precision(location.getAccuracy());
            locationData.setLatitude(location.getLatitude());
            locationData.setLongitude(location.getLongitude());
            locationData.setTimestamp_unix(location.getTime() / 1000);
            locationData.setProcessing_method(location.getProvider());
            clientExifMetadata = new ClientExifMetadata();
            clientExifMetadata.setLocation(locationData);
        }
        this.E.c("gcam");
        boolean EndPayloadFrames = this.e.EndPayloadFrames(a2, clientExifMetadata);
        if (!EndPayloadFrames) {
            this.D.c("EndPayloadFrames() failed.");
        } else {
            this.E.c("progress");
            igv igvVar = dseVar.c.b;
            if (igvVar == null || ihw.NORMAL != igvVar.m()) {
                a = obr.a(2131952421, new Object[0]);
            } else {
                a = obr.a(2131952285, new Object[0]);
            }
            dseVar.c.d.a(a);
            dseVar.c.d.a(this.a, 0.0f);
        }
        this.E.a();
        this.E.a();
        return EndPayloadFrames;
    }

    @Override // defpackage.dqg
    public boolean a(dse dseVar) {
        int a = dseVar.a();
        mkn mknVar = this.E;
        String sb = "EndShotCapture-" +
                a;
        mknVar.b(sb);
        boolean EndShotCapture = this.e.EndShotCapture(a);
        this.E.a();
        return EndShotCapture;
    }

    @Override // defpackage.dqg
    public void b(int i) {
        this.e.FlushTemporalBinning(i);
    }

    @Override // defpackage.dqg
    public void a(int i) {
        this.e.FlushViewfinder(i);
    }

    @Override // defpackage.dqg
    public Bitmap a(neb nebVar, ndr ndrVar, grj grjVar, gri griVar, mjs mjsVar, Integer num, Integer num2) {
        StaticMetadata convertToGcamStaticMetadata = MetadataConverter.convertToGcamStaticMetadata(this.l.getPhysicalCharacteristics(ndrVar));
        ShotParams a = a(this.l.getExposureCompensationStops(((Integer) ((mch) this.i).c).intValue()), 0, grjVar, griVar, a((ndn) ndrVar), false, false);
        this.l.updateAeShotParams(a.getAe(), ndrVar, 0.1225f, this.h.f(cim.a), mjsVar == null ? this.o : mjsVar);
        if (mjsVar != null) {
            a.getAe().setTarget_width(mjsVar.a);
            a.getAe().setTarget_height(mjsVar.b);
        }
        FrameMetadata a2 = a(ndrVar, b((ndn) ndrVar));
        RawWriteView wrapRawWriteView = this.m.wrapRawWriteView(nebVar);
        SpatialGainMap convertToSpatialGainMap = this.l.convertToSpatialGainMap(ndrVar);
        GenerateRgbImageOptions generateRgbImageOptions = new GenerateRgbImageOptions();
        generateRgbImageOptions.setExpected_number_of_frames(num.intValue());
        generateRgbImageOptions.setActual_number_of_frames(num2.intValue());
        cin cinVar = this.h;
        ciq ciqVar = ciu.a;
        generateRgbImageOptions.setVerbose(cinVar.b());
        InterleavedImageU8 GenerateRgbImage = Gcam.GenerateRgbImage(convertToGcamStaticMetadata, a, a2, convertToSpatialGainMap, wrapRawWriteView, this.b.b.getExecute_finish_on(), this.b.b.getFinish_threads(), generateRgbImageOptions);
        if (GenerateRgbImage.Empty()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.k, GenerateRgbImage.width(), GenerateRgbImage.height(), Bitmap.Config.ARGB_8888);
        ImageUtils.simpleRgbToAnyRgb(GenerateRgbImage, 5, LockedBitmap.acquire(createBitmap).view());
        return createBitmap;
    }

    private int c(int i) {
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < this.e.GetNumCameras(); i4++) {
            if (this.e.GetStaticMetadata(i4).getSensor_id() == i) {
                i2++;
                i3 = i4;
            }
        }
        int i5 = i2 == 1 ? i3 : -1;
        qdu.c(i5 >= 0);
        return i5;
    }

    @Override // defpackage.dqg
    public int a(ndn ndnVar) {
        return c(MetadataConverter.getGcamSensorId(this.n, ndnVar));
    }

    private GyroSampleVector b(ndn ndnVar) {
        long longValue = (Long) qdu.d((Long) ndnVar.a(CaptureResult.SENSOR_TIMESTAMP));
        long longValue2 = (Long) qdu.d((Long) ndnVar.a(CaptureResult.SENSOR_EXPOSURE_TIME)) + longValue + this.l.getReadoutTimeNs(ndnVar);
        pjz pjzVar = (pjz) this.t.get();
        if (pjzVar.a()) {
            naj najVar = (naj) pjzVar.b();
            this.E.b("gyro");
            GyroSampleVector gyroSampleVector = (GyroSampleVector) najVar.a((-5000000) + longValue, longValue2 + 5000000, doh.a);
            this.E.a();
            return gyroSampleVector;
        }
        return null;
    }

    @Override // defpackage.dqg
    public boolean b(ndr ndrVar) {
        return this.e.GetLatestViewfinderResults(a((ndn) ndrVar)).getIs_on_tripod();
    }

    @Override // defpackage.dqg
    public boolean a(ndr ndrVar) {
        FrameMetadataKey convertToGcamFrameMetadataKey;
        if (!this.h.c(ciu.A) || (convertToGcamFrameMetadataKey = this.l.convertToGcamFrameMetadataKey(ndrVar)) == null) {
            return false;
        }
        return !this.e.ProcessedByTemporalBinning(convertToGcamFrameMetadataKey);
    }

    @Override // defpackage.dqg
    public dse b(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar) {
        this.E.b("HdrPlus#StartMomentsShotCapture");
        try {
            return a(i, dssVar, gnqVar, postviewParams, grjVar, griVar, ndrVar, true, -1, -1, false, true);
        } finally {
            this.E.a();
        }
    }

    @Override // defpackage.dqg
    public dse a(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar) {
        this.E.b("HdrPlus#StartShotCapture");
        try {
            return a(i, dssVar, gnqVar, postviewParams, grjVar, griVar, ndrVar, false, -1, -1, false, false);
        } finally {
            this.E.a();
        }
    }

    private dse a(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar, boolean z, int i2, int i3, boolean z2, boolean z3) {
        ImageSaverParams imageSaverParams;
        int i4;
        this.D.b("startShotCapture()");
        qdu.d(dssVar);
        ShotParams a = a(this.l.getExposureCompensationStops(((Integer) ((mch) this.i).c).intValue()), bgl.a(gnqVar.a.a, this.n), grjVar, griVar, i, dssVar.f().a(), z3);
        a.setWb_mode(this.s.a() == geo.AUTO ? 0 : 1);
        String str = !z ? "n" : "z";
        drf drfVar = drf.REGULAR;
        int ordinal = this.j.ordinal();
        if (ordinal == 0) {
            str = str.concat("d");
        } else if (ordinal == 1) {
            str = str.concat("p");
        } else if (ordinal == 2) {
            str = str.concat("l");
        }
        a.setSoftware_suffix(str);
        qdu.a(i3 >= -1, "Incorrect base frame override.");
        a.setBase_frame_override_index(i3);
        a.setZsl(z);
        if (z) {
            qdu.a(i2 >= -1, "Incorrect base frame hint.");
            a.setZsl_base_frame_index_hint(i2);
        } else {
            AwbInfo awbInfoCaptured = this.l.getAwbInfoCaptured(ndrVar);
            a.setForce_wb(awbInfoCaptured);
            a.setPrevious_viewfinder_wb(awbInfoCaptured);
        }
        float viewfinderTotalExposureTime = this.l.getViewfinderTotalExposureTime(ndrVar);
        a.setPrevious_viewfinder_tet(viewfinderTotalExposureTime);
        this.D.e("takePicture - Using captured WB from viewfinder, Viewfinder TET = " +
                viewfinderTotalExposureTime);
        this.l.updateAeShotParams(a.getAe(), ndrVar, 0.1225f, this.h.f(cim.a), this.o);
        if (z2 && this.j == drf.PORTRAIT) {
            a.getAe().setCrop(new NormalizedRect());
        }
        if (this.j == drf.PORTRAIT) {
            AeShotParams ae = a.getAe();
            if (!ae.getMerged_crop().IsEmpty()) {
                ae.setMerged_crop(GcamModule.Union(ae.getMerged_crop(), ae.getCrop()));
            }
        }
        dse dseVar = new dse(dssVar, this.k, gnqVar, this.b.b.getExecute_finish_on(), this.v, this.w, this.x);
        ShotCallbacks shotCallbacks = new ShotCallbacks();
        if (dseVar.s.a().a()) {
            dseVar.f.setProgressCallback(ShotCallbacks.getCPtr(shotCallbacks), new dru(dseVar));
        }
        shotCallbacks.setStatus_callback(dseVar.g);
        if (dseVar.s.b().a()) {
            dseVar.f.setBaseFrameCallback(ShotCallbacks.getCPtr(shotCallbacks), new drv(dseVar));
        }
        ClientInterleavedU8Allocator clientInterleavedU8Allocator = dseVar.m;
        if (clientInterleavedU8Allocator != null) {
            shotCallbacks.setPostview_rgb_allocator(clientInterleavedU8Allocator);
            shotCallbacks.setPostview_callback(dseVar.h);
        } else {
            UniqueYuvClientAllocator uniqueYuvClientAllocator = dseVar.n;
            if (uniqueYuvClientAllocator != null) {
                shotCallbacks.setPostview_yuv_allocator(uniqueYuvClientAllocator);
                shotCallbacks.setPostview_callback(dseVar.h);
            }
        }
        if (dseVar.s.f().a()) {
            dseVar.f.setMergedDngCallback(ShotCallbacks.getCPtr(shotCallbacks), true, new drw(dseVar));
        }
        if (dseVar.s.g().a()) {
            shotCallbacks.setMerged_raw_image_allocator(dseVar.q);
            shotCallbacks.setMerged_raw_image_callback(dseVar.j);
        }
        if (dseVar.s.n().a()) {
            shotCallbacks.setMutable_merged_raw_callback(dseVar.k);
        }
        if (dseVar.s.h().a()) {
            shotCallbacks.setMerged_pd_allocator(dseVar.r);
            shotCallbacks.setMerged_pd_callback(dseVar.i);
        }
        ClientInterleavedU8Allocator clientInterleavedU8Allocator2 = dseVar.o;
        if (clientInterleavedU8Allocator2 != null) {
            shotCallbacks.setFinal_image_rgb_allocator(clientInterleavedU8Allocator2);
            shotCallbacks.setFinal_image_callback(dseVar.l);
        }
        if (dseVar.s.i().a()) {
            shotCallbacks.setFinal_image_yuv_allocator(dseVar.p);
            shotCallbacks.setFinal_image_callback(dseVar.l);
        }
        if (dseVar.s.l().a()) {
            dseVar.f.setJpegCallback(ShotCallbacks.getCPtr(shotCallbacks), false, new drx(dseVar));
        }
        pjz a2 = ((jdz) this.p).a();
        if (lsh.a(this.h) && a2.a()) {
            ImageSaverParams imageSaverParams2 = new ImageSaverParams();
            igv igvVar = gnqVar.b;
            long o = igvVar != null ? igvVar.o() : System.currentTimeMillis();
            if (((File) a2.b()).getFreeSpace() <= 1073741824) {
                this.x.a("Cache has less than 1GB free. Slowraw data may be silently deleted.");
            }
            if (z2 && this.j == drf.PORTRAIT) {
                doe doeVar = this.z;
                File file = (File) a2.b();
                String valueOf = String.valueOf(this.d);
                this.u = doeVar.a(file, o, valueOf.length() == 0 ? "camera_" : "camera_".concat(valueOf));
            } else {
                this.u = this.z.a((File) a2.b(), o, "");
            }
            imageSaverParams2.setDest_folder(this.u);
            imageSaverParams = imageSaverParams2;
        } else {
            imageSaverParams = null;
        }
        if (dssVar.j().a()) {
            i4 = 3;
        } else if (dssVar.k().a()) {
            i4 = 5;
        } else if (dssVar.i().a()) {
            i4 = 1;
        } else {
            dssVar.l().a();
            i4 = 0;
        }
        doe doeVar2 = this.z;
        DebugParams debugParams = new DebugParams();
        long gcam_save_none = GcamModule.getGCAM_SAVE_NONE();
        if (lsh.a(doeVar2.a)) {
            gcam_save_none = gcam_save_none | GcamModule.getGCAM_SAVE_INPUT_METERING() | GcamModule.getGCAM_SAVE_INPUT_PAYLOAD() | GcamModule.getGCAM_SAVE_TEXT();
        }
        debugParams.setSave_bitmask((int) gcam_save_none);
        this.E.b("Gcam::StartShotCapture");
        int StartShotCapture = this.e.StartShotCapture(i, a, shotCallbacks, i4, postviewParams, debugParams, imageSaverParams, null);
        this.E.a();
        if (StartShotCapture == GcamModule.getKInvalidShotId()) {
            if (this.w == cjn.RELEASE) {
                liu.a(c, "Gcam::StartShotCapture() returned an invalid shot id.");
                return null;
            }
            throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
        }
        dow dowVar = this.y;
        String sb2 = "Registering shot " + StartShotCapture;
        liu.f(dow.a);
        dov dovVar = new dov(StartShotCapture);
        synchronized (dowVar.b) {
            dowVar.c.add(dovVar);
        }
        gnqVar.a.g.a(new dor(dowVar, dovVar));
        this.b.d.put(StartShotCapture, dseVar);
        dqi dqiVar = new dqi(this, StartShotCapture);
        qdu.c(StartShotCapture != GcamModule.getKInvalidShotId());
        qdu.d(dseVar.b == GcamModule.getKInvalidShotId());
        dseVar.b = StartShotCapture;
        dseVar.t = dqiVar;
        return dseVar;
    }

    @Override // defpackage.dqg
    public dse a(int i, dss dssVar, gnq gnqVar, PostviewParams postviewParams, grj grjVar, gri griVar, ndr ndrVar, int i2, int i3, boolean z) {
        this.E.b("HdrPlus#StartZslShotCapture");
        try {
            return a(i, dssVar, gnqVar, postviewParams, grjVar, griVar, ndrVar, true, i2, i3, z, false);
        } finally {
            this.E.a();
        }
    }

    @Override // defpackage.dqg
    public boolean a(int i, long j, ndr ndrVar, neb nebVar, neb nebVar2, ndr ndrVar2, neb nebVar3) {
        FrameMetadata frameMetadata;
        this.E.b("LiveTemporalBinning-" + j);
        GyroSampleVector b = b((ndn) ndrVar);
        this.E.b("metadata");
        FrameMetadata convertToGcamFrameMetadata = this.l.convertToGcamFrameMetadata(ndrVar, b);
        SpatialGainMap convertToSpatialGainMap = this.l.convertToSpatialGainMap(ndrVar);
        this.E.a();
        InputView b2 = this.b.b(nebVar);
        InputView a = this.b.a(nebVar2);
        InputView b3 = this.b.b(nebVar3);
        if (nebVar3 == null || ndrVar2 == null) {
            frameMetadata = new FrameMetadata();
        } else {
            frameMetadata = this.l.convertToGcamFrameMetadata(ndrVar2, b);
        }
        int b4 = this.g.b();
        long j2 = b2.imageId;
        RawWriteView rawWriteView = (RawWriteView) b2.view;
        long j3 = a.imageId;
        InterleavedWriteViewU16 interleavedWriteViewU16 = (InterleavedWriteViewU16) a.view;
        long j4 = b3.imageId;
        RawWriteView rawWriteView2 = (RawWriteView) b3.view;
        ciq ciqVar = ciu.a;
        this.h.b();
        boolean TemporallyBinViewfinderFrame = this.e.TemporallyBinViewfinderFrame(i, convertToGcamFrameMetadata, convertToSpatialGainMap, j2, rawWriteView, j3, interleavedWriteViewU16, frameMetadata, j4, rawWriteView2, false, b4);
        this.E.a();
        return TemporallyBinViewfinderFrame;
    }
}