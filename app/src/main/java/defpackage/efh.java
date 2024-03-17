package defpackage;

/* compiled from: PG */
/* renamed from: efh */
/* loaded from: classes.dex */
final class efh implements epv {
    public final rhd a;
    public final rhd b;
    public final rhd c;
    public final rhd d;
    public final rhd e;
    public final rhd f;
    public final rhd g;
    public final rhd h;
    public final rhd i;
    public final rhd j;
    public final rhd k;
    public final rhd l;
    public final rhd m;
    public final rhd n;
    public final rhd o;
    public final rhd p;
    public final rhd q;
    public final /* synthetic */ efw r;

    public /* synthetic */ efh(efw efwVar, ggx ggxVar, epc epcVar, gtc gtcVar) {
        this.r = efwVar;
        this.a = new ggz(ggxVar);
        this.b = new gte(gtcVar);
        this.c = new ggy(ggxVar);
        this.d = new epd(epcVar);
        this.e = new epk(epcVar);
        this.f = new epi(epcVar, this.a);
        this.g = new gre(this.c, this.r.i);
        efw efwVar2 = this.r;
        this.h = new grf(efwVar2.bn, efwVar2.bo, this.c);
        this.i = new eph(epcVar);
        this.j = new gtd(gtcVar);
        this.k = new epf(epcVar);
        this.l = new epg(epcVar);
        efw efwVar3 = this.r;
        this.m = new grd(this.c, efwVar3.bv, efwVar3.bw);
        this.n = new epj(epcVar);
        this.o = new epl(epcVar);
        this.p = new epm(epcVar);
        this.q = rgf.a(new epe(epcVar));
    }

    @Override // defpackage.epv
    public final epw d() {
        return new efc(this);
    }

    @Override // defpackage.epv
    public final epx b() {
        return new efd(this);
    }

    @Override // defpackage.epv
    public final epy c() {
        return new efe(this);
    }

    @Override // defpackage.epv
    public final epu e() {
        return new eff(this);
    }

    @Override // defpackage.epv
    public final epz a() {
        return new efg(this);
    }
}