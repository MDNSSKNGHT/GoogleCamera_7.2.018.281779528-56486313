package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: gff  reason: default package */
/* loaded from: classes.dex */
public final class gff extends mdu {
    private final Collection<ggq> a;
    private final ggq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gff(Collection collection, Collection<ggq> collection2) {
        super(mdg.d(collection2));
        ggq a = ggt.a();
        this.a = collection;
        this.b = a;
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        List<ggq> list = (List) obj;
        ggp ggpVar = new ggp();
        for (ggq ggqVar : this.a) {
            ggqVar.a(ggpVar);
        }
        for (ggq ggqVar2 : list) {
            ggqVar2.a(ggpVar);
        }
        this.b.a(ggpVar);
        return new ggo(psl.a(ggpVar.a.values()), ggpVar.b, ggpVar.c);
    }
}