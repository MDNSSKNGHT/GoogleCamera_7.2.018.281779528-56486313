package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: lan  reason: default package */
/* loaded from: classes.dex */
public final class lan {
    public static final CameraCharacteristics.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureResult.Key d;
    @Deprecated
    public static final CaptureResult.Key e;
    @Deprecated
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureRequest.Key j;
    public static final CameraCharacteristics.Key k;
    public static final CameraCharacteristics.Key l;
    public static final CameraCharacteristics.Key m;
    public static final CameraCharacteristics.Key n;
    public static final CaptureRequest.Key o;
    public static final Integer p;
    public static final CaptureResult.Key q;
    private static final boolean r = laq.a(2);
    private static final boolean s = laq.a(3);
    private static final boolean t = laq.a(4);

    static {
        if (r) {
            CaptureRequest.Key key = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM_MODE;
        }
        if (r) {
            CameraCharacteristics.Key key2 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS;
        }
        if (r) {
            CaptureRequest.Key key3 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_BUCKET_COUNT;
        }
        if (r) {
            CaptureResult.Key key4 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM;
        }
        CaptureResult.Key key5 = null;
        a = r ? ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION : null;
        if (r && e()) {
            CameraCharacteristics.Key key6 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_DIMENSIONS;
        }
        b = (r && e()) ? ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE : null;
        if (r) {
            CaptureRequest.Key key7 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        }
        if (r) {
            CaptureResult.Key key8 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        }
        if (r) {
            CaptureResult.Key key9 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_VSYNC;
        }
        c = r ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME : null;
        d = r ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME : null;
        e = r ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X : null;
        f = r ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y : null;
        g = (r && c()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X : null;
        h = (r && c()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y : null;
        i = (r && d()) ? ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST : null;
        if (f()) {
            CaptureResult.Key key10 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        }
        if (f()) {
            CaptureRequest.Key key11 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        }
        if (f()) {
            CaptureResult.Key key12 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        }
        if (f()) {
            CaptureResult.Key key13 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        }
        if (f()) {
            CaptureRequest.Key key14 = ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE;
        }
        j = (r && g()) ? ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS : (s && g()) ? com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        if (h()) {
            CaptureResult.Key key15 = ExperimentalKeys.EXPERIMENTAL_CONTROL_SCENE_DISTANCE;
        }
        if (r && a()) {
            CameraCharacteristics.Key key16 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP;
        }
        if (r && a()) {
            CameraCharacteristics.Key key17 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP;
        }
        if (r && a()) {
            CameraCharacteristics.Key key18 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_DCC;
        }
        k = (r && b()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS : (s && b()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_NUM_LIGHTS : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        l = (r && b()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS : (s && b()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_R_OVER_G_RATIOS : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        m = (r && b()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS : (s && b()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_B_OVER_G_RATIOS : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        n = (r && b()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : (s && b()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        o = (r && i()) ? ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE : (s && i()) ? com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE : !t ? null : com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        p = 1;
        if (!r || !i()) {
            if (s && i()) {
                CaptureResult.Key key19 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
            } else if (t) {
                CaptureResult.Key key20 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
            }
        } else {
            CaptureResult.Key key21 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        }
        if (!r || !i()) {
            if (s && i()) {
                CaptureResult.Key key22 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
            } else if (t) {
                CaptureResult.Key key23 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
            }
        } else {
            CaptureResult.Key key24 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        }
        if (!r || !i()) {
            if (s && i()) {
                key5 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
            } else if (t) {
                key5 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
            }
        } else {
            key5 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        }
        q = key5;
    }

    private static boolean d() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() >= 2;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean g() {
        boolean z = false;
        try {
            if (r) {
                if (ExperimentalKeys.getLibraryVersion() < 5) {
                    return false;
                }
            } else if (!s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 3) {
                return false;
            }
            z = true;
            return true;
        } catch (NoSuchFieldError e2) {
            return z;
        } catch (NoSuchMethodError e3) {
            return z;
        }
    }

    private static boolean f() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() >= 4;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean i() {
        boolean z = false;
        try {
            if (r) {
                if (ExperimentalKeys.getLibraryVersion() < 9) {
                    return false;
                }
            } else if (!s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 4) {
                return false;
            }
            z = true;
            return true;
        } catch (NoSuchFieldError e2) {
            return z;
        } catch (NoSuchMethodError e3) {
            return z;
        }
    }

    private static boolean c() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() >= 3;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean a() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() >= 7;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean e() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() > 0;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean h() {
        if (r) {
            try {
                return ExperimentalKeys.getLibraryVersion() >= 6;
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }

    private static boolean b() {
        boolean z = false;
        try {
            if (r) {
                if (ExperimentalKeys.getLibraryVersion() < 10) {
                    return false;
                }
            } else if (!s || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() <= 0) {
                return false;
            }
            z = true;
            return true;
        } catch (NoSuchFieldError e2) {
            return z;
        } catch (NoSuchMethodError e3) {
            return z;
        }
    }
}
