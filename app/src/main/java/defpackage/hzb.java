package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: hzb  reason: default package */
/* loaded from: classes.dex */
public final class hzb {
    public Rect f;
    public ExifInterface h;
    private final neb j;
    public mzg a = null;
    public ihw b = ihw.UNKNOWN;
    public mjo c = mjo.CLOCKWISE_0;
    public qpp d = null;
    public izh e = null;
    public Long g = null;
    private Long k = null;
    public ilu i = ilu.OFF;

    public /* synthetic */ hzb(neb nebVar) {
        this.f = null;
        this.j = nebVar;
        this.f = nebVar.a();
    }

    public final hzc a() {
        Long l = this.g;
        Long l2 = this.k;
        if (l == null) {
            l = Long.valueOf(this.j.f());
        }
        qdu.d(l);
        if (l2 == null) {
            l2 = Long.valueOf(kot.a(l.longValue()));
        }
        qdu.d(l2);
        neb nebVar = this.j;
        ihw ihwVar = this.b;
        mzg mzgVar = this.a;
        mjo mjoVar = this.c;
        qpp qppVar = this.d;
        Rect rect = this.f;
        return new hzc(nebVar, ihwVar, mzgVar, mjoVar, qppVar, rect != null ? rect : nebVar.a(), l.longValue(), l2.longValue(), this.h, this.e, this.i);
    }

    public final void a(long j) {
        this.k = Long.valueOf(j);
    }

    public final void a(int i, int i2) {
        this.f = new Rect(0, 0, i, i2);
    }

    public final void a(ndr ndrVar) {
        this.d = ndrVar != null ? rgk.b(ndrVar) : null;
    }

    public final void a(int i) {
        this.c = mjo.a(i);
    }
}