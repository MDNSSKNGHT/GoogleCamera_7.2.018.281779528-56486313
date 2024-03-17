package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bbx */
/* loaded from: classes.dex */
public final class bbx implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private bbx(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static bbx a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new bbx(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new bbw((mba) this.a.get(), (dnf) this.b.get(), ((ggy) this.c).a(), (Executor) this.d.get(), ((mke) this.e).a());
    }
}