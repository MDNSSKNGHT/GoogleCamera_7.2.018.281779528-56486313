package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* renamed from: nhp  reason: default package */
/* loaded from: classes.dex */
public final class nhp implements Runnable {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ View d;

    public nhp(View view, int i, int i2, View view2) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        this.a.getHitRect(rect);
        rect.top -= this.b;
        rect.right += this.c;
        this.d.setTouchDelegate(new TouchDelegate(rect, this.a));
    }
}