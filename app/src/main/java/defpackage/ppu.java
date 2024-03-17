package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ppu  reason: default package */
/* loaded from: classes.dex */
abstract class ppu implements Comparable, Serializable {
    public static final long serialVersionUID = 0;
    public final Comparable b;

    public ppu(Comparable comparable) {
        this.b = comparable;
    }

    public Comparable a() {
        return this.b;
    }

    public abstract Comparable a(ppz ppzVar);

    public abstract ppu a(pow powVar, ppz ppzVar);

    public abstract void a(StringBuilder sb);

    public abstract boolean a(Comparable comparable);

    public abstract Comparable b(ppz ppzVar);

    public abstract ppu b(pow powVar, ppz ppzVar);

    public abstract void b(StringBuilder sb);

    public abstract int hashCode();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ppu c(Comparable comparable) {
        return new ppr(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ppu b(Comparable comparable) {
        return new ppt(comparable);
    }

    public int a(ppu ppuVar) {
        if (ppuVar != pps.a) {
            if (ppuVar != ppq.a) {
                int c = puu.c(this.b, ppuVar.b);
                if (c == 0) {
                    boolean z = this instanceof ppr;
                    if (z == (ppuVar instanceof ppr)) {
                        return 0;
                    }
                    return !z ? -1 : 1;
                }
                return c;
            }
            return -1;
        }
        return 1;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((ppu) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ppu) {
            try {
                return a((ppu) obj) == 0;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }
}
