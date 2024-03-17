package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
final class hj implements Runnable {
    public final /* synthetic */ hl a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ Handler c;

    public hj(Callable callable, Handler handler, hl hlVar) {
        this.b = callable;
        this.c = handler;
        this.a = hlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hf hfVar;
        try {
            hfVar = ((gz) this.b).a();
        } catch (Exception e) {
            hfVar = null;
        }
        this.c.post(new hi(this, hfVar));
    }
}