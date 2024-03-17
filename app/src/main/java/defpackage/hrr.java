package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: hrr  reason: default package */
/* loaded from: classes.dex */
final class hrr implements mjw {
    private String a;
    private final /* synthetic */ hrs b;
    private final /* synthetic */ Map c;

    public hrr(hrs hrsVar, Map map) {
        this.b = hrsVar;
        this.c = map;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = (String) obj;
        if (str.equals(this.a)) {
            return;
        }
        this.a = str;
        hrs hrsVar = this.b;
        mnz mnzVar = (mnz) this.c.get(str);
        if (mnzVar != null) {
            hrsVar.a = mnzVar;
        }
    }
}