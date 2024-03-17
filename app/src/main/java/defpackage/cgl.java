package defpackage;

/* compiled from: PG */
/* renamed from: cgl  reason: default package */
/* loaded from: classes.dex */
public final class cgl implements rgg {
    private final rhd a;
    private final rhd b;

    public cgl(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public final cgk a() {
        return new cgk(((cgi) this.a).a(), (mdl) this.b.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}