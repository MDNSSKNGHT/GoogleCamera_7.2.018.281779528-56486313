package defpackage;

import com.google.googlex.gcam.hdrplus.EncodedBlobCallback;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: drx  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class drx implements EncodedBlobCallback {
    private final dse a;

    public drx(dse dseVar) {
        this.a = dseVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.EncodedBlobCallback
    public final void onDataAvailable(int i, ByteBuffer byteBuffer, int i2, int i3) {
        dse dseVar = this.a;
        String str = dse.a;
        fpp.a("JPEG ready. shotId = %d, resolution = %d x %d, %d bytes", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(byteBuffer.capacity()));
        liu.b(str);
        qdu.d(dseVar.u == 1);
        ((dsl) dseVar.s.l().b()).a(new drk(byteBuffer, i2, i3));
    }
}
