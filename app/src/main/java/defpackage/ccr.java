package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ccr  reason: default package */
/* loaded from: classes.dex */
public final class ccr {
    private static final String b = liu.a("CdrLifetime");
    public final Map<ccq, mba> a = new HashMap<>();

    public void b(ccq ccqVar) {
        mba mbaVar = this.a.remove(ccqVar);
        if (mbaVar != null) {
            String sb = "close lifetime: " + ccqVar;
            liu.b(b);
            mbaVar.close();
        }
    }

    public mba a(ccq ccqVar) {
        if (this.a.containsKey(ccqVar)) {
            return this.a.get(ccqVar);
        }
        String sb = "create lifetime: " + ccqVar;
        liu.b(b);
        mba mbaVar = new mba();
        this.a.put(ccqVar, mbaVar);
        return mbaVar;
    }
}