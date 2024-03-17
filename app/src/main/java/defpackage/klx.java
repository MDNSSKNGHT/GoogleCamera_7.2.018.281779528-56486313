package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: klx  reason: default package */
/* loaded from: classes.dex */
public final class klx extends AnimatorListenerAdapter {
    private final /* synthetic */ Consumer a;

    public klx(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.accept(animator);
    }
}