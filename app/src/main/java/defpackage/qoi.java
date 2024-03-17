package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: qoi  reason: default package */
/* loaded from: classes2.dex */
final class qoi extends qog {
    private qoi() {
    }

    public /* synthetic */ qoi(byte b) {
    }

    @Override // defpackage.qog
    public final void a(qoj qojVar, Set set) {
        synchronized (qojVar) {
            if (qojVar.seenExceptions == null) {
                qojVar.seenExceptions = set;
            }
        }
    }

    @Override // defpackage.qog
    public final int a(qoj qojVar) {
        int i;
        synchronized (qojVar) {
            i = qojVar.remaining - 1;
            qojVar.remaining = i;
        }
        return i;
    }
}