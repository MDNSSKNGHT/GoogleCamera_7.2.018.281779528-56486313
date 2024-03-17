package defpackage;

import androidx.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import j$.util.Spliterator;
import j$.util.stream.Stream;

public interface puh extends Collection, j$.util.Collection {
    int a(Object obj);

    int a(Object obj, int i);

    @Override
    boolean add(Object obj);

    int b(Object obj, int i);

    boolean c(Object obj, int i);

    @Override
    boolean contains(Object obj);

    @Override
    boolean containsAll(Collection collection);

    Set e();

    @Override
    boolean equals(Object obj);

    Set g();

    @Override
    int hashCode();

    @Override
    Iterator iterator();

    @NonNull
    @Override
    default Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    default Object[] toArray(@NonNull Object[] a) {
        return new Object[0];
    }

    @Override
    boolean remove(Object obj);

    @Override
    default boolean addAll(@NonNull Collection c) {
        return false;
    }

    @Override
    default void clear() {

    }

    @Override
    default boolean retainAll(@NonNull Collection c) {
        return false;
    }

    @Override
    default boolean removeAll(@NonNull Collection c) {
        return false;
    }

    @Override
    int size();

    @Override
    default boolean isEmpty() {
        return false;
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