package defpackage;

/* compiled from: PG */
/* renamed from: pvb  reason: default package */
/* loaded from: classes.dex */
final class pvb extends pre {
    public static final pvb a = new pvb();
    private transient Object b;
    private transient Object[] c;
    private transient int d;
    private transient int e;
    private transient pvb f;

    @Override // defpackage.pre, defpackage.pov
    public final /* bridge */ /* synthetic */ pov a() {
        return this.f;
    }

    @Override // defpackage.pre
    public final pre b() {
        return this.f;
    }

    @Override // defpackage.prx
    public final boolean e() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    private pvb() {
        this.b = null;
        this.c = new Object[0];
        this.d = 0;
        this.e = 0;
        this.f = this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [pre, pvb] */
    public pvb(Object[] objArr, int i) {
        this.c = objArr;
        this.e = i;
        this.d = 0;
        int b = i >= 2 ? psl.b(i) : 0;
        this.b = pvh.a(objArr, i, b, 0);
        Object a2 = pvh.a(objArr, i, b, 1);
        this.f = new pvb();
        this.f.b = a2;
        this.f.c = objArr;
        this.f.d = 1;
        this.f.e = i;
        this.f.f = this;
    }

    @Override // defpackage.prx
    public final psl g() {
        return new pve(this, this.c, this.d, this.e);
    }

    @Override // defpackage.prx
    public final psl f() {
        return new pvf(this, new pvg(this.c, this.d, this.e));
    }

    @Override // defpackage.prx, java.util.Map
    public final Object get(Object obj) {
        return pvh.a(this.b, this.c, this.e, this.d, obj);
    }
}