package defpackage;

/* compiled from: PG */
/* renamed from: gsh  reason: default package */
/* loaded from: classes.dex */
final class gsh extends mrx {
    public final fad a;
    private final mbe b;

    public gsh(fad fadVar, mbe mbeVar) {
        this.a = fadVar;
        this.b = mbeVar;
    }

    @Override // defpackage.mrx
    public final void a(ndk ndkVar) {
        if (ndkVar.b() == 0) {
            this.b.execute(new gsg(this));
        }
    }
}