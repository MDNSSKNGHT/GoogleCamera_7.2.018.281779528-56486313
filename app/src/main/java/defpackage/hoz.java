package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* renamed from: hoz  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hoz implements mog {
    private final hpa a;

    public hoz(hpa hpaVar) {
        this.a = hpaVar;
    }

    @Override // defpackage.mog
    public final void a(mnh mnhVar) {
        hpa hpaVar = this.a;
        try {
            ndr c = mnhVar.c();
            if (c != null) {
                boolean b = hpaVar.g.b(c);
                dpa dpaVar = hpaVar.f;
                mzg N = hpaVar.h.N();
                float longValue = ((float) ((Long) qdu.b((Long) c.a(TotalCaptureResult.SENSOR_EXPOSURE_TIME))).longValue()) * 1.0E-6f;
                int intValue = ((Integer) qdu.b((Integer) c.a(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST))).intValue();
                int intValue2 = ((Integer) qdu.b((Integer) c.a(TotalCaptureResult.SENSOR_SENSITIVITY))).intValue();
                boolean z = false;
                if (b && longValue * intValue2 * intValue > ciy.b(dpaVar.a, N) * 0.9f) {
                    z = true;
                }
                dpaVar.a(z, N);
                hpaVar.d.a(c);
                if (((Long) qdu.d((Long) c.a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue() > hpa.a.longValue()) {
                    mkg mkgVar = hpaVar.b;
                    String valueOf = String.valueOf(c.a(CaptureResult.SENSOR_EXPOSURE_TIME));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb.append("Frame dropped with ultra long exposure time: ");
                    sb.append(valueOf);
                    mkgVar.f(sb.toString());
                } else if (hpaVar.i != null && hpaVar.j) {
                    neb a = mnhVar.a(hpaVar.c);
                    if (a != null) {
                        hpaVar.i.a(a, c, mjo.a(hpaVar.e.getDefaultDisplay()));
                    } else {
                        hpaVar.b.f("Received incomplete frame");
                    }
                }
            } else {
                hpaVar.b.c("Error retrieving metadata, ignoring frame");
            }
            mnhVar.close();
        } catch (Throwable th) {
            try {
                mnhVar.close();
            } catch (Throwable th2) {
                qrf.a(th, th2);
            }
            throw th;
        }
    }
}