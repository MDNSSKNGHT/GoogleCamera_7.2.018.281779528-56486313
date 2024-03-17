package defpackage;

/* compiled from: PG */
/* renamed from: jpa */
/* loaded from: classes.dex */
public final class jpa implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private jpa(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static jpa a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new jpa(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new joz((dnf) this.a.get(), (dka) this.b.get(), (djl) this.c.get());
    }
}