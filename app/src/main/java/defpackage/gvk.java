package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvk implements DialogInterface.OnClickListener {
    private final OptionsMenuContainer a;

    public gvk(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OptionsMenuContainer optionsMenuContainer = this.a;
        optionsMenuContainer.h.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera?p=motion_toast")));
    }
}