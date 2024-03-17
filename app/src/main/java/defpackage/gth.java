package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gth  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gth implements pjr {
    public static final pjr a = new gth();

    private gth() {
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        gtk gtkVar = (gtk) obj;
        return ggt.a(Arrays.asList(new ggn(CaptureRequest.SCALER_CROP_REGION, gtkVar.a), new ggn(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(gtkVar.b))));
    }
}