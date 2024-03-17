package defpackage;

/* compiled from: PG */
/* renamed from: bgm */
/* loaded from: classes.dex */
public final class bgm implements rgg {
    private final rhd a;
    private final rhd b;

    private bgm(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static bgm a(rhd rhdVar, rhd rhdVar2) {
        return new bgm(rhdVar, rhdVar2);
    }

    public final bgl a() {
        return new bgl((ncs) this.a.get(), (myo) this.b.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}