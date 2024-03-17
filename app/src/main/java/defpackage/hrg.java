package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: hrg  reason: default package */
/* loaded from: classes.dex */
public final class hrg {
    public final mos a;
    public final mos b;
    public final mos c;
    public final mos d;
    public final mos e;
    public final mos f;

    public hrg(Map map) {
        this.a = (mos) map.get(htc.RAW_HDRPLUS);
        this.b = (mos) map.get(htc.RAW_WIDE);
        this.c = (mos) map.get(htc.RAW_TELE);
        this.d = (mos) map.get(htc.PD);
        this.e = (mos) map.get(htc.DEPTH);
        this.f = (mos) map.get(htc.YUV_ANALYSIS);
    }

    public final hrf a(mnh mnhVar) {
        return new hrf(this, mnhVar);
    }
}