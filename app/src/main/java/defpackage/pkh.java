package defpackage;

/* compiled from: PG */
/* renamed from: pkh  reason: default package */
/* loaded from: classes.dex */
final class pkh extends pjz {
    public static final long serialVersionUID = 0;
    private final Object a;

    public pkh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pjz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pjz
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.pjz
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.pjz
    public final boolean equals(Object obj) {
        if (obj instanceof pkh) {
            return this.a.equals(((pkh) obj).a);
        }
        return false;
    }

    @Override // defpackage.pjz
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.pjz
    public final pjz a(pjz pjzVar) {
        qdu.d(pjzVar);
        return this;
    }

    @Override // defpackage.pjz
    public final Object a(pkx pkxVar) {
        qdu.d(pkxVar);
        return this.a;
    }

    @Override // defpackage.pjz
    public final Object a(Object obj) {
        qdu.c(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // defpackage.pjz
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return "Optional.of(" + valueOf + ")";
    }

    @Override // defpackage.pjz
    public final pjz a(pjr pjrVar) {
        return new pkh(qdu.c(pjrVar.a(this.a), "the Function passed to Optional.transform() must not return null."));
    }
}