package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: mop  reason: default package */
/* loaded from: classes.dex */
public final class mop {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOCKED" : "CONVERGED" : "IMMEDIATE_LOCKED" : "ANY";
    }

    public static /* synthetic */ int b(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static moi a(CaptureRequest.Key key, Object obj) {
        return new moi(key, obj);
    }
}