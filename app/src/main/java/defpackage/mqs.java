package defpackage;

/* compiled from: PG */
/* renamed from: mqs  reason: default package */
/* loaded from: classes.dex */
public final class mqs implements rgg {
    private final mqm a;

    public mqs(mqm mqmVar) {
        this.a = mqmVar;
    }

    public final mnx a() {
        return (mnx) rgk.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}