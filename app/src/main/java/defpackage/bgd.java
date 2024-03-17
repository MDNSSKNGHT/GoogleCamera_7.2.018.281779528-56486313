package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bgd  reason: default package */
/* loaded from: classes.dex */
public final class bgd {
    private static final String a = liu.a("ActivityCloser");
    private final WeakReference<Activity> b;
    private final mbe c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public bgd(WeakReference<Activity> weakReference, mbe mbeVar) {
        this.b = weakReference;
        this.c = mbeVar;
    }

    public void a(String str) {
        mbe.a();
        qdu.c(!pkb.a(str));
        Activity activity = this.b.get();
        if (activity == null || this.d.getAndSet(true)) {
            return;
        }
        liu.b(a, str.isEmpty() ? "WARNING: Activity was artificially finished: " : "WARNING: Activity was artificially finished: ".concat(str));
        this.c.execute(new bgc(activity));
    }
}