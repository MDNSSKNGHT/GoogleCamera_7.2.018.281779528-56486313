package defpackage;

/* compiled from: PG */
/* renamed from: kef  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class kef implements mjq {
    private final kei a;
    private final kej b;

    public kef(kei keiVar, kej kejVar) {
        this.a = keiVar;
        this.b = kejVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        kei keiVar = this.a;
        kej kejVar = this.b;
        synchronized (keiVar.c) {
            keiVar.d.remove(kejVar);
            if (!keiVar.L()) {
                keiVar.a(false, false);
                keiVar.b(false, false);
            }
        }
        String str = kei.a;
        String valueOf = String.valueOf(kejVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Removed listener ");
        sb.append(valueOf);
        sb.toString();
        liu.d(str);
    }
}