package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.media.MediaFormat;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ofq  reason: default package */
/* loaded from: classes.dex */
public final class ofq {
    private static float a(float f) {
        return f >= 180.0f ? 180.0f - f : f;
    }

    public static ValueAnimator b(View view, kmr kmrVar) {
        qdu.d(view);
        float a = a(kmrVar);
        float abs = Math.abs(a(view.getRotation()) - a(a));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ROTATION, view.getRotation(), a(a));
        ofFloat.setInterpolator(new aao());
        ofFloat.setDuration(abs <= 90.0f ? 250L : 0L);
        return ofFloat;
    }

    public static int a(kmr kmrVar) {
        if (kmr.a(kmrVar)) {
            return 0;
        }
        return kmrVar.a().e;
    }

    public static void c(View view, kmr kmrVar) {
        view.setRotation(kmrVar.e);
        view.setPivotX(view.getHeight() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (kmrVar.equals(kmr.LANDSCAPE)) {
            view.setTranslationY(view.getWidth() - view.getHeight());
        } else {
            view.setTranslationY(0.0f);
        }
    }

    public static void a(View view, kmr kmrVar) {
        b(view, kmrVar).start();
    }

    public static void a(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    public static ofo a(Executor executor) {
        return new ofm(executor);
    }
}