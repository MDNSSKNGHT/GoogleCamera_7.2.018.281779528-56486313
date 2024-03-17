package com.google.googlex.gcam.hdrplus;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class HdrPlusInterface$$Lambda$0 implements EncodedBlobCallback {
    public final EncodedBlobCallback arg$1;
    public final boolean arg$2;

    public HdrPlusInterface$$Lambda$0(EncodedBlobCallback encodedBlobCallback, boolean z) {
        this.arg$1 = encodedBlobCallback;
        this.arg$2 = z;
    }

    @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
    public void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3) {
        HdrPlusInterface.lambda$wrapWithCopyOfDataBuffer$0$HdrPlusInterface(this.arg$1, this.arg$2, i, byteBuffer, i2, i3);
    }
}
