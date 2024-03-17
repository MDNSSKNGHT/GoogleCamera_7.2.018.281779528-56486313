package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: kq  reason: default package */
/* loaded from: classes.dex */
public final class kq {
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        return resources.getDrawable(i, theme);
    }

    public static void a(Context context, int i) {
        if (context.isRestricted()) {
            return;
        }
        a(context, i, new TypedValue(), 0, (gi) null, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, gi giVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = a(context, resources, typedValue, i, i2, giVar, z);
        if (a == null && giVar == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface a(android.content.Context r22, android.content.res.Resources r23, android.util.TypedValue r24, int r25, int r26, defpackage.gi r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, gi, boolean):android.graphics.Typeface");
    }

    private static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        r7 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        r10 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r10 == 89650992) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r10 == 1191572447) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r7.equals("selector") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r7.equals("gradient") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r10 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r10 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r10 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        r7 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r7.equals("gradient") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r7 = a(r4, r28, r6, defpackage.cg.d);
        r14 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startX", 8, 0.0f);
        r15 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startY", 9, 0.0f);
        r16 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endX", 10, 0.0f);
        r17 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endY", 11, 0.0f);
        r10 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerX", 3, 0.0f);
        r2 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerY", 4, 0.0f);
        r13 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "type", 2, (int) r5);
        r8 = a(r7, r0, "startColor", (int) r5);
        r18 = a(r0, "centerColor");
        r3 = a(r7, r0, "centerColor", 7);
        r11 = a(r7, r0, "endColor", 1);
        r9 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "tileMode", 6, (int) r5);
        r21 = a(r7, (org.xmlpull.v1.XmlPullParser) r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
        if (r7 == 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
        r10 = r0.getDepth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
        if (r10 >= r2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
        if (r7 == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (r7 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
        if (r10 > r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
        if (r0.getName().equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
        r7 = a(r4, r28, r6, defpackage.cg.e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
        if (r15 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (r24 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
        r24 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r24));
        r5.add(java.lang.Float.valueOf(r25));
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016c, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017d, code lost:
        if (r12.size() <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
        r2 = new defpackage.ge(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0185, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0187, code lost:
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018a, code lost:
        if (r18 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
        r2 = new defpackage.ge(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0192, code lost:
        r2 = new defpackage.ge(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0198, code lost:
        if (r13 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019b, code lost:
        if (r13 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019d, code lost:
        r0 = new android.graphics.LinearGradient(r14, r23, r16, r17, r2.a, r2.b, defpackage.gf.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b2, code lost:
        r0 = new android.graphics.SweepGradient(r22, r2, r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c8, code lost:
        if (r21 <= 0.0f) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ca, code lost:
        r0 = new android.graphics.RadialGradient(r22, r2, r21, r2.a, r2.b, defpackage.gf.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e7, code lost:
        r2 = new defpackage.fz(r0, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ec, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ed, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f6, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0214, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0232, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0233, code lost:
        r0 = defpackage.iz.a(r4, r0, r6, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023e, code lost:
        r2 = new defpackage.fz(null, r0, r0.getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0256, code lost:
        android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", r0);
        r2 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fz a(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):fz");
    }

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return a(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return a(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return resources.obtainAttributes(attributeSet, iArr);
    }

    private static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new gl(c, fArr));
    }

    public static float[] a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int min = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[Catch: NumberFormatException -> 0x00d5, LOOP:3: B:27:0x0073->B:46:0x00ab, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d5, blocks: (B:24:0x0059, B:26:0x006c, B:27:0x0073, B:29:0x0079, B:33:0x0085, B:46:0x00ab, B:38:0x008f, B:41:0x009b, B:50:0x00c3, B:52:0x00c7, B:49:0x00b3, B:54:0x00ce), top: B:69:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: NumberFormatException -> 0x00d5, TryCatch #0 {NumberFormatException -> 0x00d5, blocks: (B:24:0x0059, B:26:0x006c, B:27:0x0073, B:29:0x0079, B:33:0x0085, B:46:0x00ab, B:38:0x008f, B:41:0x009b, B:50:0x00c3, B:52:0x00c7, B:49:0x00b3, B:54:0x00ce), top: B:69:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.gl[] a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.a(java.lang.String):gl[]");
    }

    public static gl[] a(gl[] glVarArr) {
        if (glVarArr != null) {
            gl[] glVarArr2 = new gl[glVarArr.length];
            for (int i = 0; i < glVarArr.length; i++) {
                glVarArr2[i] = new gl(glVarArr[i]);
            }
            return glVarArr2;
        }
        return null;
    }

    public kq(byte b) {
        this();
    }

    public kq() {
        new ConcurrentHashMap();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginEnd();
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginStart();
    }

    public static void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd(i);
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(i);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof jb) {
            ((jb) viewParent).a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            int i4 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof jc) {
            ((jc) viewParent).a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof jb) {
            ((jb) viewParent).a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            int i6 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof jb) {
            ((jb) viewParent).b(view, view2, i, i2);
        } else if (i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof jb) {
            return ((jb) viewParent).a(view, view2, i, i2);
        }
        if (i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        return false;
    }

    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof jb) {
            ((jb) viewParent).a(view, i);
        } else if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static ColorStateList a(CompoundButton compoundButton) {
        int i = Build.VERSION.SDK_INT;
        return compoundButton.getButtonTintList();
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}