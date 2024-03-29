package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ibj  reason: default package */
/* loaded from: classes.dex */
public enum ibj {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);
    
    private static final Map i = new HashMap();
    public final int h;

    public final boolean a() {
        return this == PASSIVE_FOCUSED || this == PASSIVE_UNFOCUSED || this == FOCUSED_LOCKED || this == NOT_FOCUSED_LOCKED || this == INACTIVE;
    }

    static {
        ibj[] values;
        for (ibj ibjVar : values()) {
            i.put(Integer.valueOf(ibjVar.h), ibjVar);
        }
    }

    ibj(int i2) {
        this.h = i2;
    }

    public static ibj a(int i2) {
        ibj ibjVar = (ibj) i.get(Integer.valueOf(i2));
        if (ibjVar != null) {
            return ibjVar;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("unknown metadata value: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}