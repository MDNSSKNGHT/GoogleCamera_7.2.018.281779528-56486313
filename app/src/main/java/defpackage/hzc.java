package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: hzc  reason: default package */
/* loaded from: classes.dex */
public final class hzc {
    public final neb a;
    public final mjo b;
    public final qpp c;
    public final izh d;
    public final Rect e;
    public final ihw f;
    public final mzg g;
    public final ExifInterface h;
    public final ilu i;
    public final long j;
    private final long k;

    public /* synthetic */ hzc(neb nebVar, ihw ihwVar, mzg mzgVar, mjo mjoVar, qpp qppVar, Rect rect, long j, long j2, ExifInterface exifInterface, izh izhVar, ilu iluVar) {
        this.a = nebVar;
        this.f = ihwVar;
        this.g = mzgVar;
        this.b = mjoVar;
        this.c = qppVar;
        this.e = rect;
        this.k = j;
        this.j = j2;
        this.h = exifInterface;
        this.d = izhVar;
        this.i = iluVar;
    }

    public static hzc a(neb nebVar, hzc hzcVar) {
        hzb hzbVar = new hzb(nebVar);
        hzbVar.a = hzcVar.g;
        hzbVar.b = hzcVar.f;
        hzbVar.c = hzcVar.b;
        hzbVar.d = hzcVar.c;
        hzbVar.i = hzcVar.i;
        hzbVar.f = hzcVar.e;
        hzbVar.h = hzcVar.h;
        hzbVar.e = hzcVar.d;
        hzbVar.a(hzcVar.j);
        hzbVar.g = Long.valueOf(hzcVar.k);
        return hzbVar.a();
    }

    public static hzb a(neb nebVar) {
        return new hzb(nebVar);
    }

    public static hzb a(ghc ghcVar) {
        hzb hzbVar = new hzb(ghcVar);
        hzbVar.d = ghcVar.j();
        return hzbVar;
    }
}