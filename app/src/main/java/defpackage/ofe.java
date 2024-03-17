package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ofe  reason: default package */
/* loaded from: classes.dex */
public final class ofe {
    public final qpp a;
    public final MediaFormat b;

    private ofe(MediaFormat mediaFormat, qpp qppVar) {
        this.b = mediaFormat;
        this.a = qppVar;
    }

    public static ofe a(MediaFormat mediaFormat, qpp qppVar) {
        return new ofe(mediaFormat, qppVar);
    }

    public static ofe a(MediaFormat mediaFormat) {
        return new ofe(mediaFormat, rgk.b(mediaFormat));
    }
}