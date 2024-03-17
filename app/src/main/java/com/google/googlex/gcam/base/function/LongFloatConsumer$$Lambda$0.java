package com.google.googlex.gcam.base.function;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class LongFloatConsumer$$Lambda$0 implements LongFloatConsumer {
    public final LongFloatConsumer arg$1;
    public final LongFloatConsumer arg$2;

    public LongFloatConsumer$$Lambda$0(LongFloatConsumer longFloatConsumer, LongFloatConsumer longFloatConsumer2) {
        this.arg$1 = longFloatConsumer;
        this.arg$2 = longFloatConsumer2;
    }

    @Override // com.google.googlex.gcam.base.function.LongFloatConsumer
    public void accept(long j, float f) {
        LongFloatConsumer$$CC.lambda$andThen$0$LongFloatConsumer$$CC(this.arg$1, this.arg$2, j, f);
    }

    @Override // com.google.googlex.gcam.base.function.LongFloatConsumer
    public LongFloatConsumer andThen(LongFloatConsumer longFloatConsumer) {
        return LongFloatConsumer$$CC.andThen$$dflt$$(this, longFloatConsumer);
    }
}
