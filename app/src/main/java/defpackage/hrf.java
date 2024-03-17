package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: hrf  reason: default package */
/* loaded from: classes.dex */
public final class hrf {
    public final mnh a;
    public final /* synthetic */ hrg b;

    public hrf(hrg hrgVar, mnh mnhVar) {
        this.b = hrgVar;
        this.a = mnhVar;
    }

    public final neb a(mos mosVar) {
        if (mosVar != null) {
            try {
                return this.a.a(mosVar);
            } catch (IllegalArgumentException e) {
            }
        }
        return null;
    }

    public final neb f() {
        return a(this.b.d);
    }

    public final neb d() {
        return a(b());
    }

    public final mos b() {
        mos mosVar;
        Set a = this.a.a().a();
        if (a.contains(this.b.a)) {
            mosVar = this.b.a;
        } else {
            mosVar = !a.contains(this.b.b) ? a.contains(this.b.c) ? this.b.c : null : this.b.b;
        }
        qdu.d(mosVar);
        return mosVar;
    }

    public final neb e() {
        return a(c());
    }

    public final mos c() {
        if (a()) {
            return this.b.c;
        }
        return null;
    }

    public final neb g() {
        return a(this.b.f);
    }

    public final boolean a() {
        hrg hrgVar = this.b;
        if (hrgVar.b != null && hrgVar.c != null) {
            Set a = this.a.a().a();
            if (a.contains(this.b.b) && a.contains(this.b.c)) {
                return true;
            }
        }
        return false;
    }
}