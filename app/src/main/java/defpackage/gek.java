package defpackage;

/* compiled from: PG */
/* renamed from: gek  reason: default package */
/* loaded from: classes.dex */
public final class gek implements rgg {
    private final rhd a;

    private gek(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gek a(rhd rhdVar) {
        return new gek(rhdVar);
    }

    public final gej a() {
        return new gej((gel) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}