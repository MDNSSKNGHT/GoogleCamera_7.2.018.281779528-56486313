package defpackage;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: mmo  reason: default package */
/* loaded from: classes.dex */
public enum mmo {
    TOP_LEFT((short) 1),
    TOP_RIGHT((short) 2),
    BOTTOM_RIGHT((short) 3),
    BOTTOM_LEFT((short) 4),
    LEFT_TOP((short) 5),
    RIGHT_TOP((short) 6),
    RIGHT_BOTTOM((short) 7),
    LEFT_BOTTOM((short) 8);
    
    private static final prx j;
    public final short b;

    static {
        List asList = Arrays.asList(values());
        mmn mmnVar = new mmn();
        qdu.d(mmnVar);
        prt h = prx.h();
        for (Object obj : asList) {
            h.a(mmnVar.a(obj), obj);
        }
        try {
            j = h.a();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    mmo(short s) {
        this.b = s;
    }

    public static mmo a(mjo mjoVar) {
        qdu.c(mjoVar, "must supply a valid orientation to convert to exif");
        mjo mjoVar2 = mjo.CLOCKWISE_0;
        int ordinal = mjoVar.ordinal();
        if (ordinal == 0) {
            return TOP_LEFT;
        }
        if (ordinal == 1) {
            return RIGHT_TOP;
        }
        if (ordinal == 2) {
            return BOTTOM_RIGHT;
        }
        if (ordinal == 3) {
            return LEFT_BOTTOM;
        }
        throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
    }

    public static mjo a(mmo mmoVar) {
        if (mmoVar != null) {
            mjo mjoVar = mjo.CLOCKWISE_0;
            int ordinal = mmoVar.ordinal();
            if (ordinal == 0) {
                return mjo.CLOCKWISE_0;
            }
            if (ordinal == 2) {
                return mjo.CLOCKWISE_180;
            }
            if (ordinal == 5) {
                return mjo.CLOCKWISE_90;
            }
            if (ordinal == 7) {
                return mjo.CLOCKWISE_270;
            }
            String valueOf = String.valueOf(mmoVar);
            String sb = "Computing rotation for an invalid orientation: " +
                    valueOf;
            Log.w("CAM_ExifOrientation", sb);
            return mjo.CLOCKWISE_0;
        }
        Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
        return mjo.CLOCKWISE_0;
    }

    public static mmo a(ExifInterface exifInterface) {
        //Integer b;
        //if (exifInterface == null || (b = exifInterface.b(ExifInterface.g)) == null) {
        //    return null;
        //}
        return null; //(mmo) j.get(Short.valueOf(b.shortValue()));
    }

    public static mmo a(byte[] bArr) {
        qdu.c(bArr, "byte array must be present and should contain jpeg data");
        return null; //a(mmz.a(bArr));
    }
}