package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;

/* compiled from: PG */
/* renamed from: gmw  reason: default package */
/* loaded from: classes.dex */
final class gmw extends mrx {
    private final mjw a;

    public gmw(mjw mjwVar) {
        this.a = mjwVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        this.a.a(gmy.a((Float) ndrVar.a(CaptureResult.LENS_FOCUS_DISTANCE), (Pair) ndrVar.a(CaptureResult.LENS_FOCUS_RANGE)));
    }
}