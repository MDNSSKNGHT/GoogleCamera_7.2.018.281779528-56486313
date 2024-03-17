package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* compiled from: PG */
/* renamed from: gfv  reason: default package */
/* loaded from: classes.dex */
final class gfv extends mdu {
    private final geq a;

    public gfv(geq geqVar, grh grhVar, mcs mcsVar) {
        super(mdg.c(grhVar, mcsVar));
        this.a = geqVar;
        qdu.d((int[]) geqVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES));
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        gri griVar = (gri) ((List) obj).get(0);
        if (griVar == gri.ON) {
            if (this.a.f()) {
                return 3;
            }
            if (this.a.b()) {
            }
            return 1;
        } else if (griVar != gri.AUTO || !this.a.f()) {
            return 1;
        } else {
            return 2;
        }
    }
}