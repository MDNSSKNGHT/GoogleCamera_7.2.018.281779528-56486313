package defpackage;

import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: oem  reason: default package */
/* loaded from: classes.dex */
public final class oem implements oei {
    private final oey b;
    private volatile pjz e;
    private final Object f;
    private final qqg g = qqg.f();
    private final qqg h = qqg.f();
    private final qqg i = qqg.f();
    public final List<oen> a = Collections.synchronizedList(new ArrayList<>());
    private boolean c = false;
    private boolean d = false;

    public oem(oey oeyVar) {
        this.b = oeyVar;
        pix pixVar = pix.a;
        this.e = pix.a;
        this.f = new Object();
    }

    public oem(File file, Executor executor) {
        this.b = ((ofn) ofq.a(executor).a(file)).a(this.g, this.h).a(this.i).a();
        pix pixVar = pix.a;
        this.e = pix.a;
        this.f = new Object();
    }

    @Override // defpackage.oei
    public final /* bridge */ /* synthetic */ oee b(MediaFormat mediaFormat) {
        oed oedVar = new oed(this.b.a(ofe.a(mediaFormat)));
        this.a.add(oedVar);
        return oedVar;
    }

    @Override // defpackage.oei
    public final /* bridge */ /* synthetic */ oef a(MediaFormat mediaFormat) {
        qqg f = qqg.f();
        oeo oeoVar = new oeo(mediaFormat, this.b.a(ofe.a(mediaFormat, f)));
        oej oejVar = new oej(this, mediaFormat, f);
        synchronized (oeoVar.a) {
            oeoVar.b = new pjt(oejVar, oeoVar.b);
        }
        return oeoVar;
    }

    @Override // defpackage.oei
    public final synchronized qpp b() {
        if (!this.d) {
            return rgk.b((Object) true);
        }
        if (!this.c) {
            for (oen oenVar : this.a) {
                oenVar.f();
            }
        }
        this.c = true;
        qqg f = qqg.f();
        rgk.a(this.b.b(), new oel(f), qot.INSTANCE);
        return f;
    }

    @Override // defpackage.oei
    public final synchronized void d() {
        for (oen oenVar : this.a) {
            oenVar.g();
        }
    }

    @Override // defpackage.oei
    public final void a(int i) {
        this.e = pjz.b(Integer.valueOf(i));
    }

    @Override // defpackage.oei
    public final synchronized void a() {
        if (!this.d) {
            synchronized (this.f) {
                this.g.b((Object) null);
                this.h.b((Object) null);
            }
            this.i.b((Integer) this.e.c());
            this.b.a();
            for (oen oenVar : this.a) {
                oenVar.a();
            }
            this.d = true;
        } else {
            throw new IllegalStateException("MediaEncoder already started.");
        }
    }

    @Override // defpackage.oei
    public final qpp c() {
        return this.b.b();
    }
}