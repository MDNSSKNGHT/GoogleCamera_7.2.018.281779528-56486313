package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ndx  reason: default package */
/* loaded from: classes.dex */
public class ndx implements neb {
    private final neb a;

    public ndx(neb nebVar, byte b) {
        this(nebVar);
    }

    public ndx(neb nebVar) {
        this.a = nebVar;
    }

    public void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof neb)) {
            neb nebVar = (neb) obj;
            if (nebVar.b() == b() && nebVar.c() == c() && nebVar.d() == d() && nebVar.f() == f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ndd
    public final myc h() {
        return this.a.h();
    }

    @Override // defpackage.neb
    public final Rect a() {
        return this.a.a();
    }

    @Override // defpackage.neb
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.neb
    public final HardwareBuffer g() {
        return this.a.g();
    }

    @Override // defpackage.neb
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.neb
    public final List e() {
        return this.a.e();
    }

    @Override // defpackage.neb
    public long f() {
        return this.a.f();
    }

    @Override // defpackage.neb
    public final int c() {
        return this.a.c();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(d()), Long.valueOf(f())});
    }

    @Override // defpackage.neb
    public final void a(Rect rect) {
        this.a.a(rect);
    }

    public String toString() {
        return this.a.toString();
    }
}