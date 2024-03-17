package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mbe  reason: default package */
/* loaded from: classes.dex */
public final class mbe implements Executor {
    public static final mbf a = new max(new Handler(Looper.getMainLooper()), (byte) 0);
    public static final mbe b = new mbe(a);
    private static final ThreadLocal c = new mbd();
    private final mbf d;

    @Deprecated
    public mbe() {
        this(a);
    }

    public mbe(mbf mbfVar) {
        this.d = mbfVar;
    }

    public static void a() {
        qdu.b(b(), "Not main thread.");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }

    public static boolean b() {
        Boolean bool = (Boolean) c.get();
        return bool != null && bool.booleanValue();
    }

    public final void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            this.d.execute(runnable);
        }
    }
}