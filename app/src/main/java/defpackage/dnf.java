package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dnf  reason: default package */
/* loaded from: classes.dex */
public final class dnf {
    public final eaz a;
    public final boolean b;
    public volatile mjs c;
    public volatile dnd d;
    private final nak e;
    private final ebe f;
    private final myo g;
    private final SizeF h;
    private final mjs i;
    private naj j;
    private boolean k;
    private volatile int l;

    public dnf(nak nakVar, eaz eazVar, ebe ebeVar, myo myoVar, gtb gtbVar) {
        SizeF sizeF = (SizeF) myoVar.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        qdu.c(sizeF, "Camera sensor size cannot be null");
        this.e = nakVar;
        this.a = eazVar;
        this.f = ebeVar;
        this.g = myoVar;
        this.h = sizeF;
        this.b = myoVar.N() == mzg.BACK;
        this.i = gtbVar.a();
        this.d = null;
        this.k = false;
        this.l = 0;
        this.c = new mjs(0, 0);
    }

    public final synchronized boolean a() {
        return this.k;
    }

    public final List a(long j, ibf ibfVar) {
        List list;
        dnd dndVar;
        oar oarVar;
        dnd dndVar2 = this.d;
        int i = 0;
        if (ibfVar == null || dndVar2 == null) {
            if (ibfVar != null) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Gyro transform calculator not valid at : ");
                sb.append(j);
                liu.a("GyroBasedME", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder(51);
                sb2.append("Camera metadata not valid at : ");
                sb2.append(j);
                liu.a("GyroBasedME", sb2.toString());
            }
            ArrayList arrayList = new ArrayList();
            dnd dndVar3 = this.d;
            if (dndVar3 != null) {
                int i2 = dndVar3.b;
                while (i < i2) {
                    arrayList.add(oar.a());
                    i++;
                }
            } else {
                liu.a("GyroBasedME", "Gyro transform calculator not valid.");
            }
            return arrayList;
        }
        a(ibfVar.b + ibfVar.c + ibfVar.d);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j2 = ibfVar.c;
        float f = ibfVar.g;
        float f2 = ibfVar.h;
        float[] a = dndVar2.a(ibfVar.n);
        float a2 = dndVar2.a(f, f2, a);
        long j3 = ibfVar.b;
        long j4 = ibfVar.d;
        long j5 = ibfVar.m;
        long a3 = dndVar2.a(j3, j4, a);
        long a4 = dndVar2.a(j5, j4, a);
        long a5 = dndVar2.a(j4, a);
        int i3 = 0;
        float[] fArr = null;
        while (true) {
            int i4 = dndVar2.b;
            if (i3 >= i4) {
                break;
            }
            long j6 = i4;
            long j7 = (i3 * a5) / j6;
            long j8 = a5 / j6;
            int i5 = i3;
            float[] fArr2 = a;
            long j9 = j2;
            float[] a6 = dndVar2.a(a4 + j7, j8, j2, dndVar2.c, fArr2, true);
            float[] fArr3 = new float[9];
            if (!dndVar2.a.a(dnd.a(a3 + j7, j8, j9), a2, a6[0], a6[1], fArr3)) {
                fArr3 = fArr;
            }
            if (fArr3 != null) {
                arrayList2.add(oar.a(fArr3));
                fArr = fArr3;
            } else {
                arrayList2.add(null);
            }
            i3 = i5 + 1;
            a = fArr2;
            j2 = j9;
        }
        int i6 = 9;
        synchronized (dndVar2.d) {
            List list2 = (List) dndVar2.e.get();
            int i7 = 0;
            while (i7 < dndVar2.b) {
                oar oarVar2 = (oar) list2.get(i7);
                oar oarVar3 = (oar) arrayList2.get(i7);
                if (oarVar2 == null) {
                    list = list2;
                    dndVar = dndVar2;
                } else if (oarVar3 == null) {
                    list = list2;
                    dndVar = dndVar2;
                } else {
                    float[] fArr4 = oarVar2.c;
                    float f3 = fArr4[0];
                    float f4 = fArr4[4];
                    float f5 = fArr4[8];
                    float f6 = f4 * f5;
                    float f7 = fArr4[5];
                    float f8 = fArr4[7];
                    float f9 = f6 - (f7 * f8);
                    list = list2;
                    double d = f3 * f9;
                    Double.isNaN(d);
                    double d2 = d + 0.0d;
                    float f10 = fArr4[1];
                    float f11 = fArr4[3];
                    float f12 = f5 * f11;
                    float f13 = fArr4[6];
                    float f14 = f10 * (f12 - (f7 * f13));
                    dndVar = dndVar2;
                    double d3 = f14;
                    Double.isNaN(d3);
                    double d4 = d2 - d3;
                    double d5 = fArr4[2] * ((f11 * f8) - (f4 * f13));
                    Double.isNaN(d5);
                    double d6 = d4 + d5;
                    if (d6 != 0.0d) {
                        float f15 = (float) (1.0d / d6);
                        float[] fArr5 = new float[i6];
                        fArr5[0] = f9 * f15;
                        fArr5[1] = (-((fArr4[1] * fArr4[8]) - (fArr4[2] * fArr4[7]))) * f15;
                        fArr5[2] = ((fArr4[1] * fArr4[5]) - (fArr4[2] * fArr4[4])) * f15;
                        fArr5[3] = (-((fArr4[3] * fArr4[8]) - (fArr4[5] * fArr4[6]))) * f15;
                        fArr5[4] = ((fArr4[0] * fArr4[8]) - (fArr4[2] * fArr4[6])) * f15;
                        fArr5[5] = (-((fArr4[0] * fArr4[5]) - (fArr4[2] * fArr4[3]))) * f15;
                        fArr5[6] = ((fArr4[3] * fArr4[7]) - (fArr4[4] * fArr4[6])) * f15;
                        fArr5[7] = (-((fArr4[0] * fArr4[7]) - (fArr4[1] * fArr4[6]))) * f15;
                        fArr5[8] = ((fArr4[0] * fArr4[4]) - (fArr4[1] * fArr4[3])) * f15;
                        oarVar = oar.a(fArr5);
                    } else {
                        oarVar = null;
                    }
                    if (oarVar == null) {
                        liu.b("RelativeGyroTransformCalculator", "Inverse cannot be computed. Defaulting to identity");
                        arrayList3.add(oar.a());
                    } else {
                        float[] b = oarVar.b();
                        float[] fArr6 = new float[i6];
                        for (int i8 = 0; i8 < 3; i8++) {
                            for (int i9 = 0; i9 < 3; i9++) {
                                for (int i10 = 0; i10 < 3; i10++) {
                                    int i11 = i8 * 3;
                                    int i12 = i11 + i9;
                                    fArr6[i12] = fArr6[i12] + (oarVar3.c[i11 + i10] * b[(i10 * 3) + i9]);
                                }
                            }
                        }
                        arrayList3.add(oar.a(fArr6));
                    }
                    i7++;
                    list2 = list;
                    dndVar2 = dndVar;
                    i6 = 9;
                }
                liu.b("RelativeGyroTransformCalculator", "Previous or current projection matrix cannot be computed. Defaulting to identity");
                arrayList3.add(oar.a());
                i7++;
                list2 = list;
                dndVar2 = dndVar;
                i6 = 9;
            }
            dndVar2.e.set(arrayList2);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        while (i < size) {
            arrayList4.add((oar) arrayList3.get(i));
            i++;
        }
        return arrayList4;
    }

    public final boolean c() {
        Integer num = (Integer) this.g.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        return num != null && num.intValue() == 1;
    }

    public final synchronized void a(mjs mjsVar, int i, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "GyroBasedMotionEstimator starting with session : ".concat(valueOf);
        } else {
            new String("GyroBasedMotionEstimator starting with session : ");
        }
        liu.b("GyroBasedME");
        this.k = true;
        this.c = mjsVar;
        this.l = 0;
        this.d = new dnd(this.h, mjsVar, this.i, i, this.a, this.f);
        naj a = this.e.a(str);
        this.j = a;
        if (a != null) {
            mjz.a(a);
        }
    }

    public final synchronized void b() {
        liu.b("GyroBasedME");
        this.k = false;
        naj najVar = this.j;
        if (najVar != null) {
            String valueOf = String.valueOf(najVar.a());
            if (valueOf.length() != 0) {
                "Closing gyroSession : ".concat(valueOf);
            } else {
                new String("Closing gyroSession : ");
            }
            liu.b("GyroBasedME");
        }
        naj najVar2 = this.j;
        if (najVar2 != null) {
            ((naj) mjz.b(najVar2)).close();
        } else {
            liu.b("GyroBasedME");
        }
        this.d = null;
    }

    public final synchronized void a(long j) {
        naj najVar = this.j;
        if (this.k && najVar != null && j > this.a.a()) {
            najVar.a(this.a.a() + 1, j, new dne(this));
        }
    }
}