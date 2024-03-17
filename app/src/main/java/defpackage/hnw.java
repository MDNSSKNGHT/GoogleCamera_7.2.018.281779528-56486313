package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: hnw  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hnw implements mnj {
    private final hnz a;

    public hnw(hnz hnzVar) {
        this.a = hnzVar;
    }

    @Override // defpackage.mnj
    public final void a(mnq mnqVar) {
        hnz hnzVar = this.a;
        if (hnzVar.h) {
            return;
        }
        List list = hnzVar.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((mnj) list.get(i)).a(mnqVar);
        }
    }
}