package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ppy  reason: default package */
/* loaded from: classes.dex */
public final class ppy extends ppz implements Serializable {
    public static final ppy a = new ppy();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }

    @Override // defpackage.ppz
    public final /* bridge */ /* synthetic */ Comparable a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ppz
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ppz
    public final /* bridge */ /* synthetic */ Comparable b(Comparable comparable) {
        int intValue = ((Integer) comparable).intValue();
        if (intValue != Integer.MAX_VALUE) {
            return Integer.valueOf(intValue + 1);
        }
        return null;
    }

    @Override // defpackage.ppz
    public final /* bridge */ /* synthetic */ Comparable a(Comparable comparable) {
        int intValue = ((Integer) comparable).intValue();
        if (intValue != Integer.MIN_VALUE) {
            return Integer.valueOf(intValue - 1);
        }
        return null;
    }
}
