package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: qg */
/* loaded from: classes.dex */
public final class qg {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static qg b;
    private vh c;

    public static synchronized qg b() {
        qg qgVar;
        synchronized (qg.class) {
            if (b == null) {
                a();
            }
            qgVar = b;
        }
        return qgVar;
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.a(context, i, true);
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (qg.class) {
            a2 = vh.a(i, mode);
        }
        return a2;
    }

    public final synchronized ColorStateList b(Context context, int i) {
        return this.c.b(context, i);
    }

    public final synchronized void a(Context context) {
        this.c.a(context);
    }

    public static synchronized void a() {
        synchronized (qg.class) {
            if (b == null) {
                qg qgVar = new qg();
                b = qgVar;
                qgVar.c = vh.a();
                b.c.a(new qf());
            }
        }
    }

    public static void a(Drawable drawable, vq vqVar, int[] iArr) {
        vh.a(drawable, vqVar, iArr);
    }
}