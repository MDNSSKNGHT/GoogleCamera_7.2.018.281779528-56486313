package defpackage;

/* compiled from: PG */
/* renamed from: dqx */
/* loaded from: classes.dex */
public final class dqx implements rgg {
    public static final dqx a = new dqx();

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a2;
        if (lap.h != null) {
            a2 = ggt.a(lap.h, (Object) 1);
        } else {
            a2 = ggt.a();
        }
        return (ggq) rgk.a(a2, "Cannot return null from a non-@Nullable @Provides method");
    }
}