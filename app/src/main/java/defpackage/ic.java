package defpackage;

/* compiled from: PG */
/* renamed from: ic  reason: default package */
/* loaded from: classes.dex */
public final class ic implements Cloneable {
    public static final Object a = new Object();
    public boolean b = false;
    public long[] c;
    public Object[] d;
    public int e;

    public ic() {
        int b = ia.b(10);
        this.c = new long[b];
        this.d = new Object[b];
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    private final ic d() {
        try {
            ic icVar = (ic) super.clone();
            icVar.c = (long[]) this.c.clone();
            icVar.d = (Object[]) this.d.clone();
            return icVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return d();
    }

    public final void a() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final Object a(long j) {
        int a2 = ia.a(this.c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != a) {
                return objArr[a2];
            }
            return null;
        }
        return null;
    }

    public final long a(int i) {
        if (this.b) {
            a();
        }
        return this.c[i];
    }

    public final void a(long j, Object obj) {
        int a2 = ia.a(this.c, this.e, j);
        if (a2 < 0) {
            int i = a2 ^ (-1);
            if (i < this.e) {
                Object[] objArr = this.d;
                if (objArr[i] == a) {
                    this.c[i] = j;
                    objArr[i] = obj;
                    return;
                }
            }
            if (this.b && this.e >= this.c.length) {
                a();
                i = ia.a(this.c, this.e, j) ^ (-1);
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b = ia.b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr2 = new Object[b];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.c = jArr;
                this.d = objArr2;
            }
            int i3 = this.e - i;
            if (i3 != 0) {
                long[] jArr3 = this.c;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3);
                Object[] objArr4 = this.d;
                System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
            }
            this.c[i] = j;
            this.d[i] = obj;
            this.e++;
            return;
        }
        this.d[a2] = obj;
    }

    public final void b(long j) {
        int a2 = ia.a(this.c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.b = true;
            }
        }
    }

    public final int b() {
        if (this.b) {
            a();
        }
        return this.e;
    }

    public final String toString() {
        if (b() > 0) {
            StringBuilder sb = new StringBuilder(this.e * 28);
            sb.append('{');
            for (int i = 0; i < this.e; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(a(i));
                sb.append('=');
                Object b = b(i);
                if (b == this) {
                    sb.append("(this Map)");
                } else {
                    sb.append(b);
                }
            }
            sb.append('}');
            return sb.toString();
        }
        return "{}";
    }

    public final Object b(int i) {
        if (this.b) {
            a();
        }
        return this.d[i];
    }
}