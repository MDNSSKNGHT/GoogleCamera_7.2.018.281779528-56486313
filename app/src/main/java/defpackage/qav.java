package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: qav  reason: default package */
/* loaded from: classes.dex */
abstract class qav extends qax {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    protected void a(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.qax
    public final void a(char c) {
        this.a.putChar(c);
        b(2);
    }

    @Override // defpackage.qax, defpackage.qbc
    public final qbc a(int i) {
        this.a.putInt(i);
        return b(4);
    }

    private final qbc b(int i) {
        try {
            a(this.a.array(), i);
            return this;
        } finally {
            this.a.clear();
        }
    }
}
