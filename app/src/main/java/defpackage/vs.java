package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: vs  reason: default package */
/* loaded from: classes2.dex */
public final class vs {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private vs(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int h(int i) {
        return this.b.getColor(i, 0);
    }

    public final ColorStateList e(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a = mx.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a;
    }

    public final float g(int i) {
        return this.b.getDimension(i, -1.0f);
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final Drawable a(int i) {
        int resourceId;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            return mx.b(this.a, resourceId);
        }
        return this.b.getDrawable(i);
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return qg.b().c(this.a, resourceId);
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int b(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final String d(int i) {
        return this.b.getString(i);
    }

    public final CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final boolean f(int i) {
        return this.b.hasValue(i);
    }

    public static vs a(Context context, int i, int[] iArr) {
        return new vs(context, context.obtainStyledAttributes(i, iArr));
    }

    public static vs a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new vs(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static vs a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new vs(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final void a() {
        this.b.recycle();
    }
}