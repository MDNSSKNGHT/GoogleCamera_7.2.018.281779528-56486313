package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dqe  reason: default package */
/* loaded from: classes.dex */
public final class dqe {
    public static final long a = TimeUnit.SECONDS.toNanos(1);
    public HashMap b = new HashMap();

    public dqe(mcs mcsVar, Executor executor, mba mbaVar) {
        mbaVar.a(mcsVar.a(new dqd(this), executor));
    }
}
