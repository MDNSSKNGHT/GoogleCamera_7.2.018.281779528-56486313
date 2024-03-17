package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: crb  reason: default package */
/* loaded from: classes.dex */
public final class crb {
    public final Context a;
    private final mbe b;

    public crb(Context context, mbe mbeVar) {
        this.a = context;
        this.b = mbeVar;
    }

    public final void a(String str) {
        this.b.execute(new cra(this, str));
    }
}