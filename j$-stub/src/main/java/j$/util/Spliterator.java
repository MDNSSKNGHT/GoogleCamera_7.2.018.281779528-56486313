package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/** HACK: make it extend java.util.Spliterator to avoid inheritance issues **/
public interface Spliterator extends java.util.Spliterator {

    /* loaded from: classes3.dex */
    public interface OfDouble extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(DoubleConsumer doubleConsumer);

        boolean tryAdvance(DoubleConsumer doubleConsumer);
    }

    /* loaded from: classes3.dex */
    public interface OfInt extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(IntConsumer intConsumer);

        boolean tryAdvance(IntConsumer intConsumer);
    }

    /* loaded from: classes3.dex */
    public interface OfLong extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(LongConsumer longConsumer);

        boolean tryAdvance(LongConsumer longConsumer);
    }

    /* loaded from: classes3.dex */
    public interface OfPrimitive extends Spliterator {
        void forEachRemaining(Object obj);

        boolean tryAdvance(Object obj);
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean tryAdvance(Consumer consumer);

    @Override
    default boolean tryAdvance(java.util.function.Consumer action) {
        // Avoid implementations
        return false;
    }

    Spliterator trySplit();
}
