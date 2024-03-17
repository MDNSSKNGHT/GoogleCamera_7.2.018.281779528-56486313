package defpackage;

import android.util.Range;

import java.util.Comparator;

import j$.util.Comparator$$CC;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

/* compiled from: PG */
/* renamed from: knm  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class knm implements Comparator, j$.util.Comparator {
    public static final Comparator a = new knm();

    private knm() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Range range = (Range) obj;
        Range range2 = (Range) obj2;
        int i = knn.a;
        if (((Integer) range2.getUpper()).compareTo((Integer) range.getUpper()) == 0) {
            return ((Integer) range.getLower()).compareTo((Integer) range2.getLower());
        }
        return ((Integer) range2.getUpper()).compareTo((Integer) range.getUpper());
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