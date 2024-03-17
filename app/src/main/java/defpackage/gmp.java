package defpackage;

/* compiled from: PG */
/* renamed from: gmp */
/* loaded from: classes.dex */
public final class gmp implements rgg {
    private final rhd a;
    private final rhd b;

    private gmp(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gmp a(rhd rhdVar, rhd rhdVar2) {
        return new gmp(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gmo(this.a, (mby) this.b.get());
    }
}