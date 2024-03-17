package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* renamed from: pof  reason: default package */
/* loaded from: classes.dex */
public abstract class pof extends pom implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map<Object, Collection> a;
    public transient int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public pof(Map map) {
        qdu.c(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public Collection a(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.pue
    public final int b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(pof pofVar) {
        pofVar.b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(pof pofVar) {
        pofVar.b--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(pof pofVar, int i) {
        pofVar.b += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(pof pofVar, int i) {
        pofVar.b -= i;
    }

    @Override // defpackage.pue
    public final void c() {
        for (Collection collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    @Override // defpackage.pom
    public final Map h() {
        return new pnv(this, this.a);
    }

    @Override // defpackage.pom
    public final Set d() {
        return new pny(this, this.a);
    }

    @Override // defpackage.pom
    public final Collection e() {
        return new pol(this);
    }

    @Override // defpackage.pom
    public final Iterator g() {
        return new pns(this);
    }

    @Override // defpackage.pue
    public Collection b(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return a(obj, collection);
    }

    @Override // defpackage.pom, defpackage.pue
    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
                return;
            }
            return;
        }
        Collection a = a();
        if (!a.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Map<Object, Collection> map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            qdu.c(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.pom
    public final Iterator f() {
        return new pnr(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List a(Object obj, List list, pob pobVar) {
        if (list instanceof RandomAccess) {
            return new pnz(this, obj, list, pobVar);
        }
        return new pod(this, obj, list, pobVar);
    }
}