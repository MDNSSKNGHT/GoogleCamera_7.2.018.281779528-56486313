package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: kly  reason: default package */
/* loaded from: classes.dex */
public final class kly extends AnimatorListenerAdapter {
    private final /* synthetic */ Consumer a;

    public kly(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.accept(animator);
    }
}