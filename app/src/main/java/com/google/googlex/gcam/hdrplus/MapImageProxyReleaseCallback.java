package com.google.googlex.gcam.hdrplus;

import android.util.LongSparseArray;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.ImageReleaseCallback;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MapImageProxyReleaseCallback extends ImageReleaseCallback {
    public static final long INVALID_IMAGE_ID = GcamModule.getKInvalidImageId();
    public final Object lock = new Object();
    public long nextUniqueId = 0;
    public final LongSparseArray imageMap = new LongSparseArray();

    @Override // com.google.googlex.gcam.ImageReleaseCallback
    public void Run(long j) {
        boolean z = true;
        qdu.a(j != INVALID_IMAGE_ID, "imageId was INVALID_IMAGE_ID (%s).", INVALID_IMAGE_ID);
        synchronized (this.lock) {
            neb nebVar = (neb) this.imageMap.get(j);
            if (nebVar == null) {
                z = false;
            }
            qdu.b(z, "MapImageProxyReleaseCallback does not contain the key %s.", j);
            nebVar.close();
            this.imageMap.remove(j);
        }
    }

    private long getNextUniqueId() {
        long j;
        synchronized (this.lock) {
            j = this.nextUniqueId;
            this.nextUniqueId = 1 + j;
        }
        return j;
    }

    public long put(neb nebVar) {
        long nextUniqueId;
        synchronized (this.lock) {
            qdu.b(this.imageMap.indexOfValue(nebVar) < 0, "image has already been put in MapImageProxyReleaseCallback.");
            nextUniqueId = getNextUniqueId();
            this.imageMap.append(nextUniqueId, nebVar);
        }
        return nextUniqueId;
    }
}
