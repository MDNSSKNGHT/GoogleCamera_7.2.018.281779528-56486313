package defpackage;

import android.animation.Animator;
import j$.util.function.Consumer;
import j$.util.function.Consumer$$CC;

/* compiled from: PG */
/* renamed from: gvb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gvb implements Consumer {
    private final gve a;

    public gvb(gve gveVar) {
        this.a = gveVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Animator animator = (Animator) obj;
        this.a.a.sendAccessibilityEvent(8);
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$$CC.andThen$$dflt$$(this, consumer);
    }
}