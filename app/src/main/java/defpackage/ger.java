package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ger  reason: default package */
/* loaded from: classes.dex */
public final class ger extends mzh implements geq {
    public ger(myo myoVar) {
        super(myoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qdu.e(M(), ((ger) obj).M());
    }

    @Override // defpackage.geq
    public final List a(mjs mjsVar) {
        return b(mjsVar);
    }

    @Override // defpackage.geq
    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (mjs mjsVar : w()) {
            mer merVar = (mer) mer.i.get(mjsVar);
            if (merVar != null) {
                arrayList.add(merVar);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{M()});
    }

    @Override // defpackage.geq
    public final boolean b() {
        return rgk.a((int[]) a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, a), 5);
    }
}