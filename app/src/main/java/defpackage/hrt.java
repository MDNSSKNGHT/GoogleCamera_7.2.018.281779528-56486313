package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: hrt */
/* loaded from: classes.dex */
public final class hrt implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;

    private hrt(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
    }

    public static hrt a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        return new hrt(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object hrqVar;
        pjz pjzVar = (pjz) this.a.get();
        pjz pjzVar2 = (pjz) this.b.get();
        pjz pjzVar3 = (pjz) this.c.get();
        pjz pjzVar4 = (pjz) this.d.get();
        boolean booleanValue = ((gpu) this.e).a().booleanValue();
        mcs mcsVar = (mcs) this.f.get();
        mba mbaVar = (mba) this.g.get();
        qdu.b(booleanValue, "No usable raw FrameStream present.");
        if (pjzVar.a()) {
            hrqVar = new hrn(pjzVar);
        } else if (pjzVar4.a()) {
            hrqVar = new hro(pjzVar4);
        } else if (pjzVar3.a() && pjzVar2.a()) {
            mnz mnzVar = (mnz) pjzVar2.b();
            mnz mnzVar2 = (mnz) pjzVar3.b();
            String str = ((mzc) qdu.d(myh.a(mnzVar))).a;
            String str2 = ((mzc) qdu.d(myh.a(mnzVar2))).a;
            HashMap hashMap = new HashMap();
            hashMap.put(str, mnzVar);
            hashMap.put(str2, mnzVar2);
            hrs hrsVar = new hrs((mnz) pjzVar2.b());
            mbaVar.a(mcsVar.a(new hrr(hrsVar, hashMap), qot.INSTANCE));
            hrqVar = hrsVar;
        } else if (pjzVar3.a()) {
            hrqVar = new hrp(pjzVar3);
        } else if (!pjzVar2.a()) {
            throw new IllegalStateException("Neither Wide not Tele Frame stream present!");
        } else {
            hrqVar = new hrq(pjzVar2);
        }
        return (pkx) rgk.a(hrqVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}