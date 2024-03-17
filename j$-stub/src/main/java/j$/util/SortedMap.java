package j$.util;

import java.util.Collection;
import java.util.Set;

import j$.util.function.BiConsumer;

/** Stub **/
public interface SortedMap extends java.util.Map, Map {
    @Override
    default void forEach(BiConsumer biConsumer) {

    }

    @Override
    default int size() {
        return 0;
    }

    @Override
    default boolean isEmpty() {
        return false;
    }

    @Override
    default boolean containsKey(Object key) {
        return false;
    }

    @Override
    default boolean containsValue(Object value) {
        return false;
    }

    @Override
    default Object get(Object key) {
        return null;
    }

    @Override
    default Object put(Object key, Object value) {
        return null;
    }

    @Override
    default Object remove(Object key) {
        return null;
    }

    @Override
    default void putAll(java.util.Map m) {

    }

    @Override
    default void clear() {

    }

    @Override
    default Set keySet() {
        return null;
    }

    @Override
    default Collection values() {
        return null;
    }

    @Override
    default Set<java.util.Map.Entry> entrySet() {
        return null;
    }
}
