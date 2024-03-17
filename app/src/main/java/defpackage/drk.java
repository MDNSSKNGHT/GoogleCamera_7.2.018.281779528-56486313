package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: drk  reason: default package */
/* loaded from: classes.dex */
public final class drk {
    public final ByteBuffer a;
    public final int b;
    public final int c;

    public drk(ByteBuffer byteBuffer, int i, int i2) {
        this.a = byteBuffer.duplicate();
        this.b = i;
        this.c = i2;
    }
}