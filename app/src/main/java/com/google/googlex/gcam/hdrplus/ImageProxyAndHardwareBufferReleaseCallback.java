package com.google.googlex.gcam.hdrplus;

import android.hardware.HardwareBuffer;
import android.util.LongSparseArray;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.ImageReleaseCallback;
import j$.util.Objects;

import defpackage.*;

public class ImageProxyAndHardwareBufferReleaseCallback extends ImageReleaseCallback {
    public static final long INVALID_BUFFER_ID = GcamModule.getKInvalidImageId();
    public final Object lock = new Object();
    public long nextUniqueId = 0;
    public final LongSparseArray entries = new LongSparseArray();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Key {
        public final long hardwareBufferId;
        public final long imageId;

        private Key(long j) {
            this.imageId = j;
            this.hardwareBufferId = ImageProxyAndHardwareBufferReleaseCallback.INVALID_BUFFER_ID;
        }

        private Key(long j, long j2) {
            this.imageId = j;
            this.hardwareBufferId = j2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.imageId == key.imageId && this.hardwareBufferId == key.hardwareBufferId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.imageId), Long.valueOf(this.hardwareBufferId));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    static class Entry {
        public final HardwareBuffer hardwareBuffer;
        public final neb image;
        public int refCount;

        public Entry(neb nebVar) {
            this.refCount = 1;
            this.image = nebVar;
            this.hardwareBuffer = null;
        }

        private Entry(neb nebVar, HardwareBuffer hardwareBuffer) {
            this.refCount = 2;
            this.image = nebVar;
            this.hardwareBuffer = hardwareBuffer;
        }

        static /* synthetic */ void access$300(Entry entry) {
            entry.release();
        }

        private void release() {
            qdu.b(this.refCount > 0, "Tried to release an entry that has already been released.");
            int i = this.refCount - 1;
            this.refCount = i;
            if (i != 0) {
                return;
            }
            HardwareBuffer hardwareBuffer = this.hardwareBuffer;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
            }
            this.image.close();
        }
    }

    @Override // com.google.googlex.gcam.ImageReleaseCallback
    public void Run(long j) {
        boolean z = true;
        qdu.a(j != INVALID_BUFFER_ID, "id was INVALID_BUFFER_ID (%s).", INVALID_BUFFER_ID);
        synchronized (this.lock) {
            Entry entry = (Entry) this.entries.get(j);
            if (entry == null) {
                z = false;
            }
            qdu.b(z, "ImageProxyAndHardwareBufferReleaseCallback does not contain the id %s.", j);
            Entry.access$300(entry);
            this.entries.remove(j);
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

    public Key register(neb nebVar) {
        Key key;
        synchronized (this.lock) {
            Entry entry = new Entry(nebVar);
            key = new Key(getNextUniqueId());
            this.entries.append(key.imageId, entry);
        }
        return key;
    }

    public Key register(neb nebVar, HardwareBuffer hardwareBuffer) {
        Key key;
        synchronized (this.lock) {
            Entry entry = new Entry(nebVar, hardwareBuffer);
            key = new Key(getNextUniqueId(), getNextUniqueId());
            this.entries.append(key.imageId, entry);
            this.entries.append(key.hardwareBufferId, entry);
        }
        return key;
    }
}
