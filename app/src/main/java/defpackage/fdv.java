package defpackage;

/* compiled from: PG */
/* renamed from: fdv  reason: default package */
/* loaded from: classes.dex */
public final class fdv implements fdu {
    private final fdt a;
    private final mcs b;
    private final mcs c;
    private final mcs d;

    public fdv(fdt fdtVar, mcs mcsVar, mcs mcsVar2) {
        this.a = fdtVar;
        this.b = mdg.b(mcsVar);
        mcs b = mdg.b(mcsVar2);
        this.c = b;
        this.d = mdg.a(b, this.b);
    }

    @Override // defpackage.fdu
    public final fdt a() {
        return this.a;
    }

    @Override // defpackage.fdu
    public final mcs b() {
        return this.b;
    }

    @Override // defpackage.fdu
    public final mcs c() {
        return this.d;
    }
}
