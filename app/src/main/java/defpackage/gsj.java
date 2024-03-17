package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: gsj */
/* loaded from: classes.dex */
public final class gsj implements rgg {
    private final rhd a;

    private gsj(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gsj a(rhd rhdVar) {
        return new gsj(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (ViewfinderJankSession) rgk.a((ViewfinderJankSession) ((jbi) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}