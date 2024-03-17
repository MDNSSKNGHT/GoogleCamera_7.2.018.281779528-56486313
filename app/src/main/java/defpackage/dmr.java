package defpackage;

/* compiled from: PG */
/* renamed from: dmr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dmr implements gmn {
    private final ebe a;

    public dmr(ebe ebeVar) {
        this.a = ebeVar;
    }

    @Override // defpackage.gmn, java.lang.Runnable
    public final void run() {
        this.a.close();
    }
}