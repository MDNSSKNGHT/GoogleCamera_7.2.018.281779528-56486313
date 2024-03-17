package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: bfs  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bfs implements DialogInterface.OnClickListener {
    private final bft a;

    public bfs(bft bftVar) {
        this.a = bftVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        bft bftVar = this.a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        String valueOf = String.valueOf(bftVar.a.getPackageName());
        intent.setData(Uri.parse(valueOf.isEmpty() ? "package:" : "package:".concat(valueOf)));
        bftVar.d.b(intent);
        bftVar.b.a("Closing until required permissions are granted.");
    }
}