package com.google.googlex.gcam.base.function;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface LongFloatConsumer {
    void accept(long j, float f);

    LongFloatConsumer andThen(LongFloatConsumer longFloatConsumer);
}
