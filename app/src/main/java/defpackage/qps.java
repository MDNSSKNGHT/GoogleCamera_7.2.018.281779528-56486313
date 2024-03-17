package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: qps  reason: default package */
/* loaded from: classes2.dex */
public interface qps extends ExecutorService {
    qpp a(Runnable runnable);

    qpp a(Runnable runnable, Object obj);

    qpp a(Callable callable);
}