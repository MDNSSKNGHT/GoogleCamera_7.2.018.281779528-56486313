package defpackage;

/* compiled from: PG */
/* renamed from: fhx */
/* loaded from: classes.dex */
public final class fhx implements rgg {
    private final rhd a;
    private final rhd b;

    public fhx(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public final pjz a() {
        Object obj;
        if (((cqp) this.b).a().b()) {
            obj = (pjz) this.a.get();
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