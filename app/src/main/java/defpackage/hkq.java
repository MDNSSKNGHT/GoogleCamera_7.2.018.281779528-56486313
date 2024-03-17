package defpackage;

/* compiled from: PG */
/* renamed from: hkq  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hkq implements pkx {
    private final pjz a;
    private final pkx b;
    private final pjz c;

    public hkq(pjz pjzVar, pkx pkxVar, pjz pjzVar2) {
        this.a = pjzVar;
        this.b = pkxVar;
        this.c = pjzVar2;
    }

    @Override // defpackage.pkx
    public final Object a() {
        pjz pjzVar = this.a;
        pkx pkxVar = this.b;
        pjz pjzVar2 = this.c;
        boolean z = true;
        if ((!pjzVar.a() || !((mnz) pkxVar.a()).a().contains(pjzVar.b())) && (!pjzVar2.a() || !((mnz) pkxVar.a()).a().contains(pjzVar2.b()))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}