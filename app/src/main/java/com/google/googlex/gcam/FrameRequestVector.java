package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameRequestVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FrameRequestVector() {
        this(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
    }

    public static long getCPtr(FrameRequestVector frameRequestVector) {
        if (frameRequestVector == null) {
            return 0L;
        }
        return frameRequestVector.swigCPtr;
    }

    public FrameRequestVector(long j) {
        this(GcamModuleJNI.new_FrameRequestVector__SWIG_1(j), true);
    }

    public FrameRequestVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(FrameRequest frameRequest) {
        GcamModuleJNI.FrameRequestVector_add(this.swigCPtr, this, FrameRequest.getCPtr(frameRequest), frameRequest);
    }

    public long capacity() {
        return GcamModuleJNI.FrameRequestVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.FrameRequestVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FrameRequestVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public FrameRequest get(int i) {
        return new FrameRequest(GcamModuleJNI.FrameRequestVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.FrameRequestVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.FrameRequestVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, FrameRequest frameRequest) {
        GcamModuleJNI.FrameRequestVector_set(this.swigCPtr, this, i, FrameRequest.getCPtr(frameRequest), frameRequest);
    }

    public long size() {
        return GcamModuleJNI.FrameRequestVector_size(this.swigCPtr, this);
    }
}
