package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: pnp  reason: default package */
/* loaded from: classes.dex */
public abstract class pnp extends pwx {
    private Object a;
    private int b = 2;

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b() {
        this.b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        qdu.d(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 2) {
                    this.b = 4;
                    this.a = a();
                    if (this.b != 3) {
                        this.b = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        Object obj = this.a;
        this.a = null;
        return obj;
    }
}