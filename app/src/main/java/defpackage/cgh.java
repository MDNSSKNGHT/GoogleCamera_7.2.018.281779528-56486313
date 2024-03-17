package defpackage;

import android.annotation.SuppressLint;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: cgh  reason: default package */
/* loaded from: classes.dex */
public final class cgh {
    private final AudioManager a;

    public cgh(AudioManager audioManager) {
        this.a = audioManager;
    }

    @SuppressLint("WrongConstant")
    public final AudioDeviceInfo a() {
        AudioDeviceInfo[] devices;
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo audioDeviceInfo2 = null;
        for (AudioDeviceInfo audioDeviceInfo3 : this.a.getDevices(1)) {
            String valueOf = String.valueOf(a(audioDeviceInfo3));
            if (valueOf.length() != 0) {
                "Found: ".concat(valueOf);
            } else {
                new String("Found: ");
            }
            if (audioDeviceInfo3.getType() == 11 || audioDeviceInfo3.getType() == 22) {
                String valueOf2 = String.valueOf(a(audioDeviceInfo3));
                if (valueOf2.length() != 0) {
                    "USB audio device is found: ".concat(valueOf2);
                } else {
                    new String("USB audio device is found: ");
                }
                if (audioDeviceInfo == null) {
                    audioDeviceInfo = audioDeviceInfo3;
                }
            }
            if (audioDeviceInfo3.getType() == 3) {
                String valueOf3 = String.valueOf(a(audioDeviceInfo3));
                if (valueOf3.length() != 0) {
                    "Headset audio device is found: ".concat(valueOf3);
                } else {
                    new String("Headset audio device is found: ");
                }
                if (audioDeviceInfo2 == null) {
                    audioDeviceInfo2 = audioDeviceInfo3;
                }
            }
        }
        return audioDeviceInfo == null ? audioDeviceInfo2 : audioDeviceInfo;
    }

    public static String a(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String valueOf = String.valueOf(audioDeviceInfo.getProductName());
            int type = audioDeviceInfo.getType();
            int id = audioDeviceInfo.getId();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
            sb.append("Audio device (Product: ");
            sb.append(valueOf);
            sb.append(", Type: ");
            sb.append(type);
            sb.append(", Id: ");
            sb.append(id);
            sb.append(")");
            return sb.toString();
        }
        return "(device is null)";
    }
}