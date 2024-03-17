package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: mce  reason: default package */
/* loaded from: classes.dex */
final class mce implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ mch b;

    public mce(mch mchVar, Object obj) {
        this.b = mchVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c = this.a;
        for (mjw mjwVar : this.b.b) {
            try {
                mjwVar.a(this.a);
            } catch (RejectedExecutionException ignored) {
            }
        }
    }
}
