package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ncp  reason: default package */
/* loaded from: classes.dex */
public final class ncp {
    public static pjz a(mnu mnuVar, pjz pjzVar, pjz pjzVar2, pjz pjzVar3, pjz pjzVar4) {
        return pjzVar.a() ? a(mnuVar, psl.c((mos) pjzVar.b()), pjzVar2, pjzVar3, pjzVar4) : pix.a;
    }

    public static pjz a(mnu mnuVar, Set set, pjz pjzVar, pjz pjzVar2, pjz pjzVar3) {
        if (set.isEmpty()) {
            return pix.a;
        }
        psj psjVar = new psj();
        psjVar.b((Iterable) set);
        if (pjzVar.a()) {
            psjVar.c((mos) pjzVar.b());
        }
        if (pjzVar3.a()) {
            psjVar.c((mos) pjzVar3.b());
        }
        Set set2 = pvi.a;
        if (pjzVar2.a()) {
            psjVar.c((mos) pjzVar2.b());
            if (lan.b != null) {
                set2 = psl.c(mop.a(lan.b, (byte) 1));
            } else {
                set2 = pvi.a;
            }
        }
        return pjz.b(mnuVar.a(psjVar.a(), set2));
    }

    public static void a(String str, nbk[] nbkVarArr, nbk[] nbkVarArr2) {
        if (!Arrays.equals(nbkVarArr, nbkVarArr2)) {
            String arrays = Arrays.toString(nbkVarArr);
            String arrays2 = Arrays.toString(nbkVarArr2);
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb.append(str);
            sb.append(" has: ");
            sb.append(arrays);
            sb.append(" which is different from: ");
            sb.append(arrays2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static String a(ncn ncnVar) {
        if (ncnVar != null) {
            if (ncnVar instanceof nck) {
                return Long.toString(((nck) ncnVar).a);
            }
            if (ncnVar instanceof ncl) {
                ncl nclVar = (ncl) ncnVar;
                return String.format(Locale.ROOT, "n: %6.6s, min: %12.12s, max: %12.12s, mean: %12.12s, last: %12.12s", Long.toString((long) nclVar.a), a(nclVar.b), a(nclVar.c), a(nclVar.d), a(nclVar.e));
            }
        }
        return "-";
    }

    private static String a(double d) {
        return (d <= 9.999999999E9d && d >= -9.99999999E8d) ? String.format(Locale.ROOT, "%.4f", Double.valueOf(d)) : String.format(Locale.ROOT, "%.6e", Double.valueOf(d));
    }
}