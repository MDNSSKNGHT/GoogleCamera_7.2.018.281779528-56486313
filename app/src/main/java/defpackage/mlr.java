package defpackage;

/* compiled from: PG */
/* renamed from: mlr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class mlr implements mjq {
    private final mlx a;

    public mlr(mlx mlxVar) {
        this.a = mlxVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.c();
    }
}