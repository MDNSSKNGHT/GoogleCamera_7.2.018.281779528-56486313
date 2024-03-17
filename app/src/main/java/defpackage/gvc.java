package defpackage;

import android.animation.Animator;
import j$.util.function.Consumer;
import j$.util.function.Consumer$$CC;

/* compiled from: PG */
/* renamed from: gvc  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gvc implements Consumer {
    private final gve a;

    public gvc(gve gveVar) {
        this.a = gveVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Animator animator = (Animator) obj;
        this.a.a.setTranslationY(0.0f);
    }

    public final Consumer andThen(Consumer consumer) {
        return Consumer$$CC.andThen$$dflt$$(this, consumer);
    }
}