package defpackage;

import j$.util.Collection$$Dispatch;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cgt  reason: default package */
/* loaded from: classes.dex */
public final class cgt implements cgy, mcs {
    public static final mzg a = mzg.BACK;
    private static final String d = liu.a("FacingController");
    private final mbe e;
    private final geq g;
    private final geq h;
    public final mdl b = new mch(a);
    private final mcs f = new bot(mdg.a(mdg.b(this.b), new cgq(this)));
    public final List c = new ArrayList();

    public cgt(gco gcoVar, mbe mbeVar) {
        this.e = mbeVar;
        this.g = a(gcoVar, mzg.BACK);
        this.h = a(gcoVar, mzg.FRONT);
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.f.a(mjwVar, executor);
    }

    private static geq a(gco gcoVar, mzg mzgVar) {
        mzc b = gcoVar.b(mzgVar);
        if (b != null) {
            return gcoVar.a(b);
        }
        return null;
    }

    @Override // defpackage.mcs
    public final /* bridge */ /* synthetic */ Object a() {
        return (cgx) this.f.a();
    }

    @Override // defpackage.cgy
    public final mzg d() {
        return (mzg) ((mch) this.b).c;
    }

    @Deprecated
    public final int e() {
        return !b() ? 0 : 1;
    }

    public final pjz g() {
        return pjz.c(b(d()));
    }

    public final geq b(mzg mzgVar) {
        geq geqVar;
        geq geqVar2;
        if (mzgVar != mzg.BACK || (geqVar2 = this.g) == null) {
            if (mzgVar == mzg.FRONT && (geqVar = this.h) != null) {
                return geqVar;
            }
            String str = d;
            String valueOf = String.valueOf(d().toString());
            liu.b(str, valueOf.length() == 0 ? new String("No OneCameraCharacteristics found for: ") : "No OneCameraCharacteristics found for: ".concat(valueOf));
            return null;
        }
        return geqVar2;
    }

    public final boolean b() {
        return d() == mzg.BACK;
    }

    public final boolean c() {
        return d() == mzg.FRONT;
    }

    public final void a(mzg mzgVar) {
        this.b.a(mzgVar);
    }

    public final qpp f() {
        a(!b() ? mzg.BACK : mzg.FRONT);
        String str = d;
        String valueOf = String.valueOf(d());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Switched camera facing to ");
        sb.append(valueOf);
        sb.toString();
        liu.b(str);
        return rgk.a((Iterable) Collection$$Dispatch.stream(this.c).map(new cgr(this)).collect(Collectors.toList()));
    }

    public final void a(Runnable runnable) {
        maw.a(f(), new cgs(runnable), this.e);
    }

    public final String toString() {
        return b() ? "Back Camera" : "Front Camera";
    }
}