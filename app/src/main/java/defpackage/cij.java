package defpackage;

/* compiled from: PG */
/* renamed from: cij  reason: default package */
/* loaded from: classes.dex */
public final class cij {
    public static final ciq a;
    public static final cio b;
    public static final cio c;
    public static final cio d;

    static {
        cip cipVar = new cip();
        cipVar.a = "camera.vesper_debl";
        b = cipVar.h();
        cip cipVar2 = new cip();
        cipVar2.a = "camera.enable_vesper";
        c = cipVar2.h();
        cip cipVar3 = new cip();
        cipVar3.a = "face_retouching_default_setting";
        a = cipVar3.a();
        cip cipVar4 = new cip();
        cipVar4.a = "camera.enable_lvesper";
        d = cipVar4.h();
        cip cipVar5 = new cip();
        cipVar5.a = "camera.enable_mvesper";
        cipVar5.b();
    }

    public static void a(nda ndaVar, cis cisVar) {
        cisVar.b(b, ndaVar.d() || ndaVar.f());
        cisVar.b(c, true);
        cisVar.b(a, 1);
        cisVar.b(d, false);
    }
}