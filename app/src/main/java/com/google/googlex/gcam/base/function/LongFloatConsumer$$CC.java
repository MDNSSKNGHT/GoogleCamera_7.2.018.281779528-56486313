package com.google.googlex.gcam.base.function;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract /* synthetic */ class LongFloatConsumer$$CC {
    public static LongFloatConsumer andThen$$dflt$$(LongFloatConsumer longFloatConsumer, LongFloatConsumer longFloatConsumer2) {
        return new LongFloatConsumer$$Lambda$0(longFloatConsumer, longFloatConsumer2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$andThen$0$LongFloatConsumer$$CC(LongFloatConsumer longFloatConsumer, LongFloatConsumer longFloatConsumer2, long j, float f) {
        longFloatConsumer.accept(j, f);
        longFloatConsumer2.accept(j, f);
    }
}
