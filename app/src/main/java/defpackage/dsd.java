package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.clientallocator.UniqueHardwareBufferInterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.UniqueInterleavedU8ClientAllocator;

/* compiled from: PG */
/* renamed from: dsd  reason: default package */
/* loaded from: classes.dex */
final class dsd extends FinalImageCallback {
    private final /* synthetic */ dss a;
    private final /* synthetic */ dse b;

    public dsd(dse dseVar, dss dssVar) {
        this.b = dseVar;
        this.a = dssVar;
    }

    @Override // com.google.googlex.gcam.FinalImageCallback
    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, ExifMetadata exifMetadata, int i2) {
        String str = dse.a;
        boolean z = true;
        fpp.a("RGB image ready. shotId = %d, resolution = %d x %d", Integer.valueOf(i), Integer.valueOf(interleavedReadViewU8.width()), Integer.valueOf(interleavedReadViewU8.height()));
        liu.b(str);
        qdu.d(this.b.u == 1);
        qdu.a(i2 == 3 || i2 == 5, "RgbReady only supports GcamPixelFormat.kRgb and GcamPixelFormat.kRgba.");
        if (!this.a.j().a() && !this.a.k().a()) {
            z = false;
        }
        qdu.b(z, "Got RGB image and no callback present");
        ExifMetadata exifMetadata2 = new ExifMetadata(exifMetadata);
        if (this.a.j().a()) {
            UniqueInterleavedU8ClientAllocator uniqueInterleavedU8ClientAllocator = (UniqueInterleavedU8ClientAllocator) this.b.o;
            qdu.d(uniqueInterleavedU8ClientAllocator.getImage().a());
            ((dsp) this.a.j().b()).a((InterleavedWriteViewU8) uniqueInterleavedU8ClientAllocator.getImage().b(), exifMetadata2);
        } else if (this.a.k().a()) {
            UniqueHardwareBufferInterleavedU8ClientAllocator uniqueHardwareBufferInterleavedU8ClientAllocator = (UniqueHardwareBufferInterleavedU8ClientAllocator) this.b.o;
            qdu.d(uniqueHardwareBufferInterleavedU8ClientAllocator.getHardwareBuffer().a());
            ((dsj) this.a.k().b()).a((HardwareBuffer) uniqueHardwareBufferInterleavedU8ClientAllocator.getHardwareBuffer().b(), exifMetadata2);
        }
    }

    @Override // com.google.googlex.gcam.FinalImageCallback
    public final void YuvReady(int i, YuvReadView yuvReadView, ExifMetadata exifMetadata, int i2) {
        qdu.d(this.b.u == 1);
        qdu.d(this.b.p.getImage().a());
        qdu.b(this.a.i().a(), "Received YUV frame but no listener present");
        ((dsr) this.a.i().b()).a((YuvWriteView) this.b.p.getImage().b(), new ExifMetadata(exifMetadata));
    }
}
