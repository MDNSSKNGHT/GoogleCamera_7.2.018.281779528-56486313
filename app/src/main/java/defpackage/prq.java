package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: prq  reason: default package */
/* loaded from: classes.dex */
final class prq extends prr {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ prr c;

    public prq(prr prrVar, int i, int i2) {
        this.c = prrVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qdu.b(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.prg
    public final Object[] h() {
        return this.c.h();
    }

    @Override // defpackage.prg
    public final int j() {
        return this.c.i() + this.a + this.b;
    }

    @Override // defpackage.prg
    public final int i() {
        return this.c.i() + this.a;
    }

    @Override // defpackage.prr
    public final prr a(int i, int i2) {
        qdu.a(i, i2, this.b);
        prr prrVar = this.c;
        int i3 = this.a;
        return prrVar.a(i + i3, i2 + i3);
    }

    @Override // defpackage.prr, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }
}