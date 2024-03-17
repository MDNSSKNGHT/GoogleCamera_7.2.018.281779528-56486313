package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: por  reason: default package */
/* loaded from: classes.dex */
class por extends pof implements pue {
    public static final long serialVersionUID = 7431625294878419160L;

    @Override // defpackage.pof
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.pof, defpackage.pue
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    public final Set a(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // defpackage.pof
    public final Collection a(Object obj, Collection collection) {
        return new poe(this, obj, (Set) collection);
    }

    public por(Map map) {
        super(map);
    }
}