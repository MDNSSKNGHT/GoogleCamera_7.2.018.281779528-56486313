package defpackage;

import com.google.android.apps.camera.debugui.DebugCanvasView;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: crd  reason: default package */
/* loaded from: classes.dex */
public final class crd {
    public static final String b = liu.a("DebugCanvasAdapter");
    public DebugCanvasView a;
    public boolean c = false;

    public final void a(Optional optional) {
        DebugCanvasView debugCanvasView = this.a;
        if (debugCanvasView == null) {
            liu.b(b, "UI view not yet initialized");
        } else {
            debugCanvasView.e = optional;
        }
    }
}