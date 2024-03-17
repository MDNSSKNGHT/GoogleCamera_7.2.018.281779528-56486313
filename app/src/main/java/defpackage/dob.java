package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dob  reason: default package */
/* loaded from: classes.dex */
public final class dob {
    private final mcs a;
    private final mcs b;
    private final mdl c;
    private final cin d;
    private final mcs e;
    private final grh f;
    private final Set g;

    public dob(mcs mcsVar, mcs mcsVar2, mdl mdlVar, mcs mcsVar3, cin cinVar, grh grhVar, Set set) {
        this.a = mcsVar;
        this.b = mcsVar2;
        this.c = mdlVar;
        this.e = mcsVar3;
        this.d = cinVar;
        this.f = grhVar;
        this.g = set;
    }

    public final doa a() {
        ilu iluVar = (ilu) this.a.a();
        boolean booleanValue = (Boolean) this.b.a();
        boolean booleanValue2 = (Boolean) this.c.a();
        boolean d = this.d.d(cjh.b);
        cin cinVar = this.d;
        ciq ciqVar = cit.a;
        cinVar.d();
        grj grjVar = (grj) this.e.a();
        return new dnz(iluVar, booleanValue, booleanValue2, d, mdg.e(this.g), (gri) this.f.a(), grjVar);
    }
}