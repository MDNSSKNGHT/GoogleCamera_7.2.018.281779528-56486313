package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dpy  reason: default package */
/* loaded from: classes.dex */
public final class dpy implements rgg {
    private final rhd a;

    private dpy(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dpy a(rhd rhdVar) {
        return new dpy(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new dpx((Set) this.a.get());
    }
}