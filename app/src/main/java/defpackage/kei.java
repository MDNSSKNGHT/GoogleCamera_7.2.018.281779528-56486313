package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.view.View;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kei  reason: default package */
/* loaded from: classes.dex */
public final class kei implements kee {
    public static final String a = liu.a("ShutterButtonCtrlr");
    private static final prr e = prr.a(klw.MORE_MODES, klw.LENS);
    public final ShutterButton b;
    private final pjz f;
    private final ked g;
    private final kob h;
    private boolean i;
    private boolean j;
    private kdd k;
    private final kej l = new keg(this);
    public final List<kej> d = new ArrayList();
    public final Object c = new Object();

    public kei(ShutterButton shutterButton, boolean z, pjz pjzVar, kob kobVar) {
        this.b = shutterButton;
        this.f = pjzVar;
        this.k = shutterButton.getMode();
        this.g = new ked(shutterButton, z);
        this.h = kobVar;
        shutterButton.setListener(this.l);
        a(new keh(this));
        synchronized (this.c) {
            this.i = shutterButton.isEnabled();
            this.j = shutterButton.isClickEnabled();
            boolean z2 = true;
            if (this.d.size() != 1) {
                z2 = false;
            }
            qdu.b(z2, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }

    @Override // defpackage.cgw
    public final qpp a(mzg mzgVar) {
        b(false);
        return rgk.b((Object) null);
    }

    @Override // defpackage.kee
    public final void u() {
        a(kdd.PHOTOSPHERE_IDLE);
    }

    @Override // defpackage.kee
    public final void q() {
        a(kdd.IMAX_IDLE);
    }

    @Override // defpackage.kee
    public final void w() {
        a(kdd.NIGHT_IDLE);
    }

    @Override // defpackage.kee
    public final void t() {
        a(kdd.PHOTOSPHERE_IDLE);
    }

    public final boolean L() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.d.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.kee
    public final void d() {
        this.b.animateToScale(0.8f);
    }

    @Override // defpackage.kee
    public final void l() {
        this.b.animateToScale(0.8f);
        this.b.pauseTimelapseAnimationState();
    }

    @Override // defpackage.kee
    public final void J() {
        this.b.performClick();
    }

    @Override // defpackage.kee
    public final void K() {
        this.b.performShutterButtonDown();
    }

    private final void b(kdd kddVar) {
        kdd kddVar2 = kdd.PHOTO_IDLE;
        klw klwVar = klw.UNINITIALIZED;
        int ordinal = kddVar.ordinal();
        if (ordinal == 0 || ordinal == 2 || ordinal == 5 || ordinal == 13) {
            this.k = kddVar;
        }
    }

    @Override // defpackage.kee
    public final mjq a(kej kejVar) {
        String str = a;
        String valueOf = String.valueOf(kejVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Registering listener ");
        sb.append(valueOf);
        sb.toString();
        liu.d(str);
        synchronized (this.c) {
            this.d.add(kejVar);
            if (L()) {
                a(this.i, false);
                b(this.j, false);
            }
        }
        return new kef(this, kejVar);
    }

    @Override // defpackage.kee
    public final void g() {
        this.b.animateToScale(1.0f);
    }

    @Override // defpackage.kee
    public final void m() {
        this.b.animateToScale(1.0f);
        this.b.resumeTimelapseAnimationState();
    }

    @Override // defpackage.kee
    public final void B() {
        a(kdd.PHOTO_IDLE);
    }

    @Override // defpackage.kee
    public final void E() {
        a(kdd.VIDEO_IDLE);
    }

    @Override // defpackage.kee
    public final void c(boolean z) {
        this.b.runPressedStateAnimation(z, this.g);
    }

    private final void a(kdd kddVar) {
        b(kddVar);
        this.b.setMode(kddVar, this.g);
        if (this.f.a()) {
            ((ken) this.f.b()).a(kddVar);
        }
    }

    @Override // defpackage.kee
    public final void b(boolean z) {
        b(z, true);
    }

    public final void b(boolean z, boolean z2) {
        String str = a;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ShutterButtonControllerImpl#setShutterButtonClickEnabled -> ");
        sb.append(z);
        sb.toString();
        liu.d(str);
        synchronized (this.c) {
            if (z2) {
                try {
                    this.j = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = false;
            if (z && L()) {
                z3 = true;
            }
            if (this.b.isClickEnabled() != z3) {
                this.b.setClickEnabled(z3);
            }
        }
    }

    @Override // defpackage.kee
    public final void a(boolean z) {
        a(z, true);
    }

    public final void a(boolean z, boolean z2) {
        String str = a;
        StringBuilder sb = new StringBuilder(60);
        sb.append("ShutterButtonControllerImpl#setShutterButtonEnabled -> ");
        sb.append(z);
        sb.toString();
        liu.d(str);
        synchronized (this.c) {
            if (z2) {
                try {
                    this.i = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = false;
            if (z && L()) {
                z3 = true;
            }
            if (this.b.isEnabled() != z3) {
                this.b.setEnabled(z3);
            }
        }
    }

    @Override // defpackage.kee
    public final void H() {
        a(kdd.AUTOTIMER_RUNNING);
    }

    @Override // defpackage.kee
    public final void F() {
        a(kdd.CANCEL);
    }

    @Override // defpackage.kee
    public final void i() {
        a(kdd.VIDEO_RECORDING);
    }

    @Override // defpackage.kee
    public final void p() {
        this.b.setEnabled(true);
        a(kdd.IMAX_RECORDING);
    }

    @Override // defpackage.kee
    public final void y() {
        a(kdd.CANCEL);
    }

    @Override // defpackage.kee
    public final void v() {
        a(kdd.NIGHT_STOP);
    }

    @Override // defpackage.kee
    public final void x() {
        a(kdd.NIGHT_CANCEL);
    }

    @Override // defpackage.kee
    public final void e() {
        kob kobVar = this.h;
        if (kobVar.a) {
            int i = Build.VERSION.SDK_INT;
            kobVar.a(VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK));
        }
        a(kdd.PHOTO_LONGPRESS);
    }

    @Override // defpackage.kee
    public final void r() {
        a(kdd.CONFIRM_DISABLED);
    }

    @Override // defpackage.kee
    public final void s() {
        a(kdd.CONFIRM_ENABLED);
    }

    @Override // defpackage.kee
    public final void c() {
        a(kdd.VIDEO_RECORDING);
    }

    @Override // defpackage.kee
    public final void a() {
        a(kdd.PHOTO_BURST);
    }

    @Override // defpackage.kee
    public final void k() {
        a(kdd.TIMELAPSE_RECORDING);
        this.b.startTimelapseCircleAnimation();
    }

    @Override // defpackage.kee
    public final void C() {
        a(kdd.VIDEO_RECORDING);
    }

    @Override // defpackage.kee
    public final void I() {
        a(kdd.AUTOTIMER_IDLE);
    }

    @Override // defpackage.kee
    public final void G() {
        a(this.k);
    }

    @Override // defpackage.kee
    public final void j() {
        a(kdd.VIDEO_IDLE);
    }

    @Override // defpackage.kee
    public final void z() {
        a(kdd.LENSBLUR_IDLE);
    }

    @Override // defpackage.kee
    public final void f() {
        a(kdd.PHOTO_IDLE);
    }

    @Override // defpackage.kee
    public final void h() {
        a(kdd.VIDEO_IDLE);
        this.b.animateToScale(1.0f);
    }

    @Override // defpackage.kee
    public final void b() {
        a(kdd.PHOTO_IDLE);
    }

    @Override // defpackage.kee
    public final void n() {
        a(kdd.TIMELAPSE_IDLE);
        this.b.stopTimelapseCircleAnimation();
    }

    @Override // defpackage.kee
    public final void a(klw klwVar) {
        this.b.setApplicationMode(klwVar);
        kdd kddVar = kdd.PHOTO_IDLE;
        klw klwVar2 = klw.UNINITIALIZED;
        switch (klwVar.ordinal()) {
            case 0:
            case 10:
            case 12:
            case 16:
            case 18:
            case 20:
                String valueOf = String.valueOf(klwVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("Unsupported mode ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            case 1:
                a(this.b.getCurrentSpec().j() != ilw.AUTO ? kdd.PHOTO_IDLE : kdd.AUTOTIMER_IDLE);
                if (this.f.a()) {
                    ((ken) this.f.b()).a();
                    break;
                }
                break;
            case 2:
            case 5:
            case 9:
                a(kdd.VIDEO_IDLE);
                break;
            case 3:
                a(kdd.IMAX_IDLE);
                break;
            case 4:
                a(kdd.PHOTOSPHERE_IDLE);
                break;
            case 6:
                a(kdd.LENSBLUR_IDLE);
                break;
            case 7:
                a(kdd.PORTRAIT_IDLE);
                break;
            case 8:
            case 13:
                a(kdd.PHOTO_IDLE);
                break;
            case 14:
                a(kdd.NIGHT_IDLE);
                break;
            case 15:
                a(kdd.TIMELAPSE_IDLE);
                break;
            case 19:
                a(kdd.CONFIRM_ENABLED);
                break;
        }
        int i = e.contains(klwVar) ? View.INVISIBLE : View.VISIBLE;
        if (this.b.getVisibility() != i) {
            kqj.a(i, this.b);
        }
    }

    @Override // defpackage.kee
    public final void A() {
        this.b.setEnabled(true);
        a(kdd.CONFIRM_ENABLED);
    }

    @Override // defpackage.kee
    public final void a(ilw ilwVar) {
        kdd i = this.b.getCurrentSpec().i();
        b(i);
        kdd kddVar = kdd.PHOTO_IDLE;
        klw klwVar = klw.UNINITIALIZED;
        int ordinal = i.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2 || ordinal == 13) {
                this.b.setMode(i, ilwVar, this.g);
                return;
            } else if (ordinal != 20) {
                return;
            }
        }
        if (ilwVar != ilw.AUTO) {
            this.b.setMode(kdd.PHOTO_IDLE, ilwVar, this.g);
        } else {
            this.b.setMode(kdd.AUTOTIMER_IDLE, ilwVar, this.g);
        }
    }

    @Override // defpackage.kee
    public final void D() {
        a(kdd.CONFIRM_ENABLED);
    }

    @Override // defpackage.kee
    public final void o() {
        this.b.updateTimelapseProgressState();
    }
}
