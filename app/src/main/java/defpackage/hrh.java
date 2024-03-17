package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hrh */
/* loaded from: classes.dex */
public final class hrh implements rgg {
    private final rhd a;

    private hrh(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static hrh a(rhd rhdVar) {
        return new hrh(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        HashMap hashMap = new HashMap((Map) this.a.get());
        hashMap.remove(htc.PD);
        return (hrg) rgk.a(new hrg(hashMap), "Cannot return null from a non-@Nullable @Provides method");
    }
}