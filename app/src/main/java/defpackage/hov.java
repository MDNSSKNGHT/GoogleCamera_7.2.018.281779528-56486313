package defpackage;

import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hov  reason: default package */
/* loaded from: classes.dex */
public final class hov {
    public final cin a;
    private final MetadataConverter b;
    private final boolean c;

    public hov(cin cinVar, MetadataConverter metadataConverter, myo myoVar) {
        this.a = cinVar;
        this.b = metadataConverter;
        this.c = myoVar.N() == mzg.FRONT;
    }

    public final List a(mnr mnrVar, FrameRequestVector frameRequestVector, ndr ndrVar, int i) {
        qdu.d(frameRequestVector.size() >= ((long) i));
        qdu.d(frameRequestVector.size() > 0);
        FrameRequest frameRequest = frameRequestVector.get(0);
        float desired_exposure_time_ms = frameRequest.getDesired_exposure_time_ms();
        float desired_analog_gain = frameRequest.getDesired_analog_gain();
        float desired_digital_gain = frameRequest.getDesired_digital_gain();
        hot hotVar = new hot(mnrVar);
        this.b.updateFromFrameRequest(frameRequest, ndrVar, hotVar);
        mnr a = mnrVar.a();
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(a.b());
        for (int i2 = 1; i2 < i; i2++) {
            FrameRequest frameRequest2 = frameRequestVector.get(i2);
            float desired_exposure_time_ms2 = frameRequest2.getDesired_exposure_time_ms();
            float desired_analog_gain2 = frameRequest2.getDesired_analog_gain();
            float desired_digital_gain2 = frameRequest2.getDesired_digital_gain();
            if (desired_exposure_time_ms2 != desired_exposure_time_ms || desired_analog_gain2 != desired_analog_gain || desired_digital_gain2 != desired_digital_gain) {
                this.b.updateFromFrameRequest(frameRequest2, ndrVar, hotVar);
                desired_exposure_time_ms = desired_exposure_time_ms2;
                desired_analog_gain = desired_analog_gain2;
                desired_digital_gain = desired_digital_gain2;
            }
            arrayList.add(mnrVar.a().b());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.a.d(ciu.B)) {
            return 1;
        }
        return (!this.a.d(cit.L) || this.c) ? 0 : 2;
    }
}