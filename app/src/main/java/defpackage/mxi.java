package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: mxi */
/* loaded from: classes.dex */
public final class mxi {
    public mxi() {
    }

    public static int a(mjo mjoVar, boolean z) {
        if (z) {
            if (mjoVar != mjo.CLOCKWISE_0) {
                if (mjoVar != mjo.CLOCKWISE_90) {
                    return mjoVar == mjo.CLOCKWISE_180 ? 10 : 9;
                }
                return 1;
            }
            return 2;
        } else if (mjoVar != mjo.CLOCKWISE_0) {
            if (mjoVar != mjo.CLOCKWISE_90) {
                return mjoVar == mjo.CLOCKWISE_180 ? 9 : 10;
            }
            return 2;
        } else {
            return 1;
        }
    }

    public static boolean a(int i) {
        return i == 1 || i == 9;
    }

    public static pjz a(mnu mnuVar, mou mouVar) {
        return mouVar != null ? pjz.c(mnuVar.a().b(mouVar)) : pix.a;
    }

    public static long a(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            long e = ((mwv) ((mos) it.next())).e();
            qdu.a(e >= 0, "bytesPerImage() must be >= 0", new Object[0]);
            j += e;
        }
        return j;
    }

    public mxi(mnv mnvVar) {
        mnvVar.a().e();
    }
}