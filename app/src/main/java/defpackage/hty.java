package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: hty  reason: default package */
/* loaded from: classes.dex */
public final class hty {
    private static final String a = liu.a("HdrPPayloadUt");

    public static ndr a(hrf hrfVar, boolean z) {
        String str;
        ndr c = hrfVar.a.c();
        if (c == null) {
            liu.b(a, "Couldn't acquire metadata from the frame.");
            return null;
        }
        liu.b(a);
        if (hrfVar.a()) {
            liu.b(a);
            if (z) {
                str = hrfVar.b().a().a;
            } else {
                mos c2 = hrfVar.c();
                if (c2 == null) {
                    return null;
                }
                str = c2.a().a;
            }
            c = a(c, str);
        }
        liu.b(a);
        return c;
    }

    public static ndr a(ndr ndrVar, String str) {
        Map e = ndrVar.e();
        if (!e.isEmpty()) {
            ndn ndnVar = (ndn) e.get(str);
            if (ndnVar != null) {
                return new ndq(ndnVar);
            }
            String str2 = a;
            String valueOf = String.valueOf(str);
            liu.b(str2, valueOf.length() == 0 ? new String("Physical metadata is null for images from camera ") : "Physical metadata is null for images from camera ".concat(valueOf));
            return ndrVar;
        }
        return ndrVar;
    }
}