package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageUtils {
    private ImageUtils() {
    }

    private static native boolean copyContentsImpl(long j, long j2);

    private static native boolean simpleRgbToAnyRgbImpl(long j, int i, long j2);

    public static boolean copyContents(InterleavedReadViewU8 interleavedReadViewU8, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long cPtr = InterleavedReadViewU8.getCPtr(interleavedReadViewU8);
        long cPtr2 = InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8);
        qdu.a(cPtr != 0, "src is null");
        qdu.a(cPtr2 != 0, "dst is null");
        return copyContentsImpl(cPtr, cPtr2);
    }

    public static boolean simpleRgbToAnyRgb(InterleavedReadViewU8 interleavedReadViewU8, int i, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long cPtr = InterleavedReadViewU8.getCPtr(interleavedReadViewU8);
        long cPtr2 = InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8);
        qdu.a(cPtr != 0, "src is null");
        qdu.a(cPtr2 != 0, "dst is null");
        return simpleRgbToAnyRgbImpl(cPtr, i, cPtr2);
    }
}
