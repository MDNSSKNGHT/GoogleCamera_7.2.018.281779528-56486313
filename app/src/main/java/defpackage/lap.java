package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2019.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: lap  reason: default package */
/* loaded from: classes.dex */
public final class lap {
    public static final CaptureRequest.Key a;
    public static final CaptureResult.Key b;
    public static final CaptureRequest.Key c;
    public static final CaptureResult.Key d;
    public static final CaptureRequest.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureRequest.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureRequest.Key m;
    public static final CaptureRequest.Key n;
    public static final CaptureRequest.Key o;
    public static final CaptureResult.Key p;
    private static final boolean q = laq.a(4);

    static {
        a = a(1) ? ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED : null;
        if (a(1)) {
            CaptureResult.Key key = ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        if (a(1)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        if (a(2)) {
            CaptureRequest.Key key3 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (a(2)) {
            CaptureResult.Key key4 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        b = a(2) ? ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : null;
        c = a(2) ? ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : null;
        d = a(2) ? ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : null;
        e = a(3) ? ExperimentalKeys.REQUEST_IPE_INFO_ENABLED : null;
        if (a(3)) {
            CaptureResult.Key key5 = ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key6 = ExperimentalKeys.RESULT_IPE_INFO;
        }
        f = a(3) ? ExperimentalKeys.REQUEST_IFE_INFO_ENABLED : null;
        if (a(3)) {
            CaptureResult.Key key7 = ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key8 = ExperimentalKeys.RESULT_IFE_INFO;
        }
        g = a(3) ? ExperimentalKeys.REQUEST_BPS_INFO_ENABLED : null;
        if (a(3)) {
            CaptureResult.Key key9 = ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key10 = ExperimentalKeys.RESULT_BPS_INFO;
        }
        if (a(4)) {
            CameraCharacteristics.Key key11 = ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        }
        h = a(4) ? ExperimentalKeys.REQUEST_MESH_WARP_MODE : null;
        if (a(4)) {
            CaptureResult.Key key12 = ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        i = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_SIZE : null;
        j = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : null;
        k = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_DATA : null;
        l = a(8) ? ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : null;
        m = a(5) ? ExperimentalKeys.REQUEST_HDRNET_MODE : null;
        if (a(5)) {
            CaptureResult.Key key13 = ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        n = a(6) ? ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : null;
        if (a(6)) {
            CaptureResult.Key key14 = ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        o = a(7) ? ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : null;
        p = a(7) ? ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT : null;
    }

    private static boolean a(int i2) {
        if (q) {
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
