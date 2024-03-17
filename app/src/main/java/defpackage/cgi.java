package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: cgi  reason: default package */
/* loaded from: classes.dex */
public final class cgi implements rgg {
    private final rhd a;

    private cgi(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static cgi a(rhd rhdVar) {
        return new cgi(rhdVar);
    }

    public final cgh a() {
        return new cgh((AudioManager) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}