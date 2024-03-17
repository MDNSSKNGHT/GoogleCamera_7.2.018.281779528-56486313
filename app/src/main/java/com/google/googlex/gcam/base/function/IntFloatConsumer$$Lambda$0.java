package com.google.googlex.gcam.base.function;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class IntFloatConsumer$$Lambda$0 implements IntFloatConsumer {
    public final IntFloatConsumer arg$1;
    public final IntFloatConsumer arg$2;

    public IntFloatConsumer$$Lambda$0(IntFloatConsumer intFloatConsumer, IntFloatConsumer intFloatConsumer2) {
        this.arg$1 = intFloatConsumer;
        this.arg$2 = intFloatConsumer2;
    }

    @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
    public void accept(int i, float f) {
        IntFloatConsumer$$CC.lambda$andThen$0$IntFloatConsumer$$CC(this.arg$1, this.arg$2, i, f);
    }

    @Override // com.google.googlex.gcam.base.function.IntFloatConsumer
    public IntFloatConsumer andThen(IntFloatConsumer intFloatConsumer) {
        return IntFloatConsumer$$CC.andThen$$dflt$$(this, intFloatConsumer);
    }
}
