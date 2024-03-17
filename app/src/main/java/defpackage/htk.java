package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: htk */
/* loaded from: classes.dex */
public final class htk implements rgg {
    private final rhd a;
    private final rhd b;

    private htk(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static htk a(rhd rhdVar, rhd rhdVar2) {
        return new htk(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (List) rgk.a(htd.a(((ggz) this.a).a(), (myz) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}