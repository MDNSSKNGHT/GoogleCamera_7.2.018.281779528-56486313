package defpackage;

/* compiled from: PG */
/* renamed from: dop  reason: default package */
/* loaded from: classes.dex */
public final class dop {
    public final cin a;
    public final int b;
    public final int c;
    public final int d;

    public dop(cqo cqoVar, cin cinVar) {
        int intValue;
        this.a = cinVar;
        this.b = Math.max(1, ((Integer) cinVar.a(ciu.g).b()).intValue());
        int intValue2 = ((Integer) cinVar.a(ciu.f).b()).intValue();
        cinVar.b();
        int max = Math.max(1, intValue2);
        int intValue3 = ((Integer) cinVar.a(ciu.k).b()).intValue();
        qdu.d(intValue3 >= 10);
        intValue3 = b(cinVar) ? intValue3 : max;
        if (a(cinVar)) {
            intValue = ((Integer) cinVar.a(ciu.j).b()).intValue();
        } else {
            cinVar.b();
            intValue = max;
        }
        int max2 = Math.max(intValue3, intValue);
        int i = !cqoVar.d() ? 0 : 4;
        if (cqoVar.d()) {
            cio cioVar = cja.a;
            cinVar.b();
        }
        this.c = Math.max(i + max, max2);
        this.d = cqoVar.d() ? this.c - max : 0;
        qdu.d(this.b > 0);
        qdu.d(this.b <= this.c);
    }

    public final boolean a() {
        cin cinVar = this.a;
        ciq ciqVar = ciu.a;
        return cinVar.c();
    }

    public static boolean b(cin cinVar) {
        if (cinVar.c(ciu.A)) {
            return false;
        }
        return cinVar.d(ciu.z);
    }

    public static boolean a(cin cinVar) {
        return cinVar.d(ciu.w);
    }

    public final int b() {
        if (this.a.a(ciu.h).a()) {
            return ((Integer) this.a.a(ciu.h).b()).intValue();
        }
        return -1;
    }
}
