package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: kms  reason: default package */
/* loaded from: classes.dex */
public final class kms extends AnimatorListenerAdapter {
    private final View a;
    private final int b;
    private int c = 0;

    public kms(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setVisibility(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        if (i != 0) {
            this.a.setVisibility(i);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c = this.a.getVisibility();
        if (this.b == 0) {
            this.a.setVisibility(View.VISIBLE);
        }
    }
}