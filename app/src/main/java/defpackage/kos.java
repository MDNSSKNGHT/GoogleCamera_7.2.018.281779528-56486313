package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kos  reason: default package */
/* loaded from: classes.dex */
public final class kos {
    public static int a(double d) {
        return (int) (d * 1000.0d);
    }

    public static long a(int i) {
        return i * 1000000;
    }

    public static boolean a(int i, int i2, int i3) {
        return (i / i3) % 2 == 0 && (i2 / i3) % 2 == 0;
    }

    public static int b(int i) {
        return i * 1000;
    }

    public static int b(long j) {
        return (int) (j / 1000);
    }

    public static long c(long j) {
        return j / 1000000;
    }

    public static float d(long j) {
        return ((float) j) / 1000.0f;
    }

    public static long e(long j) {
        return j / 1000;
    }

    public static long f(long j) {
        return j * 1000;
    }

    public static bmx a(Runnable runnable) {
        return new bmy(runnable);
    }

    public static bmx a(Runnable runnable, Executor executor) {
        return new bmz(executor, runnable);
    }

    public static final String a(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j));
        return hours > 0 ? String.format("%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%02d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }
}