package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: guz  reason: default package */
/* loaded from: classes.dex */
public final class guz {
    public final View a;
    public int c = 3;
    public Animator b = new AnimatorSet();

    public guz(View view) {
        this.a = view;
    }

    public final void a() {
        this.b.cancel();
        qdu.a(this.c == 3, "State should be stable with no animation", new Object[0]);
    }

    public final void b() {
        this.c = 3;
    }
}