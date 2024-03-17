package defpackage;

/* compiled from: PG */
/* renamed from: prn  reason: default package */
/* loaded from: classes.dex */
final class prn extends pwy {
    private final prr a;

    public prn(prr prrVar, int i) {
        super(prrVar.size(), i);
        this.a = prrVar;
    }

    @Override // defpackage.pwy
    protected final Object a(int i) {
        return this.a.get(i);
    }
}