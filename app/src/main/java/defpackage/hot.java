package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.hdrplus.MetadataConverter;

/* compiled from: PG */
/* renamed from: hot  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hot implements MetadataConverter.RequestBuilderUpdater {
    private final mnr a;

    public hot(mnr mnrVar) {
        this.a = mnrVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.MetadataConverter.RequestBuilderUpdater
    public final void setParam(CaptureRequest.Key key, Object obj) {
        this.a.a(key, obj);
    }
}