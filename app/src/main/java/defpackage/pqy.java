package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: pqy  reason: default package */
/* loaded from: classes.dex */
public final class pqy extends por {
    public static final long serialVersionUID = 0;
    private transient int d;

    private pqy() {
        super(qdu.c());
        this.d = 2;
        qdu.c(true);
        this.d = 2;
    }

    public static pqy l() {
        return new pqy();
    }

    @Override // defpackage.por, defpackage.pof
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ppk(this.d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.d = 2;
        int readInt = objectInputStream.readInt();
        a(qdu.c());
        qdu.a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        qdu.a((pue) this, objectOutputStream);
    }
}