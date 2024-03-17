package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: bfn  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bfn implements DialogInterface.OnClickListener {
    private final bft a;

    public bfn(bft bftVar) {
        this.a = bftVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c();
    }
}