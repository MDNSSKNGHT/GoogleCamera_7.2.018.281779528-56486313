package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class LongConsumer$$Lambda$0 implements LongConsumer {
    private final LongConsumer arg$1;
    private final LongConsumer arg$2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LongConsumer$$Lambda$0(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.arg$1 = longConsumer;
        this.arg$2 = longConsumer2;
    }

    @Override // j$.util.function.LongConsumer
    public void accept(long j) {
        LongConsumer$$CC.lambda$andThen$0$LongConsumer$$CC(this.arg$1, this.arg$2, j);
    }
}
