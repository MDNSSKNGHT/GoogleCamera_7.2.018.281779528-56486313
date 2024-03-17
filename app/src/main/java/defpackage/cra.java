package defpackage;

import android.widget.Toast;

/* compiled from: PG */
/* renamed from: cra  reason: default package */
/* loaded from: classes.dex */
final class cra implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ crb b;

    public cra(crb crbVar, String str) {
        this.b = crbVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.b.a, this.a, Toast.LENGTH_LONG).show();
    }
}