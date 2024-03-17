package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dmv */
/* loaded from: classes.dex */
public final class dmv implements rgg {
    private final rhd a;

    private dmv(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dmv a(rhd rhdVar) {
        return new dmv(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (Set) rgk.a(psl.c(new dmr((ebe) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}