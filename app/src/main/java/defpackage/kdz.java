package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kdz  reason: default package */
/* loaded from: classes.dex */
final class kdz extends AnimatorListenerAdapter {
    private final /* synthetic */ kec a;

    public kdz(kec kecVar) {
        this.a = kecVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.blockClickForAnimation(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.b.blockClickForAnimation(true);
    }
}