package defpackage;

/* compiled from: PG */
/* renamed from: bap */
/* loaded from: classes.dex */
public final class bap implements rgg {
    private final rhd a;

    private bap(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static bap a(rhd rhdVar) {
        return new bap(rhdVar);
    }

    public final Integer a() {
        return Integer.valueOf(!((ggy) this.a).a().r() ? 4 : 2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}