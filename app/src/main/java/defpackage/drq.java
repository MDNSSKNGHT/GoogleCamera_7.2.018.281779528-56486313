package defpackage;

import com.google.googlex.gcam.Gcam;

/* compiled from: PG */
/* renamed from: drq  reason: default package */
/* loaded from: classes.dex */
public final class drq {
    private final Gcam a;

    public drq(Gcam gcam) {
        this.a = gcam;
    }

    public final drr a(ndr ndrVar, int i) {
        return new drr(this.a.GetTuning(i), ndrVar);
    }
}