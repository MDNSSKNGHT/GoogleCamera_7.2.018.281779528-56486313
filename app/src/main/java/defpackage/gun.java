package defpackage;

import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gun  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public final class gun implements cgw {
    public static final String a = liu.a("OptionsBarCtlr2");
    public final mdl A;
    public final mdl B;
    public final mdl C;
    public final gut D;
    public final gut E;
    public final gut F;
    public final gut G;
    public final gut H;
    public final gut I;
    public final gut J;
    public final gut K;
    public final gut L;
    public final gut M;
    public final gut N;
    public final gut O;
    public final gut P;
    public final gut Q;
    public final gut R;
    public final gut S;
    public final gut T;
    public final gut U;
    public final mcs V;
    public final mcs W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final fad aA;
    public final gbq aC;
    public final mdl aD;
    private final mbe aE;
    private final mai aF;
    private final moj aG;
    private final mdl aH;
    private final mdl aI;
    private RelativeLayout aJ;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public final boolean ae;
    public final boolean af;
    public boolean ag;
    public OptionsMenuView aw;
    public OptionsMenuContainer ax;
    public ImageButton ay;
    public ImageButton az;
    public final mdl b;
    public final mkn c;
    public final cin d;
    public final cvw e;
    public final kug f;
    public final imb g;
    public final imi h;
    public final boolean i;
    public final mdl j;
    public final mdl k;
    public final mdl l;
    public final mdl m;
    public final mdl n;
    public final mdl o;
    public final mdl p;
    public final mdl q;
    public final mdl r;
    public final mdl s;
    public final mdl t;
    public final mdl u;
    public final mdl v;
    public final mdl w;
    public final mdl x;
    public final mdl y;
    public final mdl z;
    public final pov ah = pre.a(guw.TIMER_ZERO_SECONDS, ilw.OFF, guw.TIMER_THREE_SECONDS, ilw.THREE, guw.TIMER_TEN_SECONDS, ilw.TEN, guw.TIMER_AUTO, ilw.AUTO);
    public final pov ai = pre.a(guw.HDR_OFF, grj.OFF, guw.HDR_AUTO, grj.AUTO, guw.HDR_ON, grj.ON);
    public final pov aj = pre.a(guw.SELECTED, true, guw.UNSELECTED, false);
    public final pov ak = pre.a(guw.PHOTO_FLASH_AUTO, "auto", guw.PHOTO_FLASH_OFF, "off", guw.PHOTO_FLASH_ON, "on");
    public final pov al = pre.a(guw.FPS_AUTO, ilv.FPS_AUTO, guw.FPS_30, ilv.FPS_30, guw.FPS_60, ilv.FPS_60);
    public final pov am = pre.a(guw.EXT_MICROPHONE_ON, true, guw.EXT_MICROPHONE_OFF, false);
    public final pov an = pre.a(guw.BEAUTIFICATION_ON_LIGHT, ilu.ON_LIGHT.d, guw.BEAUTIFICATION_ON_STRONG, ilu.ON_STRONG.d, guw.BEAUTIFICATION_OFF, ilu.OFF.d);
    public final pov ao = pre.a(guw.AF_ON, ils.ON.f, guw.AF_ON_LOCKED, ils.ON_LOCKED.f, guw.AF_OFF_NEAR, ils.OFF_NEAR.f, guw.AF_OFF_FAR, ils.OFF_FAR.f, guw.AF_OFF_INFINITY, ils.OFF_INFINITY.f);
    public final pov ap = pre.a(guw.MICROVIDEO_ON, 2, guw.MICROVIDEO_AUTO, 1, guw.MICROVIDEO_OFF, 0);
    public final pov aq = pre.a(guw.PHOTO_SPHERE, "pano_photosphere", guw.HORIZONTAL_PHOTO_SPHERE, "pano_horizontal", guw.VERTICAL_PHOTO_SPHERE, "pano_vertical", guw.WIDE_ANGLE_PHOTO_SPHERE, "pano_wide", guw.FISH_EYE_PHOTO_SPHERE, "pano_fisheye");
    public final pov ar = pre.a(guw.SIXTEEN_BY_NINE, ilt.SIXTEEN_BY_NINE.c, guw.FOUR_BY_THREE, ilt.FOUR_BY_THREE.c);
    public final pov as = pre.a(guw.VIDEO_FLASH_OFF, "off", guw.VIDEO_FLASH_ON, "torch");
    public final pov at = pre.a(guw.IMAX_AUDIO_ON, true, guw.IMAX_AUDIO_OFF, false);
    public gul au = gtn.a;
    public gum av = gty.a;
    public final AtomicBoolean aB = new AtomicBoolean(false);

    static boolean a(klw klwVar, boolean z) {
        return klwVar == klw.PHOTO && z;
    }

    public gun(mdl mdlVar, mbe mbeVar, mkn mknVar, mai maiVar, gtm gtmVar, cin cinVar, mdl mdlVar2, mdl mdlVar3, mdl mdlVar4, mdl mdlVar5, mdl mdlVar6, mdl mdlVar7, mdl mdlVar8, mdl mdlVar9, mdl mdlVar10, mdl mdlVar11, mdl mdlVar12, mdl mdlVar13, mdl mdlVar14, mdl mdlVar15, boolean z, mdl mdlVar16, boolean z2, mdl mdlVar17, mdl mdlVar18, mdl mdlVar19, boolean z3, mdl mdlVar20, boolean z4, boolean z5, mdl mdlVar21, mdl mdlVar22, fad fadVar, moj mojVar, imb imbVar, mdl mdlVar23, mdl mdlVar24, cvw cvwVar, kug kugVar, imi imiVar, mdl mdlVar25, boolean z6, gbq gbqVar, mdl mdlVar26) {
        this.b = mdlVar;
        this.aE = mbeVar;
        this.c = mknVar;
        this.aF = maiVar;
        this.d = cinVar;
        this.j = mdlVar22;
        this.k = mdlVar2;
        this.l = mdlVar4;
        this.m = mdlVar5;
        this.n = mdlVar6;
        this.o = mdlVar7;
        this.r = mdlVar10;
        this.p = mdlVar8;
        this.q = mdlVar9;
        this.s = mdlVar12;
        this.t = mdlVar13;
        this.u = mdlVar14;
        this.v = mdlVar15;
        this.w = mdlVar16;
        this.x = mdlVar17;
        this.y = mdlVar18;
        this.aH = mdlVar19;
        this.z = mdlVar20;
        this.A = mdlVar21;
        this.C = mdlVar23;
        this.B = mdlVar24;
        this.aI = mdlVar25;
        this.D = gtmVar.a(false);
        this.E = gtmVar.a(cinVar.c(cit.ag));
        this.F = gtmVar.c;
        this.G = gtmVar.d;
        this.H = gtmVar.e;
        this.I = gtmVar.f;
        this.J = gtmVar.h;
        this.K = gtmVar.i;
        this.L = gtmVar.g;
        ArrayList arrayList = new ArrayList();
        if (z4) {
            arrayList.add(guw.FPS_AUTO);
        }
        arrayList.add(guw.FPS_30);
        if (z5) {
            arrayList.add(guw.FPS_60);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(qdu.d(gtm.b.get(arrayList.get(i))));
        }
        this.M = gut.a(guv.FPS, gtm.a, 2131952006, 2131952007, prr.a(arrayList2));
        this.N = gtmVar.j;
        this.O = gtmVar.k;
        this.P = gtmVar.l;
        this.Q = gtmVar.n;
        this.R = gtmVar.m;
        this.S = gtmVar.o;
        this.T = gtmVar.p;
        this.U = gtmVar.q;
        this.V = mdlVar3;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.ae = z4;
        this.af = z5;
        this.W = mdlVar11;
        this.aA = fadVar;
        this.e = cvwVar;
        this.f = kugVar;
        this.aG = mojVar;
        this.g = imbVar;
        this.h = imiVar;
        this.i = z6;
        this.aC = gbqVar;
        this.aD = mdlVar26;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x03ed A[Catch: all -> 0x0737, TryCatch #0 {, blocks: (B:12:0x0027, B:14:0x002d, B:16:0x005d, B:18:0x006e, B:20:0x00ff, B:22:0x017e, B:23:0x01be, B:25:0x01c4, B:30:0x01d6, B:31:0x01ec, B:33:0x0286, B:37:0x0297, B:39:0x02a8, B:41:0x0330, B:43:0x0352, B:45:0x0360, B:47:0x036e, B:49:0x037c, B:54:0x03df, B:56:0x03ed, B:58:0x043a, B:57:0x0424, B:53:0x03cc, B:42:0x0343, B:73:0x05b5, B:77:0x05c3, B:76:0x05c0, B:59:0x044d, B:61:0x0461, B:63:0x04ed, B:65:0x0512, B:67:0x0520, B:69:0x054d, B:71:0x055b, B:72:0x0579, B:64:0x0500, B:21:0x0138, B:78:0x05ce, B:80:0x05e8, B:82:0x05f5, B:86:0x06f6, B:85:0x06f0, B:87:0x06ff, B:88:0x071c), top: B:104:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0424 A[Catch: all -> 0x0737, TryCatch #0 {, blocks: (B:12:0x0027, B:14:0x002d, B:16:0x005d, B:18:0x006e, B:20:0x00ff, B:22:0x017e, B:23:0x01be, B:25:0x01c4, B:30:0x01d6, B:31:0x01ec, B:33:0x0286, B:37:0x0297, B:39:0x02a8, B:41:0x0330, B:43:0x0352, B:45:0x0360, B:47:0x036e, B:49:0x037c, B:54:0x03df, B:56:0x03ed, B:58:0x043a, B:57:0x0424, B:53:0x03cc, B:42:0x0343, B:73:0x05b5, B:77:0x05c3, B:76:0x05c0, B:59:0x044d, B:61:0x0461, B:63:0x04ed, B:65:0x0512, B:67:0x0520, B:69:0x054d, B:71:0x055b, B:72:0x0579, B:64:0x0500, B:21:0x0138, B:78:0x05ce, B:80:0x05e8, B:82:0x05f5, B:86:0x06f6, B:85:0x06f0, B:87:0x06ff, B:88:0x071c), top: B:104:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.pov r24, defpackage.mdl r25, defpackage.gut r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gun.a(pov, mdl, gut, boolean):void");
    }

    public void a(gvu gvuVar) {
        this.ax.a(gvuVar);
    }

    @Override // defpackage.cgw
    public qpp a(mzg mzgVar) {
        d();
        return rgk.b((Object) null);
    }

    public void a() {
        if (this.ax.k()) {
            this.ax.l();
        }
    }

    private static ImageButton a(Context context) {
        return new ImageButton(context, null, 0, 2132018197);
    }

    public void i() {
        this.ax.i();
        qdu.b(!h());
    }

    @Deprecated
    public void e() {
        if (h()) {
            return;
        }
        l();
    }

    private void l() {
        this.ax.j();
        qdu.b(h());
    }

    public void b() {
        if (!k()) {
            guz guzVar = this.ax.c;
            guzVar.a();
            guzVar.c = 1;
            guzVar.b = AnimatorInflater.loadAnimator(guzVar.a.getContext(), 17498112);
            guzVar.b.setDuration(200L);
            guzVar.b.setTarget(guzVar.a);
            guzVar.b.addListener(new gux(guzVar));
            guzVar.b.start();
            qdu.b(guzVar.b.isStarted());
        }
        l();
    }

    public void c() {
        i();
        if (k()) {
            guz guzVar = this.ax.c;
            guzVar.a();
            guzVar.c = 2;
            guzVar.b = AnimatorInflater.loadAnimator(guzVar.a.getContext(), 17498113);
            guzVar.b.setDuration(200L);
            guzVar.b.setTarget(guzVar.a);
            guzVar.b.addListener(new guy(guzVar));
            guzVar.b.start();
        }
    }

    public static guw a(pov povVar, mdl mdlVar, guw guwVar) {
        guw guwVar2 = (guw) povVar.a().get(mdlVar.a());
        if (guwVar2 == null) {
            String str = a;
            String valueOf = String.valueOf(mdlVar);
            String valueOf2 = String.valueOf(mdlVar.a());
            String valueOf3 = String.valueOf(guwVar);
            int length = valueOf.length();
            String sb = "Tried to get MenuOption for property " +
                    valueOf +
                    " with value " +
                    valueOf2 +
                    " but value wasn't found in map. Returning default instead: " +
                    valueOf3;
            liu.b(str, sb);
            return guwVar;
        }
        return guwVar2;
    }

    public void d() {
        i();
        if (k()) {
            guz guzVar = this.ax.c;
            guzVar.a();
            guzVar.a.setVisibility(4);
        }
    }

    private void a(mdl mdlVar, pov povVar, gut gutVar) {
        this.aF.a(mdlVar.a(new gua(this, povVar, mdlVar, gutVar), this.aE));
        OptionsMenuView optionsMenuView = this.aw;
        optionsMenuView.d.put(gutVar, new gub(this, povVar, mdlVar, gutVar));
    }

    public boolean j() {
        return this.ax.k();
    }

    public boolean a(PointF pointF) {
        RelativeLayout relativeLayout = this.aJ;
        int[] a2 = oeh.a(relativeLayout.getRootView());
        float f = pointF.x + a2[0];
        float f2 = pointF.y + a2[1];
        int[] iArr = new int[2];
        relativeLayout.getLocationOnScreen(iArr);
        return f >= ((float) iArr[0]) && f <= ((float) (iArr[0] + relativeLayout.getWidth())) && f2 >= ((float) iArr[1]) && f2 <= ((float) (iArr[1] + relativeLayout.getHeight()));
    }

    public boolean h() {
        return this.ax.isEnabled();
    }

    private boolean k() {
        guz guzVar = this.ax.c;
        int i = guzVar.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return guzVar.a.getVisibility() == 0;
                    }
                    throw new IllegalStateException("Should never be here");
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    public void f() {
        if (this.aB.compareAndSet(false, true)) {
            this.aE.execute(new gto(this));
        }
    }

    public void a(ilt iltVar, mzg mzgVar, String str) {
        mjs mjsVar;
        String str2;
        qdu.d(iltVar);
        qdu.d(mzgVar);
        Collection a2 = qdu.a((Collection) this.aG.a().b((mzc) qdu.d(this.aG.a().b(mzgVar))).a(256), new guj(iltVar));
        qdu.d(!a2.isEmpty());
        ArrayList arrayList = new ArrayList(a2);
        Collections.sort(arrayList, Collections.reverseOrder(mjt.a));
        if (str.equals("full")) {
            mjsVar = (mjs) arrayList.get(0);
        } else {
            if (str.equals("medium")) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    mjs mjsVar2 = (mjs) arrayList.get(i);
                    i++;
                    if (mjsVar2.b() < 5242880) {
                        mjsVar = mjsVar2;
                        break;
                    }
                }
            }
            liu.b(a, "Invalid resolution setting, using default.");
            mjsVar = (mjs) arrayList.get(0);
        }
        if (mzgVar == mzg.FRONT) {
            str2 = "pref_camera_picturesize_front_key";
        } else if (mzgVar != mzg.BACK) {
            String str3 = a;
            String valueOf = String.valueOf(mzgVar);
            String sb = "Unsupported facing value: " +
                    valueOf;
            liu.b(str3, sb);
            return;
        } else {
            str2 = "pref_camera_picturesize_back_key";
        }
        this.g.a("default_scope", str2, fpp.a(mjsVar));
    }

    public void a(geq geqVar) {
        boolean z = true;
        this.ac = geqVar.N() == mzg.FRONT;
        if (!geqVar.f() && !this.ac) {
            z = false;
        }
        this.aa = z;
        this.ab = geqVar.r();
        f();
    }

    public void g() {
        boolean equals;
        if (!this.ac) {
            equals = this.n.a().equals("on");
        } else {
            equals = this.o.a().equals("on");
        }
        if ((!equals || ((Integer) this.aH.a()).intValue() != 0) && !grj.ON.equals(this.k.a()) && !((Boolean) this.aI.a()).booleanValue()) {
            this.aw.b(guv.MICROVIDEO);
        } else {
            this.aw.a(guv.MICROVIDEO);
        }
    }

    public void a(OptionsMenuContainer optionsMenuContainer) {
        qdu.d(mbe.b());
        this.c.b("OptionsBarCtrl#wire");
        if (optionsMenuContainer != null) {
            this.aw = optionsMenuContainer.d();
            this.ax = optionsMenuContainer;
            optionsMenuContainer.a(new guk(this));
            this.ax.p = this.h;
            this.aJ = optionsMenuContainer.e();
        }
        if (optionsMenuContainer != null) {
            Context context = optionsMenuContainer.getContext();
            ImageButton a2 = a(context);
            this.ay = a2;
            a2.setImageResource(2131231216);
            this.ay.setContentDescription(context.getResources().getString(2131951656));
            this.ay.setBackgroundColor(17170445);
            this.ay.setOnClickListener(new gtp(this));
            this.ay.setOnTouchListener(gtq.a);
            ImageButton a3 = a(context);
            this.az = a3;
            a3.setImageResource(2131231298);
            this.az.setContentDescription(context.getResources().getString(2131952489));
            this.az.setOnClickListener(new gtr(this));
            gbn a4 = this.aC.c().a(true);
            qdu.d(a4);
            optionsMenuContainer.r = a4.a(optionsMenuContainer.h.getResources().getString(2131951955)).a();
            optionsMenuContainer.s = a4.a(optionsMenuContainer.h.getResources().getString(2131951956)).a();
            optionsMenuContainer.t = a4.a(optionsMenuContainer.h.getResources().getString(2131951954)).a();
        } else {
            liu.b(a, "OptionsMenuContainer is null!");
        }
        this.aF.a(this.b.a(new guc(this), qot.INSTANCE));
        this.aF.a(this.u.a(new gud(this), qot.INSTANCE));
        this.aF.a(this.V.a(new gue(this), qot.INSTANCE));
        this.aF.a(this.m.a(new guf(this), qot.INSTANCE));
        this.aF.a(this.W.a(new gug(this), qot.INSTANCE));
        this.aF.a(this.B.a(new guh(this), qot.INSTANCE));
        this.aF.a(this.C.a(new gui(this), qot.INSTANCE));
        a(this.j, this.ah, this.E);
        a(this.j, this.ah, this.D);
        a(this.k, this.ai, this.F);
        a(this.l, this.aj, this.G);
        a(this.n, this.ak, this.H);
        a(this.o, this.ak, this.I);
        a(this.p, this.as, this.J);
        a(this.q, this.as, this.K);
        a(this.r, this.as, this.L);
        a(this.s, this.al, this.M);
        a(this.t, this.am, this.N);
        a(this.v, this.ap, this.O);
        a(this.w, this.an, this.P);
        a(this.x, this.ao, this.Q);
        a(this.y, this.ao, this.R);
        a(this.A, this.at, this.S);
        a(this.z, this.aq, this.U);
        a(this.B, this.ar, this.T);
        this.aF.a(this.aH.a(new gts(this), this.aE));
        this.aF.a(this.n.a(new gtt(this), this.aE));
        this.aF.a(this.o.a(new gtu(this), this.aE));
        this.aF.a(this.k.a(new gtv(this), this.aE));
        this.aF.a(this.aI.a(new gtw(this), this.aE));
        this.aF.a(this.b.a(new gtx(this), this.aE));
        this.aF.a(this.j.a(new gtz(this), qot.INSTANCE));
        this.c.a();
    }
}