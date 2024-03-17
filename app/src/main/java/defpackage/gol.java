package defpackage;

/* compiled from: PG */
/* renamed from: gol  reason: default package */
/* loaded from: classes.dex */
public final class gol implements goq {
    private final goq a;
    private final mjw b;

    public gol(goq goqVar, mjw mjwVar) {
        this.a = goqVar;
        this.b = mjwVar;
    }

    @Override // defpackage.goq
    public final void a(gop gopVar, gnq gnqVar) {
        try {
            a(gch.RUNNING);
            this.a.a(gopVar, gnqVar);
        } finally {
            a(gch.IDLE);
        }
    }

    @Override // defpackage.goq
    public final mcs a() {
        return this.a.a();
    }

    @Override // defpackage.goq
    public final mcs b() {
        return this.a.b();
    }

    private final void a(gch gchVar) {
        this.b.a(gchVar);
    }
}