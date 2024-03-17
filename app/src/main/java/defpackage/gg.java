package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* renamed from: gg  reason: default package */
/* loaded from: classes.dex */
final class gg implements Runnable {
    private final /* synthetic */ Typeface a;
    private final /* synthetic */ gi b;

    public gg(gi giVar, Typeface typeface) {
        this.b = giVar;
        this.a = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}