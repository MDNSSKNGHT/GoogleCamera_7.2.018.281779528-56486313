package defpackage;

/* compiled from: PG */
/* renamed from: ciy  reason: default package */
/* loaded from: classes.dex */
public final class ciy {
    public static final cio a;
    public static final cio b;
    public static final cio c;
    public static final cio d;
    public static final cio e;

    static {
        cip cipVar = new cip();
        cipVar.a = "camera.enable_cuttlef";
        a = cipVar.h();
        cip cipVar2 = new cip();
        cipVar2.a = "total_exposure_threshold_front";
        b = cipVar2.k();
        cip cipVar3 = new cip();
        cipVar3.a = "total_exposure_threshold_rear";
        c = cipVar3.k();
        cip cipVar4 = new cip();
        cipVar4.a = "camera.promote_night_sight";
        d = cipVar4.h();
        cip cipVar5 = new cip();
        cipVar5.a = "camera.cuttle.glpreview";
        e = cipVar5.h();
    }

    public static float b(cin cinVar, mzg mzgVar) {
        if (mzgVar != mzg.FRONT) {
            return cinVar.f(c);
        }
        return cinVar.f(b);
    }

    public static float a(cin cinVar, mzg mzgVar) {
        return b(cinVar, mzgVar) * (mzgVar == mzg.FRONT ? 0.9f : 0.8f);
    }
}