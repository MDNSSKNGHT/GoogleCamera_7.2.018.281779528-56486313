package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: meu  reason: default package */
/* loaded from: classes.dex */
public final class meu implements met {
    private final Map a;

    public meu() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.a = new HashMap();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (supportedTypes.length <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                } else {
                    for (String str : supportedTypes) {
                        if (!this.a.containsKey(str)) {
                            this.a.put(str, mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.met
    public final MediaCodecInfo a(men menVar) {
        return (MediaCodecInfo) this.a.get(menVar.e);
    }

    @Override // defpackage.met
    public final boolean a() {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.a.get("video/hevc");
        return mediaCodecInfo != null && mediaCodecInfo.isHardwareAccelerated();
    }
}
