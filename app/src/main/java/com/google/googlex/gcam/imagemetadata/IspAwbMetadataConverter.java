package com.google.googlex.gcam.imagemetadata;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.IspAwbMetadata;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import com.google.googlex.gcam.Uint8Vector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IspAwbMetadataConverter {
    private IspAwbMetadataConverter() {
    }

    public static IspAwbMetadata deserializeFromAwbBgStatVendorTag(byte[] bArr) {
        ByteBuffer order = ByteBuffer.allocateDirect(bArr.length).order(ByteOrder.nativeOrder());
        order.put(bArr);
        return GcamModule.DeserializeFromBytes(new SWIGTYPE_p_unsigned_char(BufferUtils.getDirectBufferAddress(order), false), order.capacity());
    }

    public static byte[] serializeToByteArray(IspAwbMetadata ispAwbMetadata) {
        Uint8Vector SerializeToBytes = ispAwbMetadata.SerializeToBytes();
        byte[] bArr = new byte[(int) SerializeToBytes.size()];
        for (int i = 0; i < SerializeToBytes.size(); i++) {
            bArr[i] = (byte) SerializeToBytes.get(i);
        }
        return bArr;
    }
}
