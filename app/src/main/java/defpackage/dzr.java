package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: dzr  reason: default package */
/* loaded from: classes.dex */
public final class dzr implements rgg {
    private final dzq a;

    public dzr(dzq dzqVar) {
        this.a = dzqVar;
    }

    public final ContentResolver a() {
        return a(this.a);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public static ContentResolver a(dzq dzqVar) {
        return (ContentResolver) rgk.a(dzqVar.a.getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}