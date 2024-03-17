package com.google.googlex.gcam.hdrplus;

import java.nio.ByteBuffer;

/* compiled from: PG */
@FunctionalInterface
/* loaded from: classes.dex */
public interface EncodedBlobCallback {
    void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3);
}
