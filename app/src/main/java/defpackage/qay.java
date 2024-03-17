package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: qay  reason: default package */
/* loaded from: classes.dex */
abstract class qay extends qax {
    private final ByteBuffer a;

    public qay() {
        qdu.c(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    protected abstract void a(ByteBuffer byteBuffer);

    protected abstract qba b();

    protected void b(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.qbc
    public final qba a() {
        d();
        this.a.flip();
        if (this.a.remaining() > 0) {
            b(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }

    private final void d() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            a(this.a);
        }
        this.a.compact();
    }

    private final void c() {
        if (this.a.remaining() < 8) {
            d();
        }
    }

    @Override // defpackage.qax
    public final void a(char c) {
        this.a.putChar(c);
        c();
    }

    @Override // defpackage.qax, defpackage.qbc
    public final qbc a(int i) {
        this.a.putInt(i);
        c();
        return this;
    }
}
