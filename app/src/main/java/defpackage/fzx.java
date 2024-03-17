package defpackage;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.SpatialGainMap;

/* compiled from: PG */
/* renamed from: fzx  reason: default package */
/* loaded from: classes.dex */
public final class fzx {
    public final ExifMetadata a;
    public final int b;
    public final AeShotParams c;
    private final SpatialGainMap d;

    public fzx(ExifMetadata exifMetadata, int i, AeShotParams aeShotParams, SpatialGainMap spatialGainMap) {
        this.a = exifMetadata;
        this.b = i;
        this.c = aeShotParams;
        this.d = spatialGainMap;
    }
}