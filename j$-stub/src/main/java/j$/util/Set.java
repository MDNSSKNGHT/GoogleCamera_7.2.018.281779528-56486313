package j$.util;

import java.util.Iterator;

import j$.util.stream.Stream;

/** Stub **/
public interface Set extends java.util.Collection, Collection, java.util.Set {
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
    default boolean addAll(java.util.Collection c) {
        return false;
    }

    @Override
    default void clear() {

    }

    @Override
    default boolean retainAll(java.util.Collection c) {
        return false;
    }

    @Override
    default boolean removeAll(java.util.Collection c) {
        return false;
    }

    @Override
    default boolean containsAll(java.util.Collection c) {
        return false;
    }

    @Override
    default Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    default Spliterator spliterator() {
        return null;
    }

    @Override
    default Stream stream() {
        return null;
    }
}
