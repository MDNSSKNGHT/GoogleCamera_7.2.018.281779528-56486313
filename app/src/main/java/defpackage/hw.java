package defpackage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

import j$.util.function.BiConsumer;

public class hw implements Map, j$.util.Map {
    public hw() {

    }

    public hw(int count) {

    }

    @Override
    public void forEach(BiConsumer biConsumer) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(@Nullable Object key) {
        return false;
    }

    @Override
    public boolean containsValue(@Nullable Object value) {
        return false;
    }

    @Nullable
    @Override
    public Object get(@Nullable Object key) {
        return null;
    }

    @Nullable
    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Nullable
    @Override
    public Object remove(@Nullable Object key) {
        return null;
    }

    @Override
    public void putAll(@NonNull Map m) {

    }

    @Override
    public void clear() {

    }

    @NonNull
    @Override
    public Set keySet() {
        return null;
    }

    @NonNull
    @Override
    public Collection values() {
        return null;
    }

    @NonNull
    @Override
    public Set<Map.Entry> entrySet() {
        return null;
    }

    @Nullable
    @Override
    public Object getOrDefault(@Nullable Object key, @Nullable Object defaultValue) {
        return getOrDefault(key, defaultValue);
    }

    @Override
    public void forEach(@NonNull java.util.function.BiConsumer action) {
        forEach(action);
    }

    @Override
    public void replaceAll(@NonNull BiFunction function) {
        replaceAll(function);
    }

    @Override
    public boolean remove(@Nullable Object key, @Nullable Object value) {
        return remove(key, value);
    }

    @Override
    public boolean replace(Object key, @Nullable Object oldValue, Object newValue) {
        return replace(key, oldValue, newValue);
    }

    @Nullable
    @Override
    public Object replace(Object key, Object value) {
        return replace(key, value);
    }

    @Nullable
    @Override
    public Object computeIfAbsent(Object key, @NonNull Function mappingFunction) {
        return computeIfAbsent(key, mappingFunction);
    }

    @Nullable
    @Override
    public Object computeIfPresent(Object key, @NonNull BiFunction remappingFunction) {
        return computeIfPresent(key, remappingFunction);
    }

    @Nullable
    @Override
    public Object compute(Object key, @NonNull BiFunction remappingFunction) {
        return compute(key, remappingFunction);
    }

    @Nullable
    @Override
    public Object merge(Object key, @NonNull Object value, @NonNull BiFunction remappingFunction) {
        return merge(key, value, remappingFunction);
    }

    @Nullable
    @Override
    public Object putIfAbsent(Object key, Object value) {
        return putIfAbsent(key, value);
    }
}
