package defpackage;

/* compiled from: PG */
/* renamed from: pvg */
/* loaded from: classes.dex */
final class pvg extends prr {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public pvg(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qdu.b(i, this.c);
        return this.a[i + i + this.b];
    }
}