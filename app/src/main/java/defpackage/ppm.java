package defpackage;

/* compiled from: PG */
/* renamed from: ppm  reason: default package */
/* loaded from: classes.dex */
final class ppm extends ppo {
    @Override // defpackage.ppo
    public final int a() {
        return 0;
    }

    @Override // defpackage.ppo
    public final ppo a(Comparable comparable, Comparable comparable2) {
        int compareTo = comparable.compareTo(comparable2);
        return compareTo < 0 ? ppo.b : compareTo > 0 ? ppo.c : ppo.a;
    }
}