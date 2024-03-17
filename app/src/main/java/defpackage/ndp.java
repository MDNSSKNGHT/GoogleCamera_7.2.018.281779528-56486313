package defpackage;

import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: ndp  reason: default package */
/* loaded from: classes.dex */
public class ndp implements ndj {
    private final ndj a;

    public ndp(ndj ndjVar) {
        this.a = ndjVar;
    }

    @Override // defpackage.ndj, defpackage.mjq, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.ndj
    public final ndl a(int i) throws mmh {
        return this.a.a(i);
    }

    @Override // defpackage.ndj
    public final void a(ndw ndwVar) throws mmh {
        this.a.a(ndwVar);
    }

    @Override // defpackage.ndj
    public final void a(List list, ndg ndgVar, Handler handler) throws mmh {
        this.a.a(list, ndgVar, handler);
    }

    @Override // defpackage.ndj
    public final void c(List list, ndg ndgVar, Handler handler) throws mmh {
        this.a.c(list, ndgVar, handler);
    }

    @Override // defpackage.ndj
    public final void b(List list, ndg ndgVar, Handler handler) throws mmh {
        this.a.b(list, ndgVar, handler);
    }

    @Override // defpackage.ndj
    public final String a() {
        return this.a.a();
    }
}