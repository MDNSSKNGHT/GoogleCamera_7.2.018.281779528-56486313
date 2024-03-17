package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdw  reason: default package */
/* loaded from: classes.dex */
public abstract class mdw implements mdl {
    private final mdl a;
    private final mcs b;

    /* JADX INFO: Access modifiers changed from: protected */
    public mdw(mdl mdlVar) {
        this.a = mdlVar;
        this.b = mdg.a(mdlVar, new mdv(this));
    }

    protected abstract Object b(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(Object obj);

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.b.a(mjwVar, executor);
    }

    public Object a() {
        return this.b.a();
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        mdl mdlVar = this.a;
        qdu.d(obj);
        Object b = b(obj);
        if (b == null) {
            String valueOf = String.valueOf(obj);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(name).length());
            sb.append("Transforming output value: ");
            sb.append(valueOf);
            sb.append(" resulted in a null input value for: ");
            sb.append(name);
            throw new NullPointerException(sb.toString());
        }
        mdlVar.a(b);
    }
}
