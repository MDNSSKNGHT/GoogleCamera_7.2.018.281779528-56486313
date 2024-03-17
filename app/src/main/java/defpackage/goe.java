package defpackage;

/* compiled from: PG */
/* renamed from: goe  reason: default package */
/* loaded from: classes.dex */
public final class goe extends mdu {
    private final goq a;
    private final goq b;
    private final goq c;
    private final goq d;
    private final goq e;

    static {
        liu.a("ZslHdrPSelect");
    }

    public goe(mcs mcsVar, goq goqVar, goq goqVar2, goq goqVar3, goq goqVar4, goq goqVar5) {
        super(mcsVar);
        this.a = goqVar;
        this.b = goqVar2;
        this.c = goqVar3;
        this.d = goqVar4;
        this.e = goqVar5;
    }

    @Override // defpackage.mdu
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ggg gggVar = (ggg) obj;
        int ordinal = gggVar.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return this.b;
        }
        if (ordinal == 2) {
            return this.c;
        }
        if (ordinal == 3) {
            return this.d;
        }
        if (ordinal == 4) {
            return this.e;
        }
        String valueOf = String.valueOf(gggVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Invalid AutoHdrPlusRecommendation enum instance:");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }
}