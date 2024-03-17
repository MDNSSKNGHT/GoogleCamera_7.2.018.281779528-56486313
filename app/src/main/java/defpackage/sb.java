package defpackage;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

/* compiled from: PG */
/* renamed from: sb  reason: default package */
/* loaded from: classes2.dex */
public final class sb {
    static {
        new Rect();
        int i = Build.VERSION.SDK_INT;
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    public static boolean a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } else if (drawable instanceof gp) {
            return a(((gp) drawable).a());
        } else {
            if (drawable instanceof my) {
                return a(((my) drawable).a);
            }
            if (!(drawable instanceof ScaleDrawable)) {
                return true;
            }
            return a(((ScaleDrawable) drawable).getDrawable());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        int i = Build.VERSION.SDK_INT;
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}