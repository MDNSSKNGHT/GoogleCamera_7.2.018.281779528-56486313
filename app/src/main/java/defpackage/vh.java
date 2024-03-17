package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: vh  reason: default package */
/* loaded from: classes2.dex */
public final class vh {
    private static vh b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private vg g;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final id h = new id();

    private final synchronized void a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            ic icVar = (ic) this.d.get(context);
            if (icVar == null) {
                icVar = new ic();
                this.d.put(context, icVar);
            }
            icVar.a(j, new WeakReference(constantState));
        }
    }

    public static synchronized vh a() {
        vh vhVar;
        synchronized (vh.class) {
            if (b == null) {
                b = new vh();
                int i = Build.VERSION.SDK_INT;
            }
            vhVar = b;
        }
        return vhVar;
    }

    private final synchronized Drawable a(Context context, long j) {
        ic icVar = (ic) this.d.get(context);
        if (icVar != null) {
            WeakReference weakReference = (WeakReference) icVar.a(j);
            if (weakReference != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState == null) {
                    icVar.b(j);
                } else {
                    return constantState.newDrawable(context.getResources());
                }
            }
            return null;
        }
        return null;
    }

    public final synchronized Drawable a(Context context, int i) {
        return a(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0012, B:9:0x0016, B:12:0x0027, B:13:0x0031, B:14:0x0032, B:18:0x003e, B:20:0x0058, B:24:0x0061, B:28:0x0080, B:30:0x008a, B:33:0x0092, B:35:0x0098, B:39:0x00af, B:47:0x00eb, B:49:0x011a, B:67:0x0172, B:69:0x0178, B:71:0x017e, B:73:0x018b, B:52:0x0130, B:54:0x013b, B:56:0x0145, B:59:0x0152, B:93:0x01bf, B:77:0x0195, B:79:0x019b, B:81:0x01a1, B:85:0x01af, B:89:0x01b6, B:17:0x0037), top: B:99:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable a(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (vh.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) h.a(Integer.valueOf(id.a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) h.a(Integer.valueOf(id.a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[Catch: all -> 0x01a2, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:15:0x0025, B:18:0x0033, B:59:0x0134, B:63:0x0140, B:65:0x014a, B:66:0x0154, B:68:0x0158, B:71:0x0161, B:72:0x0165, B:78:0x0172, B:80:0x0179, B:81:0x0193, B:75:0x016a, B:77:0x016f, B:62:0x0139, B:21:0x0042, B:23:0x0054, B:25:0x005a, B:27:0x0097, B:26:0x0079, B:30:0x00a5, B:33:0x00b8, B:36:0x00c4, B:55:0x0127, B:42:0x00dd, B:44:0x00e8, B:45:0x00f1, B:47:0x00fc, B:48:0x0105, B:50:0x010f, B:54:0x011e, B:6:0x0008, B:8:0x0010), top: B:91:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134 A[Catch: all -> 0x01a2, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:15:0x0025, B:18:0x0033, B:59:0x0134, B:63:0x0140, B:65:0x014a, B:66:0x0154, B:68:0x0158, B:71:0x0161, B:72:0x0165, B:78:0x0172, B:80:0x0179, B:81:0x0193, B:75:0x016a, B:77:0x016f, B:62:0x0139, B:21:0x0042, B:23:0x0054, B:25:0x005a, B:27:0x0097, B:26:0x0079, B:30:0x00a5, B:33:0x00b8, B:36:0x00c4, B:55:0x0127, B:42:0x00dd, B:44:0x00e8, B:45:0x00f1, B:47:0x00fc, B:48:0x0105, B:50:0x010f, B:54:0x011e, B:6:0x0008, B:8:0x0010), top: B:91:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.content.res.ColorStateList b(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final synchronized void a(Context context) {
        ic icVar = (ic) this.d.get(context);
        if (icVar != null) {
            icVar.c();
        }
    }

    public final synchronized void a(vg vgVar) {
        this.g = vgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable, vq vqVar, int[] iArr) {
        ColorStateList colorStateList = null;
        if (!sb.a(drawable) || drawable.mutate() == drawable) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (vqVar.d) {
                colorStateList = vqVar.a;
            } else if (!vqVar.c) {
                drawable.clearColorFilter();
                int i = Build.VERSION.SDK_INT;
            } else {
                colorStateList = null;
            }
            PorterDuff.Mode mode = vqVar.c ? vqVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            int i2 = Build.VERSION.SDK_INT;
        }
    }
}