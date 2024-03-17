package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.SizeF;

/* compiled from: PG */
/* renamed from: cxi  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cxi implements Runnable {
    private final cyo a;
    private final geq b;
    private final cyl c;

    public cxi(cyo cyoVar, geq geqVar, cyl cylVar) {
        this.a = cyoVar;
        this.b = geqVar;
        this.c = cylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cyo cyoVar = this.a;
        geq geqVar = this.b;
        cyl cylVar = this.c;
        Rect rect = (Rect) geqVar.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            float f = rect.right - rect.left;
            float f2 = rect.bottom - rect.top;
            synchronized (cyoVar) {
                pjz.b(new SizeF(f, f2));
            }
        } else {
            Log.w("faceMetadataDistributor", "Cannot set active size with null active array");
        }
        cylVar.a(geqVar.N());
    }
}