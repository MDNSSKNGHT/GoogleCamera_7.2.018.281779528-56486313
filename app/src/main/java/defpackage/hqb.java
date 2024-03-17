package defpackage;

/* compiled from: PG */
/* renamed from: hqb  reason: default package */
/* loaded from: classes.dex */
public final class hqb implements rgg {
    private final rhd a;
    private final rhd b;

    private hqb(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hqb a(rhd rhdVar, rhd rhdVar2) {
        return new hqb(rhdVar, rhdVar2);
    }

    public final hqa a() {
        return new hqa(this.a, this.b);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}