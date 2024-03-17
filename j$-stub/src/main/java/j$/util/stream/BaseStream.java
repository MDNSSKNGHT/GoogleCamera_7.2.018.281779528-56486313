package j$.util.stream;

import java.util.Iterator;

import j$.util.Spliterator;

/** HACK: make it extend java.util.stream.BaseStream to avoid inheritance issues **/
public interface BaseStream extends AutoCloseable, java.util.stream.BaseStream {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    @Override
    default java.util.stream.BaseStream sequential() {
        return null;
    }

    @Override
    default java.util.stream.BaseStream parallel() {
        return null;
    }

    @Override
    default java.util.stream.BaseStream unordered() {
        return null;
    }

    BaseStream onClose(Runnable runnable);

    @Override
    Iterator iterator();

    Spliterator spliterator();
}
