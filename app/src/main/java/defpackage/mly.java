package defpackage;

/* compiled from: PG */
/* renamed from: mly  reason: default package */
/* loaded from: classes.dex */
final class mly extends ndp {
    private final /* synthetic */ ndj a;
    private final /* synthetic */ mlz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mly(mlz mlzVar, ndj ndjVar, ndj ndjVar2) {
        super(ndjVar);
        this.b = mlzVar;
        this.a = ndjVar2;
    }

    @Override // defpackage.ndp, defpackage.ndj, defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.b.b();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a.a());
        return valueOf.length() == 0 ? new String("Virtual Camera ") : "Virtual Camera ".concat(valueOf);
    }
}