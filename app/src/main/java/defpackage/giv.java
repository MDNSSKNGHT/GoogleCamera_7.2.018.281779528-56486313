package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: giv  reason: default package */
/* loaded from: classes.dex */
public final class giv implements gly {
    public static final String a = liu.a("RawModeImageSaver");
    public final ContentResolver b;
    public final Executor c;
    public final jde d;

    public giv(ContentResolver contentResolver, jdg jdgVar, jcv jcvVar, Executor executor) {
        this.b = contentResolver;
        this.c = executor;
        this.d = jdgVar.a(jcvVar);
    }

    @Override // defpackage.gly
    public final glx a(gnq gnqVar) {
        liu.b(a);
        return new giu(this, (ihi) gnqVar.b);
    }

    public final giu c(gnq gnqVar) {
        liu.b(a);
        return new giu(this, (ihi) gnqVar.b);
    }

    @Override // defpackage.gly
    public final /* bridge */ /* synthetic */ glx b(gnq gnqVar) {
        return c(gnqVar);
    }
}