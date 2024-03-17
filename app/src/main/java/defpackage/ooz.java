package defpackage;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ooz  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class ooz implements opd {
    private final opb a;

    public ooz(opb opbVar) {
        this.a = opbVar;
    }

    @Override // defpackage.opd
    public final Object a() {
        opb opbVar = this.a;
        Cursor query = opbVar.a.query(opbVar.b, opb.c, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map hwVar = count <= 256 ? new hw(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                hwVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return hwVar;
        } finally {
            query.close();
        }
    }
}