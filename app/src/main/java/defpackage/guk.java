package defpackage;

/* compiled from: PG */
/* renamed from: guk */
/* loaded from: classes.dex */
final class guk implements gvu {
    private final /* synthetic */ gun a;

    public guk(gun gunVar) {
        this.a = gunVar;
    }

    @Override // defpackage.gvu
    public final void b() {
        if (!this.a.e.g() || this.a.e.h()) {
            this.a.e.a(true, false);
        }
        if (this.a.f.h() != this.a.f.o()) {
            this.a.f.g();
        }
        this.a.aD.a(false);
    }

    @Override // defpackage.gvu
    public final void a() {
        this.a.e.a(true);
        this.a.f.f();
        if (!this.a.g.a("default_scope", "perf_has_shown_options_bar")) {
            this.a.g.a("default_scope", "perf_has_shown_options_bar", true);
        }
        this.a.aD.a(true);
    }
}