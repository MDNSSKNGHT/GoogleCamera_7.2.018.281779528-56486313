package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvn  reason: default package */
/* loaded from: classes.dex */
public final class gvn extends AnimatorListenerAdapter {
    private final /* synthetic */ OptionsMenuContainer a;

    public gvn(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a().setVisibility(8);
        this.a.b().setVisibility(0);
        super.onAnimationStart(animator);
    }
}