package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.List;

/* compiled from: PG */
/* renamed from: kel  reason: default package */
/* loaded from: classes.dex */
public final class kel {
    public Integer a;
    public Integer b;
    public Drawable c;
    public Boolean d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private Integer s;
    private kdd t;
    private ilw u;
    private List v;

    public kel(byte b) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final kem l() {
        String str = this.l == null ? " photoCircleRadius" : "";
        if (this.m == null) {
            str = str.concat(" photoCircleAlpha");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" photoCircleColor");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" videoDotRadius");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" videoCircleColor");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" stopSquareHalfSize");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" portraitInnerCircleRadius");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" portraitOuterCircleRadius");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" buttonImageRectHalfSize");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" animateRippleEffect");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" ripplePaintAlpha");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" rippleRadius");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" mainButtonColor");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" roundButtonRadius");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" timerOption");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" tickMarkLength");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" tickMarkPadding2CircleEdge");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" tickMarkRectRoundRadius");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" tickMarkAlpha");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" tickMarkCircleState");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new kcy(this.l.intValue(), this.m.intValue(), this.a.intValue(), this.n.intValue(), this.b.intValue(), this.o.intValue(), this.p.intValue(), this.q.intValue(), this.c, this.r.intValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.s.intValue(), this.t, this.u, this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable) {
        this.c = drawable;
    }

    public final int g() {
        Integer num = this.r;
        if (num == null) {
            throw new IllegalStateException("Property \"buttonImageRectHalfSize\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.r = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public final kdd i() {
        kdd kddVar = this.t;
        if (kddVar != null) {
            return kddVar;
        }
        throw new IllegalStateException("Property \"mode\" has not been set");
    }

    public final void a(kdd kddVar) {
        if (kddVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.t = kddVar;
    }

    public final int b() {
        Integer num = this.m;
        if (num == null) {
            throw new IllegalStateException("Property \"photoCircleAlpha\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        this.m = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    public final int a() {
        Integer num = this.l;
        if (num == null) {
            throw new IllegalStateException("Property \"photoCircleRadius\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        this.l = Integer.valueOf(i);
    }

    public final int e() {
        Integer num = this.p;
        if (num == null) {
            throw new IllegalStateException("Property \"portraitInnerCircleRadius\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        this.p = Integer.valueOf(i);
    }

    public final int f() {
        Integer num = this.q;
        if (num == null) {
            throw new IllegalStateException("Property \"portraitOuterCircleRadius\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        this.q = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        this.e = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        this.f = Integer.valueOf(i);
    }

    public final int h() {
        Integer num = this.s;
        if (num == null) {
            throw new IllegalStateException("Property \"roundButtonRadius\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        this.s = Integer.valueOf(i);
    }

    public final int d() {
        Integer num = this.o;
        if (num == null) {
            throw new IllegalStateException("Property \"stopSquareHalfSize\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i) {
        this.o = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(int i) {
        this.k = Integer.valueOf(i);
    }

    public final List k() {
        List list = this.v;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"tickMarkCircleState\" has not been set");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List list) {
        if (list == null) {
            throw new NullPointerException("Null tickMarkCircleState");
        }
        this.v = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i) {
        this.h = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i) {
        this.i = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i) {
        this.j = Integer.valueOf(i);
    }

    public final ilw j() {
        ilw ilwVar = this.u;
        if (ilwVar != null) {
            return ilwVar;
        }
        throw new IllegalStateException("Property \"timerOption\" has not been set");
    }

    public final void a(ilw ilwVar) {
        if (ilwVar == null) {
            throw new NullPointerException("Null timerOption");
        }
        this.u = ilwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i) {
        this.b = Integer.valueOf(i);
    }

    public final int c() {
        Integer num = this.n;
        if (num == null) {
            throw new IllegalStateException("Property \"videoDotRadius\" has not been set");
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(int i) {
        this.n = Integer.valueOf(i);
    }

    public kel() {
    }

    public final void a(Resources resources) {
        if (i() == kdd.PHOTO_IDLE || i() == kdd.PORTRAIT_IDLE || i() == kdd.NIGHT_IDLE) {
            kdd i = i();
            kdd kddVar = kdd.NIGHT_IDLE;
            ilw j = j();
            String str = kem.a;
            String valueOf = String.valueOf(j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Update button image according to timer option = ");
            sb.append(valueOf);
            sb.toString();
            liu.b(str);
            ilw ilwVar = ilw.OFF;
            int ordinal = j.ordinal();
            int i2 = 0;
            int i3 = ordinal != 1 ? ordinal != 2 ? i != kddVar ? 0 : 2131231105 : i != kddVar ? 2131231404 : 2131231405 : i != kddVar ? 2131231406 : 2131231407;
            Drawable drawable = null;
            if (i3 != 0) {
                drawable = resources.getDrawable(i3, null);
                i2 = drawable.getIntrinsicWidth() / 2;
            }
            this.c = drawable;
            a(i2);
        }
    }
}