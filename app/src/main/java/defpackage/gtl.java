package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: gtl */
/* loaded from: classes.dex */
public final class gtl extends mdu {
    private static final String a = liu.a("MultiCropRegion");
    private final List b;
    private final float c;
    private final double d;
    private final int e;
    private final int f;
    private final int g;
    private final mzg h;
    private boolean i;
    private gtk j;

    public gtl(mdl mdlVar, myo myoVar) {
        this(mdlVar, myoVar, mix.a);
    }

    public gtl(mdl mdlVar, myo myoVar, mix mixVar) {
        super(mdlVar);
        float height;
        String str = a;
        String valueOf = String.valueOf(myoVar.M());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("current camera id =  ");
        sb.append(valueOf);
        sb.toString();
        liu.b(str);
        List J = myoVar.J();
        this.b = J;
        this.c = ((Float) Collections.min(J)).floatValue();
        SizeF sizeF = (SizeF) myoVar.b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        if (mixVar.a(mix.b)) {
            height = mixVar.a(sizeF.getWidth());
        } else {
            height = sizeF.getHeight();
        }
        this.d = Math.hypot(sizeF.getWidth(), height);
        Rect e = myoVar.e();
        int a2 = (int) mixVar.a(e.width());
        this.e = e.width() / 2;
        this.f = a2 / 2;
        this.g = (e.height() - a2) / 2;
        this.h = myoVar.N();
        this.j = a(Float.valueOf(1.0f));
    }

    public final synchronized void a(mzg mzgVar) {
        if (mzgVar != this.h) {
            String str = a;
            String valueOf = String.valueOf(mzgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Closing, switching to ");
            sb.append(valueOf);
            sb.toString();
            liu.b(str);
            this.i = true;
        }
    }

    private final synchronized gtk a(Float f) {
        if (!this.i) {
            float floatValue = f.floatValue();
            double d = this.d;
            float f2 = this.c;
            double d2 = floatValue;
            Double.isNaN(d2);
            double a2 = myh.a(f2, d / d2);
            double d3 = this.d;
            boolean z = false;
            qdu.c(d3 > 0.0d);
            if (a2 > 0.0d && a2 < 6.283185307179586d) {
                z = true;
            }
            qdu.c(z);
            double tan = Math.tan(a2 / 2.0d);
            List list = this.b;
            double d4 = (float) (d3 / (tan + tan));
            for (int size = list.size() - 1; size >= 0; size--) {
                float floatValue2 = ((Float) list.get(size)).floatValue();
                double d5 = floatValue2;
                if (d5 >= d4) {
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    if (Math.abs(d4 - d5) >= 9.999999747378752E-6d) {
                    }
                }
                double a3 = myh.a(a2, floatValue2) / this.d;
                int i = this.e;
                double d6 = i;
                Double.isNaN(d6);
                int i2 = (int) ((d6 * a3) + 0.5d);
                int i3 = this.f;
                double d7 = i3;
                Double.isNaN(d7);
                int i4 = (int) ((a3 * d7) + 0.5d);
                int i5 = this.g + i3;
                Rect rect = new Rect(i - i2, i5 - i4, i + i2, i5 + i4);
                String str = a;
                String valueOf = String.valueOf(rect);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb.append("Zoom to ");
                sb.append(valueOf);
                sb.toString();
                liu.f(str);
                this.j = new gtk(rect, floatValue2);
            }
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("focal length needed = ");
            sb2.append(d4);
            throw new IllegalStateException(sb2.toString());
        }
        return this.j;
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return a((Float) obj);
    }
}