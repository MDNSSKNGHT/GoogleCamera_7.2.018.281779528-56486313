package defpackage;

/* compiled from: PG */
/* renamed from: khu  reason: default package */
/* loaded from: classes.dex */
public final class khu implements rgg {
    private final khk a;

    public khu(khk khkVar) {
        this.a = khkVar;
    }

    public final khh a() {
        return (khh) rgk.a(this.a.b, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}