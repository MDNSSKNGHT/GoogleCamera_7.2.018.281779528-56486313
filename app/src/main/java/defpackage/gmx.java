package defpackage;

/* compiled from: PG */
/* renamed from: gmx  reason: default package */
/* loaded from: classes.dex */
public final class gmx implements rgg {
    private final rhd a;

    private gmx(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gmx a(rhd rhdVar) {
        return new gmx(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gmw((mjw) this.a.get());
    }
}