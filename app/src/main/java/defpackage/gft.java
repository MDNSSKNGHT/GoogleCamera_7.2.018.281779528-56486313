package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: gft  reason: default package */
/* loaded from: classes.dex */
final class gft extends mdu {
    private final klw a;
    private final int b;

    public gft(mcs mcsVar, mcs mcsVar2, geq geqVar, klw klwVar) {
        super(mdg.c(mcsVar, mcsVar2));
        this.a = klwVar;
        this.b = geqVar.K();
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = (List) obj;
        Boolean bool = (Boolean) list.get(0);
        mzf mzfVar = (mzf) list.get(1);
        if (lap.n != null) {
            if (this.a == klw.PORTRAIT) {
                return 3;
            }
            if (this.a == klw.LONG_EXPOSURE) {
                return 5;
            }
        }
        if (this.b == 3 && bool.booleanValue()) {
            return 18;
        }
        if (mzfVar == mzf.FULL || mzfVar == mzf.SIMPLE || mzfVar == mzf.EXTENDED) {
            return 1;
        }
        return 0;
    }
}