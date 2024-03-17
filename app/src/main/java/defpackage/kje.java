package defpackage;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: kje  reason: default package */
/* loaded from: classes.dex */
public final class kje {
    private static final String a = liu.a("WindowFlags");

    public static void b(Window window) {
        window.getDecorView().setSystemUiVisibility(1797);
        int i = Build.VERSION.SDK_INT;
        window.setNavigationBarContrastEnforced(false);
    }

    public static void a(Window window) {
        liu.d(a);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
        window.requestFeature(8);
        liu.f(a);
        window.addFlags(Integer.MIN_VALUE);
        liu.f(a);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        int i = Build.VERSION.SDK_INT;
    }
}
