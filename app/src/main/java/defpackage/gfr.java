package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: gfr  reason: default package */
/* loaded from: classes.dex */
final class gfr extends mdu {
    private final int a;

    public gfr(mcs mcsVar, mcs mcsVar2, mch mchVar, geq geqVar) {
        super(mdg.c(mcsVar, mcsVar2, mchVar));
        this.a = geqVar.K();
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = (List) obj;
        Boolean bool = (Boolean) list.get(0);
        mzf mzfVar = (mzf) list.get(1);
        if (((ibi) list.get(2)) == ibi.AUTO) {
            return 1;
        }
        if (this.a != 3 || !bool.booleanValue()) {
            if (mzfVar != mzf.FULL && mzfVar != mzf.SIMPLE && mzfVar != mzf.EXTENDED) {
                return 1;
            }
            return 2;
        }
        return 2;
    }
}