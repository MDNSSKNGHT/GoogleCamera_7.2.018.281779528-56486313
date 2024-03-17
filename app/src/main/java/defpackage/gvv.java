package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* compiled from: PG */
/* renamed from: gvv  reason: default package */
/* loaded from: classes.dex */
public final class gvv implements View.OnTouchListener {
    private final /* synthetic */ OptionsMenuView a;

    public gvv(OptionsMenuView optionsMenuView) {
        this.a = optionsMenuView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.c.onTouchEvent(motionEvent);
    }
}