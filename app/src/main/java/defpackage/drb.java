package defpackage;

/* compiled from: PG */
/* renamed from: drb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class drb implements Runnable {
    private final drc a;

    public drb(drc drcVar) {
        this.a = drcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        drc drcVar = this.a;
        if (drcVar.d.isEmpty()) {
            return;
        }
        liu.a(drc.a, fpp.a("HDR+ is idle, but we have %d shots in flight", Integer.valueOf(drcVar.d.size())));
    }
}
