package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: geh  reason: default package */
/* loaded from: classes.dex */
public final class geh implements gei {
    private static final MeteringRectangle[] a = {new MeteringRectangle(0, 0, 0, 0, 0)};

    public static gei a() {
        return geg.a;
    }

    @Override // defpackage.gei
    public final MeteringRectangle[] a(Rect rect) {
        return a;
    }

    @Override // defpackage.gei
    public final MeteringRectangle[] b(Rect rect) {
        return a;
    }
}