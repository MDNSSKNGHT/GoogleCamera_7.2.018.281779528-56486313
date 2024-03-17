package j$.util;

import j$.util.function.BiConsumer;

/* loaded from: classes3.dex */
public interface Map extends java.util.Map {

    /* loaded from: classes3.dex */
    public interface Entry {
    }

    void forEach(BiConsumer biConsumer);

    Object putIfAbsent(Object obj, Object obj2);
}
