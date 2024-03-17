package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: niy  reason: default package */
/* loaded from: classes.dex */
public final class niy {
    public static int a(mjs mjsVar, mjs mjsVar2) {
        int min = Math.min(mjsVar.a / mjsVar2.a, mjsVar.b / mjsVar2.b);
        if (min > 0) {
            while (min > 0) {
                if (a(mjsVar.a, min) && a(mjsVar.b, min)) {
                    return min;
                }
                min--;
            }
        }
        return 1;
    }

    public static boolean a(int i, int i2) {
        return i % (i2 + i2) == 0;
    }

    public static void a(View view, View view2, int i, int i2) {
        view.post(new nhp(view2, i, i2, view));
    }

    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static void a(ImageView imageView, int i) {
        if (i <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public static void a() {
        qdu.b(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }
}