package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: dnz  reason: default package */
/* loaded from: classes.dex */
final class dnz implements doa {
    private final /* synthetic */ ilu a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ List e;
    private final /* synthetic */ gri f;
    private final /* synthetic */ grj g;

    public dnz(ilu iluVar, boolean z, boolean z2, boolean z3, List list, gri griVar, grj grjVar) {
        this.a = iluVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
        this.f = griVar;
        this.g = grjVar;
    }

    @Override // defpackage.doa
    public final ilu a() {
        return this.a;
    }

    @Override // defpackage.doa
    public final ilu b() {
        return this.b ? this.a : ilu.OFF;
    }

    @Override // defpackage.doa
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.doa
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.doa
    public final List e() {
        return this.e;
    }

    @Override // defpackage.doa
    public final gri f() {
        return this.f;
    }

    @Override // defpackage.doa
    public final grj g() {
        return this.g;
    }
}