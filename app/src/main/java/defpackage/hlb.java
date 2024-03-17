package defpackage;

/* compiled from: PG */
/* renamed from: hlb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hlb implements Runnable {
    private final mcs a;
    private final mch b;

    public hlb(mcs mcsVar, mch mchVar) {
        this.a = mcsVar;
        this.b = mchVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(new hlc(this.b), qot.INSTANCE);
    }
}