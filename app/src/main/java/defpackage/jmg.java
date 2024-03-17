package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: jmg  reason: default package */
/* loaded from: classes.dex */
public enum jmg {
    MANUAL_FPS_30_1X_LITE(jlv.SLOW, 30, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_30_1X(jlv.SLOWEST, 30, 30.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_60_2X(jlv.SLOWEST, 60, 60.0d, 8.0d, 4.0d, 1.0d, 0.25d);
    
    public final prx c;
    public final int e;
    public final int f = 30;
    public final jlv d = jlv.SLOW;

    jmg(jlv jlvVar, int i, double... dArr) {
        this.e = i;
        int ordinal = jlvVar.ordinal();
        HashMap hashMap = new HashMap(dArr.length);
        for (int i2 = 0; i2 < dArr.length; i2++) {
            hashMap.put(jlv.values()[i2 + ordinal], Double.valueOf(dArr[i2]));
        }
        this.c = prx.a(hashMap);
    }

    public static meo a(jmg jmgVar) {
        meo[] values;
        for (meo meoVar : meo.values()) {
            int i = jmgVar.e;
            if (i == meoVar.f && jmgVar.f == meoVar.g && i == meoVar.h) {
                return meoVar;
            }
        }
        throw new IllegalArgumentException("No camcorderCaptureRate found.");
    }

    public final double a() {
        if (this.c.containsKey(this.d)) {
            return ((Double) this.c.get(this.d)).doubleValue();
        }
        return ((Double) qdu.d((Double) this.c.get(jlv.SLOWEST))).doubleValue();
    }
}