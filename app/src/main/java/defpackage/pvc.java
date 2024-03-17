package defpackage;

/* compiled from: PG */
/* renamed from: pvc  reason: default package */
/* loaded from: classes.dex */
final class pvc extends prr {
    public static final prr a = new pvc(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    @Override // defpackage.prg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.prg
    public final Object[] h() {
        return this.b;
    }

    @Override // defpackage.prg
    public final int i() {
        return 0;
    }

    @Override // defpackage.prg
    public final int j() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public pvc(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.prr, defpackage.prg
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qdu.b(i, this.c);
        return this.b[i];
    }
}