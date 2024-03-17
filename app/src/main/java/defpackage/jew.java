package defpackage;

/* compiled from: PG */
/* renamed from: jew  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class jew implements mjq {
    private final jex a;
    private final jez b;

    public jew(jex jexVar, jez jezVar) {
        this.a = jexVar;
        this.b = jezVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        jex jexVar = this.a;
        jez jezVar = this.b;
        String str = jex.a;
        String valueOf = String.valueOf(jezVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Removing listener ");
        sb.append(valueOf);
        sb.toString();
        liu.b(str);
        jexVar.b.remove(jezVar);
    }
}