package defpackage;

/* compiled from: PG */
/* renamed from: mca  reason: default package */
/* loaded from: classes.dex */
final class mca implements mjq, mcc {
    private final mjq a;
    private final String b;

    public mca(mjq mjqVar, String str) {
        this.a = mjqVar;
        this.b = str;
    }

    @Override // defpackage.mcc
    public final String c() {
        return this.b;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}