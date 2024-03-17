package com.google.googlex.gcam;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BufferUtils {
    private BufferUtils() {
    }

    private static native ByteBuffer byteBufferViewOfNativePointerImpl(long j, int i);

    private static native long getDirectBufferAddressImpl(Buffer buffer);

    private static native long getDirectBufferCapacityImpl(Buffer buffer);

    public static ByteBuffer byteBufferViewOfNativePointer(long j, int i) {
        qdu.a(j != 0, "ptr must not be 0.");
        qdu.a(i > 0, "capacity must be positive, got: %s", i);
        return byteBufferViewOfNativePointerImpl(j, i).order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer copy(ByteBuffer byteBuffer) {
        return copy(byteBuffer, byteBuffer.isDirect());
    }

    public static ByteBuffer copy(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer allocate;
        if (!z) {
            allocate = ByteBuffer.allocate(byteBuffer.capacity());
        } else {
            allocate = ByteBuffer.allocateDirect(byteBuffer.capacity());
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        asReadOnlyBuffer.clear();
        allocate.put(asReadOnlyBuffer);
        allocate.position(byteBuffer.position());
        allocate.limit(byteBuffer.limit());
        allocate.order(byteBuffer.order());
        return allocate;
    }

    public static long getDirectBufferAddress(Buffer buffer) {
        qdu.d(buffer);
        return getDirectBufferAddressImpl(buffer);
    }

    public static long getDirectBufferCapacity(Buffer buffer) {
        qdu.d(buffer);
        return getDirectBufferCapacityImpl(buffer);
    }
}
