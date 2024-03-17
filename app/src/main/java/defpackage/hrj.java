package defpackage;

/* compiled from: PG */
/* renamed from: hrj  reason: default package */
/* loaded from: classes.dex */
final class hrj extends mdu {
    private final int a;
    private final int b;
    private boolean c;

    public hrj(mcs mcsVar, int i) {
        super(mcsVar);
        qdu.c(true);
        this.a = 1;
        this.b = i;
        this.c = a((Integer) mcsVar.a()).booleanValue();
    }

    private final Boolean a(Integer num) {
        if (num.intValue() < this.a) {
            this.c = false;
        } else if (num.intValue() >= this.b) {
            this.c = true;
        }
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return a((Integer) obj);
    }
}