package defpackage;

/* compiled from: PG */
/* renamed from: cao  reason: default package */
/* loaded from: classes.dex */
public abstract class cao {
    private static final String a = liu.a("CdrSState");
    private final Object b = new Object();

    public abstract mdl a();

    public abstract mdl b();

    public abstract mdl c();

    public abstract mdl d();

    public abstract mdl e();

    public abstract mdl f();

    public abstract mdl g();

    public abstract mdl h();

    public abstract mdl i();

    public abstract mdl j();

    public abstract mdl k();

    public abstract mdl l();

    public abstract mdl m();

    public abstract mdl n();

    public abstract mdl o();

    public abstract mdl p();

    public abstract mdl q();

    public abstract mcs r();

    public abstract mcs s();

    public abstract mcs t();

    public abstract mcs u();

    public abstract mcs v();

    public abstract mcs w();

    public abstract gtl x();

    public static can y() {
        return new can((byte) 0);
    }

    public final void a(cal calVar) {
        synchronized (this.b) {
            if (calVar != m().a()) {
                String str = a;
                String valueOf = String.valueOf(m().a());
                String valueOf2 = String.valueOf(calVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
                sb.append("update module state: ");
                sb.append(valueOf);
                sb.append(" -> ");
                sb.append(valueOf2);
                sb.toString();
                liu.b(str);
                m().a(calVar);
            }
        }
    }
}