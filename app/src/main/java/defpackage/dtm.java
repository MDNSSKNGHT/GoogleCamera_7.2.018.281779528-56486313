package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: dtm  reason: default package */
/* loaded from: classes.dex */
public abstract class dtm {
    public abstract long a();

    public abstract long b();

    public abstract byte[] c();

    public abstract byte[] d();

    public abstract byte[] e();

    public static dtm a(ndn ndnVar) {
        dtl dtlVar = new dtl((byte) 0);
        dtlVar.a(0L);
        dtlVar.a = Long.valueOf(ndnVar.c());
        Long l = (Long) ndnVar.a(CaptureResult.SENSOR_TIMESTAMP);
        dtlVar.a(l != null ? l.longValue() : 0L);
        if (lao.i != null) {
            dtlVar.c = (byte[]) ndnVar.a(lao.i);
        }
        if (lao.j != null) {
            dtlVar.d = (byte[]) ndnVar.a(lao.j);
        }
        if (lao.k != null) {
            dtlVar.e = (byte[]) ndnVar.a(lao.k);
        }
        String str = dtlVar.a == null ? " frameNumber" : "";
        if (dtlVar.b == null) {
            str = str.concat(" timestampNanos");
        }
        if (str.isEmpty()) {
            return new dtr(dtlVar.a.longValue(), dtlVar.b.longValue(), dtlVar.c, dtlVar.d, dtlVar.e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final boolean f() {
        return (c() == null && d() == null && e() == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AfDebugMetadata{");
        sb.append(a());
        if (b() > 0) {
            sb.append(" ");
            sb.append(b());
        }
        if (c() != null) {
            sb.append(" AEC");
        }
        if (d() != null) {
            sb.append(" AF");
        }
        if (e() != null) {
            sb.append(" AWB");
        }
        sb.append("}");
        return sb.toString();
    }
}