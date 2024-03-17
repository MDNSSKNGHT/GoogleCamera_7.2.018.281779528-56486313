package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gi  reason: default package */
/* loaded from: classes.dex */
public abstract class gi {
    public abstract void a();

    public abstract void a(Typeface typeface);

    public final void a(int i) {
        new Handler(Looper.getMainLooper()).post(new gh(this));
    }

    public final void b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new gg(this, typeface));
    }
}