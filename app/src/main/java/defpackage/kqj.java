package defpackage;

import android.view.View;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kqj  reason: default package */
/* loaded from: classes.dex */
public final class kqj {
    public static void a(mai maiVar, Future future) {
        maiVar.a(new boe(future));
    }

    public static void a(int i, View view) {
        float f = i == 0 ? 1.0f : 0.0f;
        view.animate().cancel();
        boolean z = i == 0;
        view.setClickable(false);
        if (z) {
            view.setVisibility(View.VISIBLE);
        }
        view.animate().alpha(f).setDuration(i == 0 ? 200L : 150L).setStartDelay(i == 0 ? 100L : 0L).setInterpolator(new aao()).withEndAction(new kox(view, z, i)).start();
    }

    public static String a(long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        return hours > 0 ? String.format("%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%1d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }
}