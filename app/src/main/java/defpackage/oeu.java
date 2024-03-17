package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: oeu  reason: default package */
/* loaded from: classes.dex */
public final class oeu implements off {
    private final off a;

    public oeu(off offVar) {
        this.a = offVar;
    }

    @Override // defpackage.off, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.off
    public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        oez a = oez.a(byteBuffer, bufferInfo);
        this.a.a(a.a, a.b);
    }
}