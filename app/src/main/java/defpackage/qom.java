package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: qom  reason: default package */
/* loaded from: classes2.dex */
public final class qom extends Number implements Serializable {
    public static final long serialVersionUID = 0;
    public transient AtomicLong value;

    public qom() {
        this((byte) 0);
    }

    public qom(byte b) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(0.0d));
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return a();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) a();
    }

    public final double a() {
        return Double.longBitsToDouble(this.value.get());
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) a();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        a(objectInputStream.readDouble());
    }

    public final void a(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }

    public final String toString() {
        return Double.toString(a());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(a());
    }
}