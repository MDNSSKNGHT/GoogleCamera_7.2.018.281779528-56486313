package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: knj  reason: default package */
/* loaded from: classes.dex */
public class knj {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "TEXTURE_VIEW_LEGACY" : "SURFACE_VIEW" : "NONE";
    }

    public void a() {
    }

    public static int a(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getLeft();
        }
        return view.getLeft() + a((View) view.getParent());
    }

    public static int b(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getTop();
        }
        return view.getTop() + b((View) view.getParent());
    }

    public static Point d(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Point c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static View e(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return view;
    }

    public static ndn a(String str, ndr ndrVar) {
        ndn ndnVar;
        return (str == null || (ndnVar = (ndn) ndrVar.e().get(str)) == null) ? ndrVar : ndnVar;
    }
}