package defpackage;

/* compiled from: PG */
/* renamed from: dpg  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dpg implements pjr {
    private final myo a;
    private final cin b;
    private final cqo c;
    private final mdl d;

    public dpg(myo myoVar, cin cinVar, cqo cqoVar, mdl mdlVar) {
        this.a = myoVar;
        this.b = cinVar;
        this.c = cqoVar;
        this.d = mdlVar;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        myo myoVar = this.a;
        cin cinVar = this.b;
        cqo cqoVar = this.c;
        mdl mdlVar = this.d;
        Integer num = (Integer) obj;
        boolean z = false;
        if (myoVar.N() == mzg.FRONT && cinVar.c(cij.c) && ilu.a(num.intValue()).a()) {
            z = true;
        }
        return (z || cqoVar.d() || ((Boolean) mdlVar.a()).booleanValue()) ? doo.YUV : doo.JPEG;
    }
}
