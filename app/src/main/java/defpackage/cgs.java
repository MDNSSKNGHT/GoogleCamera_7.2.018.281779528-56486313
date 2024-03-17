package defpackage;

/* compiled from: PG */
/* renamed from: cgs  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cgs implements miz {
    private final Runnable a;

    public cgs(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.miz
    public final void a(Object obj) {
        Runnable runnable = this.a;
        mzg mzgVar = cgt.a;
        runnable.run();
    }
}