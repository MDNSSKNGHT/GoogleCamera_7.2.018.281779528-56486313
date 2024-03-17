package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: mbm  reason: default package */
/* loaded from: classes.dex */
public final class mbm implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    private final /* synthetic */ int b;
    private final /* synthetic */ String c;

    public mbm(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.a.incrementAndGet();
        int i = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(incrementAndGet);
        return new maj(i, runnable, sb.toString());
    }
}