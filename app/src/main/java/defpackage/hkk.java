package defpackage;

/* compiled from: PG */
/* renamed from: hkk  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hkk implements mog {
    private final pjz a;
    private final pjz b;

    public hkk(pjz pjzVar, pjz pjzVar2) {
        this.a = pjzVar;
        this.b = pjzVar2;
    }

    @Override // defpackage.mog
    public final void a(mnh mnhVar) {
        pjz pjzVar = this.a;
        pjz pjzVar2 = this.b;
        neb a = mnhVar.a((mos) pjzVar.b());
        if (a != null) {
            ((jox) pjzVar2.b()).a(a);
        }
        mnhVar.close();
    }
}