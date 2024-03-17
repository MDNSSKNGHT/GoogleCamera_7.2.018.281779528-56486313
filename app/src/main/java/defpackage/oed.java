package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: oed  reason: default package */
/* loaded from: classes.dex */
final class oed implements oee {
    private final off a;
    private volatile boolean b = false;

    public oed(off offVar) {
        this.a = offVar;
    }

    @Override // defpackage.oen
    public final void a() {
    }

    @Override // defpackage.oen
    public final void f() {
        this.a.close();
        rgk.b(oed.class);
    }

    @Override // defpackage.oen
    public final void g() {
        this.b = true;
    }

    @Override // defpackage.oee
    public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.b) {
            return;
        }
        this.a.a(byteBuffer, bufferInfo);
    }
}