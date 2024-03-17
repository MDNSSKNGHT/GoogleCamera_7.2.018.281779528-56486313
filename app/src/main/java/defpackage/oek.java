package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: oek  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class oek implements pjr {
    private final MediaFormat a;

    public oek(MediaFormat mediaFormat) {
        this.a = mediaFormat;
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        MediaFormat mediaFormat = this.a;
        MediaFormat mediaFormat2 = (MediaFormat) obj;
        if (mediaFormat2 != null) {
            ofq.a("oo.muxer.drop_initial_non_keyframes", mediaFormat, mediaFormat2);
            ofq.a("oo.muxer.force_sequential", mediaFormat, mediaFormat2);
        }
        return mediaFormat2;
    }
}