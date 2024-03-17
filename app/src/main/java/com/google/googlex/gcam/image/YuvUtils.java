package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class YuvUtils {
    private YuvUtils() {
    }

    private static native boolean rgbToYuvImpl(long j, long j2);

    private static native boolean yuvToRgbImpl(long j, long j2);

    public static boolean rgbToYuv(InterleavedReadViewU8 interleavedReadViewU8, YuvWriteView yuvWriteView) {
        long cPtr = InterleavedReadViewU8.getCPtr(interleavedReadViewU8);
        long cPtr2 = YuvWriteView.getCPtr(yuvWriteView);
        qdu.a(cPtr != 0, "src view is null");
        qdu.a(cPtr2 != 0, "dst view is null");
        return rgbToYuvImpl(cPtr, cPtr2);
    }

    public static boolean yuvToRgb(YuvReadView yuvReadView, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long cPtr = YuvReadView.getCPtr(yuvReadView);
        long cPtr2 = InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8);
        qdu.a(cPtr != 0, "src view is null");
        qdu.a(cPtr2 != 0, "dst view is null");
        return yuvToRgbImpl(cPtr, cPtr2);
    }
}
