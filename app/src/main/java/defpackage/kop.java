package defpackage;

/* compiled from: PG */
/* renamed from: kop */
/* loaded from: classes.dex */
public final class kop implements rgg {
    private final rhd a;

    public kop(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final koo a() {
        return new koo((cin) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}