package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: gfx  reason: default package */
/* loaded from: classes.dex */
public final class gfx extends mrx {
    public final ReentrantLock a;
    public final Condition b;
    public long c;
    private final TreeMap d;
    private long e;
    private final Set<mop> f;

    public gfx() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.d = new TreeMap();
        this.c = -1L;
        this.e = -1L;
        this.f = new HashSet();
    }

    public final long a() {
        this.a.lock();
        try {
            return this.e;
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.mrx
    public final void a(ggi ggiVar) {
        this.a.lock();
        try {
            long j = ggiVar.b;
            if (this.c < j) {
                this.c = j;
                this.e = ggiVar.a;
                this.b.signal();
                while (!this.d.isEmpty() && ((Long) this.d.firstKey()).longValue() >= this.c) {
                    ((Runnable) ((Map.Entry) qdu.d(this.d.pollFirstEntry())).getValue()).run();
                }
                for (mop mopVar : this.f) {
                    if (this.c % 0 == 0) {
                        throw null;
                    }
                }
            }
        } finally {
            this.a.unlock();
        }
    }
}