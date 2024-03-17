package defpackage;

/* compiled from: PG */
/* renamed from: fvi  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class fvi implements Runnable {
    private final fvl a;
    private final meo b;

    public fvi(fvl fvlVar, meo meoVar) {
        this.a = fvlVar;
        this.b = meoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fvl fvlVar = this.a;
        fvlVar.g.a(this.b);
        fvlVar.e.f();
    }
}