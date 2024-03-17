package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GcamModule {
    public static void AdjustRawVignetting(RawVignetteParams rawVignetteParams, SpatialGainMap spatialGainMap) {
        GcamModuleJNI.AdjustRawVignetting(RawVignetteParams.getCPtr(rawVignetteParams), rawVignetteParams, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public static void ApplyAntibanding(int i, boolean z, float f, float f2, SWIGTYPE_p_float sWIGTYPE_p_float, SWIGTYPE_p_float sWIGTYPE_p_float2) {
        GcamModuleJNI.ApplyAntibanding(i, z, f, f2, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float2));
    }

    public static void ApplyBlsAndSgm(SpatialGainMap spatialGainMap, float[] fArr, int i, InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.ApplyBlsAndSgm(SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, fArr, i, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }

    public static SWIGTYPE_p_std__arrayT_float_3_t ApplyColorSaturation(SWIGTYPE_p_std__arrayT_float_3_t sWIGTYPE_p_std__arrayT_float_3_t, ColorSatParams colorSatParams) {
        return new SWIGTYPE_p_std__arrayT_float_3_t(GcamModuleJNI.ApplyColorSaturation(SWIGTYPE_p_std__arrayT_float_3_t.getCPtr(sWIGTYPE_p_std__arrayT_float_3_t), ColorSatParams.getCPtr(colorSatParams), colorSatParams), true);
    }

    public static boolean ApplySensorBinning(int i, StaticMetadata staticMetadata) {
        return GcamModuleJNI.ApplySensorBinning__SWIG_1(i, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public static void ApplySensorBinning(int i, boolean z, boolean z2, FrameMetadata frameMetadata) {
        GcamModuleJNI.ApplySensorBinning__SWIG_0(i, z, z2, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public static boolean BayerPatternColors(int i, short[] sArr) {
        return GcamModuleJNI.BayerPatternColors(i, sArr);
    }

    public static int BayerPatternFromColors(short[] sArr) {
        return GcamModuleJNI.BayerPatternFromColors(sArr);
    }

    public static boolean CheckBlackRegions(PixelRectVector pixelRectVector, StaticMetadata staticMetadata) {
        return GcamModuleJNI.CheckBlackRegions(PixelRectVector.getCPtr(pixelRectVector), pixelRectVector, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public static void CheckHdrGains(float f, float f2, float f3, float f4, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        GcamModuleJNI.CheckHdrGains(f, f2, f3, f4, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver));
    }

    public static String ConvertBurstMetadataToString(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        return GcamModuleJNI.ConvertBurstMetadataToString__SWIG_2(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static String ConvertBurstMetadataToString(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, boolean z) {
        return GcamModuleJNI.ConvertBurstMetadataToString__SWIG_1(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), z);
    }

    public static String ConvertBurstMetadataToString(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, boolean z, boolean z2) {
        return GcamModuleJNI.ConvertBurstMetadataToString__SWIG_0(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), z, z2);
    }

    public static void ConvertFrameMetadataToRgb(int i, boolean z, FrameMetadata frameMetadata) {
        GcamModuleJNI.ConvertFrameMetadataToRgb(i, z, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public static String ConvertShotParamsToString(ShotParams shotParams) {
        return GcamModuleJNI.ConvertShotParamsToString(ShotParams.getCPtr(shotParams), shotParams);
    }

    public static String ConvertStaticMetadataToString(StaticMetadata staticMetadata) {
        return GcamModuleJNI.ConvertStaticMetadataToString__SWIG_1(StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public static String ConvertStaticMetadataToString(StaticMetadata staticMetadata, boolean z) {
        return GcamModuleJNI.ConvertStaticMetadataToString__SWIG_0(StaticMetadata.getCPtr(staticMetadata), staticMetadata, z);
    }

    public static PortraitRequest CreateDefaultRequest() {
        return new PortraitRequest(GcamModuleJNI.CreateDefaultRequest(), true);
    }

    public static FaceInfo CropFaceInfo(FaceInfo faceInfo, NormalizedRect normalizedRect, int i, int i2) {
        return new FaceInfo(GcamModuleJNI.CropFaceInfo__SWIG_1(FaceInfo.getCPtr(faceInfo), faceInfo, NormalizedRect.getCPtr(normalizedRect), normalizedRect, i, i2), true);
    }

    public static FaceInfo CropFaceInfo(FaceInfo faceInfo, PixelRect pixelRect, int i, int i2) {
        return new FaceInfo(GcamModuleJNI.CropFaceInfo__SWIG_0(FaceInfo.getCPtr(faceInfo), faceInfo, PixelRect.getCPtr(pixelRect), pixelRect, i, i2), true);
    }

    public static boolean CropInDngMetadata(int i) {
        return GcamModuleJNI.CropInDngMetadata(i);
    }

    public static int DecodeIccProfileData(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j) {
        return GcamModuleJNI.DecodeIccProfileData(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j);
    }

    public static void DecreaseTrackedMemory(long j) {
        GcamModuleJNI.DecreaseTrackedMemory(j);
    }

    public static boolean Deserialize(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, AeResults aeResults) {
        return GcamModuleJNI.Deserialize__SWIG_0(SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), AeResults.getCPtr(aeResults), aeResults);
    }

    public static boolean Deserialize(String str, AeResults aeResults) {
        return GcamModuleJNI.Deserialize__SWIG_1(str, AeResults.getCPtr(aeResults), aeResults);
    }

    public static boolean DeserializeBurstMetadata(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        return GcamModuleJNI.DeserializeBurstMetadata(SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static boolean DeserializeDngMakernoteFromString(String str, InitParams initParams, StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata) {
        return GcamModuleJNI.DeserializeDngMakernoteFromString(str, InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public static IspAwbMetadata DeserializeFromBytes(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j) {
        return new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j), true);
    }

    public static float EstimateSnr(FrameMetadata frameMetadata, int i) {
        return GcamModuleJNI.EstimateSnr__SWIG_1(FrameMetadata.getCPtr(frameMetadata), frameMetadata, i);
    }

    public static float EstimateSnr(FrameMetadata frameMetadata, int i, float f) {
        return GcamModuleJNI.EstimateSnr__SWIG_0(FrameMetadata.getCPtr(frameMetadata), frameMetadata, i, f);
    }

    public static AeRunnerDeviceTuning ExtractAeRunnerDeviceTuning(Tuning tuning) {
        return new AeRunnerDeviceTuning(GcamModuleJNI.ExtractAeRunnerDeviceTuning(Tuning.getCPtr(tuning), tuning), true);
    }

    public static NormalizedRect FaceInfoToNormalizedRect(FaceInfo faceInfo, int i, int i2, boolean z) {
        return new NormalizedRect(GcamModuleJNI.FaceInfoToNormalizedRect__SWIG_1(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z), true);
    }

    public static NormalizedRect FaceInfoToNormalizedRect(FaceInfo faceInfo, int i, int i2, boolean z, int i3) {
        return new NormalizedRect(GcamModuleJNI.FaceInfoToNormalizedRect__SWIG_0(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z, i3), true);
    }

    public static PixelRect FaceInfoToPixelRect(FaceInfo faceInfo, int i, int i2, boolean z) {
        return new PixelRect(GcamModuleJNI.FaceInfoToPixelRect__SWIG_1(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z), true);
    }

    public static PixelRect FaceInfoToPixelRect(FaceInfo faceInfo, int i, int i2, boolean z, int i3) {
        return new PixelRect(GcamModuleJNI.FaceInfoToPixelRect__SWIG_0(FaceInfo.getCPtr(faceInfo), faceInfo, i, i2, z, i3), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_2(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_1(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver)), true);
    }

    public static TetFactorization FactorizeTet(TetModel tetModel, float f, float f2, FactorizeTetOptions factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, int i) {
        return new TetFactorization(GcamModuleJNI.FactorizeTet__SWIG_0(TetModel.getCPtr(tetModel), tetModel, f, f2, FactorizeTetOptions.getCPtr(factorizeTetOptions), factorizeTetOptions, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), i), true);
    }

    public static void FixOldWbGains(AwbInfo awbInfo) {
        GcamModuleJNI.FixOldWbGains(AwbInfo.getCPtr(awbInfo), awbInfo);
    }

    public static int GetBitsPerChannel(int i) {
        return GcamModuleJNI.GetBitsPerChannel(i);
    }

    public static int GetBitsPerPixel(int i) {
        return GcamModuleJNI.GetBitsPerPixel(i);
    }

    public static FileSaver GetCustomFileSaver() {
        long GetCustomFileSaver = GcamModuleJNI.GetCustomFileSaver();
        if (GetCustomFileSaver != 0) {
            return new FileSaver(GetCustomFileSaver, false);
        }
        return null;
    }

    public static FactorizeTetOptions GetFactorizeTetOptions(Tuning tuning, StaticMetadata staticMetadata) {
        return new FactorizeTetOptions(GcamModuleJNI.GetFactorizeTetOptions(Tuning.getCPtr(tuning), tuning, StaticMetadata.getCPtr(staticMetadata), staticMetadata), true);
    }

    public static SpatialGainMap GetFlatSpatialGainMap() {
        return new SpatialGainMap(GcamModuleJNI.GetFlatSpatialGainMap(), false);
    }

    public static boolean GetIccProfileData(int i, SWIGTYPE_p_p_unsigned_char sWIGTYPE_p_p_unsigned_char, SWIGTYPE_p_unsigned_long sWIGTYPE_p_unsigned_long) {
        return GcamModuleJNI.GetIccProfileData(i, SWIGTYPE_p_p_unsigned_char.getCPtr(sWIGTYPE_p_p_unsigned_char), SWIGTYPE_p_unsigned_long.getCPtr(sWIGTYPE_p_unsigned_long));
    }

    public static SpatialGainMap GetN5N6SpatialGainMap() {
        return new SpatialGainMap(GcamModuleJNI.GetN5N6SpatialGainMap(), false);
    }

    public static int GetNumChannels(int i) {
        return GcamModuleJNI.GetNumChannels(i);
    }

    public static int GetRandomBayerPattern() {
        return GcamModuleJNI.GetRandomBayerPattern();
    }

    public static FaceInfo GetRandomFaceInfo() {
        return new FaceInfo(GcamModuleJNI.GetRandomFaceInfo(), true);
    }

    public static FrameMetadata GetRandomFrameMetadata() {
        return new FrameMetadata(GcamModuleJNI.GetRandomFrameMetadata(), true);
    }

    public static InitParams GetRandomInitParams() {
        return new InitParams(GcamModuleJNI.GetRandomInitParams(), true);
    }

    public static IspAwbMetadata GetRandomIspAwbMetadata() {
        return new IspAwbMetadata(GcamModuleJNI.GetRandomIspAwbMetadata(), true);
    }

    public static MeshWarp GetRandomMeshWarp() {
        return new MeshWarp(GcamModuleJNI.GetRandomMeshWarp(), true);
    }

    public static int GetRandomPixelFormat() {
        return GcamModuleJNI.GetRandomPixelFormat();
    }

    public static ShotParams GetRandomShotParams() {
        return new ShotParams(GcamModuleJNI.GetRandomShotParams(), true);
    }

    public static StaticMetadata GetRandomStaticMetadata() {
        return new StaticMetadata(GcamModuleJNI.GetRandomStaticMetadata(), true);
    }

    public static AwbInfo GetRandomWhiteBalance() {
        return new AwbInfo(GcamModuleJNI.GetRandomWhiteBalance(), true);
    }

    public static int GetRawCropping(ShotParams shotParams, ShotCallbacks shotCallbacks) {
        return GcamModuleJNI.GetRawCropping(ShotParams.getCPtr(shotParams), shotParams, ShotCallbacks.getCPtr(shotCallbacks), shotCallbacks);
    }

    public static void GetRotatedImageSize(int i, int i2, int i3, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2) {
        GcamModuleJNI.GetRotatedImageSize(i, i2, i3, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2));
    }

    public static long GetTrackedMemoryCurrent() {
        return GcamModuleJNI.GetTrackedMemoryCurrent();
    }

    public static long GetTrackedMemoryPeak() {
        return GcamModuleJNI.GetTrackedMemoryPeak();
    }

    public static boolean GetTuning(StaticMetadata staticMetadata, boolean z, Tuning tuning) {
        return GcamModuleJNI.GetTuning__SWIG_1(StaticMetadata.getCPtr(staticMetadata), staticMetadata, z, Tuning.getCPtr(tuning), tuning);
    }

    public static boolean GetTuning(String str, String str2, int i, boolean z, Tuning tuning) {
        return GcamModuleJNI.GetTuning__SWIG_0(str, str2, i, z, Tuning.getCPtr(tuning), tuning);
    }

    public static SpatialGainMap GetTypicalSpatialGainMap() {
        return new SpatialGainMap(GcamModuleJNI.GetTypicalSpatialGainMap(), false);
    }

    public static StaticMetadata GetUncalibratedStaticMetadata() {
        return new StaticMetadata(GcamModuleJNI.GetUncalibratedStaticMetadata(), true);
    }

    public static String GetVersion() {
        return GcamModuleJNI.GetVersion();
    }

    public static void IncreaseTrackedMemory(long j) {
        GcamModuleJNI.IncreaseTrackedMemory(j);
    }

    public static void InitCustomFileSaver(FileSaver fileSaver) {
        GcamModuleJNI.InitCustomFileSaver(FileSaver.getCPtr(fileSaver), fileSaver);
    }

    public static NormalizedRect Intersect(NormalizedRect normalizedRect, NormalizedRect normalizedRect2) {
        return new NormalizedRect(GcamModuleJNI.Intersect__SWIG_1(NormalizedRect.getCPtr(normalizedRect), normalizedRect, NormalizedRect.getCPtr(normalizedRect2), normalizedRect2), true);
    }

    public static PixelRect Intersect(PixelRect pixelRect, PixelRect pixelRect2) {
        return new PixelRect(GcamModuleJNI.Intersect__SWIG_0(PixelRect.getCPtr(pixelRect), pixelRect, PixelRect.getCPtr(pixelRect2), pixelRect2), true);
    }

    public static boolean IsIpuOffload(int i) {
        return GcamModuleJNI.IsIpuOffload(i);
    }

    public static boolean IsLogical(int i) {
        return GcamModuleJNI.IsLogical(i);
    }

    public static boolean IsMergedRawFullSized(int i) {
        return GcamModuleJNI.IsMergedRawFullSized(i);
    }

    public static boolean IsPlanar(int i) {
        return GcamModuleJNI.IsPlanar(i);
    }

    public static boolean IsRgb16(int i) {
        return GcamModuleJNI.IsRgb16(i);
    }

    public static boolean IsRgb8(int i) {
        return GcamModuleJNI.IsRgb8(i);
    }

    public static boolean IsValidSensorId(int i) {
        return GcamModuleJNI.IsValidSensorId(i);
    }

    public static boolean IsYuv(int i) {
        return GcamModuleJNI.IsYuv(i);
    }

    public static RawVignetteParams Lerp(RawVignetteParams rawVignetteParams, RawVignetteParams rawVignetteParams2, float f) {
        return new RawVignetteParams(GcamModuleJNI.Lerp(RawVignetteParams.getCPtr(rawVignetteParams), rawVignetteParams, RawVignetteParams.getCPtr(rawVignetteParams2), rawVignetteParams2, f), true);
    }

    public static DehazeParams MakeRandomDehazeParams() {
        return new DehazeParams(GcamModuleJNI.MakeRandomDehazeParams(), true);
    }

    public static DenoiseParams MakeRandomDenoiseParams() {
        return new DenoiseParams(GcamModuleJNI.MakeRandomDenoiseParams(), true);
    }

    public static RawSharpenParams MakeRandomSharpenParams() {
        return new RawSharpenParams(GcamModuleJNI.MakeRandomSharpenParams(), true);
    }

    public static SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t MakeSharpenCurve(float f, float f2, float f3) {
        return new SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t(GcamModuleJNI.MakeSharpenCurve(f, f2, f3), true);
    }

    public static TetWaypoint MakeTetWaypoint(float f, float f2) {
        return new TetWaypoint(GcamModuleJNI.MakeTetWaypoint(f, f2), true);
    }

    public static SpatialGainMap ParameterizedSpatialGainMap(int i, int i2, float f, float f2, float f3) {
        return new SpatialGainMap(GcamModuleJNI.ParameterizedSpatialGainMap(i, i2, f, f2, f3), true);
    }

    public static FaceInfo PixelRectToFaceInfo(PixelRect pixelRect, float f, int i, int i2) {
        return new FaceInfo(GcamModuleJNI.PixelRectToFaceInfo__SWIG_1(PixelRect.getCPtr(pixelRect), pixelRect, f, i, i2), true);
    }

    public static FaceInfo PixelRectToFaceInfo(PixelRect pixelRect, float f, int i, int i2, int i3) {
        return new FaceInfo(GcamModuleJNI.PixelRectToFaceInfo__SWIG_0(PixelRect.getCPtr(pixelRect), pixelRect, f, i, i2, i3), true);
    }

    public static String PortraitDepthBlurConfigToText(int i) {
        return GcamModuleJNI.PortraitDepthBlurConfigToText(i);
    }

    public static void PrintColorTemps(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t) {
        GcamModuleJNI.PrintColorTemps(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t));
    }

    public static InterleavedImageU8 RawFinishPreview(String str, RawReadView rawReadView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, StaticMetadata staticMetadata, NormalizedRect normalizedRect, int i, int i2, int i3, AeResults aeResults, Tuning tuning, int i4, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__SaveInfo sWIGTYPE_p_gcam__SaveInfo, FrameMetadata frameMetadata2) {
        return new InterleavedImageU8(GcamModuleJNI.RawFinishPreview(str, RawReadView.getCPtr(rawReadView), rawReadView, FrameMetadata.getCPtr(frameMetadata), frameMetadata, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap, StaticMetadata.getCPtr(staticMetadata), staticMetadata, NormalizedRect.getCPtr(normalizedRect), normalizedRect, i, i2, i3, AeResults.getCPtr(aeResults), aeResults, Tuning.getCPtr(tuning), tuning, i4, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__SaveInfo.getCPtr(sWIGTYPE_p_gcam__SaveInfo), FrameMetadata.getCPtr(frameMetadata2), frameMetadata2), true);
    }

    public static void ResetTrackedMemoryPeak() {
        GcamModuleJNI.ResetTrackedMemoryPeak();
    }

    public static int ReverseRotation(int i) {
        return GcamModuleJNI.ReverseRotation(i);
    }

    public static void RggbPositions(int i, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2, SWIGTYPE_p_int sWIGTYPE_p_int3, SWIGTYPE_p_int sWIGTYPE_p_int4, SWIGTYPE_p_int sWIGTYPE_p_int5, SWIGTYPE_p_int sWIGTYPE_p_int6, SWIGTYPE_p_int sWIGTYPE_p_int7, SWIGTYPE_p_int sWIGTYPE_p_int8) {
        GcamModuleJNI.RggbPositions(i, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int3), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int4), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int5), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int6), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int7), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int8));
    }

    public static SWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_3_t RggbToRgb(SWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_4_t sWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_4_t, boolean z) {
        return new SWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_3_t(GcamModuleJNI.RggbToRgb(SWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_4_t.getCPtr(sWIGTYPE_p_std__arrayT_gcam__DngNoiseModel_4_t), z), true);
    }

    public static void RotateCoordinates(int i, int i2, int i3, int i4, int i5, SWIGTYPE_p_int sWIGTYPE_p_int, SWIGTYPE_p_int sWIGTYPE_p_int2) {
        GcamModuleJNI.RotateCoordinates(i, i2, i3, i4, i5, SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int), SWIGTYPE_p_int.getCPtr(sWIGTYPE_p_int2));
    }

    public static void RotateNormalizedCoordinates(float f, float f2, int i, SWIGTYPE_p_float sWIGTYPE_p_float, SWIGTYPE_p_float sWIGTYPE_p_float2) {
        GcamModuleJNI.RotateNormalizedCoordinates(f, f2, i, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float2));
    }

    public static DenoiseParams ScaleParams(DenoiseParams denoiseParams, float f) {
        return new DenoiseParams(GcamModuleJNI.ScaleParams__SWIG_0(DenoiseParams.getCPtr(denoiseParams), denoiseParams, f), true);
    }

    public static RawSharpenParams ScaleParams(RawSharpenParams rawSharpenParams, float f) {
        return new RawSharpenParams(GcamModuleJNI.ScaleParams__SWIG_1(RawSharpenParams.getCPtr(rawSharpenParams), rawSharpenParams, f), true);
    }

    public static int SensorIdToLensFacing(int i) {
        return GcamModuleJNI.SensorIdToLensFacing(i);
    }

    public static void SerializeBurstMetadata(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, String str, int i) {
        GcamModuleJNI.SerializeBurstMetadata__SWIG_2(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), str, i);
    }

    public static void SerializeBurstMetadata(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, String str, int i, boolean z) {
        GcamModuleJNI.SerializeBurstMetadata__SWIG_1(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), str, i, z);
    }

    public static void SerializeBurstMetadata(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t, String str, int i, boolean z, boolean z2) {
        GcamModuleJNI.SerializeBurstMetadata__SWIG_0(SWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__FrameMetadata_t), str, i, z, z2);
    }

    public static String SerializeDngMakernoteToString(InitParams initParams, StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata) {
        return GcamModuleJNI.SerializeDngMakernoteToString__SWIG_1(InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public static void SerializeDngMakernoteToString(InitParams initParams, StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata, String str) {
        GcamModuleJNI.SerializeDngMakernoteToString__SWIG_3(InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata, str);
    }

    public static void SerializeDngMakernoteToString(InitParams initParams, StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata, String str, boolean z) {
        GcamModuleJNI.SerializeDngMakernoteToString__SWIG_2(InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata, str, z);
    }

    public static String SerializeDngMakernoteToString(InitParams initParams, StaticMetadata staticMetadata, ShotParams shotParams, FrameMetadata frameMetadata, boolean z) {
        return GcamModuleJNI.SerializeDngMakernoteToString__SWIG_0(InitParams.getCPtr(initParams), initParams, StaticMetadata.getCPtr(staticMetadata), staticMetadata, ShotParams.getCPtr(shotParams), shotParams, FrameMetadata.getCPtr(frameMetadata), frameMetadata, z);
    }

    public static String SerializeToString(AeResults aeResults, int i) {
        return GcamModuleJNI.SerializeToString(AeResults.getCPtr(aeResults), aeResults, i);
    }

    public static boolean ShouldCropBeforeMerge(int i) {
        return GcamModuleJNI.ShouldCropBeforeMerge(i);
    }

    public static void SuppressRowArtifacts(FloatVector floatVector, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_1(FloatVector.getCPtr(floatVector), floatVector, i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static void SuppressRowArtifacts(FloatVector floatVector, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_0(FloatVector.getCPtr(floatVector), floatVector, SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t), i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static void SuppressRowArtifacts(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t sWIGTYPE_p_std__vectorT_gcam__RowPattern_t, int i, SWIGTYPE_p_gcam__Context sWIGTYPE_p_gcam__Context, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver, RawWriteView rawWriteView) {
        GcamModuleJNI.SuppressRowArtifacts__SWIG_2(SWIGTYPE_p_std__vectorT_gcam__RowPattern_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__RowPattern_t), i, SWIGTYPE_p_gcam__Context.getCPtr(sWIGTYPE_p_gcam__Context), SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver), RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }

    public static int TextToAeState(String str) {
        return GcamModuleJNI.TextToAeState(str);
    }

    public static int TextToAeType(String str) {
        return GcamModuleJNI.TextToAeType(str);
    }

    public static int TextToAfState(String str) {
        return GcamModuleJNI.TextToAfState(str);
    }

    public static int TextToBayerPattern(String str) {
        return GcamModuleJNI.TextToBayerPattern(str);
    }

    public static int TextToBurstFrameType(String str) {
        return GcamModuleJNI.TextToBurstFrameType(str);
    }

    public static int TextToExecuteOn(String str) {
        return GcamModuleJNI.TextToExecuteOn(str);
    }

    public static int TextToFlashMetadata(String str) {
        return GcamModuleJNI.TextToFlashMetadata(str);
    }

    public static int TextToFlashMode(String str) {
        return GcamModuleJNI.TextToFlashMode(str);
    }

    public static int TextToGcamPixelFormat(String str) {
        return GcamModuleJNI.TextToGcamPixelFormat(str);
    }

    public static int TextToIccProfile(String str) {
        return GcamModuleJNI.TextToIccProfile(str);
    }

    public static int TextToImageRotation(String str) {
        return GcamModuleJNI.TextToImageRotation(str);
    }

    public static int TextToInputFrameType(String str) {
        return GcamModuleJNI.TextToInputFrameType(str);
    }

    public static int TextToLensFacing(String str) {
        return GcamModuleJNI.TextToLensFacing(str);
    }

    public static int TextToLensOpticalStabilizationMode(String str) {
        return GcamModuleJNI.TextToLensOpticalStabilizationMode(str);
    }

    public static int TextToLensState(String str) {
        return GcamModuleJNI.TextToLensState(str);
    }

    public static int TextToMergeMethod(String str) {
        return GcamModuleJNI.TextToMergeMethod(str);
    }

    public static int TextToPortraitDepthBlurConfig(String str) {
        return GcamModuleJNI.TextToPortraitDepthBlurConfig(str);
    }

    public static int TextToRawCropping(String str) {
        return GcamModuleJNI.TextToRawCropping(str);
    }

    public static int TextToResamplingMethod(String str) {
        return GcamModuleJNI.TextToResamplingMethod(str);
    }

    public static int TextToSceneFlicker(String str) {
        return GcamModuleJNI.TextToSceneFlicker(str);
    }

    public static int TextToUxMode(String str) {
        return GcamModuleJNI.TextToUxMode(str);
    }

    public static int TextToWhiteBalanceMethod(String str) {
        return GcamModuleJNI.TextToWhiteBalanceMethod(str);
    }

    public static int TextToWhiteBalanceMode(String str) {
        return GcamModuleJNI.TextToWhiteBalanceMode(str);
    }

    public static int TextToYuvFormat(String str) {
        return GcamModuleJNI.TextToYuvFormat(str);
    }

    public static String ToText(int i) {
        return GcamModuleJNI.ToText__SWIG_0(i);
    }

    public static int ToYuvFormat(int i) {
        return GcamModuleJNI.ToYuvFormat(i);
    }

    public static SWIGTYPE_p_void TrackedMemoryAllocate(long j) {
        long TrackedMemoryAllocate = GcamModuleJNI.TrackedMemoryAllocate(j);
        if (TrackedMemoryAllocate != 0) {
            return new SWIGTYPE_p_void(TrackedMemoryAllocate, false);
        }
        return null;
    }

    public static void TrackedMemoryDeallocate(SWIGTYPE_p_void sWIGTYPE_p_void) {
        GcamModuleJNI.TrackedMemoryDeallocate(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void));
    }

    public static NormalizedRect Union(NormalizedRect normalizedRect, NormalizedRect normalizedRect2) {
        return new NormalizedRect(GcamModuleJNI.Union__SWIG_1(NormalizedRect.getCPtr(normalizedRect), normalizedRect, NormalizedRect.getCPtr(normalizedRect2), normalizedRect2), true);
    }

    public static PixelRect Union(PixelRect pixelRect, PixelRect pixelRect2) {
        return new PixelRect(GcamModuleJNI.Union__SWIG_0(PixelRect.getCPtr(pixelRect), pixelRect, PixelRect.getCPtr(pixelRect2), pixelRect2), true);
    }

    public static void WriteAeToShotLogData(AeResults aeResults, ShotLogData shotLogData) {
        GcamModuleJNI.WriteAeToShotLogData(AeResults.getCPtr(aeResults), aeResults, ShotLogData.getCPtr(shotLogData), shotLogData);
    }

    public static boolean WriteEmptyFile(String str) {
        return GcamModuleJNI.WriteEmptyFile(str);
    }

    public static boolean WriteMemoryToFile(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, String str) {
        return GcamModuleJNI.WriteMemoryToFile(SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j, str);
    }

    public static boolean WriteStringToFile(String str, String str2) {
        return GcamModuleJNI.WriteStringToFile(str, str2);
    }

    public static boolean YuvFormatsHaveUvSwapped(int i, int i2) {
        return GcamModuleJNI.YuvFormatsHaveUvSwapped(i, i2);
    }

    public static long getGCAM_SAVE_INPUT_METADATA() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_METADATA_get();
    }

    public static long getGCAM_SAVE_INPUT_METERING() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_METERING_get();
    }

    public static long getGCAM_SAVE_INPUT_PAYLOAD() {
        return GcamModuleJNI.GCAM_SAVE_INPUT_PAYLOAD_get();
    }

    public static long getGCAM_SAVE_NONE() {
        return GcamModuleJNI.GCAM_SAVE_NONE_get();
    }

    public static long getGCAM_SAVE_OTHER_TEXT() {
        return GcamModuleJNI.GCAM_SAVE_OTHER_TEXT_get();
    }

    public static long getGCAM_SAVE_TEXT() {
        return GcamModuleJNI.GCAM_SAVE_TEXT_get();
    }

    public static int getKColorLutSize() {
        return GcamModuleJNI.kColorLutSize_get();
    }

    public static int getKColorTempUnknown() {
        return GcamModuleJNI.kColorTempUnknown_get();
    }

    public static int getKDefaultPostviewLongestEdge() {
        return GcamModuleJNI.kDefaultPostviewLongestEdge_get();
    }

    public static float getKDefaultTripodMaxTotalCaptureTimeMs() {
        return GcamModuleJNI.kDefaultTripodMaxTotalCaptureTimeMs_get();
    }

    public static int getKDenoiseFreqCount() {
        return GcamModuleJNI.kDenoiseFreqCount_get();
    }

    public static int getKDenoiseStrengthMapDecimation() {
        return GcamModuleJNI.kDenoiseStrengthMapDecimation_get();
    }

    public static String getKDroppedFrameSuffix() {
        return GcamModuleJNI.kDroppedFrameSuffix_get();
    }

    public static String getKInitParamsFilename() {
        return GcamModuleJNI.kInitParamsFilename_get();
    }

    public static long getKInvalidAllocationId() {
        return GcamModuleJNI.kInvalidAllocationId_get();
    }

    public static long getKInvalidImageId() {
        return GcamModuleJNI.kInvalidImageId_get();
    }

    public static float getKInvalidMotionScore() {
        return GcamModuleJNI.kInvalidMotionScore_get();
    }

    public static int getKInvalidShotId() {
        return GcamModuleJNI.kInvalidShotId_get();
    }

    public static int[] getKLandmarkType() {
        return GcamModuleJNI.kLandmarkType_get();
    }

    public static int getKLinearClampLevel() {
        return GcamModuleJNI.kLinearClampLevel_get();
    }

    public static int getKLinearFullRangePrecision() {
        return GcamModuleJNI.kLinearFullRangePrecision_get();
    }

    public static int getKLinearPrecision() {
        return GcamModuleJNI.kLinearPrecision_get();
    }

    public static int getKLinearWhiteLevel() {
        return GcamModuleJNI.kLinearWhiteLevel_get();
    }

    public static int getKLog2ColorLutSize() {
        return GcamModuleJNI.kLog2ColorLutSize_get();
    }

    public static int getKLog2DenoiseStrengthMapDecimation() {
        return GcamModuleJNI.kLog2DenoiseStrengthMapDecimation_get();
    }

    public static float getKLogSceneBrightnessUnknown() {
        return GcamModuleJNI.kLogSceneBrightnessUnknown_get();
    }

    public static float getKMaxMotionScore() {
        return GcamModuleJNI.kMaxMotionScore_get();
    }

    public static float getKMaxOverallGainSlopFactor() {
        return GcamModuleJNI.kMaxOverallGainSlopFactor_get();
    }

    public static int getKMaxTetWaypoints() {
        return GcamModuleJNI.kMaxTetWaypoints_get();
    }

    public static int getKMaxValidColorTemp() {
        return GcamModuleJNI.kMaxValidColorTemp_get();
    }

    public static String getKMeteringBurstFrameMetadataFilename() {
        return GcamModuleJNI.kMeteringBurstFrameMetadataFilename_get();
    }

    public static String getKMeteringBurstSpecFilename() {
        return GcamModuleJNI.kMeteringBurstSpecFilename_get();
    }

    public static float getKMinDigitalZoomRatio() {
        return GcamModuleJNI.kMinDigitalZoomRatio_get();
    }

    public static float getKMinMotionScore() {
        return GcamModuleJNI.kMinMotionScore_get();
    }

    public static int getKMinValidColorTemp() {
        return GcamModuleJNI.kMinValidColorTemp_get();
    }

    public static String getKPayloadBurstFrameMetadataFilename() {
        return GcamModuleJNI.kPayloadBurstFrameMetadataFilename_get();
    }

    public static String getKPayloadBurstSpecFilename() {
        return GcamModuleJNI.kPayloadBurstSpecFilename_get();
    }

    public static int getKPdCurrentVersion() {
        return GcamModuleJNI.kPdCurrentVersion_get();
    }

    public static int getKRawFinishAlignmentX() {
        return GcamModuleJNI.kRawFinishAlignmentX_get();
    }

    public static int getKRawFinishAlignmentY() {
        return GcamModuleJNI.kRawFinishAlignmentY_get();
    }

    public static int getKRawPixelMaxValue() {
        return GcamModuleJNI.kRawPixelMaxValue_get();
    }

    public static int getKRawSharpenCurveSize() {
        return GcamModuleJNI.kRawSharpenCurveSize_get();
    }

    public static int getKRawSharpenFreqCount() {
        return GcamModuleJNI.kRawSharpenFreqCount_get();
    }

    public static String getKRequestCameraPrimary() {
        return GcamModuleJNI.kRequestCameraPrimary_get();
    }

    public static String getKRequestCameraTele() {
        return GcamModuleJNI.kRequestCameraTele_get();
    }

    public static int getKSensorTempUnknown() {
        return GcamModuleJNI.kSensorTempUnknown_get();
    }

    public static String getKShotParamsFilename() {
        return GcamModuleJNI.kShotParamsFilename_get();
    }

    public static String getKStaticMetadataFilename() {
        return GcamModuleJNI.kStaticMetadataFilename_get();
    }

    public static int getKThrowOutOneInNBlurryImages() {
        return GcamModuleJNI.kThrowOutOneInNBlurryImages_get();
    }

    public static int getKTonemappedPrecision() {
        return GcamModuleJNI.kTonemappedPrecision_get();
    }

    public static int getKTonemappedWhiteLevel() {
        return GcamModuleJNI.kTonemappedWhiteLevel_get();
    }

    public static void setKDroppedFrameSuffix(String str) {
        GcamModuleJNI.kDroppedFrameSuffix_set(str);
    }

    public static void setKMeteringBurstFrameMetadataFilename(String str) {
        GcamModuleJNI.kMeteringBurstFrameMetadataFilename_set(str);
    }

    public static void setKMeteringBurstSpecFilename(String str) {
        GcamModuleJNI.kMeteringBurstSpecFilename_set(str);
    }

    public static void setKPayloadBurstFrameMetadataFilename(String str) {
        GcamModuleJNI.kPayloadBurstFrameMetadataFilename_set(str);
    }

    public static void setKPayloadBurstSpecFilename(String str) {
        GcamModuleJNI.kPayloadBurstSpecFilename_set(str);
    }
}
