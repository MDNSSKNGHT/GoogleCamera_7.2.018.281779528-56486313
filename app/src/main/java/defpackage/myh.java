package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: myh */
/* loaded from: classes.dex */
public final class myh {
    public static void a(mnw mnwVar, myo myoVar, klw klwVar) {
        psl a = a(klwVar);
        if (a.isEmpty()) {
            return;
        }
        Set G = myoVar.G();
        for (moi moiVar : (Set<moi>) a) {
            if (G.contains(moiVar.a)) {
                mnwVar.b().c(moiVar);
            }
        }
    }

    public static mzc a(mnz mnzVar) {
        for (mos mosVar : mnzVar.a()) {
            if (mosVar.c() == 37) {
                return mosVar.a();
            }
        }
        return null;
    }

    public static psl a(klw klwVar) {
        int i;
        HashSet hashSet = new HashSet();
        if (lap.n != null) {
            if (klwVar == klw.TIME_LAPSE) {
                i = 100;
            } else if (klwVar == klw.IMAX) {
                i = 101;
            } else if (klwVar == klw.PORTRAIT) {
                i = 3;
            } else if (klwVar != klw.LONG_EXPOSURE) {
                return pvi.a;
            } else {
                i = 5;
            }
            hashSet.add(mop.a(lap.n, true));
            hashSet.add(mop.a(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        }
        return psl.a(hashSet);
    }

    public static Object a(ndd nddVar) {
        return nddVar.h().a;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(a((ndd) list.get(i)));
        }
        return arrayList;
    }

    public static double a(float f, double d) {
        qdu.c(f > 0.0f);
        qdu.c(d > 0.0d);
        double d2 = f + f;
        Double.isNaN(d2);
        double atan = Math.atan(d / d2);
        return atan + atan;
    }

    public static double a(double d, float f) {
        double d2 = f + f;
        double tan = Math.tan(d / 2.0d);
        Double.isNaN(d2);
        return d2 * tan;
    }

    public static double a(myo myoVar) {
        SizeF sizeF = (SizeF) myoVar.b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getHeight(), sizeF.getWidth());
    }
}