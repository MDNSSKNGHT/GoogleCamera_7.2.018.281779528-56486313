package defpackage;

/* compiled from: PG */
/* renamed from: bov  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bov implements miz {
    private final bow a;
    private final Runnable b;

    public bov(bow bowVar, Runnable runnable) {
        this.a = bowVar;
        this.b = runnable;
    }

    @Override // defpackage.miz
    public final void a(Object obj) {
        bow bowVar = this.a;
        boy boyVar = (boy) obj;
        bowVar.a.execute(this.b);
    }
}