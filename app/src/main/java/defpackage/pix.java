package defpackage;

/* compiled from: PG */
/* renamed from: pix  reason: default package */
/* loaded from: classes.dex */
public final class pix extends pjz {
    public static final pix a = new pix();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.pjz
    public final boolean a() {
        return false;
    }

    @Override // defpackage.pjz
    public final Object c() {
        return null;
    }

    @Override // defpackage.pjz
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.pjz
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.pjz
    public final String toString() {
        return "Optional.absent()";
    }

    private pix() {
    }

    @Override // defpackage.pjz
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.pjz
    public final pjz a(pjz pjzVar) {
        return (pjz) qdu.d(pjzVar);
    }

    @Override // defpackage.pjz
    public final Object a(pkx pkxVar) {
        return qdu.c(pkxVar.a(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // defpackage.pjz
    public final Object a(Object obj) {
        return qdu.c(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // defpackage.pjz
    public final pjz a(pjr pjrVar) {
        qdu.d(pjrVar);
        return a;
    }
}