package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: cjh  reason: default package */
/* loaded from: classes.dex */
public final class cjh {
    public static final cio a;
    public static final cio b;
    public static final cio c;
    public static final cio d;
    public static final cio e;
    public static final cio f;
    public static final cio g;
    public static final cio h;
    public static final cio i;
    public static final cio j;
    public static final cio k;
    private static final Map l = prx.b(cjg.DEFAULT, "default", cjg.BLUELINE, "blueline", cjg.SARGO, "sargo");

    static {
        cip cipVar = new cip();
        cipVar.a = "device_config";
        a = cipVar.j();
        cip cipVar2 = new cip();
        cipVar2.a = "rectiface_supported";
        b = cipVar2.i();
        cip cipVar3 = new cip();
        cipVar3.a = "camera.acat_off";
        c = cipVar3.h();
        cip cipVar4 = new cip();
        cipVar4.a = "camera.acat_sff_off";
        d = cipVar4.h();
        cip cipVar5 = new cip();
        cipVar5.a = "camera.disable_sff_in_regular_mode";
        e = cipVar5.h();
        cip cipVar6 = new cip();
        cipVar6.a = "camera.acat_fsc_off";
        f = cipVar6.h();
        cip cipVar7 = new cip();
        cipVar7.a = "camera.acat_cpu_warp";
        g = cipVar7.h();
        cip cipVar8 = new cip();
        cipVar8.a = "camera.acat_force_fd";
        h = cipVar8.h();
        cip cipVar9 = new cip();
        cipVar9.a = "camera.acat_lc_only";
        i = cipVar9.h();
        cip cipVar10 = new cip();
        cipVar10.a = "camera.acat_debug";
        j = cipVar10.h();
        cip cipVar11 = new cip();
        cipVar11.a = "camera.acat_use_mask";
        k = cipVar11.h();
    }

    public static String a(int i2) {
        return (String) l.get(qdu.d(cjg.values()[i2]));
    }
}
