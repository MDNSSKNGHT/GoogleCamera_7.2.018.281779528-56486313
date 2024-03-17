package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Gcam {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public Gcam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Gcam gcam) {
        if (gcam == null) {
            return 0L;
        }
        return gcam.swigCPtr;
    }

    public boolean AbortShot(int i) {
        return GcamModuleJNI.Gcam_AbortShot(this.swigCPtr, this, i);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView) {
        return GcamModuleJNI.Gcam_AddPayloadFrame__SWIG_4(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2) {
        return GcamModuleJNI.Gcam_AddPayloadFrame__SWIG_3(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16) {
        return GcamModuleJNI.Gcam_AddPayloadFrame__SWIG_2(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, long j3) {
        return GcamModuleJNI.Gcam_AddPayloadFrame__SWIG_1(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, j3);
    }

    public boolean AddPayloadFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, long j3, long j4) {
        return GcamModuleJNI.Gcam_AddPayloadFrame__SWIG_0(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, j3, j4);
    }

    public void AddViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, RawWriteView rawWriteView) {
        GcamModuleJNI.Gcam_AddViewfinderFrame__SWIG_1(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, AeShotParams.getCPtr(aeShotParams), aeShotParams, RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public void AddViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, RawWriteView rawWriteView, SWIGTYPE_p_std__functionT_void_fF_t sWIGTYPE_p_std__functionT_void_fF_t) {
        GcamModuleJNI.Gcam_AddViewfinderFrame__SWIG_0(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, AeShotParams.getCPtr(aeShotParams), aeShotParams, RawWriteView.getCPtr(rawWriteView), rawWriteView, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(sWIGTYPE_p_std__functionT_void_fF_t));
    }

    public boolean AppendMessageToSummary(int i, String str) {
        return GcamModuleJNI.Gcam_AppendMessageToSummary(this.swigCPtr, this, i, str);
    }

    public void BeginPayloadFrames(int i, BurstSpec burstSpec) {
        GcamModuleJNI.Gcam_BeginPayloadFrames(this.swigCPtr, this, i, BurstSpec.getCPtr(burstSpec), burstSpec);
    }

    public BurstSpec BuildAfBurstSpec(int i, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap) {
        return new BurstSpec(GcamModuleJNI.Gcam_BuildAfBurstSpec(this.swigCPtr, this, i, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap), true);
    }

    public BurstSpec BuildPayloadBurstSpec(int i, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap) {
        return new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec(this.swigCPtr, this, i, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap), true);
    }

    public static AeResults ComputeAeResults(StaticMetadata staticMetadata, Tuning tuning, AeShotParams aeShotParams, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, boolean z) {
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults__SWIG_1(StaticMetadata.getCPtr(staticMetadata), staticMetadata, Tuning.getCPtr(tuning), tuning, AeShotParams.getCPtr(aeShotParams), aeShotParams, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, z), true);
    }

    public static AeResults ComputeAeResults(StaticMetadata staticMetadata, Tuning tuning, AeShotParams aeShotParams, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, boolean z, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context) {
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults__SWIG_0(StaticMetadata.getCPtr(staticMetadata), staticMetadata, Tuning.getCPtr(tuning), tuning, AeShotParams.getCPtr(aeShotParams), aeShotParams, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, z, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context)), true);
    }

    public void ConfigureViewfinderProcessing(ViewfinderProcessingOptions viewfinderProcessingOptions) {
        GcamModuleJNI.Gcam_ConfigureViewfinderProcessing(this.swigCPtr, this, ViewfinderProcessingOptions.getCPtr(viewfinderProcessingOptions), viewfinderProcessingOptions);
    }

    public static Gcam Create(InitParams initParams, int i, StaticMetadata staticMetadata) {
        long Gcam_Create__SWIG_1 = GcamModuleJNI.Gcam_Create__SWIG_1(InitParams.getCPtr(initParams), initParams, i, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
        if (Gcam_Create__SWIG_1 != 0) {
            return new Gcam(Gcam_Create__SWIG_1, true);
        }
        return null;
    }

    public static Gcam Create(InitParams initParams, StaticMetadataVector staticMetadataVector) {
        long Gcam_Create__SWIG_0 = GcamModuleJNI.Gcam_Create__SWIG_0(InitParams.getCPtr(initParams), initParams, StaticMetadataVector.getCPtr(staticMetadataVector), staticMetadataVector);
        if (Gcam_Create__SWIG_0 != 0) {
            return new Gcam(Gcam_Create__SWIG_0, true);
        }
        return null;
    }

    public boolean EndPayloadFrames(int i, ClientExifMetadata clientExifMetadata) {
        return GcamModuleJNI.Gcam_EndPayloadFrames(this.swigCPtr, this, i, ClientExifMetadata.getCPtr(clientExifMetadata), clientExifMetadata);
    }

    public boolean EndShotCapture(int i) {
        return GcamModuleJNI.Gcam_EndShotCapture(this.swigCPtr, this, i);
    }

    public void FlushTemporalBinning(int i) {
        GcamModuleJNI.Gcam_FlushTemporalBinning(this.swigCPtr, this, i);
    }

    public void FlushViewfinder(int i) {
        GcamModuleJNI.Gcam_FlushViewfinder(this.swigCPtr, this, i);
    }

    public static InterleavedImageU8 GenerateRgbImage(StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, RawWriteView rawWriteView, int i, ThreadPoolConfig threadPoolConfig) {
        return new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage__SWIG_1(StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, RawWriteView.getCPtr(rawWriteView), rawWriteView, i, ThreadPoolConfig.getCPtr(threadPoolConfig), threadPoolConfig), true);
    }

    public static InterleavedImageU8 GenerateRgbImage(StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, RawWriteView rawWriteView, int i, ThreadPoolConfig threadPoolConfig, GenerateRgbImageOptions generateRgbImageOptions) {
        return new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage__SWIG_0(StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, RawWriteView.getCPtr(rawWriteView), rawWriteView, i, ThreadPoolConfig.getCPtr(threadPoolConfig), threadPoolConfig, GenerateRgbImageOptions.getCPtr(generateRgbImageOptions), generateRgbImageOptions), true);
    }

    public InitParams GetInitParams() {
        return new InitParams(GcamModuleJNI.Gcam_GetInitParams(this.swigCPtr, this), false);
    }

    public ViewfinderResults GetLatestViewfinderResults(int i) {
        return new ViewfinderResults(GcamModuleJNI.Gcam_GetLatestViewfinderResults(this.swigCPtr, this, i), true);
    }

    public void GetNewShotMemEstimate(SWIGTYPE_p_gcam__ShotMemInfo sWIGTYPE_p_gcam__ShotMemInfo) {
        GcamModuleJNI.Gcam_GetNewShotMemEstimate(this.swigCPtr, this, SWIGTYPE_p_gcam__ShotMemInfo.getCPtr(sWIGTYPE_p_gcam__ShotMemInfo));
    }

    public int GetNumCameras() {
        return GcamModuleJNI.Gcam_GetNumCameras(this.swigCPtr, this);
    }

    public StaticMetadata GetStaticMetadata(int i) {
        return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.swigCPtr, this, i), false);
    }

    public Tuning GetTuning(int i) {
        return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.swigCPtr, this, i), false);
    }

    public boolean IsCapturing() {
        return GcamModuleJNI.Gcam_IsCapturing(this.swigCPtr, this);
    }

    public boolean IsIdle() {
        return GcamModuleJNI.Gcam_IsIdle(this.swigCPtr, this);
    }

    public boolean LimitShotCpuUsage(int i, float f) {
        return GcamModuleJNI.Gcam_LimitShotCpuUsage(this.swigCPtr, this, i, f);
    }

    public boolean OverrideFrameMetadata(FrameMetadataKey frameMetadataKey, FrameMetadata frameMetadata) {
        return GcamModuleJNI.Gcam_OverrideFrameMetadata(this.swigCPtr, this, FrameMetadataKey.getCPtr(frameMetadataKey), frameMetadataKey, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public long PeakMemoryBytes() {
        return GcamModuleJNI.Gcam_PeakMemoryBytes(this.swigCPtr, this);
    }

    public long PeakMemoryWithNewShotBytes() {
        return GcamModuleJNI.Gcam_PeakMemoryWithNewShotBytes(this.swigCPtr, this);
    }

    public void PrintStatus() {
        GcamModuleJNI.Gcam_PrintStatus(this.swigCPtr, this);
    }

    public boolean ProcessedByTemporalBinning(FrameMetadataKey frameMetadataKey) {
        return GcamModuleJNI.Gcam_ProcessedByTemporalBinning(this.swigCPtr, this, FrameMetadataKey.getCPtr(frameMetadataKey), frameMetadataKey);
    }

    public int StartShotCapture(int i, ShotParams shotParams, ShotCallbacks shotCallbacks, int i2, PostviewParams postviewParams, DebugParams debugParams, ImageSaverParams imageSaverParams, SWIGTYPE_p_gcam__ShotOptions sWIGTYPE_p_gcam__ShotOptions) {
        return GcamModuleJNI.Gcam_StartShotCapture(this.swigCPtr, this, i, ShotParams.getCPtr(shotParams), shotParams, ShotCallbacks.getCPtr(shotCallbacks), shotCallbacks, i2, PostviewParams.getCPtr(postviewParams), postviewParams, DebugParams.getCPtr(debugParams), debugParams, ImageSaverParams.getCPtr(imageSaverParams), imageSaverParams, SWIGTYPE_p_gcam__ShotOptions.getCPtr(sWIGTYPE_p_gcam__ShotOptions));
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_7(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_6(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_5(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, FrameMetadata frameMetadata2) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_4(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, FrameMetadata.getCPtr(frameMetadata2), frameMetadata2);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, FrameMetadata frameMetadata2, long j3) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_3(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, FrameMetadata.getCPtr(frameMetadata2), frameMetadata2, j3);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, FrameMetadata frameMetadata2, long j3, RawWriteView rawWriteView2) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_2(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, FrameMetadata.getCPtr(frameMetadata2), frameMetadata2, j3, RawWriteView.getCPtr(rawWriteView2), rawWriteView2);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, FrameMetadata frameMetadata2, long j3, RawWriteView rawWriteView2, boolean z) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_1(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, FrameMetadata.getCPtr(frameMetadata2), frameMetadata2, j3, RawWriteView.getCPtr(rawWriteView2), rawWriteView2, z);
    }

    public boolean TemporallyBinViewfinderFrame(int i, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, long j, RawWriteView rawWriteView, long j2, InterleavedWriteViewU16 interleavedWriteViewU16, FrameMetadata frameMetadata2, long j3, RawWriteView rawWriteView2, boolean z, int i2) {
        return GcamModuleJNI.Gcam_TemporallyBinViewfinderFrame__SWIG_0(this.swigCPtr, this, i, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, j, RawWriteView.getCPtr(rawWriteView), rawWriteView, j2, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16, FrameMetadata.getCPtr(frameMetadata2), frameMetadata2, j3, RawWriteView.getCPtr(rawWriteView2), rawWriteView2, z, i2);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_Gcam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
