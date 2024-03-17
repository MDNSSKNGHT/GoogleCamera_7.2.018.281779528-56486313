package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.Tuning;

/* compiled from: PG */
/* renamed from: drr  reason: default package */
/* loaded from: classes.dex */
public final class drr {
    public final Tuning a;
    public final gmt b;

    public /* synthetic */ drr(Tuning tuning, ndr ndrVar) {
        qdu.d(ndrVar);
        this.a = (Tuning) qdu.d(tuning);
        Face[] faceArr = (Face[]) ndrVar.a(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) ndrVar.a(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) ndrVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        qdu.d(faceArr);
        qdu.d(rect);
        qdu.d(l);
        this.b = new gmt(faceArr, rect, l.longValue());
    }
}