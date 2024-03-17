package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: ofi  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class ofi implements Runnable {
    private final ofk a;
    private final oez b;

    public ofi(ofk ofkVar, oez oezVar) {
        this.a = ofkVar;
        this.b = oezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ofk ofkVar = this.a;
        oez oezVar = this.b;
        if (!ofkVar.d.isDone()) {
            if (oezVar.b.size != 0 || (oezVar.b.flags & 4) == 0) {
                ofkVar.f.add(oezVar);
            } else {
                ofkVar.d.b((Object) null);
            }
            ofkVar.a();
            return;
        }
        Log.w("MuxerTrackStreamImpl", "WriteSampleData called after close called. Packet dropped.");
    }
}