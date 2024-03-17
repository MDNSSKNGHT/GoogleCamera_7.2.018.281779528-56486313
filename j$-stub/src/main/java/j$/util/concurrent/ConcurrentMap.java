package j$.util.concurrent;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import j$.util.function.BiConsumer;

/** Stub **/
public interface ConcurrentMap extends Map, j$.util.Map {
    void forEach(BiConsumer biConsumer);

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
    default void putAll(Map m) {

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
    default Set<Map.Entry> entrySet() {
        return null;
    }
}
