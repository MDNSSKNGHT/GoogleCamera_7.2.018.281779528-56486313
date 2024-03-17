package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.clientallocator.UniqueBitmapClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueHardwareBufferInterleavedU8ClientAllocator;

/* compiled from: PG */
/* renamed from: drz  reason: default package */
/* loaded from: classes.dex */
final class drz extends PostviewCallback {
    private final /* synthetic */ dss a;
    private final /* synthetic */ dse b;

    public drz(dse dseVar, dss dssVar) {
        this.b = dseVar;
        this.a = dssVar;
    }

    @Override // com.google.googlex.gcam.PostviewCallback
    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, ExifMetadata exifMetadata, int i2) {
        String str = dse.a;
        fpp.a("Got RGB postview (shotId = %d, pixelFormat = %s)", Integer.valueOf(i), Integer.valueOf(i2));
        liu.b(str);
        qdu.d(this.b.u == 1);
        qdu.c(i != GcamModule.getKInvalidShotId());
        qdu.d(interleavedReadViewU8);
        ExifMetadata exifMetadata2 = new ExifMetadata(exifMetadata);
        if (this.a.c().a()) {
            pjz bitmap = ((UniqueBitmapClientAllocator) this.b.m).getBitmap();
            qdu.d(bitmap.a());
            ((dsg) this.a.c().b()).a(this.b, (Bitmap) bitmap.b(), exifMetadata2);
        } else if (this.a.e().a()) {
            UniqueHardwareBufferInterleavedU8ClientAllocator uniqueHardwareBufferInterleavedU8ClientAllocator = (UniqueHardwareBufferInterleavedU8ClientAllocator) this.b.m;
            qdu.d(uniqueHardwareBufferInterleavedU8ClientAllocator.getHardwareBuffer().a());
            ((dsj) this.a.e().b()).a((HardwareBuffer) uniqueHardwareBufferInterleavedU8ClientAllocator.getHardwareBuffer().b(), exifMetadata2);
        }
    }

    @Override // com.google.googlex.gcam.PostviewCallback
    public final void YuvReady(int i, YuvReadView yuvReadView, ExifMetadata exifMetadata, int i2) {
        String str = dse.a;
        fpp.a("Got YUV postview (shotId = %d, pixelFormat = %s)", Integer.valueOf(i), Integer.valueOf(i2));
        liu.b(str);
        qdu.d(this.b.u == 1);
        qdu.c(i != GcamModule.getKInvalidShotId());
        qdu.d(yuvReadView);
        ExifMetadata exifMetadata2 = new ExifMetadata(exifMetadata);
        pjz image = this.b.n.getImage();
        qdu.d(image.a());
        YuvImage yuvImage = (YuvImage) image.b();
        if (this.a.d().a()) {
            ((dsr) this.a.d().b()).a(yuvImage, exifMetadata2);
        }
    }
}