package defpackage;

/* compiled from: PG */
/* renamed from: jot */
/* loaded from: classes.dex */
public final class jot implements rgg {
    private final rhd a;
    private final rhd b;

    private jot(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static jot a(rhd rhdVar, rhd rhdVar2) {
        return new jot(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        pjz pjzVar = (pjz) this.a.get();
        joy joyVar = (joy) this.b.get();
        if (pjzVar.a()) {
            obj = pjz.b(((jok) pjzVar.b()).a(joyVar));
        } else {
            obj = pix.a;
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}