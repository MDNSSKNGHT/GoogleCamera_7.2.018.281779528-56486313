package defpackage;

import android.content.res.Resources;
import android.media.AudioRecord;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: oeh  reason: default package */
/* loaded from: classes.dex */
public class oeh {
    public boolean a(kny knyVar) {
        throw null;
    }

    public boolean a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    public static int a(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    public static int[] a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static odo a(AudioRecord audioRecord, int i) {
        return new odp(audioRecord, i);
    }

    public static oei a(File file) {
        return new oem(file, Executors.newSingleThreadExecutor());
    }
}