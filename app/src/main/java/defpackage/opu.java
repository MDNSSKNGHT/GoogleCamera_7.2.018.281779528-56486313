package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: opu  reason: default package */
/* loaded from: classes.dex */
public final class opu implements ope {
    private static final Map<String, opu> d = new hw();
    public volatile Map b;
    private final SharedPreferences e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f = new opt(this);
    public final Object a = new Object();
    public final List<opc> c = new ArrayList<>();

    private opu(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (opu.class) {
            for (opu opuVar : d.values()) {
                opuVar.e.unregisterOnSharedPreferenceChangeListener(opuVar.f);
            }
            d.clear();
        }
    }

    @Override // defpackage.ope
    public Object a(String str) {
        Map<String, ?> map = this.b;
        if (map == null) {
            synchronized (this.a) {
                map = this.b;
                if (map == null) {
                    map = this.e.getAll();
                    this.b = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static opu a(Context context, String str) {
        opu opuVar;
        SharedPreferences sharedPreferences;
        net.a();
        if (!str.startsWith("direct_boot:")) {
            int i = Build.VERSION.SDK_INT;
            if (!net.b(context)) {
                return null;
            }
        }
        synchronized (opu.class) {
            opuVar = d.get(str);
            if (opuVar == null) {
                if (!str.startsWith("direct_boot:")) {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                } else {
                    net.a();
                    sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str.substring(12), 0);
                }
                opuVar = new opu(sharedPreferences);
                d.put(str, opuVar);
            }
        }
        return opuVar;
    }
}