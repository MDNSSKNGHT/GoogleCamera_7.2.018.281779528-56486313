package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("AppCompatCustomView")
public class qc extends Button implements kp {
    public final qb b;
    private final rg c;

    public qc(Context context) {
        this(context, null);
    }

    public qc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968694);
    }

    public qc(Context context, AttributeSet attributeSet, int i) {
        super(vp.a(context), attributeSet, i);
        this.b = new qb(this);
        this.b.a(attributeSet, i);
        this.c = new rg(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (super.getAutoSizeTextType() == TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM) {
            return TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM;
        } else {
            return TextView.AUTO_SIZE_TEXT_TYPE_NONE;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        rg rgVar = this.c;
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        rg rgVar = this.c;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ua.a(callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }
}
