package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HdrPlusInterface {
    public static final AtomicBoolean nativeInitialized = new AtomicBoolean();

    private static native void init();

    private native void setJpegCallbackNative(long j, EncodedBlobCallback encodedBlobCallback);

    private native void setMergedDngCallbackNative(long j, EncodedBlobCallback encodedBlobCallback);

    public native void addViewfinderFrame(long j, int i, long j2, long j3, long j4, long j5, Runnable runnable);

    public native void setBaseFrameCallback(long j, BaseFrameCallback baseFrameCallback);

    public native void setFinishQueueEmptyCallback(long j, Runnable runnable);

    public native void setMemoryStateCallback(long j, MemoryStateCallback memoryStateCallback);

    public native void setProgressCallback(long j, IntFloatConsumer intFloatConsumer);

    public HdrPlusInterface() {
        if (nativeInitialized.compareAndSet(false, true)) {
            init();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void lambda$wrapWithCopyOfDataBuffer$0$HdrPlusInterface(EncodedBlobCallback encodedBlobCallback, boolean z, int i, ByteBuffer byteBuffer, int i2, int i3) {
        encodedBlobCallback.onDataAvailable(i, BufferUtils.copy(byteBuffer, z), i2, i3);
    }

    public void setJpegCallback(long j, boolean z, EncodedBlobCallback encodedBlobCallback) {
        setJpegCallbackNative(j, wrapWithCopyOfDataBuffer(encodedBlobCallback, z));
    }

    public void setMergedDngCallback(long j, boolean z, EncodedBlobCallback encodedBlobCallback) {
        setMergedDngCallbackNative(j, wrapWithCopyOfDataBuffer(encodedBlobCallback, z));
    }

    private static EncodedBlobCallback wrapWithCopyOfDataBuffer(EncodedBlobCallback encodedBlobCallback, boolean z) {
        return new HdrPlusInterface$$Lambda$0(encodedBlobCallback, z);
    }
}
