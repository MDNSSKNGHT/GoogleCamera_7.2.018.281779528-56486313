package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: grh  reason: default package */
/* loaded from: classes.dex */
public final class grh extends mdu {
    public grh(mcs mcsVar, mcs mcsVar2, mcs mcsVar3, mcs mcsVar4) {
        super(mdg.c(mcsVar, mcsVar2, mcsVar3, mcsVar4));
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = (List) obj;
        return (((Integer) list.get(1)).intValue() == 0 && ((Float) list.get(2)).floatValue() == -1.0f && ((Float) list.get(3)).floatValue() == -1.0f) ? (gri) list.get(0) : gri.OFF;
    }
}