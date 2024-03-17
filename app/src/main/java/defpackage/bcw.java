package defpackage;

/* compiled from: PG */
/* renamed from: bcw */
/* loaded from: classes.dex */
public final class bcw implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private bcw(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static bcw a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new bcw(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final bcv a() {
        return new bcv((gdl) this.a.get(), ((gek) this.b).a(), bep.a(), ((Boolean) this.d.get()).booleanValue());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}