package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: irc */
/* loaded from: classes.dex */
public final class irc implements rgg {
    private final rhd a;
    private final rhd b;

    private irc(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static irc a(rhd rhdVar, rhd rhdVar2) {
        return new irc(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        iqu iquVar = (iqu) this.a.get();
        if (!((cqp) this.b).a().e()) {
            obj = pvi.a;
        } else {
            obj = psl.c(new iqx(iquVar));
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}