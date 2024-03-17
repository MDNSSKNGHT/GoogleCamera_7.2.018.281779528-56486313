package defpackage;

/* compiled from: PG */
/* renamed from: psj  reason: default package */
/* loaded from: classes.dex */
public class psj extends prf {
    public psj() {
        super(4);
    }

    @Override // defpackage.prf
    public /* bridge */ /* synthetic */ void b(Object obj) {
        c(obj);
    }

    public psj c(Object obj) {
        qdu.d(obj);
        super.a(obj);
        return this;
    }

    public psj b(Iterable iterable) {
        qdu.d((Object) iterable);
        super.a(iterable);
        return this;
    }

    public psl a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return psl.c(this.a[0]);
            }
            psl a = null; //psl.a(i, this.a);
            this.b = a.size();
            this.c = true;
            return a;
        }
        return pvi.a;
    }
}
