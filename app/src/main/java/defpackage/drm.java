package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: drm  reason: default package */
/* loaded from: classes.dex */
public final class drm {
    private final mkg a;
    private final knz b;

    public drm(knz knzVar, mkg mkgVar) {
        this.b = knzVar;
        this.a = mkgVar.a("JpegCompressSaving");
    }

    public final void a(gnq gnqVar, mba mbaVar, pkx pkxVar, byte[] bArr, mjs mjsVar, int i, ExifInterface exifInterface) {
        izh a = gnqVar.b.a();
        int length = bArr.length;
        a.a(length);
        if (!gnqVar.a.i) {
            gnqVar.d.a(new gns(bArr, mjsVar, i, exifInterface, this.b));
            gnqVar.d.close();
            mbaVar.close();
            return;
        }
        giu giuVar = (giu) qdu.d(((dnw) pkxVar).b());
        String str = giv.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Called addJpegImage with file size ");
        sb.append(length);
        sb.toString();
        liu.d(str);
        jcc jccVar = new jcc(mjsVar, nef.JPEG);
        jccVar.a(giuVar.a.g);
        jccVar.a(mjo.a(i));
        jccVar.a(exifInterface);
        giuVar.a.a(new ByteArrayInputStream(bArr), jccVar);
        mbaVar.close();
    }

    public final void a(gnq gnqVar, pkx pkxVar, mba mbaVar, int i, int i2, byte[] bArr) {
        int i3 = gnqVar.a.d;
        try {
            ExifInterface exifInterface = new ExifInterface();
            exifInterface.a(bArr);
            mmo a = mmo.a(exifInterface);
            if (i3 >= 0) {
                mmu a2 = exifInterface.a(ExifInterface.Q, "M");
                mmu a3 = exifInterface.a(ExifInterface.R, new mjp(i3, 1L));
                exifInterface.a(a2);
                exifInterface.a(a3);
            }
            byte[] bArr2 = gnqVar.a.f;
            if (bArr2.length > 0) {
                exifInterface.a(exifInterface.a(ExifInterface.c, new String(bArr2)));
            }
            a(gnqVar, mbaVar, pkxVar, bArr, mjs.a(i, i2), mmo.a(a).e, (ExifInterface) qdu.d(exifInterface));
        } catch (/*IO*/Exception e) {
            this.a.c("Could not read exif from gcam jpeg", e);
            throw new IllegalStateException("Could not read exif from gcam jpeg", e);
        }
    }
}