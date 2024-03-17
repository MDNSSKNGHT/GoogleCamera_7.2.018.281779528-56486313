package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: rgm */
/* loaded from: classes2.dex */
public final class rgm {
    private final List a;
    private final List b;

    public /* synthetic */ rgm(int i, int i2) {
        this.a = rgk.a(i);
        this.b = rgk.a(i2);
    }

    public final void a(rhd rhdVar) {
        this.b.add(rhdVar);
    }

    public final void b(rhd rhdVar) {
        this.a.add(rhdVar);
    }

    public final rgn a() {
        return new rgn(this.a, this.b);
    }
}