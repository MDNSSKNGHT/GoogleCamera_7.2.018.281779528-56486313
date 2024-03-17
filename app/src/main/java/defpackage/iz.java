package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.IdentityHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: iz  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public final class iz {
    public iz() {
        Collections.newSetFromMap(new IdentityHashMap());
    }

    public static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            return cursor.getColumnIndexOrThrow("`" + str + "`");
        }
        return columnIndex;
    }

    public static void a(Activity activity, String[] strArr, int i) {
        int i2 = Build.VERSION.SDK_INT;
        activity.requestPermissions(strArr, i);
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int b(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColor(i);
    }

    public static File a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getDataDir();
    }

    public static Drawable a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getDrawable(i);
    }

    public static Object a(Context context, Class cls) {
        int i = Build.VERSION.SDK_INT;
        return context.getSystemService(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[], java.lang.Object] */
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        TypedArray obtainAttributes;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20][];
            int[] iArr2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                } else if (next != 2 || depth > depth2 || !xmlPullParser.getName().equals("item")) {
                    i = 1;
                } else {
                    int[] iArr3 = cg.a;
                    if (theme == null) {
                        obtainAttributes = resources.obtainAttributes(attributeSet, iArr3);
                    } else {
                        obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    }
                    int color = obtainAttributes.getColor(0, -65281);
                    float f = 1.0f;
                    if (obtainAttributes.hasValue(i)) {
                        f = obtainAttributes.getFloat(i, 1.0f);
                    } else if (obtainAttributes.hasValue(2)) {
                        f = obtainAttributes.getFloat(2, 1.0f);
                    }
                    obtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i3 = 0;
                    for (int i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130968619) {
                            int i5 = i3 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i3] = attributeNameResource;
                            i3 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                    int round = (16777215 & color) | (Math.round(Color.alpha(color) * f) << 24);
                    int i6 = i2 + 1;
                    if (i6 > iArr2.length) {
                        int[] iArr5 = new int[gf.a(i2)];
                        System.arraycopy(iArr2, 0, iArr5, 0, i2);
                        iArr2 = iArr5;
                    }
                    iArr2[i2] = round;
                    if (i6 > iArr.length) {
                        Object[] r8 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), gf.a(i2));
                        System.arraycopy(iArr, 0, r8, 0, i2);
                        //iArr = r8;
                    }
                    iArr[i2] = trimStateSet;
                    iArr = iArr;
                    i2 = i6;
                    i = 1;
                }
            }
            int[] iArr6 = new int[i2];
            int[][] iArr7 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr6, 0, i2);
            System.arraycopy(iArr, 0, iArr7, 0, i2);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static void a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static int a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static boolean a(iy iyVar, KeyEvent keyEvent) {
        if (iyVar != null) {
            int i = Build.VERSION.SDK_INT;
            return iyVar.a(keyEvent);
        }
        return false;
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        int i = Build.VERSION.SDK_INT;
    }
}