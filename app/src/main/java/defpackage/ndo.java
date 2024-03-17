package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.params.Face;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: ndo  reason: default package */
/* loaded from: classes.dex */
public final class ndo {
    public final Face a;
    public final float b;
    public final float c;
    public final float d;
    private final PointF[] e;
    private final HashMap f = new HashMap();

    public ndo(Face face, byte[] bArr, float[] fArr, float[] fArr2) {
        this.e = new PointF[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f.put(Byte.valueOf(bArr[i]), Integer.valueOf(i));
            int i2 = i + i;
            this.e[i] = new PointF(fArr[i2], fArr[i2 + 1]);
        }
        this.a = face;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.d = fArr2[2];
    }

    public final PointF a(byte b) {
        HashMap hashMap = this.f;
        Byte valueOf = Byte.valueOf(b);
        if (!hashMap.containsKey(valueOf)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Landmark:");
            sb.append((int) b);
            sb.append(" not detected for this face.");
            throw new IllegalArgumentException(sb.toString());
        }
        return this.e[((Integer) this.f.get(valueOf)).intValue()];
    }

    public final String toString() {
        return String.format("{ bounds: %s, score: %s, id: %d }", this.a.getBounds(), Integer.valueOf(this.a.getScore()), Integer.valueOf(this.a.getId()));
    }
}