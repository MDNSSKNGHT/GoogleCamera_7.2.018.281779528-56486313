package defpackage;

/* compiled from: PG */
/* renamed from: gec  reason: default package */
/* loaded from: classes.dex */
final class gec extends mrx {
    private final /* synthetic */ gee a;

    public gec(gee geeVar) {
        this.a = geeVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        synchronized (this.a.a) {
            gee geeVar = this.a;
            if (geeVar.b && geeVar.c <= ndrVar.c()) {
                this.a.a(ndrVar);
            }
        }
    }
}