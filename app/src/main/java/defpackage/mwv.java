package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: mwv  reason: default package */
/* loaded from: classes.dex */
public abstract class mwv implements mos {
    private static int a = 0;
    private final int b = h();
    public final mzc f;
    public final boolean g;
    public final mou h;

    @Override // defpackage.mos
    public final mzc a() {
        return this.f;
    }

    public abstract long e();

    public abstract Surface f();

    public abstract mov g();

    public mwv(mou mouVar, mzc mzcVar, boolean z) {
        this.h = mouVar;
        this.f = mzcVar;
        this.g = z;
    }

    @Override // defpackage.mos
    public final boolean d() {
        return this.h.g();
    }

    private static synchronized int h() {
        int i;
        synchronized (mwv.class) {
            i = a;
            a = i + 1;
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(18);
        sb.append("Stream-");
        sb.append(i);
        return sb.toString();
    }
}