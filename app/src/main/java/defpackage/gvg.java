package defpackage;

import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvg implements View.OnClickListener {
    private final OptionsMenuContainer a;

    public gvg(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.m();
    }
}