package defpackage;

/* compiled from: PG */
/* renamed from: gdn  reason: default package */
/* loaded from: classes.dex */
public final class gdn implements rgg {
    private final rhd a;

    private gdn(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gdn a(rhd rhdVar) {
        return new gdn(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gdm(((Boolean) this.a.get()).booleanValue());
    }
}