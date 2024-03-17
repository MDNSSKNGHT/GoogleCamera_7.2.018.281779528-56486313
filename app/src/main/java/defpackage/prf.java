package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: prf  reason: default package */
/* loaded from: classes.dex */
public class prf {
    public Object[] a;
    public int b;
    public boolean c;

    public prf(int i) {
        qdu.a(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public final void a(Object obj) {
        qdu.d(obj);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.b + collection.size());
            if (collection instanceof prg) {
                this.b = ((prg) collection).a(this.a, this.b);
                return;
            }
        }
        for (Object obj : iterable) {
            b(obj);
        }
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, a(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}