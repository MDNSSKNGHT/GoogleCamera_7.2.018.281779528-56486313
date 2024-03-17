package defpackage;

import com.google.googlex.gcam.GyroSample;
import com.google.googlex.gcam.GyroSampleVector;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: doh  reason: default package */
/* loaded from: classes.dex */
public final class doh implements nai {
    public static final doh a = new doh();

    private doh() {
    }

    @Override // defpackage.nai
    public final /* bridge */ /* synthetic */ Object a(List list) {
        GyroSampleVector gyroSampleVector = new GyroSampleVector();
        for (Object o : list) {
            nal nalVar = (nal) o;
            GyroSample gyroSample = new GyroSample();
            gyroSample.setTimestamp_ns(nalVar.e);
            gyroSample.setX(nalVar.f);
            gyroSample.setY(nalVar.g);
            gyroSample.setZ(nalVar.h);
            gyroSampleVector.add(gyroSample);
        }
        return gyroSampleVector;
    }
}
