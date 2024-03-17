package defpackage;

/* compiled from: PG */
/* renamed from: hsh  reason: default package */
/* loaded from: classes.dex */
public final class hsh {
    public static final String a = liu.a("PckOneCameraModule");

    public static bmx a(hju hjuVar, mdl mdlVar, neg negVar) {
        return kos.a(new hsd(hjuVar, mdlVar));
    }

    public static bmx a(cin cinVar, gqs gqsVar, hju hjuVar) {
        return kos.a(new hsc(hjuVar, ((Integer) cinVar.a(cit.b).b()).intValue(), gqsVar));
    }

    public static gcm a(hsa hsaVar, mba mbaVar) {
        return (gcm) mbaVar.a(hsaVar);
    }

    public static bmx a(mba mbaVar, mnu mnuVar, mou mouVar, qpp qppVar) {
        mos b = mnuVar.a().b(mouVar);
        if (b == null) {
            liu.d(a);
            return bnc.a;
        }
        mbaVar.a(mnuVar.a(mnuVar.a(b)));
        return new hsb(qppVar, b);
    }

    public static mou a(mjs mjsVar, geq geqVar) {
        return mrx.b(geqVar.M(), mjsVar);
    }
}