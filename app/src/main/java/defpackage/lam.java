package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

import com.google.android.camera.experimental2016.ExperimentalKeys;

public final class lam {
    public static final CaptureRequest.Key<Integer> a;
    public static final CaptureResult.Key<Integer> b;
    private static final boolean c = laq.a(1);
    private static final boolean d = laq.a(2);
    private static final boolean e = laq.a(3);
    private static final boolean f = laq.a(4);
    private static final boolean g = true;

    static {
        if (c) {
            a = ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (d) {
            a = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (e) {
            a = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (f) {
            a = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else {
            a = null;
        }
        if (c) {
            CaptureResult.Key<Integer> key = ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (d) {
            CaptureResult.Key<Integer> key = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (e) {
            CaptureResult.Key<Integer> key = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (f) {
            CaptureResult.Key<Integer> key = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        if (g) {
            b = CaptureResult.CONTROL_AF_SCENE_CHANGE;
        } else if (c) {
            b = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        } else if (d) {
            b = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        } else {
            b = null;
        }
    }
}