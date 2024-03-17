package j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToLongFunction;

/** Hack: make it extend java.util.stream.Stream to avoid inheritance issues. **/
public interface Stream extends BaseStream, java.util.stream.Stream {
    boolean allMatch(Predicate predicate);

    Object collect(Collector collector);

    void forEach(Consumer consumer);

    Stream map(Function function);

    LongStream mapToLong(ToLongFunction toLongFunction);

    @Override
    default void close() {
    }

    @Override
    default boolean isParallel() {
        return false;
    }

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

    @Override
    default BaseStream onClose(Runnable runnable) {
        return null;
    }

    @Override
    default Iterator iterator() {
        return null;
    }

    @Override
    default Spliterator spliterator() {
        return null;
    }

    @Override
    default java.util.stream.Stream filter(java.util.function.Predicate predicate) {
        return null;
    }

    @Override
    default IntStream mapToInt(ToIntFunction mapper) {
        return null;
    }

    @Override
    default java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction mapper) {
        return null;
    }

    @Override
    default DoubleStream mapToDouble(ToDoubleFunction mapper) {
        return null;
    }

    @Override
    default java.util.stream.Stream distinct() {
        return null;
    }

    @Override
    default java.util.stream.Stream sorted() {
        return null;
    }

    @Override
    default java.util.stream.Stream sorted(Comparator comparator) {
        return null;
    }

    @Override
    default java.util.stream.Stream peek(java.util.function.Consumer action) {
        return null;
    }

    @Override
    default java.util.stream.Stream limit(long maxSize) {
        return null;
    }

    @Override
    default java.util.stream.Stream skip(long n) {
        return null;
    }

    @Override
    default void forEach(java.util.function.Consumer action) {

    }

    @Override
    default void forEachOrdered(java.util.function.Consumer action) {

    }

    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @Override
    default Object reduce(Object identity, BinaryOperator accumulator) {
        return null;
    }

    @Override
    default Optional reduce(BinaryOperator accumulator) {
        return Optional.empty();
    }

    @Override
    default Optional min(Comparator comparator) {
        return Optional.empty();
    }

    @Override
    default Optional max(Comparator comparator) {
        return Optional.empty();
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default boolean anyMatch(java.util.function.Predicate predicate) {
        return false;
    }

    @Override
    default boolean allMatch(java.util.function.Predicate predicate) {
        return false;
    }

    @Override
    default boolean noneMatch(java.util.function.Predicate predicate) {
        return false;
    }

    @Override
    default Optional findFirst() {
        return Optional.empty();
    }

    @Override
    default Optional findAny() {
        return Optional.empty();
    }

    @Override
    default Object collect(java.util.stream.Collector collector) {
        return null;
    }

    @Override
    default Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) {
        return null;
    }

    @Override
    default Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner) {
        return null;
    }

    @Override
    default Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

    @Override
    default DoubleStream flatMapToDouble(java.util.function.Function mapper) {
        return null;
    }

    @Override
    default java.util.stream.LongStream flatMapToLong(java.util.function.Function mapper) {
        return null;
    }

    @Override
    default IntStream flatMapToInt(java.util.function.Function mapper) {
        return null;
    }

    @Override
    default java.util.stream.Stream flatMap(java.util.function.Function mapper) {
        return null;
    }

    @Override
    default java.util.stream.Stream map(java.util.function.Function mapper) {
        return null;
    }
}
