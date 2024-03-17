package defpackage;

/* compiled from: PG */
/* renamed from: pps  reason: default package */
/* loaded from: classes.dex */
final class pps extends ppu {
    public static final pps a = new pps();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ppu
    public final int a(ppu ppuVar) {
        return ppuVar != this ? -1 : 0;
    }

    @Override // defpackage.ppu
    public final boolean a(Comparable comparable) {
        return true;
    }

    public final String toString() {
        return "-∞";
    }

    private pps() {
        super(null);
    }

    @Override // defpackage.ppu, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((ppu) obj);
    }

    @Override // defpackage.ppu
    public final void a(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.ppu
    public final void b(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.ppu
    public final Comparable a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.ppu
    public final Comparable b(ppz ppzVar) {
        throw new AssertionError();
    }

    @Override // defpackage.ppu
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.ppu
    public final Comparable a(ppz ppzVar) {
        return ppzVar.b();
    }

    @Override // defpackage.ppu
    public final ppu a(pow powVar, ppz ppzVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ppu
    public final ppu b(pow powVar, ppz ppzVar) {
        throw new AssertionError("this statement should be unreachable");
    }
}
