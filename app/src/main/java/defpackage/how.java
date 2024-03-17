package defpackage;

import com.google.googlex.gcam.hdrplus.MetadataConverter;

/* compiled from: PG */
/* renamed from: how */
/* loaded from: classes.dex */
public final class how implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private how(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static how a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new how(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new hov((cin) this.a.get(), (MetadataConverter) this.b.get(), ((ggz) this.c).a());
    }
}