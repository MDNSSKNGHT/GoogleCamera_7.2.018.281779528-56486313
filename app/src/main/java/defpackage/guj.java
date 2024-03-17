package defpackage;

/* compiled from: PG */
/* renamed from: guj */
/* loaded from: classes.dex */
final /* synthetic */ class guj implements pkc {
    private final ilt a;

    public guj(ilt iltVar) {
        this.a = iltVar;
    }

    @Override // defpackage.pkc
    public final boolean a(Object obj) {
        mix mixVar;
        ilt iltVar = this.a;
        mix a = mix.a((mjs) qdu.d((mjs) obj));
        ilt iltVar2 = ilt.SIXTEEN_BY_NINE;
        ils ilsVar = ils.ON;
        ilu iluVar = ilu.OFF;
        int ordinal = iltVar.ordinal();
        if (ordinal != 0) {
            mixVar = ordinal != 1 ? mix.b : mix.a;
        } else {
            mixVar = mix.b;
        }
        return a.a(mixVar);
    }
}