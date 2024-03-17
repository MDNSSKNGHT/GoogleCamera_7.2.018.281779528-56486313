package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ibh  reason: default package */
/* loaded from: classes.dex */
public enum ibh {
    INACTIVE(0),
    SEARCHING(1),
    CONVERGED(2),
    LOCKED(3),
    FLASH_REQUIRED(4),
    PRECAPTURE(5);
    
    public static final Map b = new HashMap();
    private final int h;

    static {
        ibh[] values;
        for (ibh ibhVar : values()) {
            b.put(Integer.valueOf(ibhVar.h), ibhVar);
        }
    }

    ibh(int i2) {
        this.h = i2;
    }
}