package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

import java.util.HashMap;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: ik  reason: default package */
/* loaded from: classes.dex */
public final class ik {
    public ik() {
        new HashMap();
    }

    public static int a(int i, int i2, int i3) {
        return i >= i2 ? i > i3 ? i3 : i : i2;
    }

    public static bq a(Context context, Class cls, String str) {
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new bq(context, cls, str);
    }

    public static Object a(Class cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static Intent a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            String b = b(activity);
            if (b != null) {
                ComponentName componentName = new ComponentName(activity, b);
                try {
                    return b(activity, componentName) != null ? new Intent().setComponent(componentName) : Intent.makeMainActivity(componentName);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
                    return null;
                }
            }
            return null;
        }
        return parentActivityIntent;
    }

    public static Intent a(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String b = b(context, componentName);
        if (b != null) {
            ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
            if (b(context, componentName2) == null) {
                return Intent.makeMainActivity(componentName2);
            }
            return new Intent().setComponent(componentName2);
        }
        return null;
    }

    public static String b(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        int i2 = Build.VERSION.SDK_INT;
        String str = activityInfo.parentActivityName;
        if (str == null) {
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
        return str;
    }

    public static boolean a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    public static void a(Drawable drawable, boolean z) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    public static void a(Drawable drawable, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspot(f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setTint(i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintList(colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintMode(mode);
    }

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj != null) {
            String simpleName = obj.getClass().getSimpleName();
            if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        sb.append("null");
    }

    public static boolean a(Object obj, Object obj2) {
        int i = Build.VERSION.SDK_INT;
        return Objects.equals(obj, obj2);
    }
}