package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: kfu  reason: default package */
/* loaded from: classes.dex */
public final class kfu {
    private static kfu a;
    private final int b;
    private final boolean c;

    private kfu(Context context) {
        this.b = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getRotation();
        this.c = ((Activity) context).isInMultiWindowMode();
    }

    public static void a(Context context) {
        if (a == null) {
            a = new kfu(context);
        }
    }

    public static int c(Context context) {
        kfu kfuVar = a;
        return kfuVar == null ? ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getRotation() : kfuVar.b;
    }

    public static boolean b(Context context) {
        kfu kfuVar = a;
        return kfuVar == null ? ((Activity) context).isInMultiWindowMode() : kfuVar.c;
    }

    public static void a() {
        a = null;
    }
}