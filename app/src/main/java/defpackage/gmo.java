package defpackage;

import android.util.Log;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gmo  reason: default package */
/* loaded from: classes.dex */
final class gmo extends mba {
    private final rhd a;
    private final AtomicBoolean b;

    public gmo(rhd rhdVar, mby mbyVar) {
        super(mbyVar);
        this.a = rhdVar;
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.mba, defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        Throwable th = null;
        for (gmn gmnVar : (Set<gmn>) ((rgn) this.a).a()) {
            try {
                gmnVar.run();
            } catch (Throwable th2) {
                th = th2;
                Log.e("TwoStageShutdown", "Error thrown while running shutdown task", th);
            }
        }
        super.close();
        boolean z = mjz.a;
        if (th == null) {
            return;
        }
        throw new RuntimeException(th);
    }

    @Override // defpackage.mba
    public final boolean a() {
        return this.b.get();
    }
}