package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: iae  reason: default package */
/* loaded from: classes.dex */
public final class iae extends iaj {
    @Override // defpackage.iaj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ByteBuffer.allocateDirect(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iaj
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.rewind();
        byteBuffer.limit(byteBuffer.capacity());
        return byteBuffer;
    }
}