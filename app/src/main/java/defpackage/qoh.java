package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: qoh  reason: default package */
/* loaded from: classes2.dex */
final class qoh extends qog {
    private final AtomicReferenceFieldUpdater a;
    private final AtomicIntegerFieldUpdater b;

    public qoh(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.qog
    public final void a(qoj qojVar, Set set) {
        this.a.compareAndSet(qojVar, null, set);
    }

    @Override // defpackage.qog
    public final int a(qoj qojVar) {
        return this.b.decrementAndGet(qojVar);
    }
}