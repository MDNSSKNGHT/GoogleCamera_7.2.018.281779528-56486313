package defpackage;

import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: oeo  reason: default package */
/* loaded from: classes.dex */
public final class oeo implements oef {
    public final Object a;
    public pjr b;
    private final MediaFormat c;
    private final off d;
    private Handler e;
    private oet f;
    private boolean g;

    public /* synthetic */ oeo(MediaFormat mediaFormat, off offVar) {
        this.a = new Object();
        this.b = pju.INSTANCE;
        this.c = mediaFormat;
        this.e = null;
        this.d = offVar;
        this.f = new oet(oes.a);
        this.g = false;
    }

    @Override // defpackage.oef
    public final /* bridge */ /* synthetic */ oeg b() {
        Object a;
        try {
            synchronized (this.a) {
                pjr pjrVar = this.b;
                oet oetVar = this.f;
                oetVar.a = new oep(oetVar.a, this.d);
                a = pjrVar.a(new oec(this.c, this.d, this.f.a, this.e, this.g));
            }
            return (oeg) a;
        } catch (Throwable th) {
            throw new IllegalStateException("Could not build instance.", th);
        }
    }

    @Override // defpackage.oef
    public final /* bridge */ /* synthetic */ oef a(Handler handler) {
        this.e = handler;
        return this;
    }

    @Override // defpackage.oef
    public final /* bridge */ /* synthetic */ oef a(oes oesVar) {
        this.f = new oet(oesVar);
        return this;
    }

    @Override // defpackage.oef
    public final /* bridge */ /* synthetic */ oef a() {
        this.g = true;
        return this;
    }

    oeo() {
        this.a = new Object();
        this.b = pju.INSTANCE;
        this.c = null;
        this.d = null;
    }
}