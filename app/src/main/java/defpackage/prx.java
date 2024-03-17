package defpackage;

import j$.util.Map$$CC;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: prx */
/* loaded from: classes.dex */
public abstract class prx implements Map, Serializable, j$.util.Map {
    private transient psl a;
    private transient psl b;
    private transient prg c;

    public abstract prg c();

    public final Object compute(Object obj, BiFunction biFunction) {
        return Map$$CC.compute$$dflt$$(this, obj, biFunction);
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        return Map$$CC.computeIfAbsent$$dflt$$(this, obj, function);
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map$$CC.computeIfPresent$$dflt$$(this, obj, biFunction);
    }

    public abstract boolean e();

    public abstract psl f();

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map$$CC.forEach$$dflt$$(this, biConsumer);
    }

    public abstract psl g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map$$CC.merge$$dflt$$(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return Map$$CC.putIfAbsent$$dflt$$(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return Map$$CC.remove$$dflt$$(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        return Map$$CC.replace$$dflt$$(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return Map$$CC.replace$$dflt$$(this, obj, obj2, obj3);
    }

    public final void replaceAll(BiFunction biFunction) {
        Map$$CC.replaceAll$$dflt$$(this, biFunction);
    }

    public static prt h() {
        return new prt();
    }

    public static prt a(int i) {
        qdu.a(i, "expectedSize");
        return new prt(i);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().contains(obj);
    }

    public static prx a(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z = entrySet instanceof Collection;
        prt prtVar = new prt(!z ? 4 : entrySet.size());
        if (z) {
            prtVar.a(prtVar.b + entrySet.size());
        }
        for (Map.Entry entry : entrySet) {
            prtVar.a(entry.getKey(), entry.getValue());
        }
        return prtVar.a();
    }

    public final psl i() {
        psl pslVar = this.a;
        if (pslVar == null) {
            psl g = g();
            this.a = g;
            return g;
        }
        return pslVar;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return i();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Map) {
                return entrySet().equals(((Map) obj).entrySet());
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return qdu.a((Set) i());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public pwx as() {
        return new prs(i().ar());
    }

    public psl j() {
        psl pslVar = this.b;
        if (pslVar == null) {
            psl f = f();
            this.b = f;
            return f;
        }
        return pslVar;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return j();
    }

    public static prx b(Object obj, Object obj2) {
        qdu.b(obj, obj2);
        return pvh.a(1, new Object[]{obj, obj2});
    }

    public static prx b(Object obj, Object obj2, Object obj3, Object obj4) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        return pvh.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static prx b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        return pvh.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static prx b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        qdu.b(obj7, obj8);
        return pvh.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static prx b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        qdu.b(obj7, obj8);
        qdu.b(obj9, obj10);
        return pvh.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return qdu.a((Map) this);
    }

    public prg d() {
        prg prgVar = this.c;
        if (prgVar == null) {
            prg c = c();
            this.c = c;
            return c;
        }
        return prgVar;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return d();
    }

    Object writeReplace() {
        return new prw(this);
    }
}