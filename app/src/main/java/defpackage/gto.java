package defpackage;

import android.annotation.SuppressLint;
import android.view.ViewManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* compiled from: PG */
/* renamed from: gto  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
final /* synthetic */ class gto implements Runnable {
    private final gun a;

    public gto(gun gunVar) {
        this.a = gunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        klw klwVar;
        boolean z;
        boolean z2;
        boolean z3;
        gun gunVar = this.a;
        gunVar.c.b("updateOptionsBar");
        gunVar.aB.set(false);
        klw klwVar2 = (klw) gunVar.b.a();
        boolean isEnabled = gunVar.ax.isEnabled();
        gunVar.ax.i();
        boolean z4 = klwVar2 == klw.PHOTO || klwVar2 == klw.IMAGE_INTENT || klwVar2 == klw.PORTRAIT || klwVar2 == klw.LONG_EXPOSURE;
        boolean z5 = klwVar2 == klw.PHOTO && (gunVar.Z || ((Boolean) gunVar.V.a()).booleanValue());
        boolean z6 = (klwVar2 == klw.PHOTO || klwVar2 == klw.LONG_EXPOSURE) && ((Boolean) gunVar.m.a()).booleanValue();
        boolean z7 = gunVar.aa && (klwVar2 == klw.PHOTO || klwVar2 == klw.IMAGE_INTENT || klwVar2 == klw.PORTRAIT);
        boolean z8 = gunVar.aa && (klwVar2 == klw.VIDEO || klwVar2 == klw.VIDEO_INTENT || klwVar2 == klw.SLOW_MOTION || (klwVar2 == klw.LONG_EXPOSURE && gunVar.ac));
        boolean z9 = klwVar2 == klw.VIDEO && gunVar.ad;
        boolean z10 = klwVar2 == klw.VIDEO && ((Boolean) gunVar.u.a()).booleanValue();
        boolean z11 = gunVar.X && (klwVar2 == klw.PHOTO || klwVar2 == klw.PHOTOBOOTH);
        klw klwVar3 = klw.IMAX;
        boolean z12 = klwVar2 == klw.PHOTO || klwVar2 == klw.PORTRAIT || klwVar2 == klw.LONG_EXPOSURE || klwVar2 == klw.PHOTOBOOTH;
        klw klwVar4 = klw.PHOTO_SPHERE;
        boolean z13 = (klwVar2 == klw.PHOTO || klwVar2 == klw.VIDEO || klwVar2 == klw.PORTRAIT || klwVar2 == klw.LENS_BLUR || klwVar2 == klw.LONG_EXPOSURE || klwVar2 == klw.MORE_MODES) ? false : true;
        boolean z14 = gunVar.Y && (klwVar2 == klw.PORTRAIT || klwVar2 == klw.PHOTOBOOTH || (gunVar.ac && (klwVar2 == klw.PHOTO || klwVar2 == klw.LONG_EXPOSURE)));
        boolean z15 = gunVar.ab && klwVar2 == klw.LONG_EXPOSURE;
        if (gunVar.ax.k()) {
            gunVar.ax.l();
        }
        OptionsMenuContainer optionsMenuContainer = gunVar.ax;
        boolean z16 = z12;
        ImageButton imageButton = optionsMenuContainer.d;
        if (imageButton != null) {
            klwVar = klwVar3;
            ((ViewManager) imageButton.getParent()).removeView(optionsMenuContainer.d);
        } else {
            klwVar = klwVar3;
        }
        optionsMenuContainer.d = null;
        OptionsMenuContainer optionsMenuContainer2 = gunVar.ax;
        ImageButton imageButton2 = optionsMenuContainer2.e;
        if (imageButton2 != null) {
            ((ViewManager) imageButton2.getParent()).removeView(optionsMenuContainer2.e);
        }
        optionsMenuContainer2.e = null;
        OptionsMenuContainer optionsMenuContainer3 = gunVar.ax;
        OptionsMenuView d = optionsMenuContainer3.d();
        synchronized (d) {
            LinearLayout linearLayout = d.g;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                d.f.clear();
                d.e.clear();
            }
        }
        optionsMenuContainer3.o();
        if (z13) {
            OptionsMenuContainer optionsMenuContainer4 = gunVar.ax;
            ImageButton imageButton3 = gunVar.ay;
            z = z8;
            z2 = z7;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(optionsMenuContainer4.getResources().getDimensionPixelSize(2131165947), optionsMenuContainer4.getResources().getDimensionPixelSize(2131165947));
            layoutParams.addRule(17, optionsMenuContainer4.f().getId());
            imageButton3.setLayoutParams(layoutParams);
            optionsMenuContainer4.f().addView(imageButton3);
            optionsMenuContainer4.d = imageButton3;
        } else {
            z2 = z7;
            z = z8;
        }
        OptionsMenuContainer optionsMenuContainer5 = gunVar.ax;
        ImageButton imageButton4 = gunVar.az;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(optionsMenuContainer5.getResources().getDimensionPixelSize(2131165946), optionsMenuContainer5.getResources().getDimensionPixelSize(2131165946));
        layoutParams2.addRule(21, optionsMenuContainer5.g().getId());
        imageButton4.setLayoutParams(layoutParams2);
        optionsMenuContainer5.g().addView(imageButton4);
        optionsMenuContainer5.e = imageButton4;
        gunVar.a(gunVar.an, gunVar.w, gunVar.P, z14);
        gunVar.a(gunVar.al, gunVar.s, gunVar.M, z9);
        gunVar.a(gunVar.am, gunVar.t, gunVar.N, z10);
        gunVar.a(gunVar.ai, gunVar.k, gunVar.F, z5);
        gunVar.a(gunVar.aj, gunVar.l, gunVar.G, z6);
        gunVar.a(gunVar.ap, gunVar.v, gunVar.O, z11);
        if (gun.a(klwVar2, gunVar.ac)) {
            if (gunVar.ag) {
                gunVar.j.a(ilw.AUTO);
            }
            gunVar.a(gunVar.ah, gunVar.j, gunVar.E, z4);
        } else {
            if (gunVar.j.a() == ilw.AUTO) {
                gunVar.j.a(ilw.OFF);
            }
            gunVar.a(gunVar.ah, gunVar.j, gunVar.D, z4);
        }
        if (gunVar.d.d(cim.d)) {
            if (gunVar.ac) {
                gunVar.a(gunVar.ao, gunVar.y, gunVar.R, z15);
            } else {
                gunVar.a(gunVar.ao, gunVar.x, gunVar.Q, z15);
            }
        }
        if (gunVar.ac) {
            boolean z17 = z;
            gunVar.a(gunVar.ak, gunVar.o, gunVar.I, z2);
            if (klwVar2 == klw.LONG_EXPOSURE) {
                gunVar.a(gunVar.as, gunVar.r, gunVar.L, z17);
            } else {
                gunVar.a(gunVar.as, gunVar.q, gunVar.K, z17);
            }
        } else {
            gunVar.a(gunVar.ak, gunVar.n, gunVar.H, z2);
            gunVar.a(gunVar.as, gunVar.p, gunVar.J, z);
        }
        if (klwVar2 == klwVar) {
            z3 = true;
            gunVar.a(gunVar.at, gunVar.A, gunVar.S, true);
        } else {
            z3 = true;
        }
        if (z16) {
            gunVar.a(gunVar.ar, gunVar.B, gunVar.T, z3);
        }
        if (klwVar2 == klwVar4) {
            gunVar.a(gunVar.aq, gunVar.z, gunVar.U, z3);
        }
        if (isEnabled) {
            gunVar.ax.j();
        }
        if (z11) {
            gunVar.g();
        }
        if (((Boolean) gunVar.W.a()).booleanValue()) {
            gunVar.aw.a(guv.BACK_VIDEO_FLASH);
        } else {
            gunVar.aw.b(guv.BACK_VIDEO_FLASH);
        }
        gunVar.ax.h();
        gunVar.c.a();
    }
}
