package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Set;

/* compiled from: PG */
/* renamed from: osu  reason: default package */
/* loaded from: classes.dex */
public class osu {
    public osu() {
    }

    public void a(long j, int i) {
    }

    public void a(long j, int i, long j2) {
    }

    public void a(long j, Set set) {
    }

    public void a(mnl mnlVar) {
    }

    public void a(mos mosVar, long j) {
    }

    public void a(ndk ndkVar) {
    }

    public void a(ndn ndnVar) {
    }

    public void a(ndr ndrVar) {
    }

    public void b(long j, int i) {
    }

    public osu(byte b) {
    }

    public static void a(mnq mnqVar, mog mogVar) {
        mnh b = mnqVar.b();
        if (b != null) {
            b.a(new mob(mogVar, b));
        }
    }

    public static void c(mnh mnhVar) throws InterruptedException {
        if (mnhVar.d() || mnhVar.g()) {
            return;
        }
        moe moeVar = new moe();
        mnhVar.a(moeVar);
        moeVar.e();
    }

    public static void a(mnh mnhVar) throws InterruptedException {
        if (mnhVar.d() || mnhVar.f() || mnhVar.g()) {
            return;
        }
        moc mocVar = new moc();
        mnhVar.a(mocVar);
        mocVar.e();
    }

    public static void b(mnh mnhVar) throws InterruptedException {
        if (mnhVar.d() || mnhVar.e() || mnhVar.g()) {
            return;
        }
        mod modVar = new mod();
        mnhVar.a(modVar);
        modVar.e();
    }

    public static float[] a(float f, float f2) {
        float[] fArr = new float[8];
        float f3 = 1.0f - f;
        int i = 0;
        int i2 = 0;
        while (i <= 0.0f) {
            float f4 = f;
            int i3 = i2;
            int i4 = 0;
            while (i4 <= 1) {
                int i5 = i3 + 1;
                fArr[i3] = f4;
                int i6 = i5 + 1;
                fArr[i5] = 1.0f;
                int i7 = i6 + 1;
                fArr[i6] = f4;
                i3 = i7 + 1;
                fArr[i7] = f2;
                i4++;
                f4 += f3;
            }
            i++;
            i2 = i3;
        }
        return fArr;
    }

    public static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }
}