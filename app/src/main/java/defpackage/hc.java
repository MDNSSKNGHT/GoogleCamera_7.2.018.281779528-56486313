package defpackage;

import j$.util.Comparator$$CC;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: hc  reason: default package */
/* loaded from: classes.dex */
final class hc implements Comparator, j$.util.Comparator {
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

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}