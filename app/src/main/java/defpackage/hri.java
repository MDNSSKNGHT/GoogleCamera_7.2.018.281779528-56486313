package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: hri  reason: default package */
/* loaded from: classes.dex */
public final class hri implements rgg {
    private final rhd a;

    private hri(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static hri a(rhd rhdVar) {
        return new hri(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new hrg((Map) this.a.get());
    }
}