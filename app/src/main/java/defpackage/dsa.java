package defpackage;

import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.PdImageCallback;

/* compiled from: PG */
/* renamed from: dsa  reason: default package */
/* loaded from: classes.dex */
final class dsa extends PdImageCallback {
    private final /* synthetic */ dss a;
    private final /* synthetic */ dse b;

    public dsa(dse dseVar, dss dssVar) {
        this.b = dseVar;
        this.a = dssVar;
    }

    @Override // com.google.googlex.gcam.PdImageCallback
    public final void ImageReady(int i, InterleavedReadViewU16 interleavedReadViewU16) {
        pjz image = this.b.r.getImage();
        qdu.d(this.b.u == 1);
        qdu.b(image.a(), "PdImageCallback::ImageReady() was invoked but corresponding client allocator's image is absent.");
        String str = dse.a;
        fpp.a("Merged PD image ready (shotId = %d)", Integer.valueOf(i));
        liu.b(str);
        qdu.b(this.a.h().a(), "Got PD with no callback present");
        ((dsm) this.a.h().b()).a((InterleavedReadViewU16) image.b());
    }

    @Override // com.google.googlex.gcam.PdImageCallback
    public final void MergePdFailed(int i) {
        String str = dse.a;
        Integer valueOf = Integer.valueOf(i);
        liu.b(str, fpp.a("MergePD failed (shotId = %d)", valueOf));
        qdu.d(this.b.u == 1);
        qdu.b(this.a.h().a(), "Got PD with no callback present");
        new dsk(fpp.a("MergePD failed (shotId = %d)", valueOf));
        ((dsm) this.a.h().b()).a();
    }
}
