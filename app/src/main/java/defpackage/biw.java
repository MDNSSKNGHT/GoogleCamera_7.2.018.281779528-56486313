package defpackage;

/* compiled from: PG */
/* renamed from: biw  reason: default package */
/* loaded from: classes.dex */
final class biw implements bhm {
    private final mdl a;
    private final mdl b = new mch((Object) 15);

    static {
        liu.a("SceneDistanceAdviceSettings");
    }

    @Override // defpackage.bhm
    public final mcs a() {
        return this.a;
    }

    @Override // defpackage.bhm
    public final boolean b() {
        try {
            return lao.a != null;
        } catch (NoSuchFieldError e) {
            return false;
        }
    }

    @Override // defpackage.bhm
    public final mdl c() {
        return this.b;
    }

    public biw(mdl mdlVar) {
        this.a = mdlVar;
    }
}