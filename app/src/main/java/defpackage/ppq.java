package defpackage;

/* compiled from: PG */
/* renamed from: ppq  reason: default package */
/* loaded from: classes.dex */
final class ppq extends ppu {
    public static final ppq a = new ppq();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ppu
    public final int a(ppu ppuVar) {
        return ppuVar != this ? 1 : 0;
    }

    @Override // defpackage.ppu
    public final boolean a(Comparable comparable) {
        return false;
    }

    public final String toString() {
        return "+∞";
    }

    private ppq() {
        super(null);
    }

    @Override // defpackage.ppu, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((ppu) obj);
    }

    @Override // defpackage.ppu
    public final void a(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.ppu
    public final void b(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.ppu
    public final Comparable a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.ppu
    public final Comparable b(ppz ppzVar) {
        return ppzVar.a();
    }

    @Override // defpackage.ppu
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.ppu
    public final Comparable a(ppz ppzVar) {
        throw new AssertionError();
    }

    @Override // defpackage.ppu
    public final ppu a(pow powVar, ppz ppzVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // defpackage.ppu
    public final ppu b(pow powVar, ppz ppzVar) {
        throw new IllegalStateException();
    }
}
