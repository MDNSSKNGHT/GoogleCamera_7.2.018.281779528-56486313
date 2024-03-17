package defpackage;

/* compiled from: PG */
/* renamed from: ha  reason: default package */
/* loaded from: classes.dex */
final class ha implements hl {
    private final /* synthetic */ gi a;

    public ha(gi giVar) {
        this.a = giVar;
    }

    @Override // defpackage.hl
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (obj == null) {
            this.a.a(1);
            return;
        }
        hf hfVar = (hf) obj;
        int i = hfVar.b;
        if (i == 0) {
            this.a.b(hfVar.a);
        } else {
            this.a.a(i);
        }
    }
}