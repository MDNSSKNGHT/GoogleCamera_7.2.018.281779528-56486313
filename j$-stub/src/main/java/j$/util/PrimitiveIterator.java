package j$.util;

import j$.util.function.LongConsumer;

/* loaded from: classes3.dex */
public interface PrimitiveIterator extends java.util.Iterator, Iterator {

    /* loaded from: classes3.dex */
    public interface OfLong extends PrimitiveIterator {
        void forEachRemaining(LongConsumer longConsumer);

        @Override // java.util.Iterator
        Long next();

        long nextLong();
    }
}
