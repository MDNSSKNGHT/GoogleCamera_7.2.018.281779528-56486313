package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: gss */
/* loaded from: classes.dex */
public final class gss implements rgg {
    private final rhd a;

    private gss(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gss a(rhd rhdVar) {
        return new gss(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsr((ViewfinderJankSession) this.a.get());
    }
}