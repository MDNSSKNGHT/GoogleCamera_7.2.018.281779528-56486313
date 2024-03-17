package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: guy  reason: default package */
/* loaded from: classes.dex */
public final class guy extends AnimatorListenerAdapter {
    private final /* synthetic */ guz a;

    public guy(guz guzVar) {
        this.a = guzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(View.INVISIBLE);
        this.a.b();
    }
}