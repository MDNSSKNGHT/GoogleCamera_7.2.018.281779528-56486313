package defpackage;

/* compiled from: PG */
/* renamed from: opf  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class opf implements opd {
    private final oph a;
    private final String b;

    public opf(oph ophVar, String str) {
        this.a = ophVar;
        this.b = str;
    }

    @Override // defpackage.opd
    public final Object a() {
        return lzo.a(this.a.a.getContentResolver(), this.b, null);
    }
}