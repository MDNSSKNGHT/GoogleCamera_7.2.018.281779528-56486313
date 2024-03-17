package defpackage;

import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer$$CC;

/* compiled from: PG */
/* renamed from: dru  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dru implements IntFloatConsumer {
    private final dse a;

    public dru(dse dseVar) {
        this.a = dseVar;
    }

    @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
    public final void accept(int i, float f) {
        dse dseVar = this.a;
        qdu.d(dseVar.s.a().a());
        ((dsn) dseVar.s.a().b()).a(f);
    }

    @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
    public final IntFloatConsumer andThen(IntFloatConsumer intFloatConsumer) {
        return IntFloatConsumer$$CC.andThen$$dflt$$(this, intFloatConsumer);
    }
}
