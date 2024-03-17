package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* compiled from: PG */
/* renamed from: cgk  reason: default package */
/* loaded from: classes.dex */
public final class cgk implements mgk {
    private final cgh a;
    private final mcs b;
    private final HandlerThread c;
    private final Handler e;
    private AudioRouting f;
    private boolean g;
    private final AudioRouting.OnRoutingChangedListener d = new cgj(this);
    private final Object h = new Object();

    public cgk(cgh cghVar, mdl mdlVar) {
        this.a = cghVar;
        this.b = mdlVar;
        HandlerThread handlerThread = new HandlerThread("AudioDeviceSelector");
        this.c = handlerThread;
        handlerThread.start();
        this.e = new Handler(this.c.getLooper());
        this.g = false;
    }

    public final void b(AudioRouting audioRouting) {
        AudioDeviceInfo a;
        if (audioRouting == null || !((Boolean) this.b.a()).booleanValue() || (a = this.a.a()) == null) {
            return;
        }
        boolean preferredDevice = audioRouting.setPreferredDevice(a);
        String a2 = cgh.a(a);
        String str = !preferredDevice ? " not be used" : " be used";
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 39 + str.length());
        sb.append("External audio device ");
        sb.append(a2);
        sb.append(" is found and can");
        sb.append(str);
        sb.toString();
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            if (this.g) {
                Log.w("AudioDeviceSelector", "Already closed");
                return;
            }
            a();
            this.g = true;
            try {
                this.c.quit();
                this.c.join();
            } catch (InterruptedException e) {
                throw new RuntimeException("Unable to stop audio routing changed thread AudioDeviceSelector", e);
            }
        }
    }

    @Override // defpackage.mgk
    public final void a(AudioRouting audioRouting) {
        synchronized (this.h) {
            if (!this.g) {
                if (this.f != null) {
                    a();
                }
                int type = audioRouting.getRoutedDevice().getType();
                StringBuilder sb = new StringBuilder(33);
                sb.append("Start, with routing = ");
                sb.append(type);
                sb.toString();
                this.f = audioRouting;
                b(audioRouting);
                audioRouting.addOnRoutingChangedListener(this.d, this.e);
                return;
            }
            Log.w("AudioDeviceSelector", "Ignore start. Already closed");
        }
    }

    @Override // defpackage.mgk
    public final void a() {
        synchronized (this.h) {
            if (this.g) {
                Log.w("AudioDeviceSelector", "Ignore stop. Already closed");
                return;
            }
            AudioRouting audioRouting = this.f;
            if (audioRouting != null) {
                audioRouting.removeOnRoutingChangedListener(this.d);
            }
            this.f = null;
        }
    }
}