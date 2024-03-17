package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class Function$$Lambda$1 implements Function {
    private final Function arg$1;
    private final Function arg$2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Function$$Lambda$1(Function function, Function function2) {
        this.arg$1 = function;
        this.arg$2 = function2;
    }

    @Override // j$.util.function.Function
    public Object apply(Object obj) {
        return Function$$CC.lambda$andThen$1$Function$$CC(this.arg$1, this.arg$2, obj);
    }
}
