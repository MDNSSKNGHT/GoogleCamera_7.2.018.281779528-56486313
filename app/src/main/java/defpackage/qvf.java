package defpackage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import j$.util.Spliterator;
import j$.util.stream.Stream;

public interface qvf extends List, RandomAccess, j$.util.List {
    boolean a();

    qvf b(int i);

    void b();

    @Override
    default int size() {
        return 0;
    }

    @Override
    default boolean isEmpty() {
        return false;
    }

    @Override
    default boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    default Iterator iterator() {
        return null;
    }

    @Override
    default void forEach(@NonNull Consumer action) {
        List.super.forEach(action);
    }

    @NonNull
    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @Override
    default boolean add(Object o) {
        return false;
    }

    @Override
    default boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    default boolean addAll(@NonNull Collection c) {
        return false;
    }

    @Override
    default boolean removeIf(@NonNull Predicate filter) {
        return List.super.removeIf(filter);
    }

    @Override
    default boolean retainAll(@NonNull Collection c) {
        return j$.util.List.super.retainAll(c);
    }

    @Override
    default boolean removeAll(@NonNull Collection c) {
        return j$.util.List.super.removeAll(c);
    }

    @Override
    default boolean addAll(int index, @NonNull Collection c) {
        return false;
    }

    @Override
    default void replaceAll(@NonNull UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    default void sort(@Nullable Comparator c) {
        List.super.sort(c);
    }

    @Override
    default void clear() {

    }

    @Override
    default boolean containsAll(@NonNull Collection c) {
        return j$.util.List.super.containsAll(c);
    }

    @Override
    default Object get(int index) {
        return null;
    }

    @Override
    default Object set(int index, Object element) {
        return null;
    }

    @Override
    default void add(int index, Object element) {

    }

    @Override
    default Object remove(int index) {
        return null;
    }

    @Override
    default int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    default int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    default ListIterator listIterator() {
        return null;
    }

    @NonNull
    @Override
    default ListIterator listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    default List subList(int fromIndex, int toIndex) {
        return null;
    }

    @NonNull
    @Override
    default Object[] toArray(@NonNull Object[] a) {
        return new Object[0];
    }

    @Override
    default Spliterator spliterator() {
        return j$.util.List.super.spliterator();
    }

    @Override
    default Stream stream() {
        return j$.util.List.super.stream();
    }

    @NonNull
    @Override
    default java.util.stream.Stream parallelStream() {
        return List.super.parallelStream();
    }
}