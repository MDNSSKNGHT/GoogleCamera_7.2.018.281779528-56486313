package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvj implements DialogInterface.OnDismissListener {
    private final OptionsMenuContainer a;

    public gvj(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        OptionsMenuContainer optionsMenuContainer = this.a;
        if (dialogInterface == optionsMenuContainer.i) {
            optionsMenuContainer.i = null;
        }
    }
}