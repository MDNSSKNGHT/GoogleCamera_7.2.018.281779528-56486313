package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: qj  reason: default package */
/* loaded from: classes.dex */
public final class qj {
    public vq a;
    private final ImageView b;

    public qj(ImageView imageView) {
        this.b = imageView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Drawable drawable = this.b.getDrawable();
        if (drawable != null) {
            sb.a();
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            vq vqVar = this.a;
            if (vqVar != null) {
                qg.a(drawable, vqVar, this.b.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        Drawable background = this.b.getBackground();
        int i = Build.VERSION.SDK_INT;
        return !(background instanceof RippleDrawable);
    }

    public final void a(AttributeSet attributeSet, int i) {
        int f;
        vs a = vs.a(this.b.getContext(), attributeSet, mw.f, i, 0);
        try {
            Drawable drawable = this.b.getDrawable();
            if (drawable == null && (f = a.f(1, -1)) != -1 && (drawable = mx.b(this.b.getContext(), f)) != null) {
                this.b.setImageDrawable(drawable);
            }
            if (drawable != null) {
                sb.a();
            }
            if (a.f(2)) {
                ImageView imageView = this.b;
                ColorStateList e = a.e(2);
                int i2 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(e);
                int i3 = Build.VERSION.SDK_INT;
            }
            if (a.f(3)) {
                ImageView imageView2 = this.b;
                PorterDuff.Mode a2 = sb.a(a.a(3, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(a2);
                int i5 = Build.VERSION.SDK_INT;
            }
        } finally {
            a.a();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b = mx.b(this.b.getContext(), i);
            if (b != null) {
                sb.a();
            }
            this.b.setImageDrawable(b);
        } else {
            this.b.setImageDrawable(null);
        }
        b();
    }
}