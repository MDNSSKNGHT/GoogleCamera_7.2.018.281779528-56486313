package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: htm */
/* loaded from: classes.dex */
public final class htm implements rgg {
    private final rhd a;

    private htm(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static htm a(rhd rhdVar) {
        return new htm(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (Set) rgk.a(new HashSet(((Map) this.a.get()).values()), "Cannot return null from a non-@Nullable @Provides method");
    }
}