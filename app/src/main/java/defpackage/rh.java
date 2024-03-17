package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: rh  reason: default package */
/* loaded from: classes2.dex */
@SuppressLint("AppCompatCustomView")
public class rh extends TextView {
    public static /* synthetic */ int a;
    private final qb b;
    private final rg c;

    public rh(Context context) {
        this(context, null);
    }

    public rh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public rh(Context context, AttributeSet attributeSet, int i) {
        super(vp.a(context), attributeSet, i);
        qb qbVar = new qb(this);
        this.b = qbVar;
        qbVar.a(attributeSet, i);
        rg rgVar = new rg(this);
        this.c = rgVar;
        rgVar.a(attributeSet, i);
        this.c.a();
        new ua(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qb qbVar = this.b;
        if (qbVar != null) {
            qbVar.c();
        }
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        int i = Build.VERSION.SDK_INT;
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ua.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        rg rgVar = this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        rg rgVar = this.c;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qb qbVar = this.b;
        if (qbVar != null) {
            qbVar.d();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qb qbVar = this.b;
        if (qbVar != null) {
            qbVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? mx.b(context, i) : null, i2 != 0 ? mx.b(context, i2) : null, i3 != 0 ? mx.b(context, i3) : null, i4 != 0 ? mx.b(context, i4) : null);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? mx.b(context, i) : null, i2 != 0 ? mx.b(context, i2) : null, i3 != 0 ? mx.b(context, i3) : null, i4 != 0 ? mx.b(context, i4) : null);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ua.a(callback));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        ua.b(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rg rgVar = this.c;
        if (rgVar != null) {
            rgVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        int i = Build.VERSION.SDK_INT;
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = gm.a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }
}