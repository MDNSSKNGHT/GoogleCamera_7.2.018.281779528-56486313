package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class laq {
    private static final SparseArray<String> a = new SparseArray<>();
    private static final int[] b = a();

    static {
        a.append(0, "com.google.android.camera.experimental2015.ExperimentalKeys");
        a.append(1, "com.google.android.camera.experimental2016.ExperimentalKeys");
        a.append(2, "com.google.android.camera.experimental2017.ExperimentalKeys");
        a.append(3, "com.google.android.camera.experimental2018.ExperimentalKeys");
        a.append(4, "com.google.android.camera.experimental2019.ExperimentalKeys");
    }

    public static void a(ImageReader imageReader) {
        imageReader.discardFreeBuffers();
    }

    public static void a(CameraCaptureSession cameraCaptureSession, List<OutputConfiguration> list) throws CameraAccessException {
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    private static int[] a() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            try {
                Class.forName(a.valueAt(i));
                arrayList.add(a.keyAt(i));
            } catch (ClassNotFoundException | NoClassDefFoundError ignored) {
            }
        }

        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = arrayList.get(i);
        }

        Arrays.sort(iArr);
        return iArr;
    }

    public static boolean a(int i) {
        return Arrays.binarySearch(b, i) >= 0;
    }

    public static void a(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.addSurface(surface);
    }

    public static void a(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.setVideoEncodingProfileLevel(i, i2);
    }
}
