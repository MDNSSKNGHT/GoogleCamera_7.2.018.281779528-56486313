package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ibf  reason: default package */
/* loaded from: classes.dex */
public final class ibf implements Comparable, mjq {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final long m;
    public final Rect n;
    public final float o;
    public final ibe[] p;
    public final boolean q;
    public final int r;
    public final Rect s;
    private final ndn t;

    public ibf(ndn ndnVar, int i, Rect rect) {
        this(ndnVar, i, rect, null);
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public void close() {
    }

    public ibf(ndn ndnVar, int i, Rect rect, String str) {
        this.t = ndnVar;
        this.a = str;
        this.b = ((Long) a(ndnVar.a(CaptureResult.SENSOR_TIMESTAMP), 0L)).longValue();
        this.c = ((Long) a(this.t.a(CaptureResult.SENSOR_EXPOSURE_TIME), 0L)).longValue();
        this.d = ((Long) a(this.t.a(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW), 0L)).longValue();
        this.e = ((Integer) a(this.t.a(CaptureResult.SENSOR_SENSITIVITY), 0)).intValue();
        this.f = ((Integer) a(this.t.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST), 0)).intValue();
        Float valueOf = Float.valueOf(0.0f);
        this.g = ((Float) a(this.t.a(CaptureResult.LENS_FOCAL_LENGTH), valueOf)).floatValue();
        this.h = ((Float) a(this.t.a(CaptureResult.LENS_FOCUS_DISTANCE), valueOf)).floatValue();
        this.i = ((Integer) a(this.t.a(CaptureResult.CONTROL_AF_STATE), 0)).intValue();
        this.j = ((Integer) a(this.t.a(CaptureResult.CONTROL_AE_STATE), 0)).intValue();
        this.k = ((Integer) a(this.t.a(CaptureResult.CONTROL_AWB_STATE), 0)).intValue();
        this.l = ((Integer) a(this.t.a(CaptureResult.LENS_STATE), 1)).intValue();
        this.n = (Rect) this.t.a(CaptureResult.SCALER_CROP_REGION);
        if (lan.c != null) {
            this.m = ((Long) a(this.t.a(lan.c), 0L)).longValue();
        } else {
            this.m = this.b;
        }
        if (lan.q != null) {
            this.o = ((Float) a(this.t.a(lan.q), Float.valueOf(1.0f))).floatValue();
        } else {
            this.o = 1.0f;
        }
        this.r = i;
        this.s = (Rect) a(rect, new Rect());
        if (lao.m == null || this.t.a(lao.m) == null) {
            Face[] faceArr = (Face[]) this.t.a(CaptureResult.STATISTICS_FACES);
            int length = faceArr != null ? faceArr.length : 0;
            this.p = new ibe[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.p[i2] = a(ibe.a(faceArr[i2]));
            }
        } else {
            ndn ndnVar2 = this.t;
            ArrayList arrayList = new ArrayList();
            Face[] faceArr2 = (Face[]) ndnVar2.a(CaptureResult.STATISTICS_FACES);
            int[] iArr = (int[]) ndnVar2.a(lao.m);
            byte[] bArr = (byte[]) ndnVar2.a(lao.n);
            float[] fArr = (float[]) ndnVar2.a(lao.o);
            float[] fArr2 = (float[]) ndnVar2.a(lao.p);
            float[] fArr3 = (float[]) ndnVar2.a(lao.q);
            int i3 = 3;
            if (faceArr2 != null && iArr != null && bArr != null && fArr != null && fArr2 != null && fArr3 != null) {
                int length2 = faceArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    int i6 = iArr[i4];
                    byte[] bArr2 = new byte[i6];
                    int i7 = i6 + i6;
                    float[] fArr4 = new float[i7];
                    int i8 = length2;
                    float[] fArr5 = new float[i3];
                    System.arraycopy(bArr, i5, bArr2, 0, i6);
                    System.arraycopy(fArr, i5 + i5, fArr4, 0, i7);
                    System.arraycopy(fArr2, i5, new float[i6], 0, i6);
                    System.arraycopy(fArr3, i4 * 3, fArr5, 0, 3);
                    i5 += i6;
                    arrayList.add(new ndo(faceArr2[i4], bArr2, fArr4, fArr5));
                    i4++;
                    iArr = iArr;
                    length2 = i8;
                    bArr = bArr;
                    i3 = 3;
                }
            }
            int size = arrayList.size();
            this.p = new ibe[size];
            for (int i9 = 0; i9 < size; i9++) {
                ibe[] ibeVarArr = this.p;
                ndo ndoVar = (ndo) arrayList.get(i9);
                ibeVarArr[i9] = a(new ibe(ndoVar.a.getId(), ndoVar.a.getBounds(), ndoVar.a.getScore(), ndoVar.a((byte) 1), ndoVar.a((byte) 2), ndoVar.a((byte) 4), ndoVar.a((byte) 3), ndoVar.a((byte) 5), ndoVar.a((byte) 6), ndoVar.b, ndoVar.c, ndoVar.d));
            }
        }
        if (lao.l != null) {
            this.q = ((Boolean) a(this.t.a(lao.l), false)).booleanValue();
        } else {
            this.q = false;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.b > ((ibf) obj).b ? 1 : (this.b == ((ibf) obj).b ? 0 : -1));
    }

    private ibe a(ibe ibeVar) {
        Rect rect = ibeVar.a;
        return new ibe(ibeVar.i, rect != null ? new Rect(Math.round(a(rect.left)), Math.round(b(rect.top)), Math.round(a(rect.right)), Math.round(b(rect.bottom))) : null, ibeVar.b, ibeVar.c != null ? a(ibeVar.c) : null, ibeVar.d != null ? a(ibeVar.d) : null, ibeVar.e != null ? a(ibeVar.e) : null, ibeVar.f != null ? a(ibeVar.f) : null, ibeVar.g != null ? a(ibeVar.g) : null, ibeVar.h != null ? a(ibeVar.h) : null, ibeVar.j, ibeVar.k, ibeVar.l);
    }

    private PointF a(PointF pointF) {
        return new PointF(a(pointF.x), b(pointF.y));
    }

    private float a(float f) {
        return ((f - this.n.left) * this.s.width()) / this.n.width();
    }

    private float b(float f) {
        return ((f - this.n.top) * this.s.height()) / this.n.height();
    }

    public String toString() {
        String valueOf = String.valueOf(this.n);
        String arrays = Arrays.toString(this.p);
        String valueOf2 = String.valueOf(this.s);
        return "CameraMetadata{, timestampNs=" +
                this.b +
                ", exposureTime=" +
                this.c +
                ", rollingShutterTime=" +
                this.d +
                ", focalLength=" +
                this.g +
                ", sensorSensitivity=" +
                this.e +
                ", focusDistance=" +
                this.h +
                ", aFStatus=" +
                this.i +
                ", aEStatus=" +
                this.j +
                ", aWBStatus=" +
                this.k +
                ", lensStatus=" +
                this.l +
                ", cropRegion=" +
                valueOf +
                ", mTimestampBootime=" +
                this.m +
                ", subjectMotion=" +
                this.o +
                ", faces=" +
                arrays +
                ", rotationDegrees=" +
                this.r +
                ", activeArraySize=" +
                valueOf2 +
                ", physicalId=" +
                this.a +
                '}';
    }
}