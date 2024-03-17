package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.os.Handler;

import java.nio.ByteBuffer;

public class odp implements odo {
    public odp(AudioRecord audioRecord, int i) {
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public odn a(ByteBuffer byteBuffer, int i) {
        return null;
    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void close() {

    }

    @Override
    public boolean setPreferredDevice(AudioDeviceInfo deviceInfo) {
        return false;
    }

    @Override
    public AudioDeviceInfo getPreferredDevice() {
        return null;
    }

    @Override
    public AudioDeviceInfo getRoutedDevice() {
        return null;
    }

    @Override
    public void addOnRoutingChangedListener(OnRoutingChangedListener listener, Handler handler) {

    }

    @Override
    public void removeOnRoutingChangedListener(OnRoutingChangedListener listener) {

    }
}
