package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: kdx  reason: default package */
/* loaded from: classes.dex */
final class kdx extends AnimatorListenerAdapter {
    private final /* synthetic */ ked a;

    public kdx(ked kedVar) {
        this.a = kedVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Interpolator interpolator = ked.a;
        this.a.b.resetTo(kdd.PHOTO_IDLE);
    }
}