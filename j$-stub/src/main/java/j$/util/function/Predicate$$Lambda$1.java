package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class Predicate$$Lambda$1 implements Predicate {
    private final Predicate arg$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Predicate$$Lambda$1(Predicate predicate) {
        this.arg$1 = predicate;
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return Predicate$$CC.lambda$negate$1$Predicate$$CC(this.arg$1, obj);
    }
}
