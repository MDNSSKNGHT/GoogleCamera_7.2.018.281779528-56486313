package defpackage;

/* compiled from: PG */
/* renamed from: cqp */
/* loaded from: classes.dex */
public final class cqp implements rgg {
    private final rhd a;
    private final rhd b;

    public cqp(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public final cqo a() {
        return new cqo((cin) this.a.get(), ((dkh) this.b).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}