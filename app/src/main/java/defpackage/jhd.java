package defpackage;

/* compiled from: PG */
/* renamed from: jhd  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class jhd implements pkc {
    private final mix a;
    private final mjs b;

    public jhd(mix mixVar, mjs mjsVar) {
        this.a = mixVar;
        this.b = mjsVar;
    }

    @Override // defpackage.pkc
    public final boolean a(Object obj) {
        mjs mjsVar = this.b;
        mjs mjsVar2 = (mjs) obj;
        return mix.a((mjs) qdu.d(mjsVar2)).a(this.a) && mjsVar2.e().a <= mjsVar.a && mjsVar2.e().b <= mjsVar.b;
    }
}