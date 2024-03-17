package defpackage;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* compiled from: PG */
/* renamed from: crk  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class crk implements Runnable {
    private final cin a;
    private final crd b;

    public crk(cin cinVar, crd crdVar) {
        this.a = cinVar;
        this.b = crdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cin cinVar = this.a;
        crd crdVar = this.b;
        int i = crl.a;
        ciq ciqVar = cit.a;
        cinVar.e();
        crdVar.c = false;
        DebugCanvasView debugCanvasView = crdVar.a;
        if (debugCanvasView == null) {
            liu.b(crd.b, "UI view not yet initialized");
        } else {
            debugCanvasView.setVisibility(4);
        }
    }
}