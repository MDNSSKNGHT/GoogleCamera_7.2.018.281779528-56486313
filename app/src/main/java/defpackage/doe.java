package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class doe {
    private static final String c = liu.a("GcamUtils");
    public final cin a;
    private final Application b;

    public doe(Application application, cin cinVar) {
        this.b = application;
        this.a = cinVar;
    }

    public static PostviewParams a(myo myoVar, gtb gtbVar) {
        int round;
        int round2;
        PostviewParams postviewParams = new PostviewParams();
        mjs mjsVar = MetadataConverter.getGcamRawFormat(myoVar).b;
        postviewParams.setPixel_format(5);
        float a = ((mix) qdu.d(mix.a(gtbVar.b))).a();
        int i = mjsVar.a;
        int i2 = mjsVar.b;
        if (i <= i2) {
            int round3 = Math.round(i2 / 6.0f);
            round2 = round3;
            round = Math.round(round3 * a * 1.05f);
        } else {
            round = Math.round(i / 6.0f);
            round2 = Math.round((round / a) * 1.05f);
        }
        mjs mjsVar2 = new mjs((round + 1) & (-2), (round2 + 1) & (-2));
        int i3 = mjsVar2.a;
        if (i3 > mjsVar2.b) {
            postviewParams.setTarget_width(i3);
            postviewParams.setTarget_height(0);
        } else {
            postviewParams.setTarget_width(0);
            postviewParams.setTarget_height(mjsVar2.b);
        }
        return postviewParams;
    }

    public static int a(int i) {
        return MetadataConverter.getImageRotation(i);
    }

    public final String a(File file, long j, String str) {
        qdu.d((Object) file);
        if (!file.exists() || !file.isDirectory()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new RuntimeException(valueOf.length() == 0 ? new String("Gcam debug directory not valid or doesn't exist: ") : "Gcam debug directory not valid or doesn't exist: ".concat(valueOf));
        }
        File file2 = new File(new File(new File(file, "gcam"), a(j)), str);
        if (!file2.mkdirs()) {
            String valueOf2 = String.valueOf(file2.getAbsolutePath());
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Could not create Gcam debug data folder: ") : "Could not create Gcam debug data folder: ".concat(valueOf2));
        }
        return file2.getAbsolutePath();
    }

    @SuppressLint("MissingPermission")
    public final String a(long j) {
        String str = null;
        if (this.b.checkSelfPermission("android.permission.READ_PHONE_STATE") == PackageManager.PERMISSION_GRANTED) {
            try {
                str = Build.getSerial();
            } catch (SecurityException e) {
                liu.c(c);
            }
        }
        if (str != null) {
            int length = str.length();
            if (length > 4) {
                str = str.substring(length - 4, length);
            }
        } else {
            str = "XXXX";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return String.format("%s_%s", str, simpleDateFormat.format(Long.valueOf(j)));
    }
}
