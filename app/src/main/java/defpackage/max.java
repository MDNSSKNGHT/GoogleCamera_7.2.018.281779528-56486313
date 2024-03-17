package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: max  reason: default package */
/* loaded from: classes.dex */
public final class max implements Executor, mbf {
    private final Handler a;

    public max(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    public max(Handler handler, byte b) {
        this(handler);
    }
}