package defpackage;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* compiled from: PG */
/* renamed from: dng  reason: default package */
/* loaded from: classes.dex */
final class dng extends drg {
    public final AeShotParams a;
    private final RawWriteView b;
    private final FrameMetadata c;
    private final SpatialGainMap d;
    private final float e;

    public dng(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, float f) {
        if (rawWriteView == null) {
            throw new NullPointerException("Null rawWriteView");
        }
        this.b = rawWriteView;
        if (frameMetadata == null) {
            throw new NullPointerException("Null metadata");
        }
        this.c = frameMetadata;
        if (spatialGainMap == null) {
            throw new NullPointerException("Null spatialGainMap");
        }
        this.d = spatialGainMap;
        if (aeShotParams == null) {
            throw new NullPointerException("Null aeShotParams");
        }
        this.a = aeShotParams;
        this.e = f;
    }

    @Override // defpackage.drg
    public final RawWriteView a() {
        return this.b;
    }

    @Override // defpackage.drg
    public final FrameMetadata b() {
        return this.c;
    }

    @Override // defpackage.drg
    public final SpatialGainMap c() {
        return this.d;
    }

    @Override // defpackage.drg
    public final AeShotParams d() {
        return this.a;
    }

    @Override // defpackage.drg
    public final float e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof drg) {
                drg drgVar = (drg) obj;
                if (this.b.equals(drgVar.a()) && this.c.equals(drgVar.b()) && this.d.equals(drgVar.c()) && this.a.equals(drgVar.d()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(drgVar.e())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ Float.floatToIntBits(this.e);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.a);
        float f = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 111 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("HdrPlusViewfinderFrame{rawWriteView=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", spatialGainMap=");
        sb.append(valueOf3);
        sb.append(", aeShotParams=");
        sb.append(valueOf4);
        sb.append(", viewfinderTet=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
