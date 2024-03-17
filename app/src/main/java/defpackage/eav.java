package defpackage;

import android.media.MediaCodec;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: eav  reason: default package */
/* loaded from: classes.dex */
public final class eav {
    private eav() {
    }

    public static synchronized void a() {
        synchronized (eav.class) {
            mjy.a(eav.class);
        }
    }

    public static Object a(rhd rhdVar) {
        a();
        return rhdVar.get();
    }

    public static boolean a(cin cinVar, cjn cjnVar) {
        return cjnVar == cjn.ENG || cjnVar == cjn.FISHFOOD || cinVar.c(ciy.a);
    }

    public static ExecutorService a(String str) {
        return Executors.newCachedThreadPool(d(str));
    }

    public static ExecutorService b(String str, int i) {
        return Executors.newFixedThreadPool(i, d(str));
    }

    public static ExecutorService c(String str, int i) {
        return Executors.newFixedThreadPool(2, d(str, i));
    }

    private static ThreadFactory e(String str) {
        return new mbn(str);
    }

    private static ThreadFactory d(String str) {
        return d(str, 0);
    }

    private static ThreadFactory d(String str, int i) {
        qdu.c(str.length() <= 13);
        return new mbm(i, str);
    }

    public static ScheduledExecutorService a(String str, int i) {
        return Executors.newScheduledThreadPool(i, d(str));
    }

    public static ExecutorService b(String str) {
        return Executors.newSingleThreadExecutor(e(str));
    }

    public static ScheduledExecutorService c(String str) {
        return Executors.newSingleThreadScheduledExecutor(e(str));
    }

    public static MediaCodec a(mfh mfhVar) throws mfg {
        String a = mfhVar.a();
        String valueOf = String.valueOf(a);
        if (valueOf.length() != 0) {
            "create mediaCodec for".concat(valueOf);
        } else {
            new String("create mediaCodec for");
        }
        try {
            return MediaCodec.createEncoderByType(a);
        } catch (IOException e) {
            throw new mfg("fail to create media codec", mfhVar, e);
        }
    }
}