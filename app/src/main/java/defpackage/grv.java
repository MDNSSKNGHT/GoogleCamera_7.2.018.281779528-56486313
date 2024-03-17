package defpackage;

/* compiled from: PG */
/* renamed from: grv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class grv implements jez {
    private final int a;
    private final int b;
    private final mch c;

    public grv(int i, int i2, mch mchVar) {
        this.a = i;
        this.b = i2;
        this.c = mchVar;
    }

    @Override // defpackage.jez
    public final void a(jfa jfaVar) {
        int i = this.a;
        int i2 = this.b;
        mch mchVar = this.c;
        jfa jfaVar2 = jfa.NORMAL;
        int ordinal = jfaVar.ordinal();
        if (ordinal == 4 || ordinal == 5 || ordinal == 6) {
            i = i2;
        }
        if (i != ((Integer) mchVar.c).intValue()) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Updating metering period to ");
            sb.append(i);
            liu.b("PckSmrtMtrMdl", sb.toString());
            mchVar.a(Integer.valueOf(i));
        }
    }
}