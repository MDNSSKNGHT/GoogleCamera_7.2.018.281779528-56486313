package defpackage;

public abstract class quw extends qtb {

    public static qvc a(qvc qvcVar) {
        int size = qvcVar.size();
        return qvcVar.a(size != 0 ? size + size : 10);
    }

    protected abstract Object a(int i, Object obj);

    public final qur f() {
        return (qur) b(5);
    }

    public final Object b(int i) {
        return a(i, null);
    }

    static quw a(quw quwVar, qtw qtwVar, quj qujVar) throws qvi {
        quw quwVar2 = (quw) quwVar.b(4);
        try {
            qwu a = qwq.a.a(quwVar2);
            //a.a(quwVar2, qtx.a(qtwVar), qujVar);
            a.c(quwVar2);
            return quwVar2;
        } /*catch (IOException e) {
            if (!(e.getCause() instanceof qvi)) {
                throw new qvi(e.getMessage());
            }
            throw ((qvi) e.getCause());
        } */catch (RuntimeException e2) {
            if (e2.getCause() instanceof qvi) {
                throw ((qvi) e2.getCause());
            }
            throw e2;
        }
    }

    protected static void a(Class cls, quw quwVar) {
        //ar.put(cls, quwVar);
    }

    public static quw a(quw quwVar, byte[] bArr, int i, int i2, quj qujVar) throws qvi {
        quw quwVar2 = (quw) quwVar.b(4);
        try {
            qwu a = qwq.a.a(quwVar2);
            a.a(quwVar2, bArr, i, i + i2, new qtg(qujVar));
            a.c(quwVar2);
            if (quwVar2.ao == 0) {
                return quwVar2;
            }
            throw new RuntimeException();
        } /*catch (IOException e) {
            if (!(e.getCause() instanceof qvi)) {
                throw new qvi(e.getMessage());
            }
            throw ((qvi) e.getCause());
        } */catch (IndexOutOfBoundsException e2) {
            throw qvi.a();
        }
    }

}