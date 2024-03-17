package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dpj */
/* loaded from: classes.dex */
public final class dpj implements rgg {
    private final rhd a;

    private dpj(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dpj a(rhd rhdVar) {
        return new dpj(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ArraySet arraySet = new ArraySet();
        arraySet.add(mdg.a(doo.POSTVIEW));
        arraySet.add(mdg.a((mdl) this.a.get(), dpf.a));
        return (Set) rgk.a(arraySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}