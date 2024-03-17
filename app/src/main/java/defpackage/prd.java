package defpackage;

/* compiled from: PG */
/* renamed from: prd  reason: default package */
/* loaded from: classes.dex */
final class prd extends prw {
    public static final long serialVersionUID = 0;

    public prd(pre preVar) {
        super(preVar);
    }

    @Override // defpackage.prw
    Object readResolve() {
        return a(new prc());
    }
}