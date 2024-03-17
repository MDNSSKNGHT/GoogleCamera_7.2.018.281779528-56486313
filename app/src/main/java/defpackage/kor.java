package defpackage;

/* compiled from: PG */
/* renamed from: kor */
/* loaded from: classes.dex */
public final class kor implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    public kor(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public final koq a() {
        ghs.a();
        return new koq((mdl) this.a.get(), (cin) this.b.get(), ((kop) this.c).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}