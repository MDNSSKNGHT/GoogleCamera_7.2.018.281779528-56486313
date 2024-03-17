package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: qoj  reason: default package */
/* loaded from: classes2.dex */
abstract class qoj extends qnt {
    private static final Logger e = Logger.getLogger(qoj.class.getName());
    public static final qog f;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        qog qoiVar;
        Throwable th;
        try {
            qoiVar = new qoh(AtomicReferenceFieldUpdater.newUpdater(qoj.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(qoj.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            qoiVar = new qoi((byte) 0);
            th = th2;
        }
        f = qoiVar;
        if (th != null) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public abstract void a(Set set);

    public qoj(int i) {
        this.remaining = i;
    }
}