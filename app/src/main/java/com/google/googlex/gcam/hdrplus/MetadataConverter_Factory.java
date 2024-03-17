package com.google.googlex.gcam.hdrplus;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MetadataConverter_Factory implements rgg {
    public final rhd cameraHardwareManagerProvider;
    public final rhd characteristicsProvider;

    public MetadataConverter_Factory(rhd rhdVar, rhd rhdVar2) {
        this.characteristicsProvider = rhdVar;
        this.cameraHardwareManagerProvider = rhdVar2;
    }

    public static MetadataConverter_Factory create(rhd rhdVar, rhd rhdVar2) {
        return new MetadataConverter_Factory(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public MetadataConverter get() {
        return new MetadataConverter((myo) this.characteristicsProvider.get(), (myz) this.cameraHardwareManagerProvider.get());
    }

    public static MetadataConverter newInstance(myo myoVar, myz myzVar) {
        return new MetadataConverter(myoVar, myzVar);
    }
}
