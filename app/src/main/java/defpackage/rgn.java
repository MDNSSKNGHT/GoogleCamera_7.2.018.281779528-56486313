package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: rgn  reason: default package */
/* loaded from: classes2.dex */
public final class rgn implements rgg {
    public static final rgg a = rgh.a(Collections.emptySet());
    private final List b;
    private final List c;

    public /* synthetic */ rgn(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public static rgm a(int i, int i2) {
        return new rgm(i, i2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public final Set a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((rhd) this.c.get(i2)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(rgk.c(i));
        int size3 = this.b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hashSet.add(rgk.a(((rhd) this.b.get(i3)).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                hashSet.add(rgk.a(obj));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}