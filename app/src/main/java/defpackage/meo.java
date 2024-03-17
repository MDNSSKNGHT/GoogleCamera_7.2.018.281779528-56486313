package defpackage;

import java.util.Collection;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: meo  reason: default package */
/* loaded from: classes.dex */
public enum meo {
    FPS_AUTO(30, 30, 60),
    FPS_30(30, 30, 30),
    FPS_60(60, 60, 60),
    FPS_60_HFR_2X(60, 30, 60),
    FPS_120_HFR_4X(120, 30, 120),
    FPS_240_HFR_8X(240, 30, 240);
    
    public final int f;
    public final int g;
    public final int h;

    public final boolean b() {
        return this.f == this.g;
    }

    public final boolean c() {
        return this.f > this.g;
    }

    meo(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final int d() {
        return this.f / this.g;
    }

    public static Collection a() {
        meo[] values;
        LinkedList linkedList = new LinkedList();
        for (meo meoVar : values()) {
            if (meoVar.c()) {
                linkedList.add(meoVar);
            }
        }
        return linkedList;
    }

    public static meo a(int i, int i2) {
        if (i2 == 30 && i == 30) {
            return FPS_30;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("unsupported capture frame rate =");
        sb.append(i);
        sb.append(" and encoding frame rate=");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
