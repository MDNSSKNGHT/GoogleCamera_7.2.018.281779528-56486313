package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: hjz */
/* loaded from: classes.dex */
public final class hjz implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private hjz(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static hjz a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hjz(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        myo a = ((ggz) this.a).a();
        Set<mou> a2 = ((rgn) this.b).a();
        Set a3 = ((rgn) this.c).a();
        hju hjuVar = (hju) this.d.get();
        mom momVar = (mom) this.e.get();
        mnw l = mnx.l();
        l.a(a.M());
        for (mou mouVar : a2) {
            l.a(mouVar);
        }
        if (!a3.isEmpty()) {
            l.a(a3);
        }
        l.a(hjuVar);
        l.a(momVar);
        return (mnx) rgk.a(l.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}