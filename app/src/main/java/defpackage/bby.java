package defpackage;

/* compiled from: PG */
/* renamed from: bby  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bby implements mjw {
    private final bca a;
    private final fad b;

    public bby(bca bcaVar, fad fadVar) {
        this.a = bcaVar;
        this.b = fadVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        bca bcaVar = this.a;
        fad fadVar = this.b;
        ils a = ils.a(((Integer) obj).intValue());
        ils ilsVar = bcaVar.d;
        if (a != ilsVar) {
            fadVar.a(ilsVar.b(), a.b(), bcaVar.c, bcaVar.b.b, bcaVar.a);
            bcaVar.d = a;
        }
    }
}