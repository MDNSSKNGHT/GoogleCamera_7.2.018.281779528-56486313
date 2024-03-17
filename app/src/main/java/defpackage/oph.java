package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* compiled from: PG */
/* renamed from: oph  reason: default package */
/* loaded from: classes.dex */
final class oph implements ope {
    private static oph b;
    public final Context a;
    private final ContentObserver c;

    private oph() {
        this.a = null;
        this.c = null;
    }

    private oph(Context context) {
        this.a = context;
        this.c = new opg();
        context.getContentResolver().registerContentObserver(lzo.a, true, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (oph.class) {
            if (b != null && b.a != null && b.c != null) {
                b.a.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }

    @Override // defpackage.ope
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return b(str);
    }

    public final String b(String str) {
        if (this.a != null) {
            try {
                return (String) opv.a(new opf(this, str));
            } catch (IllegalStateException | SecurityException e) {
                String valueOf = String.valueOf(str);
                Log.e("GservicesLoader", valueOf.isEmpty() ? "Unable to read GServices for: " : "Unable to read GServices for: ".concat(valueOf), e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oph a(Context context) {
        oph ophVar;
        synchronized (oph.class) {
            if (b == null) {
                b = gf.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0 ? new oph() : new oph(context);
            }
            ophVar = b;
        }
        return ophVar;
    }
}