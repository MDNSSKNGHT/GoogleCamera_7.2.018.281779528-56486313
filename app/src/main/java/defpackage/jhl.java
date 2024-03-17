package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jhl  reason: default package */
/* loaded from: classes.dex */
public final class jhl {
    public static final String a = liu.a("CheetahFs");
    public mdx A;
    public mdy B;
    public mzc C;
    public myo D;
    public kno E;
    public mzg G;
    public mnz H;
    public mnz I;
    public mba J;
    public gtl K;
    public mos L;
    public mos M;
    public jip O;
    public jkg P;
    public jkh Q;
    public int R;
    public mnj S;
    public mnu T;
    private final Activity V;
    private final jde W;
    public final cin b;
    public final mef d;
    public final mfk e;
    public final mer f;
    public final cgt g;
    public final Context h;
    public final nda i;
    public final Executor j;
    public final jfz k;
    public final ezm l;
    public final mbe m;
    public final gwg o;
    public final moj p;
    public final mdl q;
    public final bcx r;
    public final biu s;
    public final jgo t;
    public final jjf u;
    public final mkn v;
    public final cdp w;
    public final kug x;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final Object n = new Object();
    public final osu U = new jhe(this);
    public final ArrayList z = new ArrayList();
    public final boolean y = laq.a(3);
    public meo F = meo.FPS_30;
    public jmg N = jmg.MANUAL_FPS_30_1X;

    public jhl(Activity activity, cin cinVar, mef mefVar, mfk mfkVar, mer merVar, cgt cgtVar, Context context, nda ndaVar, Executor executor, jde jdeVar, jfz jfzVar, ezm ezmVar, mbe mbeVar, gwg gwgVar, moj mojVar, mdl mdlVar, bcx bcxVar, biu biuVar, jgo jgoVar, jjf jjfVar, mkn mknVar, cdp cdpVar, kug kugVar) {
        this.V = activity;
        this.b = cinVar;
        this.d = mefVar;
        this.e = mfkVar;
        this.f = merVar;
        this.g = cgtVar;
        this.h = context;
        this.i = ndaVar;
        this.W = jdeVar;
        this.k = jfzVar;
        this.l = ezmVar;
        this.m = mbeVar;
        this.o = gwgVar;
        this.p = mojVar;
        this.r = bcxVar;
        this.s = biuVar;
        this.t = jgoVar;
        this.j = executor;
        this.u = jjfVar;
        this.v = mknVar;
        this.w = cdpVar;
        this.q = mdlVar;
        this.x = kugVar;
    }

    public void a() {
        mba mbaVar = this.J;
        if (mbaVar != null) {
            mbaVar.close();
            this.J = null;
        }
    }

    public File a(long j) {
        return this.W.a(this.W.d(j), nef.MPEG4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mjs a(mix mixVar) {
        Point point = new Point();
        this.V.getWindowManager().getDefaultDisplay().getSize(point);
        mjs e = mjs.a(point).e();
        List c = ((myo) qdu.d(this.D)).c();
        return null; //(mjs) qdu.a(Collections.max(qdu.a((Collection) c, new jhd(mixVar, e)), mjt.a), "Unable to find suitable viewfinder size from %s", c);
    }
}