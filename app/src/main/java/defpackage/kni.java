package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: kni  reason: default package */
/* loaded from: classes.dex */
public final class kni {
    private static final String a = liu.a("CameraUtil");

    public static Bitmap a(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
                return null;
            }
            double d = options.outWidth;
            double d2 = options.outHeight;
            Double.isNaN(d);
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(Math.sqrt((d * d2) / 51200.0d));
            if (ceil > 8) {
                i = ((ceil + 7) / 8) << 3;
            } else {
                while (i < ceil) {
                    i += i;
                }
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (OutOfMemoryError e) {
            liu.a(a, "Got oom exception ", e);
            return null;
        }
    }

    public static Rect a(RectF rectF) {
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static RectF a(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Point a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 % 180;
        int i7 = i6 == 0 ? i2 : i;
        if (i6 != 0) {
            i = i2;
        }
        Point point = new Point();
        point.x = i4;
        point.y = i5;
        if (i == 0 || i7 == 0) {
            String str = a;
            StringBuilder sb = new StringBuilder(101);
            sb.append("zero width/height, falling back to bounds (w|h|bw|bh):");
            sb.append(i);
            sb.append("|");
            sb.append(i7);
            sb.append("|");
            sb.append(i4);
            sb.append("|");
            sb.append(i5);
            liu.b(str, sb.toString());
        } else if (i5 * i > i4 * i7) {
            point.y = (i7 * point.x) / i;
        } else {
            point.x = (i * point.y) / i7;
        }
        return point;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        if (i != 0) {
            matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap != createBitmap) {
                bitmap.recycle();
                return createBitmap;
            }
            return bitmap;
        } catch (OutOfMemoryError e) {
            return bitmap;
        }
    }
}