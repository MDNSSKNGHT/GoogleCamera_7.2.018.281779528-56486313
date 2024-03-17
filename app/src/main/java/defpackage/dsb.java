package defpackage;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.PlanarRawImageCallback;
import com.google.googlex.gcam.SWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t;

/* compiled from: PG */
/* renamed from: dsb  reason: default package */
/* loaded from: classes.dex */
final class dsb extends PlanarRawImageCallback {
    private final /* synthetic */ dss a;
    private final /* synthetic */ dse b;

    public dsb(dse dseVar, dss dssVar) {
        this.b = dseVar;
        this.a = dssVar;
    }

    @Override // com.google.googlex.gcam.PlanarRawImageCallback
    public final void ImageReady(int i, ExifMetadata exifMetadata, SWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t) {
        String str = dse.a;
        fpp.a("Gcam merged RAW data ready: shotId = %d", Integer.valueOf(i));
        liu.b(str);
        qdu.d(this.b.u == 1);
        qdu.b(this.a.n().a(), "Got merged RAW callback but no callback present");
        ((dsq) this.a.m().b()).a(this.b);
    }
}
