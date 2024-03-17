package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ibi  reason: default package */
/* loaded from: classes.dex */
public enum ibi {
    OFF(0),
    AUTO(1),
    MACRO(2),
    CONTINUOUS_VIDEO(3),
    CONTINUOUS_PICTURE(4),
    EDOF(5);
    
    public static final Map d = new HashMap();
    public final int e;

    static {
        ibi[] values;
        for (ibi ibiVar : values()) {
            d.put(Integer.valueOf(ibiVar.e), ibiVar);
        }
    }

    ibi(int i2) {
        this.e = i2;
    }
}