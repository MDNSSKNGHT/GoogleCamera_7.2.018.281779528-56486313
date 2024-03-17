package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.OisMetadata;
import j$.util.function.Consumer;
import j$.util.function.Consumer$$CC;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class MetadataConverter$$Lambda$0 implements Consumer {
    public final FrameMetadata arg$1;

    private MetadataConverter$$Lambda$0(FrameMetadata frameMetadata) {
        this.arg$1 = frameMetadata;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Consumer get$Lambda(FrameMetadata frameMetadata) {
        return new MetadataConverter$$Lambda$0(frameMetadata);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.arg$1.setOis_metadata((OisMetadata) obj);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$$CC.andThen$$dflt$$(this, consumer);
    }
}
