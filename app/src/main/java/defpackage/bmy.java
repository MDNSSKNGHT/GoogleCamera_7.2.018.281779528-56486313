package defpackage;

/* compiled from: PG */
/* renamed from: bmy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bmy implements bmx {
    private final Runnable a;

    public bmy(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.bmx
    public final qpp Z() {
        this.a.run();
        return rgk.b((Object) true);
    }
}