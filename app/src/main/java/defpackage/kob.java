package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* compiled from: PG */
/* renamed from: kob  reason: default package */
/* loaded from: classes.dex */
public final class kob {
    public final boolean a;
    private final Vibrator b;
    private final boolean c;

    public kob(Context context, cin cinVar) {
        this.b = (Vibrator) context.getSystemService("vibrator");
        this.c = cinVar.c(cit.at);
        this.a = cinVar.c(cit.au);
    }

    public final void a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        a(VibrationEffect.createPredefined(i));
    }

    public static void a(Context context, int i) {
        if (nda.a().b()) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        ((Vibrator) context.getSystemService("vibrator")).vibrate(VibrationEffect.createPredefined(i));
    }

    public final void a(VibrationEffect vibrationEffect) {
        if (this.b.hasVibrator() && this.c) {
            this.b.vibrate(vibrationEffect);
        }
    }
}
