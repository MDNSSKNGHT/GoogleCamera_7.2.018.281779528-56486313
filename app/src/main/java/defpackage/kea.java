package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kea  reason: default package */
/* loaded from: classes.dex */
final class kea extends AnimatorListenerAdapter {
    private final /* synthetic */ kec a;

    public kea(kec kecVar) {
        this.a = kecVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.b.getCurrentSpec().a(true);
    }
}