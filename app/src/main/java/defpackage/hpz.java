package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hpz  reason: default package */
/* loaded from: classes.dex */
public final class hpz extends hqe {
    private static final String a = liu.a("PckZslHdrPCptrCmd");
    private final hqc b;

    public hpz(hne hneVar, hqc hqcVar, Set set, goq goqVar) {
        super(hneVar, goqVar, set);
        this.b = hqcVar;
    }

    @Override // defpackage.hqe
    protected final boolean a(List list, gop gopVar, gnq gnqVar) {
        liu.d(a);
        gnqVar.c.a().a();
        liu.b(a);
        return this.b.a(list, gopVar, gnqVar);
    }
}