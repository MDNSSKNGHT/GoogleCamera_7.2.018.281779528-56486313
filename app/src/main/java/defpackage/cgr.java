package defpackage;

import j$.util.function.Function;
import j$.util.function.Function$$CC;

/* compiled from: PG */
/* renamed from: cgr  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cgr implements Function {
    private final cgt a;

    public cgr(cgt cgtVar) {
        this.a = cgtVar;
    }

    public final Function andThen(Function function) {
        return Function$$CC.andThen$$dflt$$(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return ((cgw) obj).a((mzg) ((mch) this.a.b).c);
    }

    public final Function compose(Function function) {
        return Function$$CC.compose$$dflt$$(this, function);
    }
}