package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: pss  reason: default package */
/* loaded from: classes.dex */
public final class pss extends psj {
    private final Comparator d;

    public pss(Comparator comparator) {
        this.d = (Comparator) qdu.d(comparator);
    }

    @Override // defpackage.psj, defpackage.prf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.psj
    public final /* bridge */ /* synthetic */ psj c(Object obj) {
        super.c(obj);
        return this;
    }

    @Override // defpackage.psj
    public final /* bridge */ /* synthetic */ psj b(Iterable iterable) {
        super.b(iterable);
        return this;
    }

    @Override // defpackage.psj
    public final /* bridge */ /* synthetic */ psl a() {
        return b();
    }

    public final psu b() {
        pvj a;
        Object[] objArr = this.a;
        Comparator comparator = this.d;
        int i = this.b;
        if (i != 0) {
            qdu.b(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            a = new pvj(prr.b(objArr, i2), comparator);
        } else {
            a = psu.a(comparator);
        }
        this.b = a.size();
        this.c = true;
        return a;
    }
}