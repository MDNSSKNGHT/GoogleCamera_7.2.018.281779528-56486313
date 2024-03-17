package defpackage;

import j$.util.Comparator$$CC;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: htb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class htb implements Comparator, j$.util.Comparator {
    public static final Comparator a = new htb();

    private htb() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = htd.a;
        return ((Float) ((geq) obj).J().get(0)).compareTo((Float) ((geq) obj2).J().get(0));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Comparator$$CC.reversed$$dflt$$(this);
    }

    public final Comparator thenComparing(Function function) {
        return Comparator$$CC.thenComparing$$dflt$$(this, function);
    }

    public final Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator$$CC.thenComparing$$dflt$$(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        return Comparator$$CC.thenComparing$$dflt$$(this, comparator);
    }

    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator$$CC.thenComparingDouble$$dflt$$(this, toDoubleFunction);
    }

    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$$CC.thenComparingInt$$dflt$$(this, toIntFunction);
    }

    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$$CC.thenComparingLong$$dflt$$(this, toLongFunction);
    }
}