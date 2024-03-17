package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* compiled from: PG */
/* renamed from: jdy  reason: default package */
/* loaded from: classes.dex */
public final class jdy {
    static {
        liu.a("StorageModule");
    }

    public static pjz a(Context context) {
        return pjz.c(context.getExternalCacheDir());
    }

    public static jcv a() {
        return new jcw(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
    }

    public static jcv b() {
        return new jcw(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Raw"));
    }

    public static jcl a(rhd rhdVar) {
        return (jcl) rhdVar.get();
    }
}
