package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: opb  reason: default package */
/* loaded from: classes.dex */
public final class opb implements ope {
    public final ContentResolver a;
    public final Uri b;
    private volatile Map g;
    private static final Map<Uri, opb> d = new hw();
    public static final String[] c = {"key", "value"};
    private final ContentObserver e = new opa(this);
    private final Object f = new Object();
    private final List<opc> h = new ArrayList<>();

    private opb(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (opb.class) {
            for (opb opbVar : d.values()) {
                opbVar.a.unregisterContentObserver(opbVar.e);
            }
            d.clear();
        }
    }

    @Override // defpackage.ope
    public /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) opv.a(new ooz(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(str);
    }

    public static opb a(ContentResolver contentResolver, Uri uri) {
        opb opbVar;
        synchronized (opb.class) {
            opbVar = d.get(uri);
            if (opbVar == null) {
                try {
                    opb opbVar2 = new opb(contentResolver, uri);
                    try {
                        d.put(uri, opbVar2);
                    } catch (SecurityException ignored) {
                    }
                    opbVar = opbVar2;
                } catch (SecurityException ignored) {
                }
            }
        }
        return opbVar;
    }

    public void a() {
        synchronized (this.f) {
            this.g = null;
            ops.a();
        }
        synchronized (this) {
            for (opc opcVar : this.h) {
                opcVar.a();
            }
        }
    }

    public static void a(Uri uri) {
        synchronized (opb.class) {
            opb opbVar = d.get(uri);
            if (opbVar != null) {
                opbVar.a();
            }
        }
    }
}