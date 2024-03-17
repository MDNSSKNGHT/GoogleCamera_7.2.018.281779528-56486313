package defpackage;

import com.google.googlex.gcam.Gcam;

/* compiled from: PG */
/* renamed from: drs */
/* loaded from: classes.dex */
public final class drs implements rgg {
    private final rhd a;

    private drs(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static drs a(rhd rhdVar) {
        return new drs(rhdVar);
    }

    public final drq a() {
        return new drq((Gcam) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}