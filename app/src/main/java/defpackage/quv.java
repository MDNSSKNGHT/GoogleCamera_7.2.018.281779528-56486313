package defpackage;

/* compiled from: PG */
/* renamed from: quv  reason: default package */
/* loaded from: classes2.dex */
public final class quv implements qul {
    public final int a;
    public final qxy b;

    public quv(int i, qxy qxyVar) {
        this.a = i;
        this.b = qxyVar;
    }

    @Override // defpackage.qul
    public final int a() {
        return this.a;
    }

    @Override // defpackage.qul
    public final qxy b() {
        return this.b;
    }

    @Override // defpackage.qul
    public final qxz c() {
        return this.b.g;
    }

    @Override // defpackage.qul
    public final void e() {
    }

    @Override // defpackage.qul
    public final void f() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((quv) obj).a;
    }

    @Override // defpackage.qul
    public final qwf a(qwf qwfVar, qwg qwgVar) {
        return ((qur) qwfVar).a((quw) qwgVar);
    }

    @Override // defpackage.qul
    public final qwk d() {
        throw new UnsupportedOperationException();
    }
}