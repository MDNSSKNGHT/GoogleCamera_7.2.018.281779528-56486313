package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kno  reason: default package */
/* loaded from: classes.dex */
public final class kno {
    private final myz a;
    private final Set<mzc> b;
    private final myo c;
    private String d = "";

    public kno(myz myzVar, myo myoVar) {
        this.a = myzVar;
        this.c = myoVar;
        this.b = myoVar.H();
    }

    public myo a(String str) {
        myo b;
        mzc mzcVar = null;
        if (str != null) {
            Iterator<mzc> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mzc mzcVar2 = it.next();
                if (str.equals(mzcVar2.a)) {
                    mzcVar = mzcVar2;
                    break;
                }
            }
        }
        return (mzcVar == null || (b = this.a.b(mzcVar)) == null) ? this.c : b;
    }

    public synchronized boolean b(String str) {
        if (this.b.size() >= 2 && this.d.isEmpty()) {
            float f = 0.0f;
            for (mzc mzcVar : this.b) {
                float[] fArr = (float[]) this.a.b(mzcVar).a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr != null && fArr.length > 0) {
                    float f2 = f;
                    for (float f3 : fArr) {
                        if (f3 > f2) {
                            this.d = mzcVar.a;
                            f2 = f3;
                        }
                    }
                    f = f2;
                }
            }
        }
        if (!this.d.isEmpty() && str != null) {
            return str.equals(this.d);
        }
        return false;
    }
}