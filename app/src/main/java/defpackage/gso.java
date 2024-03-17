package defpackage;

/* compiled from: PG */
/* renamed from: gso */
/* loaded from: classes.dex */
public final class gso implements rgg {
    private final rhd a;
    private final rhd b;

    private gso(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gso a(rhd rhdVar, rhd rhdVar2) {
        return new gso(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsn(((cnc) this.a).a(), (coc) this.b.get());
    }
}