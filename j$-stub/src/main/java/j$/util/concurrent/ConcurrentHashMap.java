package j$.util.concurrent;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

import j$.util.function.BiConsumer;

/** Stub **/
public class ConcurrentHashMap extends AbstractMap implements java.util.concurrent.ConcurrentMap, Serializable, ConcurrentMap, Map {
    public ConcurrentHashMap() {

    }

    public ConcurrentHashMap(int i) {

    }

    public ConcurrentHashMap(Map map) {
    }

    @Override
    public void forEach(BiConsumer biConsumer) {

    }

    @Override
    public Set<Map.Entry> entrySet() {
        return null;
    }

    @Override
    public Object putIfAbsent(Object key, Object value) {
        return null;
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return null;
    }

    @Override
    public void forEach(java.util.function.BiConsumer action) {

    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        return null;
    }

    @Override
    public Object compute(Object key, BiFunction remappingFunction) {
        return null;
    }

    @Override
    public Object computeIfPresent(Object key, BiFunction remappingFunction) {
        return null;
    }

    @Override
    public Object computeIfAbsent(Object key, Function mappingFunction) {
        return null;
    }

    @Override
    public Object replace(Object key, Object value) {
        return null;
    }

    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        return false;
    }

    @Override
    public void replaceAll(BiFunction function) {
    }
}
