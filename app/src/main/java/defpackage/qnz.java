package defpackage;

/* compiled from: PG */
/* renamed from: qnz  reason: default package */
/* loaded from: classes.dex */
final class qnz extends qob {
    public qnz(qpp qppVar, qol qolVar) {
        super(qppVar, qolVar);
    }

    @Override // defpackage.qob
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        qol qolVar = (qol) obj;
        qpp a = qolVar.a(obj2);
        qdu.a(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qolVar);
        return a;
    }

    @Override // defpackage.qob
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((qpp) obj);
    }
}