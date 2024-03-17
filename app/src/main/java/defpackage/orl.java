package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: orl  reason: default package */
/* loaded from: classes.dex */
public final class orl {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PAUSED" : "CLOSED" : "STARTED" : "READY";
    }

    public static ArrayList a(String str, String str2) {
        String[] split = str.split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            int indexOf = str3.indexOf(32);
            String[] split2 = str3.substring(0, indexOf).split(":");
            boolean z = split2.length == 2 && indexOf > 0;
            String valueOf = String.valueOf(str3);
            b(z, valueOf.length() == 0 ? new String("Invalid license meta-data line:\n") : "Invalid license meta-data line:\n".concat(valueOf));
            arrayList.add(new ord(str3.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static String a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r2, java.lang.String r3, long r4, int r6) {
        /*
            r0 = 0
            java.util.jar.JarFile r1 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.util.jar.JarEntry r2 = r1.getJarEntry(r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
            if (r2 != 0) goto L12
            r1.close()     // Catch: java.io.IOException -> L10
            goto L11
        L10:
            r2 = move-exception
        L11:
            return r0
        L12:
            java.io.InputStream r2 = r1.getInputStream(r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
            java.lang.String r2 = a(r2, r4, r6)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
            r1.close()     // Catch: java.io.IOException -> L1e
            goto L1f
        L1e:
            r3 = move-exception
        L1f:
            return r2
        L20:
            r2 = move-exception
            r0 = r1
            goto L36
        L24:
            r2 = move-exception
            r0 = r1
            goto L2b
        L28:
            r2 = move-exception
            goto L36
        L2a:
            r2 = move-exception
        L2b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "Failed to read license text."
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
        L36:
            if (r0 == 0) goto L3d
            r0.close()     // Catch: java.io.IOException -> L3c
            goto L3d
        L3c:
            r3 = move-exception
        L3d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orl.a(java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    public static String a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(2131427516))), j, i);
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void a(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i < 0) {
            a = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            a = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}