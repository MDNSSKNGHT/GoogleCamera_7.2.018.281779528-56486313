package defpackage;

/* compiled from: PG */
/* renamed from: ghy */
/* loaded from: classes.dex */
public final class ghy implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private ghy(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static ghy a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new ghy(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        hzd hzdVar;
        giz gizVar = (giz) this.a.get();
        knz knzVar = (knz) this.b.get();
        pjz pjzVar = (pjz) this.c.get();
        if (pjzVar.a()) {
            hzdVar = (hzd) pjzVar.b();
        } else {
            hzdVar = hze.a;
        }
        return (pjz) rgk.a(pjz.b(new gho(gizVar, hzdVar)), "Cannot return null from a non-@Nullable @Provides method");
    }
}