package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: bfr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bfr implements DialogInterface.OnDismissListener {
    private final bft a;

    public bfr(bft bftVar) {
        this.a = bftVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bft bftVar = this.a;
        if (dialogInterface == bftVar.f) {
            bftVar.f = null;
        }
    }
}