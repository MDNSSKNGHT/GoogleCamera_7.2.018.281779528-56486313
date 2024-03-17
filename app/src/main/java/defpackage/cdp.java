package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cdp  reason: default package */
/* loaded from: classes.dex */
public final class cdp {
    private static final String d = liu.a("CdrVideoSettings");
    public final imb a;
    public final cin b;
    public final met c;

    public cdp(imb imbVar, met metVar, cin cinVar) {
        this.a = imbVar;
        this.c = metVar;
        this.b = cinVar;
    }

    public final mer a(mzg mzgVar, cag cagVar, meo meoVar, boolean z) {
        if (!meoVar.b()) {
            List a = cagVar.a(meoVar);
            qdu.d(!a.isEmpty());
            return z ? (mer) a.get(a.size() - 1) : (mer) a.get(0);
        }
        ciq ciqVar = mzgVar != mzg.FRONT ? cig.g : cig.f;
        pjz a2 = this.b.a(ciqVar);
        if (a2 == null || !a2.a()) {
            boolean a3 = this.a.a("default_scope", "pref_video_quality_ultra_key");
            String str = (mzgVar == mzg.FRONT || a3) ? "large" : "medium";
            ArrayList arrayList = new ArrayList(cagVar.a(meo.FPS_30));
            ipx ipxVar = new ipx();
            if (!arrayList.isEmpty()) {
                ipxVar.a = (mer) arrayList.get(0);
                arrayList.remove(0);
            }
            if (!arrayList.isEmpty()) {
                ipxVar.b = (mer) arrayList.get(0);
                arrayList.remove(0);
            }
            String str2 = d;
            StringBuilder sb = new StringBuilder(57);
            sb.append("video quality setting: pref_video_quality_ultra_key=");
            sb.append(a3);
            sb.toString();
            liu.b(str2);
            if (!"small".equals(str) && !"medium".equals(str)) {
                str = "large";
            }
            return "large".equals(str) ? ipxVar.a : "medium".equals(str) ? ipxVar.b : ipxVar.c;
        }
        int intValue = ((Integer) a2.b()).intValue();
        if (intValue != 144) {
            if (intValue != 240) {
                if (intValue != 288) {
                    if (intValue != 480) {
                        if (intValue != 720) {
                            if (intValue != 1080) {
                                if (intValue == 2160) {
                                    return mer.RES_2160P;
                                }
                                String valueOf = String.valueOf(a2.b());
                                String str3 = ciqVar.a;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(str3).length());
                                sb2.append("Value ");
                                sb2.append(valueOf);
                                sb2.append(" for ADB flag ");
                                sb2.append(str3);
                                sb2.append(" not supported.");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            return mer.RES_1080P;
                        }
                        return mer.RES_720P;
                    }
                    return mer.RES_480P;
                }
                return mer.RES_CIF;
            }
            return mer.RES_QVGA;
        }
        return mer.RES_QCIF;
    }

    public final boolean a() {
        return this.a.a("default_scope", "pref_video_stabilization_key");
    }

    public final boolean b() {
        return this.b.b(cig.m);
    }
}