package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ibg  reason: default package */
/* loaded from: classes.dex */
public enum ibg {
    OFF(0),
    ON(1),
    ON_AUTO_FLASH(2),
    ON_ALWAYS_FLASH(3),
    ON_AUTO_FLASH_REDEYE(4),
    CONTROL_AE_MODE_ON_EXTERNAL_FLASH(5);
    
    public static final Map b = new HashMap();
    private final int h;

    static {
        ibg[] values;
        for (ibg ibgVar : values()) {
            b.put(Integer.valueOf(ibgVar.h), ibgVar);
        }
    }

    ibg(int i2) {
        this.h = i2;
    }
}