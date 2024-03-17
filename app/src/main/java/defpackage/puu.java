package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: puu  reason: default package */
/* loaded from: classes.dex */
public final class puu extends puv implements Serializable, pkc {
    public static final puu a = new puu(pps.a, ppq.a);
    public static final long serialVersionUID = 0;
    public final ppu b;
    public final ppu c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pus a() {
        return put.a;
    }

    public final boolean b() {
        return this.b != pps.a;
    }

    public final boolean d() {
        return this.c != ppq.a;
    }

    private puu(ppu ppuVar, ppu ppuVar2) {
        this.b = (ppu) qdu.d(ppuVar);
        this.c = (ppu) qdu.d(ppuVar2);
        if (ppuVar.a(ppuVar2) > 0 || ppuVar == ppq.a || ppuVar2 == pps.a) {
            String valueOf = String.valueOf(b(ppuVar, ppuVar2));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid range: ") : "Invalid range: ".concat(valueOf));
        }
    }

    @Override // defpackage.pkc
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return e((Comparable) obj);
    }

    public static puu d(Comparable comparable) {
        return a(ppu.b(comparable), (ppu) ppq.a);
    }

    public static puu b(Comparable comparable) {
        return a((ppu) pps.a, ppu.c(comparable));
    }

    public static puu a(Comparable comparable, Comparable comparable2) {
        return a(ppu.b(comparable), ppu.c(comparable2));
    }

    public static puu b(Comparable comparable, Comparable comparable2) {
        return a(ppu.b(comparable), ppu.b(comparable2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public final boolean e(Comparable comparable) {
        qdu.d(comparable);
        return this.b.a(comparable) && !this.c.a(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static puu a(ppu ppuVar, ppu ppuVar2) {
        return new puu(ppuVar, ppuVar2);
    }

    public static puu b(Comparable comparable, pow powVar) {
        pow powVar2 = pow.OPEN;
        int ordinal = powVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return d(comparable);
            }
            throw new AssertionError();
        }
        return c(comparable);
    }

    @Override // defpackage.pkc
    public final boolean equals(Object obj) {
        if (obj instanceof puu) {
            puu puuVar = (puu) obj;
            if (this.b.equals(puuVar.b) && this.c.equals(puuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public static puu c(Comparable comparable) {
        return a(ppu.c(comparable), (ppu) ppq.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final puu b(puu puuVar) {
        int a2 = this.b.a(puuVar.b);
        int a3 = this.c.a(puuVar.c);
        if (a2 < 0 || a3 > 0) {
            if (a2 > 0 || a3 < 0) {
                return a(a2 < 0 ? puuVar.b : this.b, a3 <= 0 ? this.c : puuVar.c);
            }
            return puuVar;
        }
        return this;
    }

    public final boolean a(puu puuVar) {
        return this.b.a(puuVar.c) <= 0 && puuVar.b.a(this.c) <= 0;
    }

    public final boolean f() {
        return this.b.equals(this.c);
    }

    public static puu a(Comparable comparable) {
        return a((ppu) pps.a, ppu.b(comparable));
    }

    public final Comparable c() {
        return this.b.a();
    }

    public static puu a(Comparable comparable, pow powVar, Comparable comparable2, pow powVar2) {
        qdu.d(powVar);
        qdu.d(powVar2);
        return a(powVar == pow.OPEN ? ppu.c(comparable) : ppu.b(comparable), powVar2 == pow.OPEN ? ppu.b(comparable2) : ppu.c(comparable2));
    }

    Object readResolve() {
        return equals(a) ? a : this;
    }

    public final String toString() {
        return b(this.b, this.c);
    }

    private static String b(ppu ppuVar, ppu ppuVar2) {
        StringBuilder sb = new StringBuilder(16);
        ppuVar.a(sb);
        sb.append("..");
        ppuVar2.b(sb);
        return sb.toString();
    }

    public static puu a(Comparable comparable, pow powVar) {
        pow powVar2 = pow.OPEN;
        int ordinal = powVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return b(comparable);
            }
            throw new AssertionError();
        }
        return a(comparable);
    }

    public final Comparable e() {
        return this.c.a();
    }
}
