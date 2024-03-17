package defpackage;

import com.google.googlex.gcam.hdrplus.EncodedBlobCallback;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: drw  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class drw implements EncodedBlobCallback {
    private final dse a;

    public drw(dse dseVar) {
        this.a = dseVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
    public final void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3) {
        dse dseVar = this.a;
        String str = dse.a;
        fpp.a("Gcam merged DNG data ready: %d bytes, shotId = %d", Integer.valueOf(byteBuffer.capacity()), Integer.valueOf(i));
        liu.b(str);
        qdu.d(dseVar.u == 1);
        ((dsi) dseVar.s.f().b()).a(new dni(byteBuffer, i2, i3));
    }
}
