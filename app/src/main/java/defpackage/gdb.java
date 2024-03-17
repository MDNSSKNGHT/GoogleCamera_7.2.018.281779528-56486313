package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: gdb  reason: default package */
/* loaded from: classes.dex */
public final class gdb extends mrx {
    private final gcz a;

    public gdb(gcz gczVar) {
        this.a = gczVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        int intValue = ((Integer) qdu.d((Integer) ndrVar.a(CaptureResult.CONTROL_AE_MODE))).intValue();
        ibg ibgVar = (ibg) ibg.b.get(Integer.valueOf(intValue));
        if (ibgVar != null) {
            ibg ibgVar2 = (ibg) qdu.d(ibgVar);
            int intValue2 = ((Integer) qdu.d((Integer) ndrVar.a(CaptureResult.CONTROL_AE_STATE))).intValue();
            ibh ibhVar = (ibh) ibh.b.get(Integer.valueOf(intValue2));
            if (ibhVar == null) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("unknown metadata value: ");
                sb.append(intValue2);
                throw new IllegalArgumentException(sb.toString());
            }
            gcx a = gcy.a();
            a.a(ibgVar2);
            a.a((ibh) qdu.d(ibhVar));
            this.a.a(a.a());
            return;
        }
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("unknown metadata value: ");
        sb2.append(intValue);
        throw new IllegalArgumentException(sb2.toString());
    }
}
