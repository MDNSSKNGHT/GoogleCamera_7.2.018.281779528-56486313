package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgg  reason: default package */
/* loaded from: classes.dex */
public final class bgg {
    private static final String a = liu.a("CaptureDataSerilzr");

    private static String a(Object obj) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    sb.append(a(Array.get(obj, i)));
                    if (i != length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
                return sb.toString();
            } else if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                String a2 = a(pair.first);
                String a3 = a(pair.second);
                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 9 + String.valueOf(a3).length());
                sb2.append("Pair: ");
                sb2.append(a2);
                sb2.append(" / ");
                sb2.append(a3);
                return sb2.toString();
            } else {
                return obj.toString();
            }
        }
        return "<null>";
    }

    public static void a(String str, ndn ndnVar, File file) {
        String str2;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bgf bgfVar = new bgf(ndnVar, str);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                List<CaptureResult.Key> a2 = bgfVar.a.a();
                String a3 = fpp.a(bgfVar.b, new Object[0]);
                StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 1);
                sb.append(a3);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                for (CaptureResult.Key key : a2) {
                    bufferedWriter.write(fpp.a("    %s\n", key.getName()));
                    bufferedWriter.write(fpp.a("        %s\n", a(bgfVar.a.a(key))));
                }
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    str2 = a;
                    liu.a(str2, "dumpMetadata - Failed to close writer.", e);
                    fileWriter.close();
                }
            } catch (IOException e2) {
                liu.a(a, "dumpMetadata - Failed to dump metadata", e2);
                try {
                    bufferedWriter.close();
                } catch (IOException e3) {
                    str2 = a;
                    liu.a(str2, "dumpMetadata - Failed to close writer.", e3);
                    fileWriter.close();
                }
            }
            fileWriter.close();
        } catch (IOException e4) {
            liu.a(a, "Could not write capture data to file.", e4);
        }
    }
}
