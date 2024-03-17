package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: ofk  reason: default package */
/* loaded from: classes.dex */
final class ofk implements off {
    public final qpp a;
    public MediaMuxer g;
    private final oft i;
    public final qqg b = qqg.f();
    public final qqg c = qqg.f();
    private final qqg h = qqg.f();
    public final qqg d = qqg.f();
    public final qqg e = qqg.f();
    public final ConcurrentLinkedDeque f = new ConcurrentLinkedDeque();
    private final Object j = new Object();
    private long k = 0;

    public ofk(qpp qppVar, oft oftVar) {
        this.i = oftVar;
        this.a = qppVar;
        qppVar.a(new ofg(this), this.i);
        this.c.a(new ofh(this), this.i);
    }

    @Override // defpackage.off, java.lang.AutoCloseable
    public void close() {
        this.i.execute(new ofj(this));
    }

    private static boolean a(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) && mediaFormat.getInteger(str) > 0;
    }

    public void a() {
        try {
            synchronized (this.j) {
                if (this.a.isDone() && !this.a.isCancelled()) {
                    boolean a = a((MediaFormat) rgk.b(this.a), "oo.muxer.drop_initial_non_keyframes");
                    if (!this.h.isDone()) {
                        if (a) {
                            while (!this.f.isEmpty() && (((oez) this.f.getFirst()).b.flags & 1) == 0) {
                                this.f.removeFirst();
                            }
                        }
                        if (!this.f.isEmpty()) {
                            this.h.b(Long.valueOf(((oez) this.f.getFirst()).b.presentationTimeUs));
                        }
                    }
                }
                if (!this.b.isDone()) {
                    boolean isCancelled = this.a.isCancelled();
                    boolean z = this.a.isDone() && !this.h.isDone() && this.d.isDone();
                    boolean z2 = !this.h.isDone() && this.f.isEmpty() && this.d.isDone();
                    if (!z && !z2 && !isCancelled) {
                        if (this.a.isDone() && !this.a.isCancelled() && this.h.isDone()) {
                            this.b.b(true);
                        }
                    }
                    this.b.b(false);
                    this.e.b(null);
                }
                if (this.c.isDone() && this.a.isDone() && !this.a.isCancelled()) {
                    while (true) {
                        oez oezVar = (oez) this.f.pollFirst();
                        if (oezVar == null) {
                            break;
                        }
                        int intValue = ((Integer) rgk.b(this.c)).intValue();
                        MediaMuxer mediaMuxer = this.g;
                        long j = oezVar.b.presentationTimeUs;
                        long j2 = this.k;
                        if (a((MediaFormat) rgk.b(this.a), "oo.muxer.force_sequential")) {
                            if (j < j2) {
                                oezVar.b.presentationTimeUs = this.k;
                            }
                            this.k = oezVar.b.presentationTimeUs + 100;
                        }
                        if (oezVar.b.size != 0) {
                            mediaMuxer.writeSampleData(intValue, oezVar.a, oezVar.b);
                        }
                    }
                    qdu.d(this.f.isEmpty());
                    if (this.d.isDone()) {
                        this.e.b(null);
                    }
                }
            }
        } catch (Exception e) {
            Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", e);
            this.e.a(e);
        }
    }

    @Override // defpackage.off
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(bufferInfo.offset);
        duplicate.limit(bufferInfo.size + bufferInfo.offset);
        this.i.execute(new ofi(this, new oez(duplicate, bufferInfo2)));
    }
}