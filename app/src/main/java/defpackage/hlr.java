package defpackage;

/* compiled from: PG */
/* renamed from: hlr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hlr implements Runnable {
    private final hlv a;

    public hlr(hlv hlvVar) {
        this.a = hlvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hlv hlvVar = this.a;
        if (((Boolean) ((mch) hlvVar.f).c).booleanValue()) {
            liu.f(hlv.a);
            return;
        }
        qqg qqgVar = hlvVar.h;
        if (qqgVar != null) {
            qqgVar.b((Object) null);
        }
    }
}