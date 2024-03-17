package defpackage;

/* compiled from: PG */
/* renamed from: jff */
/* loaded from: classes.dex */
public final class jff implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    public jff(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public final jfb a() {
        jfb jfbVar;
        rhd rhdVar = this.c;
        rhd rhdVar2 = this.d;
        ciq ciqVar = cit.a;
        ((cin) this.b.get()).b();
        if (!((ncz) this.a.get()).f) {
            jfbVar = (jfb) rhdVar.get();
        } else {
            jfbVar = (jfb) rhdVar2.get();
        }
        return (jfb) rgk.a(jfbVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}