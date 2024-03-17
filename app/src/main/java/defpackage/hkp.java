package defpackage;

/* compiled from: PG */
/* renamed from: hkp  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hkp implements pkx {
    private final mcs a;
    private final pkx b;

    public hkp(mcs mcsVar, pkx pkxVar) {
        this.a = mcsVar;
        this.b = pkxVar;
    }

    @Override // defpackage.pkx
    public final Object a() {
        mcs mcsVar = this.a;
        pkx pkxVar = this.b;
        ils ilsVar = (ils) mcsVar.a();
        boolean z = false;
        if (ilsVar != null && !ilsVar.a() && ((Boolean) pkxVar.a()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}