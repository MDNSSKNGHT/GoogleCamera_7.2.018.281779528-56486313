package defpackage;

import android.content.Context;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: dug  reason: default package */
/* loaded from: classes.dex */
public final class dug {
    private static final nda a = nda.a();
    private final mkg b;
    private final Context c;
    private final mkn d;

    public dug(mkg mkgVar, mkn mknVar, Context context) {
        this.b = mkgVar.a("HexagonEnv");
        this.c = context;
        this.d = mknVar;
    }

    public final void b() {
        int i;
        try {
            try {
                if (!a.b()) {
                    this.b.d("Loading libhalide_hexagon_host.so.");
                    System.loadLibrary("halide_hexagon_host");
                } else {
                    this.b.d("Loading libhalide_hexagon_host_pixel1.so.");
                    System.loadLibrary("halide_hexagon_host_pixel1");
                }
                String str = this.c.getApplicationInfo().dataDir;
                this.d.b("HexagonEnvironment#copyHexagonRemoteToDisk");
                String concat = String.valueOf(str).concat("/libhalide_hexagon_remote_skel.so");
                if (a.b()) {
                    mkg mkgVar = this.b;
                    String valueOf = String.valueOf(concat);
                    mkgVar.d(valueOf.length() != 0 ? "Writing libhalide_hexagon_remote_skel_pixel1.so to ".concat(valueOf) : new String("Writing libhalide_hexagon_remote_skel_pixel1.so to "));
                    i = 2131886092;
                } else {
                    mkg mkgVar2 = this.b;
                    String valueOf2 = String.valueOf(concat);
                    mkgVar2.d(valueOf2.length() != 0 ? "Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ".concat(valueOf2) : new String("Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to "));
                    i = 2131886093;
                }
                InputStream openRawResource = this.c.getResources().openRawResource(i);
                FileOutputStream fileOutputStream = new FileOutputStream(concat);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                openRawResource.close();
                fileOutputStream.close();
                this.d.a();
                String concat2 = String.valueOf(str).concat(";/dsp");
                try {
                    mkg mkgVar3 = this.b;
                    String valueOf3 = String.valueOf(concat2);
                    mkgVar3.d(valueOf3.length() != 0 ? "ADSP_LIBRARY_PATH=".concat(valueOf3) : new String("ADSP_LIBRARY_PATH="));
                    Os.setenv("ADSP_LIBRARY_PATH", concat2, true);
                } catch (ErrnoException e) {
                    mkg mkgVar4 = this.b;
                    String valueOf4 = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 33);
                    sb.append("Failed to set ADSP_LIBRARY_PATH: ");
                    sb.append(valueOf4);
                    mkgVar4.f(sb.toString());
                }
            } catch (UnsatisfiedLinkError e2) {
                mkg mkgVar5 = this.b;
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 32);
                sb2.append("Failed to load Hexagon library: ");
                sb2.append(valueOf5);
                mkgVar5.f(sb2.toString());
            }
        } catch (Exception e3) {
            mkg mkgVar6 = this.b;
            String valueOf6 = String.valueOf(e3);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
            sb3.append("Error initializing Hexagon: ");
            sb3.append(valueOf6);
            mkgVar6.f(sb3.toString());
        }
    }

    public static boolean a() {
        return new File("/dev/adsprpc-smd").canRead();
    }
}
