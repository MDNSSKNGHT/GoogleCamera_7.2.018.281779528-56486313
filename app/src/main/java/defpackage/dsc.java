package defpackage;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.RawImage;
import com.google.googlex.gcam.RawImageCallback;
import com.google.googlex.gcam.RawReadView;

/* compiled from: PG */
/* renamed from: dsc  reason: default package */
/* loaded from: classes.dex */
final class dsc extends RawImageCallback {
    private final /* synthetic */ dss a;
    private final /* synthetic */ dse b;

    public dsc(dse dseVar, dss dssVar) {
        this.b = dseVar;
        this.a = dssVar;
    }

    @Override // com.google.googlex.gcam.RawImageCallback
    public final void ImageReady(int i, ExifMetadata exifMetadata, RawReadView rawReadView) {
        qdu.d(this.b.u == 1);
        qdu.b(this.a.g().a(), "Got merged RAW callback but no callback present");
        pjz image = this.b.q.getImage();
        qdu.b(image.a(), "RawImageCallback::ImageReady() was invoked but corresponding client allocator's image is absent.");
        String str = dse.a;
        fpp.a("Gcam merged RAW data ready: shotId = %d", Integer.valueOf(i));
        liu.b(str);
        ((dso) this.a.g().b()).a((RawImage) image.b(), new ExifMetadata(exifMetadata));
    }

    @Override // com.google.googlex.gcam.RawImageCallback
    public final void MergeRawFailed(int i) {
        qdu.d(this.b.u == 1);
        qdu.b(this.a.g().a(), "Got Raw with no callback present");
        ((dso) this.a.g().b()).a(new dsk(fpp.a("MergeRaw failed (shotId = %d)", Integer.valueOf(i))));
    }
}
