package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: hse  reason: default package */
/* loaded from: classes.dex */
final class hse implements qpe {
    private final /* synthetic */ mos a;
    private final /* synthetic */ qqg b;

    public hse(mos mosVar, qqg qqgVar) {
        this.a = mosVar;
        this.b = qqgVar;
    }

    @Override // defpackage.qpe
    public final void a(Throwable th) {
        liu.a(hsh.a, "Error updating surfaceview");
        this.b.b((Object) false);
    }

    @Override // defpackage.qpe
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        liu.b(hsh.a);
        this.a.a((Surface) obj);
        this.b.b((Object) true);
    }
}