package defpackage;

import android.util.DisplayMetrics;

/* compiled from: PG */
/* renamed from: epg  reason: default package */
/* loaded from: classes.dex */
public final class epg implements rgg {
    private final epc a;

    public epg(epc epcVar) {
        this.a = epcVar;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (DisplayMetrics) rgk.a(this.a.d, "Cannot return null from a non-@Nullable @Provides method");
    }
}
