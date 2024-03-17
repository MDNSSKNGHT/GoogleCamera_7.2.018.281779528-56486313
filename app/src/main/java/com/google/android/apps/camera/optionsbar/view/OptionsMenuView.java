package com.google.android.apps.camera.optionsbar.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public class OptionsMenuView extends ScrollView {
    public static final String a = liu.a("OptionsMenuView");
    public int b;
    public final GestureDetector c;
    public final Map d;
    public final Map e;
    public final Map f;
    public LinearLayout g;
    public gvw h;

    public OptionsMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.c = new GestureDetector(context, new gvx(this));
    }

    public final void a(guv guvVar) {
        synchronized (this) {
            if (this.f.get(guvVar) != null) {
                gvt gvtVar = (gvt) this.f.get(guvVar);
                Iterator it = gvtVar.b.iterator();
                while (it.hasNext()) {
                    ImageButton imageButton = (ImageButton) it.next();
                    imageButton.setEnabled(false);
                    imageButton.setImageAlpha(64);
                }
                ImageButton imageButton2 = (ImageButton) gvtVar.c.get(gvtVar.h);
                if (imageButton2 != null) {
                    imageButton2.setBackground(gvtVar.getResources().getDrawable(2131231215, null));
                }
                gvtVar.f.setText(gvtVar.getResources().getString(2131952248));
                gvtVar.f.setContentDescription(gvtVar.getResources().getString(2131952249));
                gvtVar.f.setTextColor(gvtVar.getResources().getColor(2131100242, null));
                ((gvt) this.f.get(guvVar)).setEnabled(false);
            }
        }
    }

    public final void b(guv guvVar) {
        synchronized (this) {
            if (this.f.get(guvVar) != null) {
                gvt gvtVar = (gvt) this.f.get(guvVar);
                Iterator it = gvtVar.b.iterator();
                while (it.hasNext()) {
                    ImageButton imageButton = (ImageButton) it.next();
                    imageButton.setEnabled(true);
                    imageButton.setImageAlpha(255);
                }
                ImageButton imageButton2 = (ImageButton) gvtVar.c.get(gvtVar.h);
                if (imageButton2 != null) {
                    imageButton2.setBackground(gvtVar.getResources().getDrawable(2131231214, null));
                    gvtVar.f.setText(((guu) qdu.d((guu) gvtVar.d.get(imageButton2))).c);
                    gvtVar.f.setContentDescription(gvtVar.getResources().getString(((guu) qdu.d((guu) gvtVar.d.get(imageButton2))).d));
                    gvtVar.f.setTextColor(gvtVar.getResources().getColor(2131100241, null));
                }
                ((gvt) this.f.get(guvVar)).setEnabled(true);
            }
        }
    }

    public final int a() {
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            return linearLayout.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenu:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(2131624090, this);
        setLayerType(1, null);
        this.g = (LinearLayout) findViewById(2131427744);
        setOnTouchListener(new gvv(this));
        setScrollbarFadingEnabled(false);
        Trace.endSection();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = 0;
        try {
            size = View.MeasureSpec.getSize(i2);
            int dimensionPixelSize = (this.b - getResources().getDimensionPixelSize(2131165946)) - getResources().getDimensionPixelSize(2131165945);
            int dimensionPixelSize2 = dimensionPixelSize / getResources().getDimensionPixelSize(2131165951);
            if (size > dimensionPixelSize) {
                double d = dimensionPixelSize2;
                Double.isNaN(d);
                double d2 = d - 0.5d;
                Double.isNaN(d2);
                size = (int) (d2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        } catch (Exception e) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            getLayoutParams().height = size;
        } catch (Exception e2) {
            try {
                liu.a(a, "Error forcing height.");
                super.onMeasure(i, i2);
            } catch (Throwable th2) {
                super.onMeasure(i, i2);
                throw th2;
            }
        } catch (Throwable th3) {
            super.onMeasure(i, i2);
            throw th3;
        }
        super.onMeasure(i, i2);
    }
}