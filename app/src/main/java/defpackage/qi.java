package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: qi  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("AppCompatCustomView")
public class qi extends ImageButton {
    public final qb mBackgroundTintHelper;
    public final qj mImageHelper;

    public qi(Context context) {
        this(context, null);
    }

    public ColorStateList getSupportImageTintList() {
        vq vqVar;
        qj qjVar = this.mImageHelper;
        if (qjVar == null || (vqVar = qjVar.a) == null) {
            return null;
        }
        return vqVar.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        vq vqVar;
        qj qjVar = this.mImageHelper;
        if (qjVar == null || (vqVar = qjVar.a) == null) {
            return null;
        }
        return vqVar.b;
    }

    public qi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968993);
    }

    public qi(Context context, AttributeSet attributeSet, int i) {
        super(vp.a(context), attributeSet, i);
        qb qbVar = new qb(this);
        this.mBackgroundTintHelper = qbVar;
        qbVar.a(attributeSet, i);
        qj qjVar = new qj(this);
        this.mImageHelper = qjVar;
        qjVar.a(attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            qbVar.c();
        }
        qj qjVar = this.mImageHelper;
        if (qjVar != null) {
            qjVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            return qbVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            return qbVar.b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.a() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            qbVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            qbVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        qj qjVar = this.mImageHelper;
        if (qjVar != null) {
            qjVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        qj qjVar = this.mImageHelper;
        if (qjVar != null) {
            qjVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.a(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        qj qjVar = this.mImageHelper;
        if (qjVar != null) {
            qjVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            qbVar.a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        qb qbVar = this.mBackgroundTintHelper;
        if (qbVar != null) {
            qbVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        qj qjVar = this.mImageHelper;
        if (qjVar == null) {
            return;
        }
        if (qjVar.a == null) {
            qjVar.a = new vq();
        }
        vq vqVar = qjVar.a;
        vqVar.a = colorStateList;
        vqVar.d = true;
        qjVar.b();
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        qj qjVar = this.mImageHelper;
        if (qjVar == null) {
            return;
        }
        if (qjVar.a == null) {
            qjVar.a = new vq();
        }
        vq vqVar = qjVar.a;
        vqVar.b = mode;
        vqVar.c = true;
        qjVar.b();
    }
}