package defpackage;

/* compiled from: PG */
/* renamed from: mcv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class mcv implements mjw {
    private final Runnable a;

    public mcv(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        this.a.run();
    }
}
