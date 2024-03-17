package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: djp */
/* loaded from: classes.dex */
public final class djp implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private djp(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static djp a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new djp(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        Integer num = (Integer) this.a.get();
        Boolean a = ((djq) this.b).a();
        rhd rhdVar = this.c;
        mkn mknVar = (mkn) this.d.get();
        if (!a.booleanValue() || num.intValue() < 0) {
            obj = pvi.a;
        } else {
            try {
                mknVar.b("FRAMESTORE_MetadataModule#provideRequestListener");
                obj = psl.c((mrx) rhdVar.get());
            } finally {
                mknVar.a();
            }
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}