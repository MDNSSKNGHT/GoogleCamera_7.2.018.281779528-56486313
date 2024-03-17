package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: keb  reason: default package */
/* loaded from: classes.dex */
final class keb extends AnimatorListenerAdapter {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ kec b;

    public keb(kec kecVar, Drawable drawable) {
        this.b = kecVar;
        this.a = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a.b.getCurrentSpec().c = this.a;
    }
}