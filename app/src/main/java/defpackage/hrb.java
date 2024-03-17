package defpackage;

/* compiled from: PG */
/* renamed from: hrb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hrb implements Runnable {
    private final hrc a;
    private final String b;

    public hrb(hrc hrcVar, String str) {
        this.a = hrcVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.a;
        String str = this.b;
        String str2 = hrc.a;
        if (str.length() != 0) {
            "Active camera id: ".concat(str);
        } else {
            new String("Active camera id: ");
        }
        liu.b(str2);
        hrcVar.b.a(str);
    }
}