package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* compiled from: PG */
/* renamed from: gvl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gvl implements DialogInterface.OnClickListener {
    private final OptionsMenuContainer a;

    public gvl(OptionsMenuContainer optionsMenuContainer) {
        this.a = optionsMenuContainer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OptionsMenuContainer optionsMenuContainer = this.a;
        optionsMenuContainer.m();
        imi imiVar = optionsMenuContainer.p;
        if (imiVar != null) {
            imiVar.b("micro_tutorial_dismiss");
        }
    }
}