package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: gee  reason: default package */
/* loaded from: classes.dex */
public final class gee {
    public final Object a;
    public boolean b;
    public long c;
    public final mrx d = new gec(this);

    public gee() {
        new ged(this);
        this.a = new Object();
    }

    public final void a(ndr ndrVar) {
        synchronized (this.a) {
            long c = ndrVar.c() - this.c;
            if (gdp.a.contains((Integer) ndrVar.a(CaptureResult.CONTROL_AF_STATE)) || c >= 120) {
                this.b = false;
            }
        }
    }
}