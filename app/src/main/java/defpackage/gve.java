package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import j$.util.Collection$$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: gve  reason: default package */
/* loaded from: classes.dex */
public final class gve {
    public final RelativeLayout a;
    public final boolean b;
    public final int c;
    private final OptionsMenuContainer d;
    private final FrameLayout e;
    private final psl f;
    private final kmr g;
    private final int h;

    static {
        liu.a("OptionsMenuAnimation");
    }

    @SuppressLint("ResourceType")
    public gve(OptionsMenuContainer optionsMenuContainer, boolean z) {
        this.d = optionsMenuContainer;
        this.e = (FrameLayout) qdu.c(optionsMenuContainer.c(), "menuClosed");
        this.a = (RelativeLayout) qdu.c(optionsMenuContainer.e(), "menuView");
        this.f = psl.a((View) qdu.c(optionsMenuContainer.d(), "viewInternal"), (View) qdu.c(optionsMenuContainer.g(), "settingBar"), (View) qdu.c(optionsMenuContainer.findViewById(2131427745), "separateLine"));
        this.g = optionsMenuContainer.b;
        this.b = z;
        this.c = !z ? 4 : 0;
        this.h = z ? 4 : 0;
    }

    public final Animator a() {
        int height;
        float f = !this.b ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f - f, f);
        ofFloat.setDuration(50L);
        ofFloat.setInterpolator(new aao());
        ofFloat.addListener(new kms(this.e, this.h));
        if (this.g != kmr.LANDSCAPE) {
            if (this.g == kmr.REVERSE_LANDSCAPE) {
                height = -((oeh.a(this.e)[0] - oeh.a(this.a)[0]) + ((this.e.getWidth() - this.a.getWidth()) / 2));
            } else {
                height = (oeh.a(this.e)[1] - oeh.a(this.a)[1]) + ((this.e.getHeight() - this.a.getHeight()) / 2);
            }
        } else {
            height = (oeh.a(this.e)[0] - oeh.a(this.a)[0]) + ((this.e.getWidth() - this.a.getWidth()) / 2);
        }
        float f2 = this.b ? 1.0f : 0.0f;
        float f3 = 1.0f - f2;
        float f4 = height;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, PropertyValuesHolder.ofFloat(View.ALPHA, f3, f2), PropertyValuesHolder.ofFloat(View.SCALE_X, f3, f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f3, f2), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, (1.0f - f3) * f4, f4 * f3));
        ofPropertyValuesHolder.setDuration(250L);
        ofPropertyValuesHolder.setInterpolator(new aao());
        ofPropertyValuesHolder.addListener(new kms(this.a, this.c));
        ofPropertyValuesHolder.addListener(new kmi(this.d));
        ofPropertyValuesHolder.addListener(new klx(new gvc(this)));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Collection) Collection$$CC.stream$$dflt$$(this.f).map(new gvd(this)).collect(Collectors.toList()));
        List<Animator> a = prr.a(ofFloat, ofPropertyValuesHolder, animatorSet);
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (!this.b) {
            a = qdu.a((List) a);
        }
        animatorSet2.playSequentially(a);
        if (this.b) {
            animatorSet2.addListener(new kly(new gvb(this)));
        }
        return animatorSet2;
    }
}