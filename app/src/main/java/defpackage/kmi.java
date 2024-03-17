package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: kmi  reason: default package */
/* loaded from: classes.dex */
public final class kmi extends AnimatorListenerAdapter {
    private final View a;
    private final int b;

    public kmi(View view) {
        this.a = view;
        this.b = view.getLayerType();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setLayerType(this.b, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(this.b, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setLayerType(2, null);
    }
}