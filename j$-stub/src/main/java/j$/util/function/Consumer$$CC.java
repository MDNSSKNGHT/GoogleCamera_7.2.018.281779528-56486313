package j$.util.function;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Consumer$$CC {
    public static Consumer andThen$$dflt$$(Consumer consumer, Consumer consumer2) {
        consumer2.getClass();
        return new Consumer$$Lambda$0(consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$andThen$0$Consumer$$CC(Consumer consumer, Consumer consumer2, Object obj) {
        consumer.accept(obj);
        consumer2.accept(obj);
    }
}
