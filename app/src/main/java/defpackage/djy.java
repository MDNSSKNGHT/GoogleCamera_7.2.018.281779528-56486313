package defpackage;

import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: djy  reason: default package */
/* loaded from: classes.dex */
public final class djy {
    public static final mjs a = mjs.a(1024, 768);
    public static final mjs b = mjs.a(1280, 720);
    public static final mjs c = mjs.a(2048, 1536);
    public static final mjs d = mjs.a(1920, 1080);
    public static final long e = TimeUnit.MICROSECONDS.convert(1, TimeUnit.SECONDS) / 30;
    public static final long f = TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 30;

    public static int a(MediaFormat mediaFormat) {
        return ((mediaFormat.getInteger("width") * mediaFormat.getInteger("height")) * 3) / 2;
    }
}