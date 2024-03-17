package defpackage;

import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ThreadPoolConfig;
import com.google.googlex.gcam.ThreadPriority;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.hdrplus.ImageConverter;
import com.google.googlex.gcam.hdrplus.ImageProxyAndHardwareBufferReleaseCallback;
import com.google.googlex.gcam.hdrplus.InputView;
import com.google.googlex.gcam.hdrplus.MemoryStateCallback;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: drc  reason: default package */
/* loaded from: classes.dex */
final class drc {
    public static final String a = liu.a("HdrPlusState");
    public final InitParams b;
    public final ImageConverter c;
    private final HdrPlusInterface h = new HdrPlusInterface();
    public final ConcurrentMap d = new ConcurrentHashMap();
    public final ImageProxyAndHardwareBufferReleaseCallback e = new ImageProxyAndHardwareBufferReleaseCallback();
    public final mch f = new mch((Object) 0L);
    public final mch g = new mch((Object) 0L);
    private final MemoryStateCallback i = new dra(this);
    private final Runnable j = new drb(this);

    public drc(cin cinVar, feb febVar, dop dopVar, rhd rhdVar, cjn cjnVar, ImageConverter imageConverter) {
        String absolutePath;
        pjz a2 = ((jdz) rhdVar).a();
        if (!a2.a()) {
            absolutePath = "";
        } else {
            absolutePath = ((File) a2.b()).getAbsolutePath();
        }
        InitParams initParams = new InitParams();
        initParams.setCapture_threads(a(cinVar, ciu.c, null));
        initParams.setMerge_threads(a(cinVar, ciu.d, 8));
        initParams.setFinish_threads(a(cinVar, ciu.e, 9));
        initParams.setAllow_unknown_devices(cjnVar == cjn.ENG);
        initParams.setMax_payload_frames(dopVar.b);
        initParams.setExecute_finish_on(0);
        dopVar.a.c();
        if (dug.a()) {
            liu.d(a);
            initParams.setExecute_finish_on(1);
        }
        initParams.setSimultaneous_merge_and_finish(initParams.getExecute_finish_on() != 0);
        this.h.setMemoryStateCallback(InitParams.getCPtr(initParams), this.i);
        this.h.setFinishQueueEmptyCallback(InitParams.getCPtr(initParams), this.j);
        initParams.setImage_release_callback(this.e);
        initParams.setSerialized_cache_dir(absolutePath);
        this.b = initParams;
        this.c = imageConverter;
        febVar.a(new fdv(fdt.HDR_PLUS, this.f, this.g));
    }

    private static final ThreadPoolConfig a(cin cinVar, ciq ciqVar, Integer num) {
        int intValue = ((Integer) cinVar.a(ciqVar).b()).intValue();
        qdu.b(intValue > 0, "threadCount %d is not a valid value.");
        ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig();
        threadPoolConfig.setCount(intValue);
        if (num != null) {
            ThreadPriority threadPriority = new ThreadPriority();
            threadPriority.setExplicitly_set(true);
            threadPriority.setValue(num.intValue());
            threadPoolConfig.setPriority(threadPriority);
        }
        return threadPoolConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InputView a(neb nebVar) {
        if (nebVar == null) {
            return new InputView(GcamModule.getKInvalidImageId(), new InterleavedWriteViewU16());
        }
        pjz wrapPdWriteView = this.c.wrapPdWriteView(nebVar);
        if (!wrapPdWriteView.a()) {
            return new InputView(GcamModule.getKInvalidImageId(), new InterleavedWriteViewU16());
        }
        return new InputView(this.e.register(nebVar).imageId, (InterleavedWriteViewU16) wrapPdWriteView.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InputView b(neb nebVar) {
        if (nebVar != null) {
            qdu.b(this.c.isCompatibleRawFormat(nebVar.b()), "Incompatible Raw image format: %s", nebVar.b());
            return new InputView(this.e.register(nebVar).imageId, this.c.wrapRawWriteView(nebVar));
        }
        return new InputView(GcamModule.getKInvalidImageId(), new RawWriteView());
    }
}
