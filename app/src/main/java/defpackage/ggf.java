package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: ggf  reason: default package */
/* loaded from: classes.dex */
public final class ggf implements gfe {
    @Override // defpackage.gfe
    public final boolean a(ndr ndrVar) {
        if (ndrVar != null) {
            Integer num = (Integer) ndrVar.a(CaptureResult.CONTROL_AE_STATE);
            Integer num2 = (Integer) ndrVar.a(CaptureResult.CONTROL_AF_STATE);
            return num != null && num2 != null && !Objects.equals(0, num) && !Objects.equals(5, num) && !Objects.equals(3, num2);
        }
        return false;
    }
}