package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gdr  reason: default package */
/* loaded from: classes.dex */
final class gdr implements pjr {
    @Override // defpackage.pjr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return ggt.a(CaptureRequest.CONTROL_AF_TRIGGER, (Object) 1);
        }
        return ggt.a();
    }
}