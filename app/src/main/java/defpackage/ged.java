package defpackage;

/* compiled from: PG */
/* renamed from: ged  reason: default package */
/* loaded from: classes.dex */
final class ged extends mrx {
    private final /* synthetic */ gee a;

    public ged(gee geeVar) {
        this.a = geeVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        synchronized (this.a.a) {
            this.a.c = ndrVar.c();
            this.a.b = true;
        }
        this.a.a(ndrVar);
    }
}