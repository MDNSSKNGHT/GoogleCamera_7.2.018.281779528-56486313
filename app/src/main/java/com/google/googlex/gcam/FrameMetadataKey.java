package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameMetadataKey {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Compare {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Compare() {
            this(GcamModuleJNI.new_FrameMetadataKey_Compare(), true);
        }

        public static long getCPtr(Compare compare) {
            if (compare == null) {
                return 0L;
            }
            return compare.swigCPtr;
        }

        public Compare(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_FrameMetadataKey_Compare(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Hasher {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Hasher() {
            this(GcamModuleJNI.new_FrameMetadataKey_Hasher(), true);
        }

        public static long getCPtr(Hasher hasher) {
            if (hasher == null) {
                return 0L;
            }
            return hasher.swigCPtr;
        }

        public Hasher(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_FrameMetadataKey_Hasher(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }
    }

    public FrameMetadataKey() {
        this(GcamModuleJNI.new_FrameMetadataKey__SWIG_2(), true);
    }

    public static long getCPtr(FrameMetadataKey frameMetadataKey) {
        if (frameMetadataKey == null) {
            return 0L;
        }
        return frameMetadataKey.swigCPtr;
    }

    public FrameMetadataKey(long j, int i) {
        this(GcamModuleJNI.new_FrameMetadataKey__SWIG_1(j, i), true);
    }

    public FrameMetadataKey(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public FrameMetadataKey(FrameMetadata frameMetadata) {
        this(GcamModuleJNI.new_FrameMetadataKey__SWIG_0(FrameMetadata.getCPtr(frameMetadata), frameMetadata), true);
    }

    public FrameMetadataKey(FrameMetadataKey frameMetadataKey) {
        this(GcamModuleJNI.new_FrameMetadataKey__SWIG_3(getCPtr(frameMetadataKey), frameMetadataKey), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FrameMetadataKey(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
