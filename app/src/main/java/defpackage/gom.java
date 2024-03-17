package defpackage;

/* compiled from: PG */
/* renamed from: gom */
/* loaded from: classes.dex */
public final class gom implements rgg {
    private final rhd a;
    private final rhd b;

    private gom(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gom a(rhd rhdVar, rhd rhdVar2) {
        return new gom(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gol((goq) this.a.get(), (mjw) this.b.get());
    }
}