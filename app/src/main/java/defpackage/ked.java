package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import j$.util.Collection$$Dispatch;
import java.util.List;

/* compiled from: PG */
/* renamed from: ked  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public final class ked {
    public final ShutterButton b;
    public kem c;
    public kem d;
    public List e;
    public final ArgbEvaluator f = new ArgbEvaluator();
    public final Interpolator g;
    public final Interpolator h;
    private ValueAnimator j;
    private ValueAnimator k;
    private ValueAnimator l;
    private ValueAnimator m;
    private ValueAnimator n;
    private ValueAnimator o;
    private ValueAnimator p;
    private ValueAnimator q;
    private ValueAnimator r;
    private ValueAnimator s;
    private ValueAnimator t;
    private ValueAnimator u;
    private ValueAnimator v;
    private ValueAnimator w;
    private final Interpolator x;
    private final boolean y;
    private static final String i = liu.a("ShutterButtonAnimator");
    public static final Interpolator a = new LinearInterpolator();

    public ked(ShutterButton shutterButton, boolean z) {
        this.b = shutterButton;
        this.y = z;
        this.g = AnimationUtils.loadInterpolator(shutterButton.getContext(), 2131558408);
        this.h = AnimationUtils.loadInterpolator(shutterButton.getContext(), 2131558410);
        this.x = AnimationUtils.loadInterpolator(shutterButton.getContext(), 17563661);
    }

    private final kec a(Animator animator) {
        return new kec(this, animator);
    }

    private final void c() {
        qdu.d(this.d.p().equals(kdd.AUTOTIMER_IDLE));
        a(this.n).a(500);
        a(this.o).a(250);
        this.b.getCurrentSpec().c = this.d.i();
    }

    private final AnimatorSet a() {
        kdd kddVar = kdd.PHOTO_IDLE;
        switch (this.c.p().ordinal()) {
            case 0:
            case 22:
            case 23:
                int ordinal = this.d.p().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        kec a2 = a(this.m);
                        a2.a(50);
                        a2.d();
                        kec a3 = a(this.p);
                        a3.a(50);
                        a3.b();
                        break;
                    } else if (ordinal == 2) {
                        a(this.o).a(300);
                        a(this.r).a(300);
                        a(this.p).a(300);
                        a(this.j).a(300);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        break;
                    } else if (ordinal == 4) {
                        this.b.resetTo(kdd.PHOTO_PRESSED);
                        return a(this.d);
                    } else if (ordinal == 5) {
                        a(this.j).a(400);
                        kec a4 = a(this.m);
                        a4.d();
                        a4.a(350);
                        a4.a();
                        kec a5 = a(this.k);
                        a5.a(350);
                        a5.a();
                        break;
                    } else if (ordinal == 6) {
                        a(this.n).a(500);
                        a(this.o).a(250);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal == 8) {
                        this.b.blockClickForAnimation(true);
                        kec a6 = a(this.j);
                        a6.a(250);
                        a6.d();
                        kec a7 = a(this.o);
                        a7.a(250);
                        a7.d();
                        a(this.n).a(500);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal == 9) {
                        kec a8 = a(this.j);
                        a8.a(250);
                        a8.d();
                        a8.f();
                        kec a9 = a(this.o);
                        a9.a(250);
                        a9.d();
                        a(this.n).a(500);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal == 11) {
                        a(this.j).a(400);
                        kec a10 = a(this.m);
                        a10.d();
                        a10.a(350);
                        a(this.k).a(250);
                        break;
                    } else if (ordinal == 13) {
                        a(this.o).a(400);
                        a(this.j).a(400);
                        a(this.n).a(400);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal == 17) {
                        this.b.resetTo(kdd.TIMELAPSE_IDLE);
                        break;
                    } else if (ordinal == 19) {
                        this.b.resetTo(kdd.PHOTO_PRESSED);
                        return a(this.d);
                    } else if (ordinal == 20) {
                        c();
                        break;
                    } else if (ordinal != 22 && ordinal != 23) {
                        b();
                        break;
                    }
                }
                break;
            case 1:
                int ordinal2 = this.d.p().ordinal();
                if (ordinal2 == 0) {
                    kec a11 = a(this.m);
                    a11.a(50);
                    a11.d();
                    kec a12 = a(this.p);
                    a12.a(50);
                    a12.b();
                    break;
                } else if (ordinal2 == 4) {
                    this.r.setRepeatCount(9);
                    this.r.setRepeatMode(1);
                    a(this.r).a(250);
                    kec a13 = a(this.p);
                    a13.a(250);
                    a13.d();
                    a13.b();
                    kec a14 = a(this.s);
                    a14.a(150);
                    a14.d();
                    break;
                } else if (ordinal2 == 19) {
                    a(this.j).a(150);
                    kec a15 = a(this.p);
                    a15.d();
                    a15.a(250);
                    kec a16 = a(this.s);
                    a16.d();
                    a16.a(150);
                    break;
                } else {
                    this.b.resetTo(kdd.PHOTO_IDLE);
                    return a(this.d);
                }
            case 2:
                int ordinal3 = this.d.p().ordinal();
                if (ordinal3 != 0 && ordinal3 != 11) {
                    if (ordinal3 == 13) {
                        a(this.o).a(400);
                        a(this.j).a(400);
                        a(this.r).a(300);
                        a(this.p).a(300);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        a(this.n).a(400);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal3 == 17) {
                        this.b.resetTo(kdd.TIMELAPSE_IDLE);
                        break;
                    } else if (ordinal3 == 20) {
                        c();
                        break;
                    } else if (ordinal3 != 2) {
                        if (ordinal3 == 3) {
                            a(this.p).a(80);
                            kec a17 = a(this.r);
                            a17.a(80);
                            a17.b();
                            a(this.j).a(80);
                            a(this.u).a(80);
                            a(this.t).a(80);
                            break;
                        } else if (ordinal3 == 5) {
                            a(this.j).a(400);
                            kec a18 = a(this.m);
                            a18.d();
                            a18.a(350);
                            a18.a();
                            kec a19 = a(this.k);
                            a19.a(350);
                            a19.a();
                            kec a20 = a(this.u);
                            a20.d();
                            a20.a(350);
                            a20.a();
                            kec a21 = a(this.t);
                            a21.d();
                            a21.a(350);
                            a21.a();
                            break;
                        } else if (ordinal3 == 6) {
                            a(this.n).a(500);
                            a(this.o).a(250);
                            this.b.getCurrentSpec().a(this.d.i());
                            break;
                        } else if (ordinal3 != 22 && ordinal3 != 23) {
                            b();
                            break;
                        }
                    }
                }
                a(this.o).a(300);
                a(this.r).a(300);
                a(this.p).a(300);
                a(this.j).a(300);
                a(this.u).a(400);
                a(this.t).a(600);
                a(this.v).a(800);
                break;
            case 3:
                int ordinal4 = this.d.p().ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 2) {
                        a(this.r).a(300);
                        a(this.p).a(300);
                        a(this.j).a(300);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        break;
                    } else if (ordinal4 != 5 && ordinal4 != 11) {
                        this.b.resetTo(kdd.PORTRAIT_IDLE);
                        return a(this.d);
                    }
                }
                break;
            case 4:
                if (this.d.p().ordinal() == 0) {
                    kec a22 = a(this.p);
                    a22.a(250);
                    a22.d();
                    a22.b();
                    kec a23 = a(this.s);
                    a23.a(250);
                    a23.d();
                    break;
                } else {
                    this.b.resetTo(kdd.PHOTO_IDLE);
                    return a(this.d);
                }
            case 5:
                int ordinal5 = this.d.p().ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 == 2) {
                        a(this.j).a(400);
                        kec a24 = a(this.m);
                        a24.d();
                        a24.a(350);
                        a(this.k).a(250);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        break;
                    } else if (ordinal5 == 6) {
                        a(this.n).a(500);
                        a(this.o).a(250);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal5 == 13) {
                        a(this.o).a(400);
                        a(this.j).a(400);
                        a(this.n).a(500);
                        this.b.getCurrentSpec().a(this.d.i());
                        kec a25 = a(this.m);
                        a25.d();
                        a25.a(350);
                        a(this.k).a(250);
                        break;
                    } else if (ordinal5 == 17) {
                        this.b.resetTo(kdd.TIMELAPSE_IDLE);
                        break;
                    } else if (ordinal5 == 20) {
                        c();
                        break;
                    } else if (ordinal5 == 10) {
                        kec a26 = a(this.k);
                        a26.a(350);
                        a26.e();
                        a26.f();
                        kec a27 = a(this.l);
                        a27.a(500);
                        a27.c();
                        break;
                    } else if (ordinal5 != 11 && ordinal5 != 22 && ordinal5 != 23) {
                        b();
                        break;
                    }
                }
                a(this.j).a(400);
                kec a28 = a(this.m);
                a28.d();
                a28.a(350);
                a(this.k).a(250);
                break;
            case 6:
                int ordinal6 = this.d.p().ordinal();
                if (ordinal6 != 0) {
                    if (ordinal6 == 2) {
                        a(this.j).a(400);
                        kec a29 = a(this.m);
                        a29.d();
                        a29.a(350);
                        a(this.k).a(250);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        kec a30 = a(this.n);
                        a30.a(250);
                        a30.a(this.d.i());
                        break;
                    } else if (ordinal6 == 5) {
                        a(this.k).a(500);
                        kec a31 = a(this.q);
                        a31.a(200);
                        a31.f();
                        kec a32 = a(this.n);
                        a32.a(250);
                        a32.a(this.d.i());
                        break;
                    } else if (ordinal6 != 13 && ordinal6 != 23) {
                        b();
                        break;
                    }
                }
                kec a33 = a(this.j);
                a33.a(250);
                a33.d();
                a33.f();
                kec a34 = a(this.o);
                a34.a(250);
                a34.d();
                kec a35 = a(this.n);
                a35.a(250);
                a35.a(this.d.i());
                break;
            case 7:
            default:
                b();
                break;
            case 8:
                int ordinal7 = this.d.p().ordinal();
                if (ordinal7 != 0) {
                    if (ordinal7 == 9) {
                        this.b.blockClickForAnimation(false);
                        a(this.o).a(250);
                        break;
                    } else if (ordinal7 != 22) {
                        b();
                        break;
                    }
                }
                this.b.blockClickForAnimation(false);
                kec a36 = a(this.j);
                a36.a(250);
                a36.d();
                kec a37 = a(this.o);
                a37.a(250);
                a37.d();
                kec a38 = a(this.n);
                a38.a(250);
                a38.a(this.d.i());
                break;
            case 9:
                int ordinal8 = this.d.p().ordinal();
                if (ordinal8 != 0) {
                    if (ordinal8 == 5) {
                        a(this.k).a(500);
                        kec a39 = a(this.q);
                        a39.a(200);
                        a39.f();
                        kec a40 = a(this.n);
                        a40.a(250);
                        a40.a(this.d.i());
                        break;
                    } else if (ordinal8 == 7) {
                        kec a41 = a(this.q);
                        a41.a(250);
                        a41.d();
                        kec a42 = a(this.k);
                        a42.a(250);
                        a42.d();
                        kec a43 = a(this.n);
                        a43.a(250);
                        a43.f();
                        this.n.addListener(new kdx(this));
                        break;
                    } else if (ordinal8 != 13 && ordinal8 != 22) {
                        b();
                        break;
                    }
                }
                kec a44 = a(this.j);
                a44.a(250);
                a44.d();
                a44.f();
                kec a45 = a(this.o);
                a45.a(250);
                a45.d();
                kec a46 = a(this.n);
                a46.a(250);
                a46.a(this.d.i());
                break;
            case 10:
                int ordinal9 = this.d.p().ordinal();
                if (ordinal9 == 5) {
                    kec a47 = a(this.k);
                    a47.a(350);
                    a47.f();
                    a(this.l).a(250);
                    break;
                } else if (ordinal9 == 9) {
                    a(this.l).a(250);
                    kec a48 = a(this.q);
                    a48.a(500);
                    a48.f();
                    a(this.n).a(500);
                    this.b.getCurrentSpec().a(this.d.i());
                    break;
                } else if (ordinal9 == 20) {
                    c();
                    break;
                } else {
                    b();
                    break;
                }
            case 11:
                int ordinal10 = this.d.p().ordinal();
                if (ordinal10 != 0) {
                    if (ordinal10 == 2) {
                        a(this.o).a(300);
                        a(this.r).a(300);
                        a(this.p).a(300);
                        a(this.j).a(300);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        break;
                    } else if (ordinal10 == 5) {
                        a(this.j).a(400);
                        kec a49 = a(this.m);
                        a49.d();
                        a49.a(350);
                        a49.a();
                        kec a50 = a(this.k);
                        a50.a(350);
                        a50.a();
                        break;
                    } else if (ordinal10 == 12) {
                        kec a51 = a(this.j);
                        a51.a(250);
                        a51.d();
                        a51.f();
                        kec a52 = a(this.o);
                        a52.a(250);
                        a52.d();
                        a(this.n).a(500);
                        this.b.getCurrentSpec().a(this.d.i());
                        break;
                    } else if (ordinal10 == 17) {
                        this.b.resetTo(kdd.TIMELAPSE_IDLE);
                        break;
                    } else if (ordinal10 == 20) {
                        c();
                        break;
                    } else if (ordinal10 != 22 && ordinal10 != 23) {
                        b();
                        break;
                    }
                }
                a(this.j).a(400);
                kec a53 = a(this.m);
                a53.d();
                a53.a(350);
                a(this.k).a(250);
                break;
            case 12:
                int ordinal11 = this.d.p().ordinal();
                if (ordinal11 == 0 || ordinal11 == 11) {
                    kec a54 = a(this.j);
                    a54.a(250);
                    a54.d();
                    a54.f();
                    kec a55 = a(this.o);
                    a55.a(250);
                    a55.d();
                    kec a56 = a(this.n);
                    a56.a(250);
                    a56.a(this.d.i());
                    break;
                } else {
                    b();
                    break;
                }
            case 13:
                int ordinal12 = this.d.p().ordinal();
                if (ordinal12 != 0) {
                    if (ordinal12 == 2) {
                        a(this.o).a(300);
                        a(this.r).a(300);
                        a(this.p).a(300);
                        a(this.j).a(300);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        a(this.n).a(250);
                        break;
                    } else if (ordinal12 != 11) {
                        if (ordinal12 == 20) {
                            c();
                            break;
                        } else if (ordinal12 == 5) {
                            a(this.o).a(400);
                            a(this.j).a(400);
                            kec a57 = a(this.n);
                            a57.a(250);
                            a57.a(this.d.i());
                            kec a58 = a(this.m);
                            a58.d();
                            a58.a(350);
                            kec a59 = a(this.k);
                            a59.a(250);
                            a59.a(350);
                            a59.a();
                            break;
                        } else if (ordinal12 == 6) {
                            a(this.n).a(500);
                            a(this.o).a(250);
                            this.b.getCurrentSpec().a(this.d.i());
                            break;
                        } else if (ordinal12 != 22 && ordinal12 != 23) {
                            switch (ordinal12) {
                                case 13:
                                    break;
                                case 14:
                                    kec a60 = a(this.m);
                                    a60.a(50);
                                    a60.d();
                                    kec a61 = a(this.p);
                                    a61.a(50);
                                    a61.b();
                                    break;
                                case 15:
                                case 16:
                                    kec a62 = a(this.m);
                                    a62.a(50);
                                    a62.d();
                                    kec a63 = a(this.p);
                                    a63.a(50);
                                    a63.b();
                                    this.b.getCurrentSpec().a(this.d.i());
                                    break;
                                case 17:
                                    this.b.resetTo(kdd.TIMELAPSE_IDLE);
                                    break;
                                default:
                                    b();
                                    break;
                            }
                        }
                    }
                }
                a(this.o).a(400);
                a(this.j).a(400);
                kec a64 = a(this.n);
                a64.a(250);
                a64.a(this.d.i());
                break;
            case 14:
                int ordinal13 = this.d.p().ordinal();
                if (ordinal13 == 13 || ordinal13 == 15) {
                    kec a65 = a(this.m);
                    a65.a(50);
                    a65.d();
                    kec a66 = a(this.p);
                    a66.a(50);
                    a66.b();
                    this.b.getCurrentSpec().a(this.d.i());
                    break;
                } else {
                    this.b.resetTo(kdd.NIGHT_IDLE);
                    return a(this.d);
                }
            case 15:
                int ordinal14 = this.d.p().ordinal();
                if (ordinal14 == 13 || ordinal14 == 16) {
                    kec a67 = a(this.m);
                    a67.a(50);
                    a67.d();
                    kec a68 = a(this.p);
                    a68.a(50);
                    a68.b();
                    this.b.getCurrentSpec().a(this.d.i());
                    break;
                } else {
                    this.b.resetTo(kdd.NIGHT_IDLE);
                    return a(this.d);
                }
            case 16:
                if (this.d.p().ordinal() == 13) {
                    kec a69 = a(this.m);
                    a69.a(50);
                    a69.d();
                    kec a70 = a(this.p);
                    a70.a(50);
                    a70.b();
                    this.b.getCurrentSpec().a(this.d.i());
                    break;
                } else {
                    this.b.resetTo(kdd.NIGHT_IDLE);
                    return a(this.d);
                }
            case 17:
                int ordinal15 = this.d.p().ordinal();
                if (ordinal15 != 0) {
                    if (ordinal15 == 2) {
                        a(this.j).a(400);
                        kec a71 = a(this.m);
                        a71.d();
                        a71.a(350);
                        a(this.k).a(250);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        this.b.getCurrentSpec().m(0);
                        this.b.getCurrentSpec().n(0);
                        this.b.getCurrentSpec().o(0);
                        this.b.getCurrentSpec().l(0);
                        break;
                    } else if (ordinal15 == 6) {
                        a(this.n).a(500);
                        a(this.o).a(250);
                        this.b.getCurrentSpec().a(this.d.i());
                        this.b.getCurrentSpec().m(0);
                        this.b.getCurrentSpec().n(0);
                        this.b.getCurrentSpec().o(0);
                        this.b.getCurrentSpec().l(0);
                        break;
                    } else if (ordinal15 != 11) {
                        if (ordinal15 == 18) {
                            kec a72 = a(this.k);
                            a72.a(350);
                            a72.e();
                            a72.f();
                            kec a73 = a(this.l);
                            a73.a(500);
                            a73.c();
                            this.b.getCurrentSpec().m(this.d.r());
                            this.b.getCurrentSpec().n(this.d.s());
                            this.b.getCurrentSpec().o(this.d.t());
                            this.b.getCurrentSpec().l(this.d.u());
                            break;
                        } else if (ordinal15 == 20) {
                            c();
                            break;
                        } else if (ordinal15 != 22 && ordinal15 != 23) {
                            b();
                            break;
                        }
                    }
                }
                a(this.j).a(400);
                kec a74 = a(this.m);
                a74.d();
                a74.a(350);
                a(this.k).a(250);
                this.b.getCurrentSpec().m(0);
                this.b.getCurrentSpec().n(0);
                this.b.getCurrentSpec().o(0);
                this.b.getCurrentSpec().l(0);
                break;
            case 18:
                int ordinal16 = this.d.p().ordinal();
                if (ordinal16 == 9) {
                    a(this.l).a(250);
                    kec a75 = a(this.q);
                    a75.a(500);
                    a75.f();
                    a(this.n).a(500);
                    this.b.getCurrentSpec().a(this.d.i());
                    this.b.getCurrentSpec().m(0);
                    this.b.getCurrentSpec().n(0);
                    this.b.getCurrentSpec().o(0);
                    this.b.getCurrentSpec().l(0);
                    break;
                } else if (ordinal16 != 17) {
                    b();
                    break;
                } else {
                    kec a76 = a(this.k);
                    a76.a(350);
                    a76.f();
                    a(this.l).a(250);
                    this.b.getCurrentSpec().m(0);
                    this.b.getCurrentSpec().n(0);
                    this.b.getCurrentSpec().o(0);
                    this.b.getCurrentSpec().l(0);
                    break;
                }
            case 19:
                if (this.d.p().ordinal() == 0) {
                    a(this.j).a(400);
                    kec a77 = a(this.m);
                    a77.d();
                    a77.a(350);
                    a(this.k).a(250);
                    break;
                } else {
                    b();
                    break;
                }
            case 20:
                int ordinal17 = this.d.p().ordinal();
                if (ordinal17 != 0) {
                    if (ordinal17 == 2) {
                        a(this.j).a(400);
                        kec a78 = a(this.m);
                        a78.d();
                        a78.a(350);
                        a(this.k).a(250);
                        a(this.u).a(400);
                        a(this.t).a(600);
                        a(this.v).a(800);
                        break;
                    } else if (ordinal17 != 11) {
                        if (ordinal17 == 13) {
                            this.b.resetTo(kdd.NIGHT_IDLE);
                            break;
                        } else if (ordinal17 == 17) {
                            this.b.resetTo(kdd.TIMELAPSE_IDLE);
                            break;
                        } else if (ordinal17 == 5) {
                            a(this.k).a(500);
                            kec a79 = a(this.q);
                            a79.a(200);
                            a79.f();
                            kec a80 = a(this.n);
                            a80.a(250);
                            a80.a(this.d.i());
                            break;
                        } else if (ordinal17 != 6) {
                            switch (ordinal17) {
                                case 21:
                                    kec a81 = a(this.k);
                                    a81.a(350);
                                    a81.e();
                                    a81.f();
                                    a81.a(this.d.i());
                                    kec a82 = a(this.l);
                                    a82.a(500);
                                    a82.c();
                                    break;
                                case 22:
                                case 23:
                                    break;
                                default:
                                    b();
                                    break;
                            }
                        } else {
                            a(this.n).a(500);
                            a(this.o).a(250);
                            this.b.getCurrentSpec().a(this.d.i());
                            break;
                        }
                    }
                }
                a(this.j).a(400);
                kec a83 = a(this.m);
                a83.d();
                a83.a(350);
                kec a84 = a(this.k);
                a84.a(250);
                a84.a(this.d.i());
                break;
            case 21:
                if (this.d.p().ordinal() == 20) {
                    c();
                    break;
                } else {
                    b();
                    break;
                }
        }
        this.w.setDuration(Collection$$Dispatch.stream(this.e).mapToLong(kdm.a).max().orElseThrow(new kdn(this)));
        this.w.addListener(new kdy(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(this.e);
        return animatorSet;
    }

    public final AnimatorSet a(kem kemVar) {
        kem spec = this.b.getSpec();
        this.c = spec;
        this.d = kemVar;
        this.j = a(spec.a(), kemVar.a(), new kdh(this));
        this.k = a(this.c.d(), kemVar.d(), new kdo(this));
        this.l = a(this.c.f(), kemVar.f(), new kdp(this));
        this.n = a(this.c.j(), kemVar.j(), new kdq(this));
        this.o = a(0, 1, new kdr(this, kemVar));
        this.m = a(this.c.b(), kemVar.b(), new kds(this));
        this.p = a(this.c.l(), kemVar.l(), new kdt(this));
        this.q = a(0, 1, new kdu(this, kemVar));
        this.r = a(this.c.m(), kemVar.m(), new kdv(this));
        this.s = a(0, 1, new kdw(this, kemVar));
        this.u = a(this.c.g(), kemVar.g(), new kdi(this));
        this.t = a(this.c.h(), kemVar.h(), new kdj(this));
        this.v = a(this.c.o(), kemVar.o(), new kdk(this));
        ValueAnimator a2 = a(0, 1, new kdl(this));
        this.w = a2;
        this.e = prr.a(a2, this.l, this.j, this.m, this.k, this.n, this.o, this.p, this.r, this.s, this.q, this.u, this.t, this.v);
        return a();
    }

    private final ValueAnimator a(int i2, int i3, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        qdu.c(this.b, "Trying to create animators for null shutterbutton");
        ValueAnimator duration = ValueAnimator.ofInt(i2, i3).setDuration(40L);
        duration.addUpdateListener(animatorUpdateListener);
        duration.setInterpolator(this.x);
        return duration;
    }

    public final ViewPropertyAnimator a(float f, int i2) {
        ViewPropertyAnimator animate = this.b.animate();
        animate.setDuration(i2);
        animate.setInterpolator(this.x);
        animate.scaleX(f).scaleY(f);
        return animate;
    }

    private final void b() {
        String format = String.format("Unsupported transition from %s -> %s", this.c.p(), this.d.p());
        if (this.y) {
            throw new IllegalArgumentException(format);
        }
        liu.b(i, format);
    }
}