package defpackage;

import android.os.Build;

/* compiled from: PG */
/* renamed from: mvq  reason: default package */
/* loaded from: classes.dex */
public final class mvq implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;

    public mvq(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mux muxVar;
        ncz nczVar = (ncz) this.a.get();
        mnx a = ((mqs) this.b).a();
        rhd rhdVar = this.c;
        rhd rhdVar2 = this.d;
        rhd rhdVar3 = this.e;
        rhd rhdVar4 = this.f;
        rhd rhdVar5 = this.g;
        if (nczVar.e) {
            muxVar = (mux) rhdVar4.get();
        } else if (a.b().equals(moh.HIGH_SPEED)) {
            muxVar = (mux) rhdVar5.get();
        } else if (nczVar.c) {
            muxVar = (mux) rhdVar3.get();
        } else if (nczVar.b) {
            muxVar = (mux) rhdVar2.get();
        } else if (!nczVar.a) {
            int i = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Unsupported SDK: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else {
            muxVar = (mux) rhdVar.get();
        }
        return (mux) rgk.a(muxVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
