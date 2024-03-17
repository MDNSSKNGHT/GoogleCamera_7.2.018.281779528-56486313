package com.google.android.apps.camera.optionsbar.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import java.util.ArrayList;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public class OptionsMenuContainer extends RelativeLayout {
    public static final String a = liu.a("OptionsMenuCntnr");
    public kmr b;
    public final guz c;
    public ImageButton d;
    public ImageButton e;
    public final GestureDetector f;
    public final GestureDetector g;
    public final Context h;
    public AlertDialog i;
    public final Animator j;
    public final Animator k;
    public ImageButton l;
    public AnimatedVectorDrawable m;
    public VectorDrawable n;
    public boolean o;
    public imi p;
    public boolean q;
    public gbp r;
    public gbp s;
    public gbp t;
    private Animator u;
    private final ArrayList v;
    private gbq w;
    private boolean x;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public OptionsMenuContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = kmr.PORTRAIT;
        this.i = null;
        this.o = false;
        this.q = false;
        this.c = new guz(this);
        this.f = new GestureDetector(context, new gvp(this));
        this.g = new GestureDetector(context, new gvq(this));
        this.v = new ArrayList();
        this.j = AnimatorInflater.loadAnimator(context, 2130837545);
        this.k = AnimatorInflater.loadAnimator(context, 2130837546);
        this.h = context;
    }

    public final void a(gvu gvuVar) {
        if (this.v.contains(gvuVar)) {
            return;
        }
        this.v.add(gvuVar);
    }

    public final void a(kmr kmrVar) {
        String str = a;
        String valueOf = String.valueOf(kmrVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Rotating Options Menu Icon to ");
        sb.append(valueOf);
        sb.toString();
        liu.b(str);
        Trace.beginSection("optionsMenuContainer:applyOrientation");
        this.b = kmrVar;
        ofq.c(this, kmrVar);
        RelativeLayout e = e();
        ValueAnimator b = ofq.b(e, kmrVar);
        b.addListener(new kmi(e));
        b.start();
        gbq gbqVar = this.w;
        if (gbqVar != null) {
            a(gbqVar, this.x);
        }
        Trace.endSection();
    }

    public final void o() {
        if (this.n != null && this.m != null) {
            n();
        }
        this.l = null;
        this.m = null;
        this.n = null;
    }

    public final void l() {
        Animator animator = this.u;
        if (animator == null || !animator.isRunning()) {
            Animator a2 = new gve(this, false).a();
            this.u = a2;
            a2.start();
            d().fullScroll(33);
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gvu) arrayList.get(i)).b();
            }
        }
    }

    public final void i() {
        setEnabled(false);
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setEnabled(false);
        }
        h();
    }

    public final void j() {
        setEnabled(true);
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setEnabled(true);
        }
        h();
    }

    public final ImageButton b() {
        return (ImageButton) findViewById(2131427703);
    }

    public final FrameLayout c() {
        return (FrameLayout) findViewById(2131427741);
    }

    public final ImageButton a() {
        return (ImageButton) findViewById(2131427742);
    }

    public final RelativeLayout g() {
        return (RelativeLayout) findViewById(2131427746);
    }

    public final RelativeLayout f() {
        return (RelativeLayout) findViewById(2131427747);
    }

    public final RelativeLayout e() {
        return (RelativeLayout) findViewById(2131427748);
    }

    public final OptionsMenuView d() {
        return (OptionsMenuView) findViewById(2131427749);
    }

    public final boolean k() {
        return e().getVisibility() == 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenuContainer:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(2131624089, this);
        setLayerType(1, null);
        setBackgroundColor(0);
        this.j.addListener(new gvn(this));
        this.k.addListener(new gvo(this));
        c().setOnTouchListener(new gvf(this));
        c().setOnClickListener(new gvg(this));
        setOnTouchListener(new gvh(this));
        c().setAlpha(0.72f);
        d().h = new gvi(this);
        c().setClickable(true);
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a(this.b);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.h).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (kmr.a(this.b)) {
            OptionsMenuView d = d();
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165954);
            d.b = i4 - (dimensionPixelSize + dimensionPixelSize);
        } else {
            d().b = i3;
        }
        if (kmr.a(this.b)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }

    public final void m() {
        if (!isEnabled() || c() == null || e() == null) {
            return;
        }
        new gve(this, true).a().start();
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gvu) arrayList.get(i)).a();
        }
        a(this.w, false);
    }

    public final void a(ImageButton imageButton) {
        this.l = imageButton;
        this.m = (AnimatedVectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(0);
        VectorDrawable vectorDrawable = (VectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(1);
        this.n = vectorDrawable;
        if (this.o || vectorDrawable == null) {
            return;
        }
        vectorDrawable.setAlpha(0);
    }

    public final void a(gbq gbqVar, boolean z) {
        synchronized (this) {
            if (gbqVar != null) {
                if (this.w == null) {
                    this.w = gbqVar;
                }
                this.x = z;
                if (!z) {
                    gbqVar.b(this.r);
                    gbqVar.b(this.s);
                    gbqVar.b(this.t);
                } else {
                    kmr kmrVar = kmr.PORTRAIT;
                    int ordinal = this.b.ordinal();
                    if (ordinal == 1) {
                        gbqVar.a(this.s);
                    } else if (ordinal != 2) {
                        gbqVar.a(this.r);
                    } else {
                        gbqVar.a(this.t);
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        mbe.a();
        AlertDialog.Builder onDismissListener = new AlertDialog.Builder(this.h, 2132017437).setTitle(getResources().getString(2131952163)).setMessage(getResources().getString(2131952162)).setCancelable(false).setOnDismissListener(new gvj(this));
        onDismissListener.setNegativeButton(getResources().getString(2131952115), new gvk(this));
        if (z) {
            onDismissListener.setPositiveButton(getResources().getString(2131952250), new gvl(this));
        } else {
            onDismissListener.setPositiveButton(getResources().getString(2131952114), new gvm(this));
        }
        AlertDialog show = onDismissListener.show();
        this.i = show;
        show.setCanceledOnTouchOutside(true);
        if (z) {
            return;
        }
        l();
    }

    public final void n() {
        liu.b(a);
        if (this.l == null || !this.o) {
            return;
        }
        this.j.cancel();
        this.k.setTarget(this.n);
        this.k.start();
        this.o = false;
    }

    public final void h() {
        int a2 = d().a();
        FrameLayout c = c();
        boolean z = false;
        c.setVisibility(a2 > 0 ? 0 : 4);
        if (isEnabled() && a2 > 0) {
            z = true;
        }
        c.setEnabled(z);
    }
}