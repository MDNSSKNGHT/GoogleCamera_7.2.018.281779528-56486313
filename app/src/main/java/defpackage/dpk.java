package defpackage;

/* compiled from: PG */
/* renamed from: dpk */
/* loaded from: classes.dex */
public final class dpk implements rgg {
    private final rhd a;
    private final rhd b;

    private dpk(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dpk a(rhd rhdVar, rhd rhdVar2) {
        return new dpk(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        rhd rhdVar = this.a;
        if (((Boolean) ((mdl) this.b.get()).a()).booleanValue()) {
            obj = pjz.b(((giw) rhdVar).a());
        } else {
            obj = pix.a;
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}