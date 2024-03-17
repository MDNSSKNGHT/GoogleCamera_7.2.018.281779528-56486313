package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: kem  reason: default package */
/* loaded from: classes.dex */
public abstract class kem {
    public static final String a = liu.a("ShutterButtonSpec");

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract Drawable i();

    public abstract int j();

    public abstract boolean k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract kdd p();

    public abstract ilw q();

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract List v();

    private static kel a(kdd kddVar, ilw ilwVar) {
        kel kelVar = new kel((byte) 0);
        kelVar.a(kddVar);
        kelVar.a(ilwVar);
        kelVar.a(false);
        kelVar.h(0);
        kelVar.c = null;
        kelVar.a(0);
        kelVar.b(-1);
        kelVar.g(0);
        kelVar.f(0);
        kelVar.m(0);
        kelVar.n(0);
        kelVar.o(0);
        kelVar.l(0);
        kelVar.a(Arrays.asList(new Boolean[30]));
        return kelVar;
    }

    @SuppressLint("ResourceType")
    public static kel a(kdd kddVar, ilw ilwVar, Resources resources) {
        kdd kddVar2 = kdd.PHOTO_IDLE;
        ilw ilwVar2 = ilw.OFF;
        switch (kddVar.ordinal()) {
            case 0:
            case 11:
            case 22:
            case 23:
                kel a2 = a(kddVar, ilwVar);
                a2.e(resources.getDimensionPixelSize(2131165964));
                a2.c(255);
                a2.d(resources.getColor(2131099736, null));
                a2.q(0);
                a2.p(resources.getColor(2131100675, null));
                a2.k(0);
                a2.i(resources.getDimensionPixelSize(2131165964));
                a2.f(resources.getDimensionPixelSize(2131165964));
                a2.g(resources.getDimensionPixelSize(2131165964));
                a2.j(resources.getDimensionPixelSize(2131165965));
                a2.a(resources);
                return a2;
            case 1:
                kel a3 = a(kddVar, ilwVar);
                a3.e(resources.getDimensionPixelSize(2131165964));
                a3.c(0);
                a3.d(-1);
                a3.q(0);
                a3.p(resources.getColor(2131100675, null));
                a3.k(0);
                a3.a(true);
                a3.h(255);
                a3.i(resources.getDimensionPixelSize(2131165964));
                a3.j(resources.getDimensionPixelSize(2131165965));
                return a3;
            case 2:
                kel a4 = a(kddVar, ilwVar);
                a4.e(resources.getDimensionPixelSize(2131166008));
                a4.c(255);
                a4.d(-1);
                a4.q(0);
                a4.p(resources.getColor(2131100675, null));
                a4.k(0);
                a4.i(resources.getDimensionPixelSize(2131166008));
                a4.f(resources.getDimensionPixelSize(2131166009));
                a4.g(resources.getDimensionPixelSize(2131166011));
                a4.j(resources.getDimensionPixelSize(2131166010));
                a4.a(resources);
                return a4;
            case 3:
                kel a5 = a(kddVar, ilwVar);
                a5.e(resources.getDimensionPixelSize(2131166007));
                a5.c(0);
                a5.d(-1);
                a5.q(0);
                a5.p(resources.getColor(2131100675, null));
                a5.k(0);
                a5.a(true);
                a5.h(255);
                a5.i(resources.getDimensionPixelSize(2131166007));
                a5.f(resources.getDimensionPixelSize(2131166009) / 2);
                a5.g(resources.getDimensionPixelSize(2131166011) / 2);
                a5.j(resources.getDimensionPixelSize(2131166010));
                return a5;
            case 4:
                kel a6 = a(kddVar, ilwVar);
                a6.e(resources.getDimensionPixelSize(2131165964));
                a6.c(0);
                a6.d(-1);
                a6.q(0);
                a6.p(resources.getColor(2131100675, null));
                a6.k(0);
                a6.a(true);
                a6.h(255);
                a6.i(resources.getDimensionPixelSize(2131165965));
                a6.b(resources.getColor(2131099734, null));
                a6.j(resources.getDimensionPixelSize(2131165965));
                return a6;
            case 5:
                kel a7 = a(kddVar, ilwVar);
                a7.e(resources.getDimensionPixelSize(2131165965));
                a7.c(0);
                a7.d(resources.getColor(2131099736, null));
                a7.p(resources.getColor(2131100675, null));
                a7.q(resources.getDimensionPixelSize(2131166151));
                a7.k(0);
                a7.i(resources.getDimensionPixelSize(2131165964));
                a7.j(resources.getDimensionPixelSize(2131165965));
                return a7;
            case 6:
                kel a8 = a(kddVar, ilwVar);
                a8.e(resources.getDimensionPixelSize(2131165965));
                a8.c(255);
                a8.d(resources.getColor(2131099727, null));
                a8.p(resources.getColor(2131100675, null));
                a8.q(0);
                a8.k(0);
                a8.c = resources.getDrawable(2131231035, null);
                a8.a(resources.getDrawable(2131231042, null).getIntrinsicWidth() / 2);
                a8.i(resources.getDimensionPixelSize(2131165964));
                a8.j(resources.getDimensionPixelSize(2131165965));
                return a8;
            case 7:
                kel a9 = a(kddVar, ilwVar);
                a9.e(resources.getDimensionPixelSize(2131165964));
                a9.c(255);
                a9.d(resources.getColor(2131099736, null));
                a9.p(resources.getColor(2131099736, null));
                a9.q(0);
                a9.k(0);
                a9.c = resources.getDrawable(2131231042, null);
                a9.a((int) ((resources.getDrawable(2131231042, null).getIntrinsicWidth() * 1.75f) / 2.0f));
                a9.i(resources.getDimensionPixelSize(2131165964));
                a9.j(resources.getDimensionPixelSize(2131165965));
                return a9;
            case 8:
                kel a10 = a(kddVar, ilwVar);
                a10.e(resources.getDimensionPixelSize(2131165964));
                a10.c(255);
                a10.d(-1);
                a10.p(resources.getColor(2131099727, null));
                a10.q(resources.getDimensionPixelSize(2131165965));
                a10.k(0);
                a10.c = resources.getDrawable(2131231042, null);
                a10.a(resources.getDrawable(2131231042, null).getIntrinsicWidth() / 2);
                a10.i(resources.getDimensionPixelSize(2131165964));
                a10.j(resources.getDimensionPixelSize(2131165965));
                return a10;
            case 9:
                kel a11 = a(kddVar, ilwVar);
                a11.e(resources.getDimensionPixelSize(2131165964));
                a11.c(255);
                a11.d(-1);
                a11.p(resources.getColor(2131099734, null));
                a11.q(resources.getDimensionPixelSize(2131165965));
                a11.k(0);
                a11.c = resources.getDrawable(2131231042, null);
                a11.a(resources.getDrawable(2131231042, null).getIntrinsicWidth() / 2);
                a11.i(resources.getDimensionPixelSize(2131165964));
                a11.j(resources.getDimensionPixelSize(2131165965));
                return a11;
            case 10:
                kel a12 = a(kddVar, ilwVar);
                a12.e(resources.getDimensionPixelSize(2131165965));
                a12.c(255);
                a12.d(-1);
                a12.q(resources.getDimensionPixelSize(2131165965));
                a12.p(resources.getColor(2131100675, null));
                a12.k(resources.getDimensionPixelSize(2131166152) / 2);
                a12.i(resources.getDimensionPixelSize(2131165964));
                a12.j(resources.getDimensionPixelSize(2131165965));
                return a12;
            case 12:
                kel a13 = a(kddVar, ilwVar);
                a13.e(resources.getDimensionPixelSize(2131165965));
                a13.c(255);
                a13.d(resources.getColor(2131099734, null));
                a13.p(resources.getColor(2131099734, null));
                a13.q(0);
                a13.k(0);
                a13.c = resources.getDrawable(2131231042, null);
                a13.a(resources.getDrawable(2131231042, null).getIntrinsicWidth() / 2);
                a13.i(resources.getDimensionPixelSize(2131165964));
                a13.j(resources.getDimensionPixelSize(2131165965));
                return a13;
            case 13:
                kel a14 = a(kddVar, ilwVar);
                a14.e(resources.getDimensionPixelSize(2131165903));
                a14.c(255);
                a14.d(resources.getColor(2131100224, null));
                a14.q(0);
                a14.p(resources.getColor(2131100675, null));
                a14.k(0);
                a14.i(resources.getDimensionPixelSize(2131165964));
                a14.f(resources.getDimensionPixelSize(2131165964));
                a14.g(resources.getDimensionPixelSize(2131165964));
                a14.j(resources.getDimensionPixelSize(2131165965));
                a14.a(resources);
                return a14;
            case 14:
                kel a15 = a(kddVar, ilwVar);
                a15.e(resources.getDimensionPixelSize(2131165903));
                a15.c(0);
                a15.d(resources.getColor(2131100224, null));
                a15.q(0);
                a15.p(resources.getColor(2131100675, null));
                a15.k(0);
                a15.a(true);
                a15.h(255);
                a15.i(resources.getDimensionPixelSize(2131165903));
                a15.j(resources.getDimensionPixelSize(2131165965));
                a15.c = resources.getDrawable(2131231105, null);
                a15.a(resources.getDrawable(2131231105, null).getIntrinsicWidth() / 2);
                return a15;
            case 15:
                kel a16 = a(kddVar, ilwVar);
                a16.e(resources.getDimensionPixelSize(2131165903));
                a16.c(255);
                a16.d(-1);
                a16.q(0);
                a16.p(resources.getColor(2131100675, null));
                a16.k(0);
                a16.i(resources.getDimensionPixelSize(2131165964));
                a16.f(resources.getDimensionPixelSize(2131165964));
                a16.g(resources.getDimensionPixelSize(2131165964));
                a16.j(resources.getDimensionPixelSize(2131165965));
                a16.c = resources.getDrawable(2131231249, null);
                a16.a(resources.getDrawable(2131231249, null).getIntrinsicWidth() / 2);
                return a16;
            case 16:
                kel a17 = a(kddVar, ilwVar);
                a17.e(resources.getDimensionPixelSize(2131165903));
                a17.c(255);
                a17.d(-1);
                a17.q(0);
                a17.p(resources.getColor(2131100675, null));
                a17.k(0);
                a17.i(resources.getDimensionPixelSize(2131165964));
                a17.f(resources.getDimensionPixelSize(2131165964));
                a17.g(resources.getDimensionPixelSize(2131165964));
                a17.j(resources.getDimensionPixelSize(2131165965));
                a17.c = resources.getDrawable(2131231153, null);
                a17.a(resources.getDrawable(2131231153, null).getIntrinsicWidth() / 2);
                return a17;
            case 17:
                kel a18 = a(kddVar, ilwVar);
                a18.e(resources.getDimensionPixelSize(2131165965));
                a18.c(0);
                a18.d(resources.getColor(2131099736, null));
                a18.p(resources.getColor(2131100675, null));
                a18.q(resources.getDimensionPixelSize(2131166151));
                a18.k(0);
                a18.i(resources.getDimensionPixelSize(2131165964));
                a18.j(resources.getDimensionPixelSize(2131165965));
                a18.m(0);
                a18.n(0);
                a18.o(0);
                a18.l(0);
                a18.a(Arrays.asList(new Boolean[30]));
                return a18;
            case 18:
                kel a19 = a(kddVar, ilwVar);
                a19.e(resources.getDimensionPixelSize(2131165965));
                a19.c(255);
                a19.d(-1);
                a19.q(resources.getDimensionPixelSize(2131165965));
                a19.p(resources.getColor(2131100675, null));
                a19.k(resources.getDimensionPixelSize(2131166152) / 2);
                a19.i(resources.getDimensionPixelSize(2131165964));
                a19.j(resources.getDimensionPixelSize(2131165965));
                a19.m(resources.getDimensionPixelSize(2131166122));
                a19.n(resources.getDimensionPixelSize(2131166123));
                a19.o(resources.getDimensionPixelSize(2131166124));
                a19.l(255);
                a19.a(Arrays.asList(new Boolean[30]));
                return a19;
            case 19:
                kel a20 = a(kddVar, ilwVar);
                a20.e(resources.getDimensionPixelSize(2131165964));
                a20.c(255);
                a20.d(resources.getColor(2131100132, null));
                a20.q(0);
                a20.p(resources.getColor(2131100132, null));
                a20.k(0);
                a20.i(resources.getDimensionPixelSize(2131165964));
                a20.h(0);
                a20.j(resources.getDimensionPixelSize(2131165965));
                return a20;
            case 20:
                kel a21 = a(kddVar, ilwVar);
                a21.e(resources.getDimensionPixelSize(2131165965));
                a21.c(255);
                a21.d(-1);
                a21.p(resources.getColor(2131100675, null));
                a21.q(0);
                a21.k(0);
                a21.c = resources.getDrawable(2131231021, null);
                a21.a(resources.getDrawable(2131231042, null).getIntrinsicWidth() / 2);
                a21.i(resources.getDimensionPixelSize(2131165964));
                a21.j(resources.getDimensionPixelSize(2131165965));
                return a21;
            case 21:
                kel a22 = a(kddVar, ilwVar);
                a22.e(resources.getDimensionPixelSize(2131165965));
                a22.c(255);
                a22.d(resources.getColor(2131099680, null));
                a22.q(resources.getDimensionPixelSize(2131165965));
                a22.p(resources.getColor(2131099680, null));
                a22.k(resources.getDimensionPixelSize(2131166152) / 2);
                a22.i(resources.getDimensionPixelSize(2131165964));
                a22.j(resources.getDimensionPixelSize(2131165965));
                return a22;
            default:
                String valueOf = String.valueOf(kddVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Shutter mode not supported: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}