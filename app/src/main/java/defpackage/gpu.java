package defpackage;

/* compiled from: PG */
/* renamed from: gpu  reason: default package */
/* loaded from: classes.dex */
public final class gpu implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private gpu(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static gpu a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new gpu(rhdVar, rhdVar2, rhdVar3);
    }

    public final Boolean a() {
        pjz pjzVar = (pjz) this.b.get();
        pjz pjzVar2 = (pjz) this.c.get();
        boolean z = true;
        if (!((pjz) this.a.get()).a() && !pjzVar.a() && !pjzVar2.a()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}