package defpackage;

/* compiled from: PG */
/* renamed from: hru */
/* loaded from: classes.dex */
public final class hru implements rgg {
    private final rhd a;

    private hru(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static hru a(rhd rhdVar) {
        return new hru(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        pjz pjzVar = (pjz) this.a.get();
        if (pjzVar.a()) {
            obj = (pjz) pjzVar.b();
        } else {
            obj = pix.a;
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}