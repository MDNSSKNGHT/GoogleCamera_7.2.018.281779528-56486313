package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import j$.util.function.Function;
import j$.util.function.Function$$CC;

/* compiled from: PG */
/* renamed from: gvd  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gvd implements Function {
    private final gve a;

    public gvd(gve gveVar) {
        this.a = gveVar;
    }

    public final Function andThen(Function function) {
        return Function$$CC.andThen$$dflt$$(this, function);
    }

    public final Function compose(Function function) {
        return Function$$CC.compose$$dflt$$(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        gve gveVar = this.a;
        View view = (View) obj;
        float f = !gveVar.b ? 0.0f : 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f - f, f);
        ofFloat.setDuration(50L);
        ofFloat.setInterpolator(new aao());
        ofFloat.addListener(new kms(view, gveVar.c));
        return ofFloat;
    }
}