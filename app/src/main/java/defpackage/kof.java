package defpackage;

/* compiled from: PG */
/* renamed from: kof  reason: default package */
/* loaded from: classes.dex */
public final class kof implements rgg {
    private final rhd a;

    public kof(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final koe a() {
        return new koe(((dzs) this.a).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}