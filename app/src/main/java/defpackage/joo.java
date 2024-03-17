package defpackage;

/* compiled from: PG */
/* renamed from: joo */
/* loaded from: classes.dex */
public final class joo implements rgg {
    private final rhd a;
    private final rhd b;

    public joo(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public final pjz a() {
        Object obj;
        rhd rhdVar = this.a;
        if (((jom) this.b).a().booleanValue()) {
            obj = (pjz) rhdVar.get();
        } else {
            obj = pix.a;
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}