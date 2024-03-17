package j$.util.function;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class LongConsumer$$CC {
    public static LongConsumer andThen$$dflt$$(LongConsumer longConsumer, LongConsumer longConsumer2) {
        longConsumer2.getClass();
        return new LongConsumer$$Lambda$0(longConsumer, longConsumer2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$andThen$0$LongConsumer$$CC(LongConsumer longConsumer, LongConsumer longConsumer2, long j) {
        longConsumer.accept(j);
        longConsumer2.accept(j);
    }
}
