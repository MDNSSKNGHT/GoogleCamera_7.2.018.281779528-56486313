package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
final class qf implements vg {
    public final int[] a = {2131230894, 2131230892, 2131230811};
    public final int[] b = {2131230835, 2131230876, 2131230842, 2131230837, 2131230838, 2131230841, 2131230840};
    public final int[] c = {2131230891, 2131230893, 2131230828, 2131230884, 2131230885, 2131230887, 2131230889, 2131230886, 2131230888, 2131230890};
    public final int[] d = {2131230866, 2131230826, 2131230865};
    public final int[] e = {2131230882, 2131230895};
    public final int[] f = {2131230814, 2131230820, 2131230815, 2131230821};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList a(Context context, int i) {
        int a = vn.a(context, 2130968767);
        return new ColorStateList(new int[][]{vn.a, vn.c, vn.b, vn.e}, new int[]{vn.c(context, 2130968765), gj.a(a, i), gj.a(a, i), i});
    }

    public static final void a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (sb.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = qg.a;
        }
        drawable.setColorFilter(qg.a(i, mode));
    }
}