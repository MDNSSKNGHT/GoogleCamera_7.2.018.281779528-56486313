package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public interface NavigableSet extends java.util.SortedSet, SortedSet {
    @Override
    default Comparator comparator() {
        return null;
    }

    @Override
    default java.util.SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    @Override
    default java.util.SortedSet headSet(Object toElement) {
        return null;
    }

    @Override
    default java.util.SortedSet tailSet(Object fromElement) {
        return null;
    }

    @Override
    default Object first() {
        return null;
    }

    @Override
    default Object last() {
        return null;
    }

    @Override
    default int size() {
        return SortedSet.super.size();
    }

    @Override
    default boolean isEmpty() {
        return SortedSet.super.isEmpty();
    }

    @Override
    default boolean contains(Object o) {
        return SortedSet.super.contains(o);
    }
    
    @Override
    default Iterator iterator() {
        return SortedSet.super.iterator();
    }

    @Override
    default void forEach(Consumer action) {
        SortedSet.super.forEach(action);
    }

    @Override
    default Object[] toArray() {
        return SortedSet.super.toArray();
    }

    @Override
    default boolean add(Object o) {
        return SortedSet.super.add(o);
    }

    @Override
    default boolean remove(Object o) {
        return SortedSet.super.remove(o);
    }

    @Override
    default boolean addAll(Collection c) {
        return SortedSet.super.addAll(c);
    }

    @Override
    default boolean removeIf(Predicate filter) {
        return SortedSet.super.removeIf(filter);
    }

    @Override
    default void clear() {
        SortedSet.super.clear();
    }

    @Override
    default boolean retainAll(Collection c) {
        return SortedSet.super.retainAll(c);
    }

    @Override
    default boolean removeAll(Collection c) {
        return SortedSet.super.removeAll(c);
    }

    @Override
    default boolean containsAll(Collection c) {
        return SortedSet.super.containsAll(c);
    }

    
    @Override
    default Object[] toArray(Object[] a) {
        return SortedSet.super.toArray(a);
    }

    @Override
    default Spliterator spliterator() {
        return SortedSet.super.spliterator();
    }

    @Override
    default Stream stream() {
        return SortedSet.super.stream();
    }

    @Override
    default java.util.stream.Stream parallelStream() {
        return SortedSet.super.parallelStream();
    }
}