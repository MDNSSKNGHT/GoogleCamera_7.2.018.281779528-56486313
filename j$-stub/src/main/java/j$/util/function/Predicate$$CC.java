package j$.util.function;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Predicate$$CC {
    public static Predicate and$$dflt$$(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new Predicate$$Lambda$0(predicate, predicate2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$and$0$Predicate$$CC(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$negate$1$Predicate$$CC(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static Predicate negate$$dflt$$(Predicate predicate) {
        return new Predicate$$Lambda$1(predicate);
    }

    public static Predicate or$$dflt$$(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new Predicate$$Lambda$2(predicate, predicate2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$or$2$Predicate$$CC(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }
}
