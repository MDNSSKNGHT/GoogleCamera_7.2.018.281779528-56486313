package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ggt  reason: default package */
/* loaded from: classes.dex */
public final class ggt {
    private ggt() {
    }

    public static ggt e() {
        return new ggt();
    }

    public static moq c() {
        moo h = moq.h();
        h.b(1);
        h.a(2);
        h.c(1);
        return h.a();
    }

    public static moq d() {
        moo h = moq.h();
        h.b(2);
        h.a(2);
        h.c(1);
        return h.a();
    }

    public static moq b() {
        moo h = moq.h();
        h.b(3);
        h.a(3);
        h.c(1);
        return h.a();
    }

    public static psl a(boolean z) {
        if (z) {
            return psl.a(new ggn(CaptureRequest.FLASH_MODE, 0), new ggn(CaptureRequest.CONTROL_AE_MODE, 1), new ggn(lam.a, 1), new ggn(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1));
        }
        return psl.b(new ggn(CaptureRequest.FLASH_MODE, 0), new ggn(CaptureRequest.CONTROL_AE_MODE, 1));
    }

    public static mcs a(CaptureRequest.Key key, mcs mcsVar) {
        return mdg.a(mdg.a(mcsVar, new ggs(key)), ggr.a);
    }

    public static ggq a(CaptureRequest.Key key, Object obj) {
        return a(new ggn(key, obj));
    }

    public static ggq a(ggn ggnVar) {
        return new ggq(pix.a, Collections.emptySet(), Collections.emptySet(), psl.c(ggnVar));
    }

    public static ggq a(List list) {
        return new ggq(pix.a, Collections.emptySet(), Collections.emptySet(), psl.a(list));
    }

    public static ggq a() {
        return new ggq(pix.a, Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }
}