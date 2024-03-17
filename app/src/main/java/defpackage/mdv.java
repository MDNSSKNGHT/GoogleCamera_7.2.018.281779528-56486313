package defpackage;

/* compiled from: PG */
/* renamed from: mdv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class mdv implements pjr {
    private final mdw a;

    public mdv(mdw mdwVar) {
        this.a = mdwVar;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        mdw mdwVar = this.a;
        qdu.d(obj);
        Object c = mdwVar.c(obj);
        if (c == null) {
            String valueOf = String.valueOf(obj);
            String name = mdwVar.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(name).length());
            sb.append("Transforming input value: ");
            sb.append(valueOf);
            sb.append(" resulted in a null output value for: ");
            sb.append(name);
            throw new NullPointerException(sb.toString());
        }
        return c;
    }
}
