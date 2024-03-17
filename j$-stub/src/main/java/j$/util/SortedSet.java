package j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import j$.util.stream.Stream;

public interface SortedSet extends java.util.Set, Set {
    @Override
    default int size() {
        return 0;
    }

    @Override
    default boolean isEmpty() {
        return false;
    }

    @Override
    default boolean contains(Object o) {
        return false;
    }

    @Override
    default Iterator iterator() {
        return null;
    }

    @Override
    default void forEach(Consumer action) {
        Set.super.forEach(action);
    }


    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @Override
    default boolean add(Object o) {
        return false;
    }

    @Override
    default boolean remove(Object o) {
        return false;
    }

    @Override
    default boolean addAll(Collection c) {
        return false;
    }

    @Override
    default boolean removeIf(Predicate filter) {
        return Set.super.removeIf(filter);
    }

    @Override
    default void clear() {

    }

    @Override
    default boolean retainAll(Collection c) {
        return Set.super.retainAll(c);
    }

    @Override
    default boolean removeAll(Collection c) {
        return Set.super.removeAll(c);
    }

    @Override
    default boolean containsAll(Collection c) {
        return Set.super.containsAll(c);
    }

    @Override
    default Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    default Spliterator spliterator() {
        return Set.super.spliterator();
    }

    @Override
    default Stream stream() {
        return Set.super.stream();
    }

    @Override
    default java.util.stream.Stream parallelStream() {
        return Set.super.parallelStream();
    }
}