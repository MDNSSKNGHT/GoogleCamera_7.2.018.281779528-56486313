package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public class ip {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    public Object[] a;
    public int b;
    private int[] g;

    public ip() {
        this.g = ia.a;
        this.a = ia.b;
        this.b = 0;
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final int size() {
        return this.b;
    }

    public ip(int i) {
        if (i == 0) {
            this.g = ia.a;
            this.a = ia.b;
        } else {
            e(i);
        }
        this.b = 0;
    }

    public ip(ip ipVar) {
        this();
        a(ipVar);
    }

    private final void e(int i) {
        if (i == 8) {
            synchronized (ip.class) {
                if (e != null) {
                    Object[] objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ip.class) {
                if (c != null) {
                    Object[] objArr2 = c;
                    this.a = objArr2;
                    c = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.a = new Object[i + i];
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return ia.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            this.g = ia.a;
            this.a = ia.b;
            this.b = 0;
            a(iArr, objArr, i);
        }
        if (this.b <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.g;
        if (iArr.length < i) {
            Object[] objArr = this.a;
            e(i);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2 + i2);
            }
            a(iArr, objArr, i2);
        }
        if (this.b == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ip) {
                ip ipVar = (ip) obj;
                if (this.b == ipVar.b) {
                    for (int i = 0; i < this.b; i++) {
                        try {
                            Object b = b(i);
                            Object c2 = c(i);
                            Object obj2 = ipVar.get(b);
                            if (c2 != null) {
                                if (!c2.equals(obj2)) {
                                    return false;
                                }
                            } else if (obj2 != null || !ipVar.containsKey(b)) {
                                return false;
                            }
                        } catch (ClassCastException e2) {
                            return false;
                        } catch (NullPointerException e3) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.b == map.size()) {
                    for (int i2 = 0; i2 < this.b; i2++) {
                        try {
                            Object b2 = b(i2);
                            Object c3 = c(i2);
                            Object obj3 = map.get(b2);
                            if (c3 == null) {
                                if (obj3 != null || !map.containsKey(b2)) {
                                    return false;
                                }
                            } else if (!c3.equals(obj3)) {
                                return false;
                            }
                        } catch (ClassCastException e4) {
                            return false;
                        } catch (NullPointerException e5) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (ip.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        } else if (length == 4) {
            synchronized (ip.class) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a = a(obj);
        return a >= 0 ? this.a[a + a + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    private final int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            int a = a(this.g, i2, i);
            if (a >= 0 && !obj.equals(this.a[a + a])) {
                int i3 = a + 1;
                while (i3 < i2 && this.g[i3] == i) {
                    if (obj.equals(this.a[i3 + i3])) {
                        return i3;
                    }
                    i3++;
                }
                for (int i4 = a - 1; i4 >= 0 && this.g[i4] == i; i4--) {
                    if (obj.equals(this.a[i4 + i4])) {
                        return i4;
                    }
                }
                return i3 ^ (-1);
            }
            return a;
        }
        return -1;
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    private final int a() {
        int i = this.b;
        if (i != 0) {
            int a = a(this.g, i, 0);
            if (a >= 0 && this.a[a + a] != null) {
                int i2 = a + 1;
                while (i2 < i && this.g[i2] == 0) {
                    if (this.a[i2 + i2] == null) {
                        return i2;
                    }
                    i2++;
                }
                for (int i3 = a - 1; i3 >= 0 && this.g[i3] == 0; i3--) {
                    if (this.a[i3 + i3] == null) {
                        return i3;
                    }
                }
                return i2 ^ (-1);
            }
            return a;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(Object obj) {
        int i = this.b;
        int i2 = i + i;
        Object[] objArr = this.a;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object b(int i) {
        return this.a[i + i];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int a;
        int i2 = this.b;
        if (obj == null) {
            a = a();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a = a(obj, hashCode);
        }
        if (a >= 0) {
            int i3 = a + a + 1;
            Object[] objArr = this.a;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = a ^ (-1);
        int[] iArr = this.g;
        int length = iArr.length;
        if (i2 >= length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.a;
            e(i5);
            if (i2 == this.b) {
                int[] iArr2 = this.g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.a, 0, objArr2.length);
                }
                a(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.g;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.a;
            int i7 = this.b - i4;
            System.arraycopy(objArr3, i4 + i4, objArr3, i6 + i6, i7 + i7);
        }
        int i8 = this.b;
        if (i2 == i8) {
            int[] iArr4 = this.g;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.a;
                int i9 = i4 + i4;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.b = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void a(ip ipVar) {
        int i = ipVar.b;
        a(this.b + i);
        if (this.b != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ipVar.b(i2), ipVar.c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(ipVar.g, 0, this.g, 0, i);
            System.arraycopy(ipVar.a, 0, this.a, 0, i + i);
            this.b = i;
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int a = a(obj);
        if (a < 0) {
            return null;
        }
        return d(a);
    }

    public final boolean remove(Object obj, Object obj2) {
        int a = a(obj);
        if (a >= 0) {
            Object c2 = c(a);
            if (obj2 == c2 || (obj2 != null && obj2.equals(c2))) {
                d(a);
                return true;
            }
            return false;
        }
        return false;
    }

    public Object d(int i) {
        Object[] objArr = this.a;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.b;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.g, objArr, i3);
            this.g = ia.a;
            this.a = ia.b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.g;
            int length = iArr.length;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.a;
                    System.arraycopy(objArr2, i6 + i6, objArr2, i2, i7 + i7);
                }
                Object[] objArr3 = this.a;
                int i8 = i5 + i5;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                e(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.g, 0, i);
                    System.arraycopy(objArr, 0, this.a, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.g, i, i10);
                    System.arraycopy(objArr, i9 + i9, this.a, i2, i10 + i10);
                }
            }
            i4 = i5;
        }
        if (i3 == this.b) {
            this.b = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object replace(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            return null;
        }
        return a(a, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a = a(obj);
        if (a >= 0) {
            Object c2 = c(a);
            if (c2 == obj2 || (obj2 != null && obj2.equals(c2))) {
                a(a, obj3);
                return true;
            }
            return false;
        }
        return false;
    }

    public Object a(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 28);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c2 = c(i);
            if (c2 == this) {
                sb.append("(this Map)");
            } else {
                sb.append(c2);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object c(int i) {
        return this.a[i + i + 1];
    }
}