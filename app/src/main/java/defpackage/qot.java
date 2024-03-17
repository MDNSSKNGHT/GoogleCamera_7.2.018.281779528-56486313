package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: qot  reason: default package */
/* loaded from: classes2.dex */
public enum qot implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
