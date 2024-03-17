package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: oej  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class oej implements pjr {
    private final oem a;
    private final MediaFormat b;
    private final qqg c;

    public oej(oem oemVar, MediaFormat mediaFormat, qqg qqgVar) {
        this.a = oemVar;
        this.b = mediaFormat;
        this.c = qqgVar;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        oem oemVar = this.a;
        MediaFormat mediaFormat = this.b;
        qqg qqgVar = this.c;
        oeg oegVar = (oeg) obj;
        oemVar.a.add(oegVar);
        qqgVar.a(qob.a(oegVar.d(), new oek(mediaFormat), qot.INSTANCE));
        return oegVar;
    }
}