package defpackage;

/* compiled from: PG */
/* renamed from: mhb  reason: default package */
/* loaded from: classes.dex */
public enum mhb {
    VIDEO_BUFFER_DELAY(false),
    AUDIO_BUFFER_DELAY(false),
    VIDEO_TRACK_FAIL_TO_START(true),
    AUDIO_TRACK_FAIL_TO_START(false),
    AUDIO_RECORD_ERROR(false),
    MUXER_STOP_ERROR(true),
    MEDIA_CODEC_ERROR_AUDIO(true),
    MEDIA_CODEC_ERROR_VIDEO(true),
    FILE_LOST(false),
    OTHER(true);
    
    public final boolean k;

    mhb(boolean z) {
        this.k = z;
    }
}