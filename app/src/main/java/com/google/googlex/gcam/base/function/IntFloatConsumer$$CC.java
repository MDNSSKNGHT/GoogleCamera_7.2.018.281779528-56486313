package com.google.googlex.gcam.base.function;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract /* synthetic */ class IntFloatConsumer$$CC {
    public static IntFloatConsumer andThen$$dflt$$(IntFloatConsumer intFloatConsumer, IntFloatConsumer intFloatConsumer2) {
        return new IntFloatConsumer$$Lambda$0(intFloatConsumer, intFloatConsumer2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$andThen$0$IntFloatConsumer$$CC(IntFloatConsumer intFloatConsumer, IntFloatConsumer intFloatConsumer2, int i, float f) {
        intFloatConsumer.accept(i, f);
        intFloatConsumer2.accept(i, f);
    }
}
