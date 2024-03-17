package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bjl  reason: default package */
/* loaded from: classes.dex */
public final class bjl implements iyf {
    private static final String a = liu.a("FontPreload");
    private final Executor b;
    private final Application c;
    private final mkn d;

    public bjl(Application application, Executor executor, mkn mknVar) {
        this.b = executor;
        this.c = application;
        this.d = mknVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        Context baseContext = this.c.getBaseContext();
        try {
            kq.a(baseContext, 2131296256);
            kq.a(baseContext, 2131296258);
        } catch (Resources.NotFoundException e) {
            liu.b(a, "NotFoundException was thrown while preloading font: ", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.execute(this.d.a("preloading font", new bjk(this)));
    }
}
