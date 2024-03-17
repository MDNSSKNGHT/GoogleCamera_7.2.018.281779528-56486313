package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hb  reason: default package */
/* loaded from: classes.dex */
final class hb implements hl {
    private final /* synthetic */ String a;

    public hb(String str) {
        this.a = str;
    }

    @Override // defpackage.hl
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (hg.b) {
            ArrayList arrayList = (ArrayList) hg.c.get(this.a);
            if (arrayList != null) {
                hg.c.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((hl) arrayList.get(i)).a(obj);
                }
            }
        }
    }
}