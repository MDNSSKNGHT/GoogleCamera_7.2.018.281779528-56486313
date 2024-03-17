package com.google.googlex.gcam;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitDepthArguments {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitDepthArguments() {
        this(GcamModuleJNI.new_PortraitDepthArguments__SWIG_3(), true);
    }

    public static long getCPtr(PortraitDepthArguments portraitDepthArguments) {
        if (portraitDepthArguments == null) {
            return 0L;
        }
        return portraitDepthArguments.swigCPtr;
    }

    public PortraitDepthArguments(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PortraitDepthArguments(InterleavedReadViewU16 interleavedReadViewU16) {
        this(GcamModuleJNI.new_PortraitDepthArguments__SWIG_0(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16), true);
    }

    public PortraitDepthArguments(InterleavedReadViewU16 interleavedReadViewU16, StringRawReadViewMap stringRawReadViewMap) {
        this(GcamModuleJNI.new_PortraitDepthArguments__SWIG_1(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, StringRawReadViewMap.getCPtr(stringRawReadViewMap), stringRawReadViewMap), true);
    }

    public PortraitDepthArguments(InterleavedReadViewU8 interleavedReadViewU8) {
        this(GcamModuleJNI.new_PortraitDepthArguments__SWIG_2(InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8), true);
    }

    public PortraitDepthArguments(PortraitDepthArguments portraitDepthArguments) {
        this(GcamModuleJNI.new_PortraitDepthArguments__SWIG_4(getCPtr(portraitDepthArguments), portraitDepthArguments), true);
    }

    public List MultiCamNames() {
        return GcamModuleJNI.PortraitDepthArguments_MultiCamNames(this.swigCPtr, this);
    }

    public RawReadView MultiCamRaw(String str) {
        return new RawReadView(GcamModuleJNI.PortraitDepthArguments_MultiCamRaw(this.swigCPtr, this, str), true);
    }

    public InterleavedReadViewU16 PdInput() {
        return new InterleavedReadViewU16(GcamModuleJNI.PortraitDepthArguments_PdInput(this.swigCPtr, this), false);
    }

    public InterleavedReadViewU8 PrecomputedSmoothDisparity() {
        return new InterleavedReadViewU8(GcamModuleJNI.PortraitDepthArguments_PrecomputedSmoothDisparity(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitDepthArguments(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
