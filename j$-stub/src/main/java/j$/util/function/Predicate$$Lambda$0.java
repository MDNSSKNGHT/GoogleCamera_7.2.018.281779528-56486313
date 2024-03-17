package j$.util.function;

/* loaded from: classes3.dex */
final /* synthetic */ class Predicate$$Lambda$0 implements Predicate {
    private final Predicate arg$1;
    private final Predicate arg$2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Predicate$$Lambda$0(Predicate predicate, Predicate predicate2) {
        this.arg$1 = predicate;
        this.arg$2 = predicate2;
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return Predicate$$CC.lambda$and$0$Predicate$$CC(this.arg$1, this.arg$2, obj);
    }
}
