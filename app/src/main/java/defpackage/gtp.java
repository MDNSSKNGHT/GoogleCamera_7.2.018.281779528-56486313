package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: gtp */
/* loaded from: classes.dex */
final /* synthetic */ class gtp implements View.OnClickListener {
    private final gun a;

    public gtp(gun gunVar) {
        this.a = gunVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.au.a();
    }
}