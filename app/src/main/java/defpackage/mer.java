package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: mer  reason: default package */
/* loaded from: classes.dex */
public enum mer {
    RES_UNKNOWN(-1, -1),
    RES_QCIF(176, 144),
    RES_QVGA(320, 240),
    RES_CIF(352, 288),
    RES_480P(720, 480),
    RES_720P(1280, 720),
    RES_1080P(1920, 1080),
    RES_2160P(3840, 2160);
    
    public static final Map i = new HashMap();
    private final int j;
    private final int k;

    public final long c() {
        return this.j * this.k;
    }

    static {
        mer[] values;
        for (mer merVar : values()) {
            i.put(new mjs(merVar.j, merVar.k), merVar);
        }
    }

    mer(int i2, int i3) {
        this.j = i2;
        this.k = i3;
    }

    public static Comparator a() {
        return new meq();
    }

    public final mjs b() {
        return new mjs(this.j, this.k);
    }
}