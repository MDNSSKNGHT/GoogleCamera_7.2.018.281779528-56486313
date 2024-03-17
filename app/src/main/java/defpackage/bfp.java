package defpackage;

import android.annotation.SuppressLint;
import android.app.AlertDialog;

/* compiled from: PG */
/* renamed from: bfp  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bfp implements Runnable {
    private final bft a;
    private final int b;
    private final boolean c;

    public bfp(bft bftVar, int i, boolean z) {
        this.a = bftVar;
        this.b = i;
        this.c = z;
    }

    @SuppressLint("ResourceType")
    @Override // java.lang.Runnable
    public final void run() {
        bft bftVar = this.a;
        int i = this.b;
        boolean z = this.c;
        AlertDialog alertDialog = bftVar.f;
        if (alertDialog != null && alertDialog.isShowing()) {
            bftVar.f.dismiss();
        }
        if (bftVar.e == 0) {
            mbe.a();
            AlertDialog.Builder onDismissListener = new AlertDialog.Builder(bftVar.a, 16974546).setTitle(bftVar.c.getString(2131951806)).setMessage(bftVar.c.getString(i)).setCancelable(false).setOnKeyListener(new bfq(bftVar)).setOnDismissListener(new bfr(bftVar));
            if (z) {
                onDismissListener.setPositiveButton(bftVar.c.getString(2131951880), bftVar.g);
            } else {
                onDismissListener.setPositiveButton(bftVar.c.getString(2131951803), new bfs(bftVar)).setNegativeButton(bftVar.c.getString(2131951880), bftVar.g);
            }
            bftVar.f = onDismissListener.show();
        }
    }
}