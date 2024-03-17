package defpackage;

/* compiled from: PG */
/* renamed from: byg  reason: default package */
/* loaded from: classes.dex */
final class byg implements qpe {
    private final /* synthetic */ byh a;

    public byg(byh byhVar) {
        this.a = byhVar;
    }

    @Override // defpackage.qpe
    public final void a(Throwable th) {
    }

    @Override // defpackage.qpe
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        mgi mgiVar = (mgi) obj;
        synchronized (this.a.b) {
            this.a.a = mgiVar;
        }
    }
}