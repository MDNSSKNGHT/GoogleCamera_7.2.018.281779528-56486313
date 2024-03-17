package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: mrq  reason: default package */
/* loaded from: classes.dex */
public final class mrq implements mnz {
    public final psl a;
    public final psl b;
    public final psl c;
    public final psl d;
    public final int e;
    private final int f;
    private final mcs g;

    public mrq(psl pslVar, psl pslVar2, psl pslVar3, psl pslVar4, int i, mcs mcsVar) {
        boolean z = true;
        qdu.c(!pslVar.isEmpty());
        if (i <= 0 && i != -1) {
            z = false;
        }
        qdu.a(z, "Capacity %s must be greater than 0, or -1 to indicate that capacity is not tracked.", i);
        this.c = pslVar;
        this.a = pslVar2;
        this.b = pslVar3;
        this.d = pslVar4;
        this.e = i;
        this.g = mcsVar;
        this.f = mtz.a();
    }

    @Override // defpackage.mnz
    public final /* bridge */ /* synthetic */ Set a() {
        return this.c;
    }

    @Override // defpackage.mnz
    public final /* bridge */ /* synthetic */ Set b() {
        return this.d;
    }

    @Override // defpackage.mnz
    public final mcs c() {
        return this.g;
    }

    @Override // defpackage.mnz
    public final int d() {
        return this.e;
    }

    public final String toString() {
        int i = this.f;
        StringBuilder sb = new StringBuilder(23);
        sb.append("FrameStream-");
        sb.append(i);
        return sb.toString();
    }
}