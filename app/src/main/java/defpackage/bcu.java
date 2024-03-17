package defpackage;

/* compiled from: PG */
/* renamed from: bcu */
/* loaded from: classes.dex */
public final class bcu implements rgg {
    private final rhd a;
    private final rhd b;

    private bcu(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static bcu a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new bcu(rhdVar, rhdVar3);
    }

    public final bct a() {
        return new bct((gtl) this.a.get(), gen.a(), ((ggy) this.b).a(), (byte) 0, (byte) 0);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}