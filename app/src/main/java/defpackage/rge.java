package defpackage;

/* compiled from: PG */
/* renamed from: rge */
/* loaded from: classes2.dex */
public final class rge implements rgg {
    private rhd a;

    @Override // defpackage.rhd
    public final Object get() {
        rhd rhdVar = this.a;
        if (rhdVar == null) {
            throw new IllegalStateException();
        }
        return rhdVar.get();
    }

    public static void a(rhd rhdVar, rhd rhdVar2) {
        rgk.a(rhdVar2);
        rge rgeVar = (rge) rhdVar;
        if (rgeVar.a != null) {
            throw new IllegalStateException();
        }
        rgeVar.a = rhdVar2;
    }
}