package com.google.googlex.gcam.base.function;

public interface IntFloatConsumer {
    void accept(int i, float f);

    IntFloatConsumer andThen(IntFloatConsumer intFloatConsumer);
}
