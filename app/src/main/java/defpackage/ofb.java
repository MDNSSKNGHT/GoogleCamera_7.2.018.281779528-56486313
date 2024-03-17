package defpackage;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: ofb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class ofb implements Runnable {
    private final ofd a;

    public ofb(ofd ofdVar) {
        this.a = ofdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ofd ofdVar = this.a;
        try {
            int i = 0;
            for (ofk ofkVar : ofdVar.h) {
                if (((Boolean) rgk.b((Future) ofkVar.b)).booleanValue()) {
                    i++;
                }
            }
            if (i != 0) {
                MediaMuxer mediaMuxer = (MediaMuxer) rgk.b((Future) ofdVar.e);
                for (ofk ofkVar2 : ofdVar.h) {
                    if (((Boolean) rgk.b((Future) ofkVar2.b)).booleanValue()) {
                        int addTrack = mediaMuxer.addTrack((MediaFormat) rgk.b((Future) ofkVar2.a));
                        ofkVar2.g = (MediaMuxer) rgk.b((Future) ofdVar.e);
                        ofkVar2.c.b(Integer.valueOf(addTrack));
                    }
                }
                mediaMuxer.start();
                ofdVar.f.b((Object) true);
                return;
            }
            ((MediaMuxer) rgk.b((Future) ofdVar.e)).release();
            ofdVar.f.cancel(true);
        } catch (ExecutionException e) {
            Log.e("MuxerImpl", "MediaMuxer should be done by now.", e);
            ofdVar.f.a((Throwable) e);
        }
    }
}