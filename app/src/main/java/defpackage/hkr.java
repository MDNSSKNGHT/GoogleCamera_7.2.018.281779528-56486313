package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hkr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hkr implements mjw {
    private final hqu a;
    private final mnu b;

    public hkr(hqu hquVar, mnu mnuVar) {
        this.a = hquVar;
        this.b = mnuVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        hqu hquVar = this.a;
        mnu mnuVar = this.b;
        hqt hqtVar = (hqt) obj;
        if (lap.c == null || !hquVar.b()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Float valueOf = Float.valueOf(0.0f);
        arrayList.add(valueOf);
        arrayList.add(Float.valueOf(hqtVar.a()));
        arrayList.add(Float.valueOf(hqtVar.b()));
        arrayList.add(Float.valueOf(-1.0f));
        arrayList.add(valueOf);
        arrayList.add(valueOf);
        CaptureRequest.Key key = lap.c;
        Object[] array = arrayList.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) qdu.d(array[i])).floatValue();
        }
        mnuVar.b(psl.b(mop.a(key, fArr), mop.a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(hqtVar.c()))));
    }
}