package defpackage;

import android.animation.Animator;
import android.view.animation.Interpolator;
import j$.util.function.ToLongFunction;

/* compiled from: PG */
/* renamed from: kdm  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class kdm implements ToLongFunction {
    public static final ToLongFunction a = new kdm();

    private kdm() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        Animator animator = (Animator) obj;
        Interpolator interpolator = ked.a;
        return animator.getDuration() + animator.getStartDelay();
    }
}