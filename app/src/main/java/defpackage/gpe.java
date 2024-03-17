package defpackage;

/* compiled from: PG */
/* renamed from: gpe */
/* loaded from: classes.dex */
public final class gpe implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private gpe(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static gpe a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new gpe(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gpd(((cnc) this.a).a(), ((ggy) this.b).a(), (grh) this.c.get());
    }
}