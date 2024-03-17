package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdu  reason: default package */
/* loaded from: classes.dex */
public abstract class mdu implements mcs {
    private final mcs a;
    private final mcs b;

    /* JADX INFO: Access modifiers changed from: protected */
    public mdu(mcs mcsVar) {
        this.a = mcsVar;
        this.b = mdg.b(new mdt(this, mcsVar));
    }

    protected abstract Object a(Object obj);

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.b.a(mjwVar, executor);
    }

    public final Object b(Object obj) {
        if (obj == null) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Input: ");
            sb.append(valueOf);
            sb.append(" returned a null value");
            throw new NullPointerException(sb.toString());
        }
        Object a = a(obj);
        if (a == null) {
            String valueOf2 = String.valueOf(obj);
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58 + String.valueOf(name).length());
            sb2.append("Transforming input value: ");
            sb2.append(valueOf2);
            sb2.append(" resulted in a null output for: ");
            sb2.append(name);
            throw new NullPointerException(sb2.toString());
        }
        return a;
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.b.a();
    }
}