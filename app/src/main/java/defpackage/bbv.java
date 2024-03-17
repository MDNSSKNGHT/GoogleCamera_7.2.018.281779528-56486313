package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* renamed from: bbv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bbv implements Runnable {
    private final bbw a;
    private final ndr b;

    public bbv(bbw bbwVar, ndr ndrVar) {
        this.a = bbwVar;
        this.b = ndrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet<Runnable> hashSet;
        bbw bbwVar = this.a;
        bbwVar.b.a(this.b);
        if (bbwVar.b.b()) {
            synchronized (bbwVar) {
                hashSet = new HashSet(bbwVar.a);
            }
            for (Runnable runnable : hashSet) {
                runnable.run();
            }
        }
    }
}