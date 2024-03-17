package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: drh  reason: default package */
/* loaded from: classes.dex */
public final class drh implements mjw {
    private static final String b = liu.a("HdrPVFMetaDataSaver");
    public volatile ndr a;
    private final gfe c;

    public drh(gfe gfeVar) {
        this.c = gfeVar;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ndr ndrVar = (ndr) obj;
        if (ndrVar.a(CaptureResult.COLOR_CORRECTION_GAINS) == null) {
            liu.f(b);
        } else if (ndrVar.a(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null) {
            liu.f(b);
        } else if (ndrVar.a(CaptureResult.CONTROL_AE_REGIONS) == null) {
            liu.f(b);
        } else if (!this.c.a(ndrVar)) {
            liu.f(b);
        } else {
            this.a = ndrVar;
        }
    }
}
