package defpackage;

/* compiled from: PG */
/* renamed from: gep  reason: default package */
/* loaded from: classes.dex */
public final class gep extends mdw {
    public final mcs a;

    public gep(mdl mdlVar) {
        super(mdlVar);
        this.a = mdlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mdw
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        int intValue = (Integer) obj;
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 5) {
                        if (intValue == 6) {
                            return geo.CLOUDY;
                        }
                        throw new RuntimeException("Unknown WB input value");
                    }
                    return geo.SUNNY;
                }
                return geo.FLUORESCENT;
            }
            return geo.INCANDESCENT;
        }
        return geo.AUTO;
    }

    @Override // defpackage.mdw
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        geo geoVar = geo.AUTO;
        int ordinal = ((geo) obj).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return 3;
                        }
                        throw new RuntimeException("Unknown WB output value");
                    }
                    return 2;
                }
                return 5;
            }
            return 6;
        }
        return 1;
    }
}
