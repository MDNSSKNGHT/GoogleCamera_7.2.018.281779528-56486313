package defpackage;

/* compiled from: PG */
/* renamed from: ncl  reason: default package */
/* loaded from: classes.dex */
public final class ncl extends ncn {
    public double a = 1.0d;
    public double b;
    public double c;
    public double d;
    public double e;

    public ncl(double d) {
        this.b = d;
        this.c = d;
        this.d = d;
        this.e = d;
    }

    @Override // defpackage.ncn
    public final ncn a() {
        ncl nclVar = new ncl(this.e);
        nclVar.a = this.a;
        nclVar.b = this.b;
        nclVar.c = this.c;
        nclVar.d = this.d;
        nclVar.e = this.e;
        return nclVar;
    }
}