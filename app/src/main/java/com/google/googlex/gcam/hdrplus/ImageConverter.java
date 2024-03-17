package com.google.googlex.gcam.hdrplus;

import android.util.Log;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_short;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageConverter {
    public static final int DEPTH16_NUM_CHANNELS = 1;
    public static final int DEPTH16_PLANE = 0;
    public static final int DEPTH16_PLANE_COUNT = 1;
    public static final int GCAM_YUV_PIXEL_DISTANCE_UV = 1;
    public static final int GCAM_YUV_PIXEL_STRIDE_U = 2;
    public static final int GCAM_YUV_PIXEL_STRIDE_V = 2;
    public static final int IMAGE_FORMAT_RAW_DEPTH = 4098;
    public static final int PD_DEPTH_POINT_CLOUD_HEIGHT1 = 756;
    public static final int PD_DEPTH_POINT_CLOUD_HEIGHT2 = 758;
    public static final int PD_DEPTH_POINT_CLOUD_ROW_PADDING = 0;
    public static final int PD_DEPTH_POINT_CLOUD_WIDTH = 2016;
    public static final int PD_NUM_CHANNELS = 2;
    public static final int PD_PLANE = 0;
    public static final int PD_PLANE_COUNT = 1;
    public static final int RAW10_PIXEL_STRIDE = 0;
    public static final int RAW12_PIXEL_STRIDE = 0;
    public static final int RAW_PLANE = 0;
    public static final int RAW_PLANE_COUNT = 1;
    public static final int RAW_SENSOR_PIXEL_STRIDE = 2;
    public static final int SIZE_OF_UINT16 = 2;
    public static final String TAG = ImageConverter.class.getSimpleName();
    public static final int YUV_420_888_CHROMA_SUBSAMPLE = 2;
    public static final int YUV_420_888_LUMA_SUBSAMPLE = 1;
    public static final int YUV_420_888_PIXEL_STRIDE_Y = 1;
    public static final int YUV_420_888_PLANE_COUNT = 3;
    public static final int YUV_420_888_PLANE_U = 1;
    public static final int YUV_420_888_PLANE_V = 2;
    public static final int YUV_420_888_PLANE_Y = 0;

    public boolean isCompatibleDepth16Format(int i) {
        return i == 1144402265;
    }

    public boolean isCompatiblePdFormat(int i) {
        return i == 257 || i == 4098;
    }

    public boolean isCompatibleRawFormat(int i) {
        return i == 37 || i == 38 || i == 32;
    }

    private static int validateAndConvertToGcamYuvFormat(neb nebVar) {
        int c = nebVar.c();
        int d = nebVar.d();
        boolean z = false;
        qdu.a(c % 2 == 0, "A YUV image must have even width.");
        qdu.a(d % 2 == 0, "A YUV image must have even height.");
        qdu.a(nebVar.b() == 35, "Format is not YUV_420_888");
        List e = nebVar.e();
        qdu.a(e.size() == 3, "A YUV image must have %s planes.", 3);
        nea neaVar = (nea) e.get(0);
        nea neaVar2 = (nea) e.get(1);
        nea neaVar3 = (nea) e.get(2);
        long directBufferAddress = BufferUtils.getDirectBufferAddress(neaVar.getBuffer());
        long directBufferAddress2 = BufferUtils.getDirectBufferAddress(neaVar2.getBuffer());
        long directBufferAddress3 = BufferUtils.getDirectBufferAddress(neaVar3.getBuffer());
        qdu.a(neaVar.getPixelStride() == 1, "Y plane's pixel stride is not 1");
        qdu.a(neaVar.getRowStride() >= nebVar.c(), "Y plane's row stride smaller than image width");
        qdu.a(neaVar2.getRowStride() >= nebVar.c(), "U plane's row stride smaller than image width");
        qdu.a(neaVar2.getRowStride() == neaVar3.getRowStride(), "U and V planes have different row strides");
        qdu.a(directBufferAddress != 0, "luma plane address cannot be 0 (NULL).");
        qdu.a(directBufferAddress2 != 0, "chroma U plane address cannot be 0 (NULL).");
        qdu.a(directBufferAddress3 != 0, "chroma V plane address cannot be 0 (NULL).");
        if (neaVar2.getPixelStride() == 2 && neaVar3.getPixelStride() == 2 && Math.abs(directBufferAddress2 - directBufferAddress3) == 1) {
            z = true;
        }
        qdu.a(z, "UV planes not tightly interleaved");
        return directBufferAddress2 < directBufferAddress3 ? 1 : 2;
    }

    public pjz wrapDepth16WriteView(neb nebVar) {
        int b = nebVar.b();
        List e = nebVar.e();
        qdu.a(e.size() == 1, "Should have a single depth plane, has: %s", e.size());
        qdu.a(isCompatibleDepth16Format(b), "Unsupported format: %s", b);
        ByteBuffer buffer = ((nea) e.get(0)).getBuffer();
        int remaining = buffer.remaining();
        int pixelStride = ((nea) e.get(0)).getPixelStride();
        qdu.a(pixelStride == 2, "Pixel stride should be two bytes.");
        int c = nebVar.c();
        int d = nebVar.d();
        int rowStride = ((nea) e.get(0)).getRowStride();
        int i = pixelStride * c;
        qdu.a(rowStride >= i, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i);
        int i2 = rowStride - i;
        qdu.a(remaining == rowStride * d, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(remaining), Integer.valueOf(rowStride), Integer.valueOf(d));
        return pjz.b(new InterleavedWriteViewU16(c, d, 1, new SWIGTYPE_p_unsigned_short(BufferUtils.getDirectBufferAddress(buffer), false), i2));
    }

    public pjz wrapPdWriteView(neb nebVar) {
        int i;
        int i2;
        int i3;
        int b = nebVar.b();
        List e = nebVar.e();
        boolean z = e.size() == 1;
        int size = e.size();
        StringBuilder sb = new StringBuilder(47);
        sb.append("Should have a single PD plane, has: ");
        sb.append(size);
        qdu.a(z, sb.toString());
        boolean isCompatiblePdFormat = isCompatiblePdFormat(b);
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Unsupported PD format: ");
        sb2.append(b);
        qdu.a(isCompatiblePdFormat, sb2.toString());
        ByteBuffer buffer = ((nea) e.get(0)).getBuffer();
        int remaining = buffer.remaining();
        if (b != 257) {
            qdu.a(nebVar.c() % 2 == 0, "Image width should be divisible by the number of channels.");
            int pixelStride = ((nea) e.get(0)).getPixelStride();
            qdu.a(pixelStride == 2, "Pixel stride should be two bytes.");
            int c = nebVar.c() / 2;
            i = nebVar.d();
            int rowStride = ((nea) e.get(0)).getRowStride();
            int i4 = (c + c) * pixelStride;
            boolean z2 = rowStride >= i4;
            StringBuilder sb3 = new StringBuilder(99);
            sb3.append("The row stride (");
            sb3.append(rowStride);
            sb3.append(" bytes) should be greater than or equal to the width (");
            sb3.append(i4);
            sb3.append(" bytes)");
            qdu.a(z2, sb3.toString());
            i2 = rowStride - i4;
            boolean z3 = remaining == rowStride * i;
            StringBuilder sb4 = new StringBuilder(130);
            sb4.append("The buffer capacity (");
            sb4.append(remaining);
            sb4.append(") should be equal to the row stride in bytes (");
            sb4.append(rowStride);
            sb4.append(") multiplied by the height (");
            sb4.append(i);
            sb4.append(").");
            qdu.a(z3, sb4.toString());
            i3 = c;
        } else if (remaining % 8064 != 0) {
            String str = TAG;
            StringBuilder sb5 = new StringBuilder(96);
            sb5.append("The row stride in bytes (8064) should evenly divide the PD buffer capacity (");
            sb5.append(remaining);
            sb5.append(").");
            Log.e(str, sb5.toString());
            return pix.a;
        } else {
            i = remaining / 8064;
            if (i != 756 && i != 758) {
                String str2 = TAG;
                StringBuilder sb6 = new StringBuilder(114);
                sb6.append("The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is ");
                sb6.append(i);
                Log.e(str2, sb6.toString());
                return pix.a;
            }
            i2 = 0;
            i3 = 2016;
        }
        return pjz.b(new InterleavedWriteViewU16(i3, i, 2, new SWIGTYPE_p_unsigned_short(BufferUtils.getDirectBufferAddress(buffer), false), i2));
    }

    public RawWriteView wrapRawWriteView(neb nebVar) {
        int i;
        int i2;
        int c = nebVar.c();
        int d = nebVar.d();
        int b = nebVar.b();
        List e = nebVar.e();
        int pixelStride = ((nea) e.get(0)).getPixelStride();
        int rowStride = ((nea) e.get(0)).getRowStride();
        qdu.a(isCompatibleRawFormat(b), "Should must be a compatible image format.");
        boolean z = c % 2 == 0 && d % 2 == 0;
        StringBuilder sb = new StringBuilder(61);
        sb.append("Should have even dimensions, but was: ");
        sb.append(c);
        sb.append("x");
        sb.append(d);
        qdu.a(z, sb.toString());
        boolean z2 = e.size() == 1;
        int size = e.size();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Should have a single RAW_SENSOR plane, has: ");
        sb2.append(size);
        qdu.a(z2, sb2.toString());
        boolean z3 = (b == 32 || b == 37) ? true : b == 38;
        StringBuilder sb3 = new StringBuilder(35);
        sb3.append("Unsupported raw format: ");
        sb3.append(b);
        qdu.a(z3, sb3.toString());
        if (b == 32) {
            boolean z4 = pixelStride == 2;
            StringBuilder sb4 = new StringBuilder(47);
            sb4.append("Unexpected RAW_SENSOR pixel stride: ");
            sb4.append(pixelStride);
            qdu.a(z4, sb4.toString());
        } else if (b == 37) {
            boolean z5 = c % 4 == 0;
            StringBuilder sb5 = new StringBuilder(76);
            sb5.append("RAW10 image width should be divisible by 4, but was: ");
            sb5.append(c);
            sb5.append("x");
            sb5.append(d);
            qdu.a(z5, sb5.toString());
            boolean z6 = pixelStride == 0;
            StringBuilder sb6 = new StringBuilder(42);
            sb6.append("Unexpected RAW10 pixel stride: ");
            sb6.append(pixelStride);
            qdu.a(z6, sb6.toString());
            int i3 = (c * 5) / 4;
            boolean z7 = rowStride >= i3;
            StringBuilder sb7 = new StringBuilder(58);
            sb7.append("RAW10 row stride ");
            sb7.append(rowStride);
            sb7.append("should be at least ");
            sb7.append(i3);
            qdu.a(z7, sb7.toString());
        } else if (b == 38) {
            boolean z8 = c % 4 == 0;
            StringBuilder sb8 = new StringBuilder(76);
            sb8.append("RAW12 image width should be divisible by 4, but was: ");
            sb8.append(c);
            sb8.append("x");
            sb8.append(d);
            qdu.a(z8, sb8.toString());
            boolean z9 = pixelStride == 0;
            StringBuilder sb9 = new StringBuilder(42);
            sb9.append("Unexpected RAW12 pixel stride: ");
            sb9.append(pixelStride);
            qdu.a(z9, sb9.toString());
            int i4 = (c * 3) / 2;
            boolean z10 = rowStride >= i4;
            StringBuilder sb10 = new StringBuilder(58);
            sb10.append("RAW12 row stride ");
            sb10.append(rowStride);
            sb10.append("should be at least ");
            sb10.append(i4);
            qdu.a(z10, sb10.toString());
        }
        SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char = new SWIGTYPE_p_unsigned_char(BufferUtils.getDirectBufferAddress(((nea) e.get(0)).getBuffer()), false);
        if (b == 37) {
            i = rowStride - ((c * 5) / 4);
            i2 = 0;
        } else if (nebVar.b() == 38) {
            i = rowStride - ((c * 3) / 2);
            i2 = 1;
        } else {
            i = (rowStride / 2) - c;
            i2 = 2;
        }
        return new RawWriteView(c, d, i, i2, sWIGTYPE_p_unsigned_char);
    }

    public YuvWriteView wrapYuvWriteView(neb nebVar) {
        int c = nebVar.c();
        int d = nebVar.d();
        int validateAndConvertToGcamYuvFormat = validateAndConvertToGcamYuvFormat(nebVar);
        List e = nebVar.e();
        SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char = new SWIGTYPE_p_unsigned_char(BufferUtils.getDirectBufferAddress(((nea) e.get(0)).getBuffer()), false);
        int i = validateAndConvertToGcamYuvFormat != 1 ? 2 : 1;
        return new YuvWriteView(c, d, ((nea) e.get(0)).getRowStride(), sWIGTYPE_p_unsigned_char, c / 2, d / 2, ((nea) e.get(i)).getRowStride(), new SWIGTYPE_p_unsigned_char(BufferUtils.getDirectBufferAddress(((nea) e.get(i)).getBuffer()), false), validateAndConvertToGcamYuvFormat);
    }
}
