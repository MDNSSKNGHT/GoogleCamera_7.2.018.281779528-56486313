package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: hkh  reason: default package */
/* loaded from: classes.dex */
public final class hkh implements hkd {
    private final mcs a;

    public hkh(mcs mcsVar) {
        this.a = mcsVar;
    }

    @Override // defpackage.hkd
    public final void a() {
    }

    @Override // defpackage.hkd
    public final hkc a(mny mnyVar) {
        try {
            mnyVar.a(mnyVar.b().b((Integer) this.a.a()).a()).get();
        } catch (InterruptedException | CancellationException | ExecutionException /*| mmh*/ e) {
            liu.a("NoTorchIllum", "Couldn't set the no-torch illumination", e);
        }
        return new hkg();
    }
}