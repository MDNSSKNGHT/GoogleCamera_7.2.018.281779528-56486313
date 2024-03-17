package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: prt  reason: default package */
/* loaded from: classes.dex */
public class prt {
    public Object[] a;
    public int b;

    public prt() {
        this(4);
    }

    public prt(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    public prx a() {
        return pvh.a(this.b, this.a);
    }

    public final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, prf.a(length, i2));
        }
    }

    public prt a(Object obj, Object obj2) {
        a(this.b + 1);
        qdu.b(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }
}