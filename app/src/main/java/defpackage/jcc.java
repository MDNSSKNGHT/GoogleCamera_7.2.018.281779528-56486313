package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;

/* compiled from: PG */
/* renamed from: jcc  reason: default package */
/* loaded from: classes.dex */
public final class jcc {
    public final mjs a;
    public final nef b;
    public pjz c = pix.a;
    public pjz d = pix.a;
    public pjz e = pix.a;
    public pjz f = pix.a;
    public pjz g = pix.a;
    public pjz h = pix.a;

    public jcc(mjs mjsVar, nef nefVar) {
        this.a = mjsVar;
        this.b = nefVar;
    }

    public final void a(Long l) {
        this.e = pjz.c(l);
    }

    public final void a(ExifInterface exifInterface) {
        this.d = pjz.c(exifInterface);
    }

    public final void a(mjo mjoVar) {
        this.c = pjz.c(mjoVar);
    }

    public final void a(File file) {
        this.g = pjz.c(file);
    }

    public final void a(String str) {
        this.h = pjz.c(str);
    }
}