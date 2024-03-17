package defpackage;

/* compiled from: PG */
/* renamed from: hla  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hla implements pjr {
    private final myo a;

    public hla(myo myoVar) {
        this.a = myoVar;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        ils ilsVar = (ils) obj;
        float f = 0.0f;
        if (this.a.N() == mzg.FRONT) {
            ils ilsVar2 = ils.ON;
            int ordinal = ilsVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                f = 2.0f;
            } else if (ordinal == 3) {
                f = 1.0f;
            }
        } else {
            ils ilsVar3 = ils.ON;
            if (ilsVar.ordinal() == 2) {
                f = 0.833f;
            }
        }
        return Float.valueOf(f);
    }
}