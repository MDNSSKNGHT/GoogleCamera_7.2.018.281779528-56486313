package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: gtq */
/* loaded from: classes.dex */
final /* synthetic */ class gtq implements View.OnTouchListener {
    public static final View.OnTouchListener a = new gtq();

    private gtq() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str = gun.a;
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(1.1f);
            view.animate().scaleY(1.1f);
            return false;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            view.animate().scaleX(1.0f);
            view.animate().scaleY(1.0f);
            return false;
        }
    }
}