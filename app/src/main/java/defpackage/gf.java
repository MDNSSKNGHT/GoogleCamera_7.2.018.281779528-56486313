package defpackage;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.os.Process;
import android.util.Base64;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: gf  reason: default package */
/* loaded from: classes.dex */
public class gf {
    public static int a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    @SuppressLint("WrongConstant")
    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i = Build.VERSION.SDK_INT;
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid == null || packagesForUid.length <= 0) {
                        return -1;
                    }
                    packageName = packagesForUid[0];
                }
                int i2 = Build.VERSION.SDK_INT;
                if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static List a(Resources resources, int i) {
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            try {
                if (obtainTypedArray.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = Build.VERSION.SDK_INT;
                    if (obtainTypedArray.getType(0) == 1) {
                        for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                            int resourceId = obtainTypedArray.getResourceId(i3, 0);
                            if (resourceId != 0) {
                                arrayList.add(a(resources.getStringArray(resourceId)));
                            }
                        }
                    } else {
                        arrayList.add(a(resources.getStringArray(i)));
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            } finally {
                obtainTypedArray.recycle();
            }
        }
        return Collections.emptyList();
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static Shader.TileMode b(int i) {
        if (i != 1) {
            if (i == 2) {
                return Shader.TileMode.MIRROR;
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.REPEAT;
    }
}