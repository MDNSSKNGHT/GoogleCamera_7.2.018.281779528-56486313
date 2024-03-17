package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class Consumer$$Lambda$0 implements Consumer {
    private final Consumer arg$1;
    private final Consumer arg$2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Consumer$$Lambda$0(Consumer consumer, Consumer consumer2) {
        this.arg$1 = consumer;
        this.arg$2 = consumer2;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        Consumer$$CC.lambda$andThen$0$Consumer$$CC(this.arg$1, this.arg$2, obj);
    }
}
