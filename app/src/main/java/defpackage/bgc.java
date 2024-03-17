package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: bgc  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bgc implements Runnable {
    private final Activity a;

    public bgc(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.finish();
    }
}