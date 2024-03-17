package defpackage;

import android.media.CamcorderProfile;

/* compiled from: PG */
/* renamed from: mft  reason: default package */
/* loaded from: classes.dex */
public abstract class mft implements mfo {
    public static mfs a(CamcorderProfile camcorderProfile) {
        mfs mfsVar = new mfs((byte) 0);
        mfsVar.f(camcorderProfile.audioBitRate);
        mfsVar.g(camcorderProfile.audioChannels);
        mfsVar.h(camcorderProfile.audioCodec);
        mfsVar.i(camcorderProfile.audioSampleRate);
        mfsVar.a(camcorderProfile.fileFormat);
        mfsVar.b(camcorderProfile.quality);
        mfsVar.j(camcorderProfile.videoBitRate);
        mfsVar.k(camcorderProfile.videoCodec);
        mfsVar.m(-1);
        mfsVar.l(-1);
        mfsVar.c(camcorderProfile.videoFrameHeight);
        mfsVar.d(camcorderProfile.videoFrameRate);
        mfsVar.e(camcorderProfile.videoFrameWidth);
        return mfsVar;
    }

    public static mfs a(mfo mfoVar) {
        mfs mfsVar = new mfs((byte) 0);
        mfsVar.f(mfoVar.a());
        mfsVar.g(mfoVar.b());
        mfsVar.h(mfoVar.c());
        mfsVar.i(mfoVar.d());
        mfsVar.a(mfoVar.e());
        mfsVar.b(mfoVar.f());
        mfsVar.j(mfoVar.g());
        mfsVar.k(mfoVar.h());
        mfsVar.m(mfoVar.i());
        mfsVar.l(mfoVar.j());
        mfsVar.c(mfoVar.k());
        mfsVar.d(mfoVar.l());
        mfsVar.e(mfoVar.m());
        return mfsVar;
    }
}