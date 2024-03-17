package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThreadPoolConfig {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ThreadPoolConfig() {
        this(GcamModuleJNI.new_ThreadPoolConfig(), true);
    }

    public static long getCPtr(ThreadPoolConfig threadPoolConfig) {
        if (threadPoolConfig == null) {
            return 0L;
        }
        return threadPoolConfig.swigCPtr;
    }

    public ThreadPoolConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(ThreadPoolConfig threadPoolConfig) {
        return GcamModuleJNI.ThreadPoolConfig_Equals(this.swigCPtr, this, getCPtr(threadPoolConfig), threadPoolConfig);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ThreadPoolConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getAffinity_mask() {
        return GcamModuleJNI.ThreadPoolConfig_affinity_mask_get(this.swigCPtr, this);
    }

    public int getCount() {
        return GcamModuleJNI.ThreadPoolConfig_count_get(this.swigCPtr, this);
    }

    public ThreadPriority getPriority() {
        long ThreadPoolConfig_priority_get = GcamModuleJNI.ThreadPoolConfig_priority_get(this.swigCPtr, this);
        if (ThreadPoolConfig_priority_get != 0) {
            return new ThreadPriority(ThreadPoolConfig_priority_get, false);
        }
        return null;
    }

    public void setAffinity_mask(long j) {
        GcamModuleJNI.ThreadPoolConfig_affinity_mask_set(this.swigCPtr, this, j);
    }

    public void setCount(int i) {
        GcamModuleJNI.ThreadPoolConfig_count_set(this.swigCPtr, this, i);
    }

    public void setPriority(ThreadPriority threadPriority) {
        GcamModuleJNI.ThreadPoolConfig_priority_set(this.swigCPtr, this, ThreadPriority.getCPtr(threadPriority), threadPriority);
    }
}
