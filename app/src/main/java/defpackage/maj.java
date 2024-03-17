package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: maj  reason: default package */
/* loaded from: classes.dex */
public final class maj extends Thread {
    private final int a;

    public maj(int i, Runnable runnable, String str) {
        super(runnable);
        this.a = i;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}