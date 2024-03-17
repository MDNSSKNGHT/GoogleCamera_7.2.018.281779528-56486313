package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: koq  reason: default package */
/* loaded from: classes.dex */
public final class koq {
    private final cin a;
    private final mdl b;
    private final koo c;

    public koq(mdl mdlVar, cin cinVar, koo kooVar) {
        this.a = cinVar;
        this.b = mdlVar;
        this.c = kooVar;
    }

    public static final boolean a(mjo mjoVar) {
        return mjoVar == mjo.CLOCKWISE_90 || mjoVar == mjo.CLOCKWISE_270;
    }

    public final Bitmap a(Bitmap bitmap, int i, mzg mzgVar) {
        return a(bitmap, i, mzgVar, true);
    }

    private final Bitmap a(Bitmap bitmap, int i, mzg mzgVar, boolean z) {
        if (bitmap == null || !a(mzgVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        long currentTimeMillis = System.currentTimeMillis();
        if (i != mjo.CLOCKWISE_90.e && i != mjo.CLOCKWISE_270.e) {
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.postScale(1.0f, -1.0f);
        }
        if (z) {
            matrix.postRotate(i);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        koo kooVar = this.c;
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(81);
        sb.append("Perfs_flipBitmap: ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        sb.append(" Rotation: ");
        sb.append(i);
        sb.append(" ApplyRotation: ");
        sb.append(z);
        sb.toString();
        kooVar.a();
        return createBitmap;
    }

    public final void a(neb nebVar, mjo mjoVar) {
        qdu.d(nebVar);
        qdu.c(nebVar.b() == 35);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = a(mjoVar);
        ByteBuffer buffer = ((nea) nebVar.e().get(0)).getBuffer();
        int rowStride = ((nea) nebVar.e().get(0)).getRowStride();
        ByteBuffer buffer2 = ((nea) nebVar.e().get(1)).getBuffer();
        int rowStride2 = ((nea) nebVar.e().get(1)).getRowStride();
        ByteBuffer buffer3 = ((nea) nebVar.e().get(2)).getBuffer();
        int rowStride3 = ((nea) nebVar.e().get(2)).getRowStride();
        //FrameUtilNative.mirrorYUV420888(buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, nebVar.c(), nebVar.d(), a);
        koo kooVar = this.c;
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(62);
        sb.append("Perfs_flipImage_in_place: ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        sb.append(" Portrait: ");
        sb.append(a);
        sb.toString();
        kooVar.a();
    }

    public final void a(neb nebVar, neb nebVar2, mjo mjoVar) {
        qdu.d(nebVar);
        qdu.d(nebVar2);
        qdu.c(nebVar.b() == 35);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = a(mjoVar);
        //mxx mxxVar = (mxx) nebVar2;
        //FrameUtilNative.mirrorYUV420888(((nea) nebVar.e().get(0)).getBuffer(), ((nea) nebVar.e().get(0)).getRowStride(), ((nea) nebVar.e().get(1)).getBuffer(), ((nea) nebVar.e().get(1)).getRowStride(), ((nea) nebVar.e().get(2)).getBuffer(), ((nea) nebVar.e().get(2)).getRowStride(), ((nea) mxxVar.i().get(0)).getBuffer(), ((nea) mxxVar.i().get(0)).getRowStride(), ((nea) mxxVar.i().get(1)).getBuffer(), ((nea) mxxVar.i().get(1)).getRowStride(), ((nea) mxxVar.i().get(2)).getBuffer(), ((nea) mxxVar.i().get(2)).getRowStride(), nebVar.c(), nebVar.d(), a);
        koo kooVar = this.c;
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(53);
        sb.append("Perfs_flipImage: ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        sb.append(" Portrait: ");
        sb.append(a);
        sb.toString();
        kooVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.libraries.camera.exif.ExifInterface r5, defpackage.mzg r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.a(r6)
            if (r0 == 0) goto L5e
            mmj r0 = r5.W
            boolean r0 = r0.a()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            mmj r0 = r5.W
            r0.c()
        L15:
            r0 = r2
            goto L25
        L17:
            mmj r0 = r5.W
            byte[] r0 = r0.b
            if (r0 == 0) goto L23
            int r3 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r3)
            goto L25
        L23:
            goto L15
        L25:
            if (r0 == 0) goto L52
            java.lang.Object r0 = defpackage.qdu.d(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r6 = r4.a(r0, r7, r6, r1)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = 90
            boolean r6 = r6.compress(r0, r1, r7)
            if (r6 == 0) goto L51
            byte[] r6 = r7.toByteArray()
            mmj r7 = r5.W
            r7.b = r2
            java.util.ArrayList r7 = r7.c
            r7.clear()
            mmj r5 = r5.W
            r5.b = r6
        L51:
            return
        L52:
            boolean r5 = defpackage.koo.b
            if (r5 == 0) goto L5d
            java.lang.String r5 = defpackage.koo.a
            java.lang.String r6 = "Couldn't extract thumbnail from exifInterface. Not attempting to flip it."
            defpackage.liu.a(r5, r6)
        L5d:
            return
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koq.a(com.google.android.libraries.camera.exif.ExifInterface, mzg, int):void");
    }

    public final boolean a(mzg mzgVar) {
        if (!this.a.c(cit.al)) {
            this.b.a(false);
        }
        return ((Boolean) this.b.a()).booleanValue() && mzgVar.equals(mzg.FRONT);
    }
}