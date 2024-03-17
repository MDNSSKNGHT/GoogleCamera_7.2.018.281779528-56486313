package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* renamed from: pvd  reason: default package */
/* loaded from: classes.dex */
final class pvd extends prr {
    private final /* synthetic */ pve a;

    public pvd(pve pveVar) {
        this.a = pveVar;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        qdu.b(i, this.a.c);
        pve pveVar = this.a;
        Object[] objArr = pveVar.a;
        int i2 = i + i;
        int i3 = pveVar.b;
        return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}