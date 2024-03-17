package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: off  reason: default package */
/* loaded from: classes.dex */
public interface off extends AutoCloseable {
    void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    @Override // java.lang.AutoCloseable
    void close();
}