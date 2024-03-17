package defpackage;

/* compiled from: PG */
/* renamed from: dql  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dql implements mjq {
    private final naj a;

    public dql(naj najVar) {
        this.a = najVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        ((naj) mjz.b(this.a)).close();
    }
}