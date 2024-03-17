package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: pom  reason: default package */
/* loaded from: classes.dex */
public abstract class pom implements pue {
    private transient Set a;
    private transient Collection b;
    public transient Collection c;
    private transient Map d;

    @Override // defpackage.pue
    public void a(Object obj, Object obj2) {
        throw null;
    }

    public abstract Set d();

    public abstract Collection e();

    public Iterator f() {
        throw null;
    }

    public abstract Iterator g();

    public abstract Map h();

    @Override // defpackage.pue
    public final Map k() {
        Map map = this.d;
        if (map == null) {
            Map h = h();
            this.d = h;
            return h;
        }
        return map;
    }

    @Override // defpackage.pue
    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) k().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pue) {
                return k().equals(((pue) obj).k());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return k().hashCode();
    }

    @Override // defpackage.pue
    public final Set i() {
        Set set = this.a;
        if (set == null) {
            Set d = d();
            this.a = d;
            return d;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pue
    public final void a(Object obj, Iterable iterable) {
        qdu.d(iterable);
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty() || b(obj).addAll((Collection) iterable)) {
            }
            return;
        }
        //Iterator it = iterable.iterator();
        //if (!it.hasNext() || qdu.a(b(obj), it)) {
        //}
    }

    @Override // defpackage.pue
    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) k().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return k().toString();
    }

    @Override // defpackage.pue
    public final Collection j() {
        Collection collection = this.b;
        if (collection == null) {
            Collection e = e();
            this.b = e;
            return e;
        }
        return collection;
    }
}