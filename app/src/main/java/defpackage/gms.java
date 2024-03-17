package defpackage;

/* compiled from: PG */
/* renamed from: gms  reason: default package */
/* loaded from: classes.dex */
public final class gms implements rgg {
    private final rhd a;

    private gms(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gms a(rhd rhdVar) {
        return new gms(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gmr((mjw) this.a.get());
    }
}