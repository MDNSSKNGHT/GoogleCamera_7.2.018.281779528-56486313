package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class BiConsumer$$Lambda$0 implements BiConsumer {
    private final BiConsumer arg$1;
    private final BiConsumer arg$2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BiConsumer$$Lambda$0(BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.arg$1 = biConsumer;
        this.arg$2 = biConsumer2;
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        BiConsumer$$CC.lambda$andThen$0$BiConsumer$$CC(this.arg$1, this.arg$2, obj, obj2);
    }
}
