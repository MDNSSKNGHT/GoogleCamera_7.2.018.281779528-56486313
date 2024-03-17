package defpackage;

/* compiled from: PG */
/* renamed from: ptj  reason: default package */
/* loaded from: classes.dex */
final class ptj extends pwy {
    public static final pwy a = new ptj(new Object[0]);
    private final Object[] b;

    private ptj(Object[] objArr) {
        super(0, 0);
        this.b = objArr;
    }

    @Override // defpackage.pwy
    protected final Object a(int i) {
        return this.b[i];
    }
}