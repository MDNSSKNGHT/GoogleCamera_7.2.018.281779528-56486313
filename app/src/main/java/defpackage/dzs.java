package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dzs  reason: default package */
/* loaded from: classes.dex */
public final class dzs implements rgg {
    private final dzq a;

    public dzs(dzq dzqVar) {
        this.a = dzqVar;
    }

    public final Context a() {
        return a(this.a);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public static Context a(dzq dzqVar) {
        return (Context) rgk.a(dzqVar.b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
