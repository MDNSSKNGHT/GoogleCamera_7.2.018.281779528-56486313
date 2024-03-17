package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: PG */
/* renamed from: bfq  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bfq implements DialogInterface.OnKeyListener {
    private final bft a;

    public bfq(bft bftVar) {
        this.a = bftVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.a.c();
            return true;
        }
        return true;
    }
}