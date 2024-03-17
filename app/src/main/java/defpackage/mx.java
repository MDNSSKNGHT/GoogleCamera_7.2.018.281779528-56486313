package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: mx  reason: default package */
/* loaded from: classes.dex */
public final class mx {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static ColorStateList a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return vh.a().a(context, i);
    }
}