package defpackage;

import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ndc  reason: default package */
/* loaded from: classes.dex */
public final class ndc {
    private final Method a;

    @SuppressLint("PrivateApi")
    private ndc() {
        Method a1;
        Class<?> cls = null;
        Method method = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
        } catch (Exception e) {
        } catch (Throwable th) {
            throw th;
        }
        try {
            try {
                cls.getMethod("set", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                a1 = method;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Exception e2) {
            throw new IllegalStateException("Unable to reflect SystemProperties.", e2);
        }
        this.a = a1;
    }

    @SuppressLint("PrivateApi")
    public /* synthetic */ ndc(byte b) {
        Method a1;
        Class<?> cls = null;
        Method method = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
        } catch (Exception e) {
        } catch (Throwable th) {
            throw th;
        }
        try {
            try {
                cls.getMethod("set", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                a1 = method;
            } catch (Throwable th2) {
                a1 = method;
                throw th2;
            }
        } catch (Exception e2) {
            throw new IllegalStateException("Unable to reflect SystemProperties.", e2);
        }
        this.a = a1;
    }

    public final String a(String str) {
        qdu.c(str, "Key cannot be null!");
        try {
            Method method = this.a;
            if (method != null) {
                String str2 = (String) method.invoke(null, str, null);
                if ("".equals(str2)) {
                    return null;
                }
                return str2;
            }
            return null;
        } catch (Exception e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }
}
