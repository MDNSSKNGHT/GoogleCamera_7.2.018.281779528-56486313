package defpackage;

/* compiled from: PG */
/* renamed from: gfj */
/* loaded from: classes.dex */
public final class gfj implements rgg {
    public static final gfj a = new gfj();

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a2;
        if (lan.j != null) {
            a2 = ggt.a(lan.j, (Object) 1);
        } else {
            a2 = ggt.a();
        }
        return (ggq) rgk.a(a2, "Cannot return null from a non-@Nullable @Provides method");
    }
}