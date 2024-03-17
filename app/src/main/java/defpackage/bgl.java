package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* renamed from: bgl  reason: default package */
/* loaded from: classes.dex */
public final class bgl {
    public final int a;
    public final boolean b;
    private final ncs c;

    public bgl(ncs ncsVar, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = ncsVar;
    }

    public static int a(int i, int i2, boolean z) {
        if (z) {
            i2 = (360 - i2) % 360;
        }
        return (i + i2) % 360;
    }

    public bgl(ncs ncsVar, myo myoVar) {
        this(ncsVar, myoVar.d(), myoVar.N() == mzg.FRONT);
    }

    public final mjo a() {
        return mjo.a(a(this.a, this.c.a().e, this.b));
    }

    public static int a(int i, myo myoVar) {
        if (i != -1) {
            Integer num = (Integer) myoVar.a(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) myoVar.a(CameraCharacteristics.SENSOR_ORIENTATION);
            if (num != null && num2 != null) {
                return a(num2.intValue(), i, num.intValue() == 0);
            }
        }
        return 0;
    }

    public final mcs b() {
        return mdg.a(new gwe(this.c), new bgk(this));
    }
}
