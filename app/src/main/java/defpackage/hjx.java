package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hjx */
/* loaded from: classes.dex */
public final class hjx implements rgg {
    private final rhd a;
    private final rhd b;

    private hjx(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hjx a(rhd rhdVar, rhd rhdVar2) {
        return new hjx(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gff gffVar = (gff) this.a.get();
        myo a = ((ggz) this.b).a();
        HashSet hashSet = new HashSet();
        for (CaptureRequest.Key key : a.G()) {
            hashSet.add(key.getName());
        }
        psj psjVar = new psj();
        if (gffVar != null) {
            for (ggn ggnVar : ((ggo) gffVar.a()).a) {
                if (hashSet.contains(ggnVar.a.getName())) {
                    psjVar.c(mop.a(ggnVar.a, ggnVar.b));
                }
            }
        }
        return (Set) rgk.a(psjVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}