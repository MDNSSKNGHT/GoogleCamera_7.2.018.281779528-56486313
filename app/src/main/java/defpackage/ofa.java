package defpackage;

import android.media.MediaMuxer;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: ofa  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class ofa implements Runnable {
    private final ofd a;

    public ofa(ofd ofdVar) {
        this.a = ofdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaMuxer mediaMuxer;
        ofd ofdVar = this.a;
        try {
            pjz c = pjz.c((Integer) rgk.b((Future) ofdVar.b));
            pjz c2 = pjz.c((Float) rgk.b((Future) ofdVar.c));
            pjz c3 = pjz.c((Float) rgk.b((Future) ofdVar.d));
            oex oexVar = (oex) rgk.b((Future) ofdVar.a);
            if (oexVar.a.a()) {
                mediaMuxer = new MediaMuxer((String) oexVar.a.b(), 0);
            } else {
                mediaMuxer = new MediaMuxer((FileDescriptor) oexVar.b.b(), 0);
            }
            if (c.a()) {
                mediaMuxer.setOrientationHint(((Integer) c.b()).intValue());
            }
            if (c2.a() && c3.a()) {
                mediaMuxer.setLocation(((Float) c2.b()).floatValue(), ((Float) c3.b()).floatValue());
            }
            ofdVar.e.b(mediaMuxer);
        } catch (IOException e) {
            Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", e);
            ofdVar.e.a((Throwable) e);
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            Log.e("MuxerImpl", "Expected future to be set.", e2);
            ofdVar.e.a((Throwable) e2);
        }
    }
}