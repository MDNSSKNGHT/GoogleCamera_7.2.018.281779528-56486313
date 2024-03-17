package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gry */
/* loaded from: classes.dex */
public final class gry implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;
    private final rhd h;
    private final rhd i;

    private gry(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
        this.h = rhdVar8;
        this.i = rhdVar9;
    }

    public static gry a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        return new gry(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8, rhdVar9);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mnk mnkVar = (mnk) this.a.get();
        mba mbaVar = (mba) this.b.get();
        mcs a = ((grz) this.c).a();
        Object obj = this.d.get();
        grt grtVar = new grt(mnkVar, a, (gsb) obj, (gfx) this.e.get(), (dsv) this.f.get(), (hrg) this.g.get(), (Executor) this.h.get(), ((rgn) this.i).a());
        synchronized (grtVar.b) {
            if (!grtVar.g) {
                grtVar.i = true;
                grtVar.b();
            }
        }
        return (gsf) rgk.a((gsf) mbaVar.a(grtVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}