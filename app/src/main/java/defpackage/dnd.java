package defpackage;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dnd */
/* loaded from: classes.dex */
public final class dnd {
    public final eaz a;
    public final int b;
    public final mjs c;
    public final Object d;
    public final AtomicReference e;
    private final ebe f;
    private final SizeF g;
    private final mjs h;
    private final float i;

    public static long a(long j, long j2, long j3) {
        return j + ((j2 + j3) / 2);
    }

    public final long a(long j, float[] fArr) {
        float f = this.i;
        return (long) ((((float) j) * (1.0f - (f + f))) / fArr[1]);
    }

    public final long a(long j, long j2, float[] fArr) {
        if (j > 0) {
            float f = (float) j2;
            return (long) (j + (this.i * f) + ((0.5f - (0.5f / fArr[1])) * f));
        }
        return j;
    }

    public final float a(float f, float f2, float[] fArr) {
        return (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * this.c.a) / this.g.getWidth()) * (fArr[0] + fArr[1]) * 0.5f;
    }

    public final float[] a(long j, long j2, long j3, mjs mjsVar, float[] fArr, boolean z) {
        float[] fArr2 = {0.0f, 0.0f};
        if (j >= 0) {
            long a = a(j, j2, j3);
            if (z) {
                fArr2 = this.f.a(a, j3);
            } else {
                fArr2 = this.f.a(a);
            }
        }
        return new float[]{((float) (mjsVar.a - 1)) * ((fArr2[0] * fArr[0]) + 0.5f), ((float) (mjsVar.b - 1)) * ((fArr2[1] * fArr[1]) + 0.5f)};
    }

    public final float[] a(Rect rect) {
        float[] fArr = {1.0f, 1.0f};
        if (rect != null) {
            fArr[0] = this.h.a / (rect.right - rect.left);
            fArr[1] = this.h.b / (rect.bottom - rect.top);
        }
        return fArr;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.g);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 113 + String.valueOf(valueOf2).length());
        sb.append("AbsoluteGyroTransformCalculator{imageSize=");
        sb.append(valueOf);
        sb.append(", sensorSize=");
        sb.append(valueOf2);
        sb.append(", timeoutMs=0, numOfStrips=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    public dnd(SizeF sizeF, mjs mjsVar, mjs mjsVar2, int i, eaz eazVar, ebe ebeVar) {
        qdu.c(true);
        this.g = sizeF;
        this.c = mjsVar;
        this.h = mjsVar2;
        this.b = i;
        this.a = eazVar;
        this.f = ebeVar;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = mjsVar.a / mjsVar.b;
        this.i = ((f / width) - 1.0f) / ((f + f) / width);
        this.d = new Object();
        this.e = new AtomicReference();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.e.set(arrayList);
    }
}