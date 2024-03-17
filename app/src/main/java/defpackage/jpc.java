package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: jpc  reason: default package */
/* loaded from: classes.dex */
public abstract class jpc {
    public abstract RectF a();

    public abstract float b();

    public abstract long c();

    public abstract int d();

    public static jpb f() {
        jpb jpbVar = new jpb((byte) 0);
        jpbVar.a(1);
        jpbVar.a(new RectF(-1.0f, -1.0f, -1.0f, -1.0f));
        jpbVar.a(0.0f);
        jpbVar.a(0L);
        return jpbVar;
    }

    public static jpc g() {
        return f().a();
    }

    public final boolean e() {
        return a().centerX() >= 0.0f && a().centerY() >= 0.0f;
    }
}