package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvo  reason: default package */
/* loaded from: classes.dex */
public final class gvo extends AnimatorListenerAdapter {
    private final /* synthetic */ OptionsMenuContainer a;

    public gvo(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a().setVisibility(0);
        this.a.b().setVisibility(8);
        super.onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a().setVisibility(0);
        this.a.b().setVisibility(8);
        super.onAnimationEnd(animator);
    }
}