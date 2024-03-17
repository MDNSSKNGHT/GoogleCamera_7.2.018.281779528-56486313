package defpackage;

/* compiled from: PG */
/* renamed from: cfy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cfy implements pjr {
    private final cga a;
    private final cak b;

    public cfy(cga cgaVar, cak cakVar) {
        this.a = cgaVar;
        this.b = cakVar;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        cga cgaVar = this.a;
        cak cakVar = this.b;
        Long l = (Long) obj;
        if (l.longValue() < 0) {
            String valueOf = String.valueOf(l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("The storage space is too low. available space (byte)=");
            sb.append(valueOf);
            liu.a("VideoRecFac", sb.toString());
            cgaVar.k.b();
        }
        return cakVar.k().a() ? Long.valueOf(Math.min(l.longValue(), ((Long) cakVar.k().b()).longValue())) : l;
    }
}