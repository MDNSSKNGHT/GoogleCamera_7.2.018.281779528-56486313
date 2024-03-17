package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: gsq */
/* loaded from: classes.dex */
public final class gsq implements rgg {
    private final rhd a;

    private gsq(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gsq a(rhd rhdVar) {
        return new gsq(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsp((ViewfinderJankSession) this.a.get());
    }
}