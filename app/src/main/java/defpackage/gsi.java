package defpackage;

/* compiled from: PG */
/* renamed from: gsi */
/* loaded from: classes.dex */
public final class gsi implements rgg {
    private final rhd a;
    private final rhd b;

    private gsi(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gsi a(rhd rhdVar, rhd rhdVar2) {
        return new gsi(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsh((fad) this.a.get(), (mbe) this.b.get());
    }
}