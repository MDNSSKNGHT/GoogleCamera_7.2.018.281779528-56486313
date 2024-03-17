package defpackage;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* compiled from: PG */
/* renamed from: gvx  reason: default package */
/* loaded from: classes.dex */
public final class gvx extends GestureDetector.SimpleOnGestureListener {
    private boolean a;
    private final /* synthetic */ OptionsMenuView b;

    public gvx(OptionsMenuView optionsMenuView) {
        this.b = optionsMenuView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        OptionsMenuView optionsMenuView = this.b;
        String str = OptionsMenuView.a;
        if (optionsMenuView.getChildAt(optionsMenuView.getChildCount() - 1).getBottom() - (optionsMenuView.getHeight() + optionsMenuView.getScrollY()) == 0) {
            this.a = true;
        } else {
            this.a = false;
        }
        return false;
    }

    @SuppressLint("ResourceType")
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        OptionsMenuView optionsMenuView = this.b;
        String str = OptionsMenuView.a;
        if (optionsMenuView.getHeight() >= optionsMenuView.findViewById(2131427744).getHeight() + optionsMenuView.getPaddingTop() + optionsMenuView.getPaddingBottom() || this.a) {
            if (motionEvent2.getY() - motionEvent.getY() >= 80.0f || f2 >= -300.0f) {
                return true;
            }
            this.a = false;
            ((gvi) this.b.h).a.l();
            return true;
        }
        return false;
    }
}