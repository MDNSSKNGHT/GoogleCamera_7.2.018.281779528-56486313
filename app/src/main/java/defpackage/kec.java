package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: kec  reason: default package */
/* loaded from: classes.dex */
final class kec {
    public final /* synthetic */ ked a;
    private final Animator b;

    public kec(ked kedVar, Animator animator) {
        this.a = kedVar;
        this.b = animator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.setStartDelay(150L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.addListener(new kea(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable) {
        this.b.addListener(new keb(this, drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.b.setDuration(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b.setInterpolator(ked.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b.setInterpolator(this.a.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.b.setInterpolator(this.a.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.b.addListener(new kdz(this));
    }
}