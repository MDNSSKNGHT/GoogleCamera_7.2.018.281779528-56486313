package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: hox  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hox implements miz {
    private final hpa a;
    private final fby b;

    public hox(hpa hpaVar, fby fbyVar) {
        this.a = hpaVar;
        this.b = fbyVar;
    }

    @Override // defpackage.miz
    public final void a(Object obj) {
        hpa hpaVar = this.a;
        fby fbyVar = this.b;
        Surface surface = (Surface) obj;
        if (surface != null) {
            fbyVar.a(surface);
            hpaVar.j = true;
        }
    }
}