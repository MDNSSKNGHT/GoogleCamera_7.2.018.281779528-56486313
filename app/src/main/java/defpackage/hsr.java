package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: hsr */
/* loaded from: classes.dex */
final /* synthetic */ class hsr implements mjw {
    private final mnu a;
    private final hqu b;

    public hsr(mnu mnuVar, hqu hquVar) {
        this.a = mnuVar;
        this.b = hquVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        mnu mnuVar = this.a;
        hqu hquVar = this.b;
        mnf c = mnuVar.c();
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (ggn ggnVar : ((ggo) obj).a) {
            if (hquVar.b() && ggnVar.a.equals(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
                continue;
            }
            CaptureRequest.Key key = ggnVar.a;
            if (!key.equals(CaptureRequest.CONTROL_AE_MODE) && !key.equals(CaptureRequest.CONTROL_AF_REGIONS) && !key.equals(CaptureRequest.CONTROL_AE_REGIONS) && !key.equals(CaptureRequest.CONTROL_AWB_REGIONS) && !key.equals(CaptureRequest.CONTROL_AF_TRIGGER) && !key.equals(CaptureRequest.CONTROL_AE_LOCK) && !key.equals(CaptureRequest.CONTROL_AWB_LOCK)) {
                Object obj2 = ggnVar.b;
                qdu.d(obj2);
                CaptureRequest.Key key2 = ggnVar.a;
                if (key2.equals(CaptureRequest.CONTROL_AF_MODE)) {
                    c.a((Integer) obj2);
                    z = true;
                } else if (key2.equals(CaptureRequest.CONTROL_AWB_MODE)) {
                    c.c((Integer) obj2);
                    z = true;
                } else if (key2.equals(CaptureRequest.CONTROL_MODE)) {
                    c.e((Integer) obj2);
                    z = true;
                } else if (key2.equals(CaptureRequest.FLASH_MODE)) {
                    c.d((Integer) obj2);
                    z = true;
                } else {
                    hashSet.add(mop.a(ggnVar.a, ggnVar.b));
                }
            }
        }
        if (z) {
            mnuVar.b(c.a());
        }
        if (hashSet.isEmpty()) {
            return;
        }
        mnuVar.b(hashSet);
    }
}