package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2018.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: lao  reason: default package */
/* loaded from: classes.dex */
public final class lao {
    public static final CaptureResult.Key a;
    public static final CameraCharacteristics.Key b;
    public static final CameraCharacteristics.Key c;
    public static final CameraCharacteristics.Key d;
    public static final CameraCharacteristics.Key e;
    public static final CameraCharacteristics.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureRequest.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureResult.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureRequest.Key s;
    public static final CaptureResult.Key t;
    private static final boolean u = laq.a(3);
    private static final boolean v = laq.a(4);

    static {
        CaptureResult.Key key;
        CaptureRequest.Key key2;
        CaptureResult.Key key3;
        CaptureResult.Key key4;
        CaptureResult.Key key5;
        CaptureResult.Key key6;
        CaptureResult.Key key7;
        CaptureResult.Key key8;
        CaptureResult.Key key9;
        CaptureResult.Key key10;
        CaptureResult.Key key11;
        CaptureRequest.Key key12;
        CaptureResult.Key key13 = null;
        if (a(2)) {
            key = ExperimentalKeys.EXPERIMENTAL_FOCUS_OBJ_TOO_CLOSE;
        } else {
            key = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        }
        a = key;
        if (a(5)) {
            CaptureResult.Key key14 = ExperimentalKeys.EXPERIMENTAL_3A_SPECTRAL_DATA;
        }
        b = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : null;
        c = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : null;
        d = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : null;
        e = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : null;
        f = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : null;
        if (a(13)) {
            CameraCharacteristics.Key key15 = ExperimentalKeys.NEXUS_EXPERIMENTAL_FRONT_STEREO_CAL;
        }
        if (a(7)) {
            CaptureRequest.Key key16 = ExperimentalKeys.EXPERIMENTAL_REQUEST_BAYER_GRID_STATS;
        }
        if (a(7)) {
            CaptureResult.Key key17 = ExperimentalKeys.EXPERIMENTAL_BAYER_GRID_STATS;
        }
        g = a(8) ? ExperimentalKeys.EXPERIMENTAL_THERMAL_INFO : null;
        if (a(9)) {
            key2 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_ENABLED;
        } else {
            key2 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        }
        h = key2;
        if (a(9)) {
            key3 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AEC;
        } else {
            key3 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        }
        i = key3;
        if (a(9)) {
            key4 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AF;
        } else {
            key4 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AF;
        }
        j = key4;
        if (a(9)) {
            key5 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AWB;
        } else {
            key5 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        }
        k = key5;
        if (a(12)) {
            CameraCharacteristics.Key key18 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (v) {
            CameraCharacteristics.Key key19 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        }
        if (a(12)) {
            key6 = ExperimentalKeys.EXPERIMENTAL_FACE_SKIPFRAME;
        } else {
            key6 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        }
        l = key6;
        if (a(12)) {
            key7 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_COUNT;
        } else {
            key7 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        }
        m = key7;
        if (a(12)) {
            key8 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_IDS;
        } else {
            key8 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        }
        n = key8;
        if (a(12)) {
            key9 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_XY;
        } else {
            key9 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        }
        o = key9;
        if (a(12)) {
            key10 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_DEPTH;
        } else {
            key10 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        }
        p = key10;
        if (a(12)) {
            key11 = ExperimentalKeys.EXPERIMENTAL_FACE_ORIENTATION;
        } else {
            key11 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        }
        q = key11;
        r = a(11) ? ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_INDEX : null;
        if (a(11)) {
            CaptureResult.Key key20 = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_DATA;
        }
        if (a(16)) {
            key12 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB_ENABLED;
        } else {
            key12 = !v ? null : com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        }
        s = key12;
        if (a(16)) {
            key13 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB;
        } else if (v) {
            key13 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        t = key13;
        if (a(16)) {
            CaptureRequest.Key key21 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE_ENABLED;
        } else if (v) {
            CaptureRequest.Key key22 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        if (a(16)) {
            CaptureResult.Key key23 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE;
        } else if (v) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AE;
        }
    }

    private static boolean a(int i2) {
        if (u) {
            try {
                return i2 <= ExperimentalKeys.getLibraryVersion();
            } catch (NoSuchFieldError e2) {
                return false;
            } catch (NoSuchMethodError e3) {
                return false;
            }
        }
        return false;
    }
}
