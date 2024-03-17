package defpackage;

/* compiled from: PG */
/* renamed from: qtd  reason: default package */
/* loaded from: classes2.dex */
public abstract class qtd implements qwo {
    private static final quj a = quj.a();

    public qwg a(byte[] bArr, int i, quj qujVar) throws qvi {
        throw null;
    }

    @Override // defpackage.qwo
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr, int i) throws qvi {
        qxi e;
        qwg a2 = a(bArr, i, a);
        if (a2 == null || a2.c()) {
            return a2;
        }
        if (a2 instanceof qtb) {
            e = qtb.e();
        } else if (a2 instanceof qtc) {
            qtc qtcVar = (qtc) a2;
            throw null;
        } else {
            e = new qxi();
        }
        throw e.a();
    }
}