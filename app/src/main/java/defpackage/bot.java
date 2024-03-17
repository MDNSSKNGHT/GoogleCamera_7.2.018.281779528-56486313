package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bot  reason: default package */
/* loaded from: classes.dex */
public final class bot implements mcs {
    private final mcs a;

    public bot(mcs mcsVar) {
        this.a = mcsVar;
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.a.a(new bos(mjwVar), executor);
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.a.a();
    }
}