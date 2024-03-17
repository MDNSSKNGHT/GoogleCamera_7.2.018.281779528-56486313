package defpackage;

/* compiled from: PG */
/* renamed from: goh  reason: default package */
/* loaded from: classes.dex */
public final class goh implements goq {
    private final mcs a;
    private final mkg b;
    private final mcs c;
    private final mcs d;

    public goh(mkf mkfVar, mcs mcsVar) {
        this.a = mcsVar;
        this.b = mkfVar.a("ImgCptrSwitch");
        this.c = mdg.a(mdg.a(this.a, new gof()));
        this.d = mdg.a(mdg.a(this.a, new gog()));
    }

    @Override // defpackage.goq
    public final mcs a() {
        return this.c;
    }

    @Override // defpackage.goq
    public final mcs b() {
        return this.d;
    }

    @Override // defpackage.goq
    public final void a(gop gopVar, gnq gnqVar) {
        goq goqVar = (goq) this.a.a();
        mkg mkgVar = this.b;
        String valueOf = String.valueOf(goqVar.toString());
        mkgVar.b(valueOf.length() == 0 ? new String("Running command: ") : "Running command: ".concat(valueOf));
        goqVar.a(gopVar, gnqVar);
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a(this.a);
        return e.toString();
    }
}