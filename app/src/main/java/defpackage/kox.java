package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: kox  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kox implements Runnable {
    private final View a;
    private final boolean b;
    private final int c;

    public kox(View view, boolean z, int i) {
        this.a = view;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        boolean z = this.b;
        int i = this.c;
        view.setClickable(z);
        view.setVisibility(i);
    }
}