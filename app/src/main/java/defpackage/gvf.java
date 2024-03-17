package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvf implements View.OnTouchListener {
    private final OptionsMenuContainer a;

    public gvf(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OptionsMenuContainer optionsMenuContainer = this.a;
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(1.1f);
            view.animate().scaleY(1.1f);
            view.animate().alpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            view.animate().scaleX(1.0f);
            view.animate().scaleY(1.0f);
            view.animate().alpha(0.72f);
        }
        return optionsMenuContainer.f.onTouchEvent(motionEvent);
    }
}