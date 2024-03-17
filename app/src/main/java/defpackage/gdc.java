package defpackage;

/* compiled from: PG */
/* renamed from: gdc */
/* loaded from: classes.dex */
public final class gdc implements rgg {
    private final rhd a;

    private gdc(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gdc a(rhd rhdVar) {
        return new gdc(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gdb((gcz) this.a.get());
    }
}