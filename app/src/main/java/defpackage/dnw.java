package defpackage;

/* compiled from: PG */
/* renamed from: dnw */
/* loaded from: classes.dex */
final class dnw implements pkx {
    private final Object a = new Object();
    private final boolean b;
    private final gnq c;
    private giu d;
    private final /* synthetic */ dnx e;

    public /* synthetic */ dnw(dnx dnxVar, gnq gnqVar, boolean z) {
        this.e = dnxVar;
        this.b = z;
        this.c = gnqVar;
    }

    public final giu b() {
        giu giuVar;
        qdu.b(this.b, "Started RAW session when not requested");
        qdu.b(this.e.i.a(), "Starting RAW session with no image saver");
        synchronized (this.a) {
            if (this.d == null) {
                this.d = ((giv) this.e.i.b()).c(this.c);
            }
            giuVar = this.d;
        }
        return giuVar;
    }

    @Override // defpackage.pkx
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}