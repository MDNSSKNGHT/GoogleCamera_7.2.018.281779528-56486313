package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

public class qdu {
    public static void a(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static boolean a(Collection collection, Collection collection2) {
        for (Object obj : collection2) {
            if (!collection.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public static void a(List list, pkc pkcVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!pkcVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException e) {
                        a(list, pkcVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException e2) {
                        a(list, pkcVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        d(comparator);
        d((Object) iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = pup.a;
            }
        } else if (iterable instanceof pvt) {
            comparator2 = ((pvt) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static String a(Map<?, ?> map) {
        int size = map.size();
        a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static pkx a(pkx pkxVar) {
        if ((pkxVar instanceof pkz) || (pkxVar instanceof pky)) {
            return pkxVar;
        }
        if (!(pkxVar instanceof Serializable)) {
            return new pkz(pkxVar);
        }
        return new pky(pkxVar);
    }

    public static Object[] a(Object... objArr) {
        return b(objArr, objArr.length);
    }

    public static pwx a(Iterator it, pkc pkcVar) {
        d((Object) it);
        d(pkcVar);
        return new ptf(it, pkcVar);
    }

    public static boolean a(Collection collection, Object obj) {
        d((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    public static Collection a(Collection collection, pkc pkcVar) {
        if (collection instanceof poy) {
            poy poyVar = (poy) collection;
            return new poy(poyVar.a, new pkd(Arrays.asList((pkc) d(poyVar.b), (pkc) d(pkcVar))));
        }
        return new poy((Collection) d((Object) collection), (pkc) d(pkcVar));
    }

    public static List a(List list) {
        if (list instanceof prr) {
            return ((prr) list).b();
        }
        if (list instanceof pto) {
            return ((pto) list).a;
        }
        if (list instanceof RandomAccess) {
            return new ptm(list);
        }
        return new pto(list);
    }

    public static List a(List list, pjr pjrVar) {
        if (list instanceof RandomAccess) {
            return new ptq(list, pjrVar);
        }
        return new pts(list, pjrVar);
    }


    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.util.List r6, java.lang.Object r7) {
        /*
            java.lang.Object r0 = d(r6)
            r1 = 1
            if (r7 == r0) goto L5e
            boolean r0 = r7 instanceof java.util.List
            r2 = 0
            if (r0 == 0) goto L5d
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 != r3) goto L5c
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L32
            r3 = 0
        L1d:
            if (r3 >= r0) goto L31
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = e(r4, r5)
            if (r4 == 0) goto L30
            int r3 = r3 + 1
            goto L1d
        L30:
            return r2
        L31:
            return r1
        L32:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L3a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L55
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r6.next()
            java.lang.Object r3 = r7.next()
            boolean r0 = e(r0, r3)
            if (r0 != 0) goto L3a
        L54:
            goto L5b
        L55:
            boolean r6 = r7.hasNext()
            r2 = r6 ^ 1
        L5b:
            return r2
        L5c:
        L5d:
            return r2
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdu.a(java.util.List, java.lang.Object):boolean");
    }

    public static Object[] a(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static pjy a(String str) {
        return new pjy(str);
    }

    public static void a(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(a(str, i, i2));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(a(str, obj));
    }

    public static void a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(a(str, obj, obj2, obj3));
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void b(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(a(str, obj));
    }

    public static Object b(Object obj) {
        return a(obj, "expected a non-null reference", new Object[0]);
    }

    public static ArrayList b(Iterable iterable) {
        d((Object) iterable);
        if (!(iterable instanceof Collection)) {
            return b(iterable.iterator());
        }
        return new ArrayList((Collection) iterable);
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public static boolean b(Iterable iterable, pkc pkcVar) {
        Iterator it = iterable.iterator();
        c(pkcVar, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!pkcVar.a(it.next())) {
                i++;
            } else if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    public static int b(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            String sb = "negative size: " +
                    i2;
            throw new IllegalArgumentException(sb);
        } else {
            a = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(a(str, i));
        }
    }

    public static void b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(a(str, j));
        }
    }

    public static ArrayList b(int i) {
        a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList b(Iterator it) {
        ArrayList e = e();
        a((Collection) e, it);
        return e;
    }

    public static int c(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static Object d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static ArrayList e() {
        return new ArrayList();
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static pkx c(Object obj) {
        return new pla(obj);
    }

    public static <T> T c(T obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Map c() {
        return new ppi((byte) 0);
    }

    public static Object[] e(Iterable iterable) {
        Collection b;
        if (iterable instanceof Collection) {
            b = (Collection) iterable;
        } else {
            b = b(iterable.iterator());
        }
        return b.toArray();
    }

    public static pjy e(Object obj) {
        return new pjy(obj.getClass().getSimpleName());
    }

    public static String a(String str, Object... objects) {
        return null;
    }
}
