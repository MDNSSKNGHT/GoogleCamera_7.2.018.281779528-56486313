package j$.util.function;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Function$$CC {
    public static Function compose$$dflt$$(Function function, Function function2) {
        function2.getClass();
        return new Function$$Lambda$0(function, function2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$compose$0$Function$$CC(Function function, Function function2, Object obj) {
        return function.apply(function2.apply(obj));
    }

    public static Function andThen$$dflt$$(Function function, Function function2) {
        function2.getClass();
        return new Function$$Lambda$1(function, function2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$andThen$1$Function$$CC(Function function, Function function2, Object obj) {
        return function2.apply(function.apply(obj));
    }
}
