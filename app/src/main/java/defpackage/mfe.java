package defpackage;

/* compiled from: PG */
/* renamed from: mfe  reason: default package */
/* loaded from: classes.dex */
public abstract class mfe {
    public abstract mep a();

    public abstract mer b();

    public abstract int c();

    public abstract meo d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public final int i() {
        return d().f;
    }

    public final int j() {
        if (d().b()) {
            return c();
        }
        return c() / d().d();
    }

    public final int k() {
        return d().g;
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a("camcorderVideoFileFormat", a());
        e.a("camcorderVideoResolution", b());
        e.a("videoCaptureBitRate", c());
        e.a("videoCaptureFrameRate", i());
        e.a("videoEncoder", e());
        e.a("videoEncodingFrameRate", k());
        e.a("videoKeyFrameInterval", h());
        return e.toString();
    }
}