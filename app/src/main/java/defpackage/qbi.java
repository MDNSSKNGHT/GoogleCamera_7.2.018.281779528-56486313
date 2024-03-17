package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: qbi  reason: default package */
/* loaded from: classes.dex */
final class qbi extends qay {
    private long a;
    private long b;
    private int c = 0;

    public qbi(int i) {
        long j = i;
        this.a = j;
        this.b = j;
    }

    private static long a(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    @Override // defpackage.qay
    public final qba b() {
        long j = this.a;
        long j2 = this.c;
        long j3 = this.b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.a = j4;
        this.b = j3 + j4;
        this.a = a(j4);
        long a = a(this.b);
        long j5 = this.a + a;
        this.a = j5;
        this.b = a + j5;
        return qba.a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
    }

    private static long b(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long c(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.qay
    protected final void a(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long b = b(j) ^ this.a;
        this.a = b;
        long rotateLeft = Long.rotateLeft(b, 27);
        long j3 = this.b;
        this.a = ((rotateLeft + j3) * 5) + 1390208809;
        long c = c(j2) ^ j3;
        this.b = c;
        this.b = ((Long.rotateLeft(c, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qay
    protected final void b(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.c += byteBuffer.remaining();
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j2 = 0;
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 2:
                j3 = 0;
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 3:
                j4 = 0;
                j3 = j4 ^ (rgk.a(byteBuffer.get(2)) << 16);
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 4:
                j5 = 0;
                j4 = j5 ^ (rgk.a(byteBuffer.get(3)) << 24);
                j3 = j4 ^ (rgk.a(byteBuffer.get(2)) << 16);
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 5:
                j6 = 0;
                j5 = j6 ^ (rgk.a(byteBuffer.get(4)) << 32);
                j4 = j5 ^ (rgk.a(byteBuffer.get(3)) << 24);
                j3 = j4 ^ (rgk.a(byteBuffer.get(2)) << 16);
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 6:
                j7 = 0;
                j6 = (rgk.a(byteBuffer.get(5)) << 40) ^ j7;
                j5 = j6 ^ (rgk.a(byteBuffer.get(4)) << 32);
                j4 = j5 ^ (rgk.a(byteBuffer.get(3)) << 24);
                j3 = j4 ^ (rgk.a(byteBuffer.get(2)) << 16);
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 7:
                j7 = rgk.a(byteBuffer.get(6)) << 48;
                j6 = (rgk.a(byteBuffer.get(5)) << 40) ^ j7;
                j5 = j6 ^ (rgk.a(byteBuffer.get(4)) << 32);
                j4 = j5 ^ (rgk.a(byteBuffer.get(3)) << 24);
                j3 = j4 ^ (rgk.a(byteBuffer.get(2)) << 16);
                j2 = j3 ^ (rgk.a(byteBuffer.get(1)) << 8);
                j = j2 ^ rgk.a(byteBuffer.get(0));
                break;
            case 8:
                j = byteBuffer.getLong();
                break;
            case 9:
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 10:
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 11:
                j8 ^= rgk.a(byteBuffer.get(10)) << 16;
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 12:
                j8 ^= rgk.a(byteBuffer.get(11)) << 24;
                j8 ^= rgk.a(byteBuffer.get(10)) << 16;
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 13:
                j8 ^= rgk.a(byteBuffer.get(12)) << 32;
                j8 ^= rgk.a(byteBuffer.get(11)) << 24;
                j8 ^= rgk.a(byteBuffer.get(10)) << 16;
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 14:
                j8 ^= rgk.a(byteBuffer.get(13)) << 40;
                j8 ^= rgk.a(byteBuffer.get(12)) << 32;
                j8 ^= rgk.a(byteBuffer.get(11)) << 24;
                j8 ^= rgk.a(byteBuffer.get(10)) << 16;
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            case 15:
                j8 = rgk.a(byteBuffer.get(14)) << 48;
                j8 ^= rgk.a(byteBuffer.get(13)) << 40;
                j8 ^= rgk.a(byteBuffer.get(12)) << 32;
                j8 ^= rgk.a(byteBuffer.get(11)) << 24;
                j8 ^= rgk.a(byteBuffer.get(10)) << 16;
                j8 ^= rgk.a(byteBuffer.get(9)) << 8;
                j8 ^= rgk.a(byteBuffer.get(8));
                j = byteBuffer.getLong();
                break;
            default:
                throw new AssertionError("Should never get here.");
        }
        this.a = b(j) ^ this.a;
        this.b ^= c(j8);
    }
}
