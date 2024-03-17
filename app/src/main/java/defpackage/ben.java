package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: ben  reason: default package */
/* loaded from: classes.dex */
public abstract class ben {
    public abstract int a();

    public abstract Rect b();

    public static ben a(int i, Rect rect) {
        return new bek(i, rect);
    }

    public final boolean c() {
        return a() >= 0 || a() == -1;
    }
}