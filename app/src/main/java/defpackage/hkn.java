package defpackage;

/* compiled from: PG */
/* renamed from: hkn  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hkn implements Runnable {
    private final mba a;
    private final hqu b;
    private final mnu c;

    public hkn(mba mbaVar, hqu hquVar, mnu mnuVar) {
        this.a = mbaVar;
        this.b = hquVar;
        this.c = mnuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mba mbaVar = this.a;
        hqu hquVar = this.b;
        mbaVar.a(hquVar.a().a(new hkr(hquVar, this.c), qot.INSTANCE));
    }
}