package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: mbn  reason: default package */
/* loaded from: classes.dex */
public final class mbn implements ThreadFactory {
    private final /* synthetic */ String a;

    public mbn(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new maj(0, runnable, this.a);
    }
}