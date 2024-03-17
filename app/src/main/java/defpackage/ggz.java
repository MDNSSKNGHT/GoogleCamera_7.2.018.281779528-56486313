package defpackage;

/* compiled from: PG */
/* renamed from: ggz  reason: default package */
/* loaded from: classes.dex */
public final class ggz implements rgg {
    private final ggx a;

    public ggz(ggx ggxVar) {
        this.a = ggxVar;
    }

    public final myo a() {
        return (myo) rgk.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}