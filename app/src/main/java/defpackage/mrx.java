package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: mrx  reason: default package */
/* loaded from: classes.dex */
public class mrx {
    public mrx(byte b) {
    }

    public void a(ggi ggiVar) {
    }

    public void a(ndk ndkVar) {
    }

    public void a(ndr ndrVar) {
    }

    public mrx() {
    }

    public static mrx a(mjw mjwVar) {
        return new ggu(mjwVar, mjwVar);
    }

    public static mou a(mzc mzcVar, mjs mjsVar) {
        mot h = mou.h();
        h.a(mov.SURFACE_TEXTURE);
        h.a(mzcVar);
        h.a(mjsVar);
        return h.a();
    }

    public static mou b(mzc mzcVar, mjs mjsVar) {
        mot h = mou.h();
        h.a(mov.SURFACE_VIEW);
        h.a(mzcVar);
        h.a(mjsVar);
        return h.a();
    }

    public static boolean a(mnz mnzVar, mnz mnzVar2, mkg mkgVar) {
        if (mnzVar2 != mnzVar && !mnzVar.b().isEmpty()) {
            mrq mrqVar = (mrq) mnzVar2;
            if (!mrqVar.d.isEmpty()) {
                boolean z = true;
                for (moi moiVar : (Set<moi>) mrqVar.d) {
                    for (moi moiVar2 : mnzVar.b()) {
                        if (moiVar.a.equals(moiVar2.a) && !moiVar.b.equals(moiVar2.b)) {
                            if (mkgVar == null) {
                                return false;
                            }
                            mkgVar.c(fpp.a("%s on %s (%s) conflicts with %s (%s)", moiVar2.a(), mnzVar, moiVar2.b, mnzVar2, moiVar.b));
                            z = false;
                        }
                    }
                }
                return z;
            }
        }
        return true;
    }
}