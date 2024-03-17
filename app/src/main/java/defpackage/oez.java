package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: oez  reason: default package */
/* loaded from: classes.dex */
public final class oez {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;

    public oez(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = byteBuffer;
        this.b = bufferInfo;
    }

    public static oez a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(bufferInfo.offset);
        duplicate.limit(bufferInfo.size + bufferInfo.offset);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        allocateDirect.put(duplicate);
        allocateDirect.rewind();
        return new oez(allocateDirect, bufferInfo2);
    }
}