package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvh implements View.OnTouchListener {
    private final OptionsMenuContainer a;

    public gvh(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.g.onTouchEvent(motionEvent);
    }
}