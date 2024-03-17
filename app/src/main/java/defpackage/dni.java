package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: dni  reason: default package */
/* loaded from: classes.dex */
public final class dni {
    public final ByteBuffer a;
    public final int b;
    public final int c;

    public dni(ByteBuffer byteBuffer, int i, int i2) {
        this.a = byteBuffer.duplicate();
        this.b = i;
        this.c = i2;
    }
}
