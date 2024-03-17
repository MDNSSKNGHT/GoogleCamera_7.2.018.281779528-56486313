package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: pre */
/* loaded from: classes.dex */
public abstract class pre extends prx implements pov {
    @Override // defpackage.pov
    public /* bridge */ /* synthetic */ pov a() {
        throw null;
    }

    @Override // defpackage.pov
    @Deprecated
    public final void a(Object obj, Object obj2) {
        throw null;
    }

    public abstract pre b();

    @Override // defpackage.prx
    public final /* bridge */ /* synthetic */ prg c() {
        throw new AssertionError("should never be called");
    }

    public static pre a(Object obj, Object obj2, Object obj3, Object obj4) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        return new pvb(new Object[]{obj, obj2, obj3, obj4}, 2);
    }

    public static pre a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        return new pvb(new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    public static pre a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        qdu.b(obj7, obj8);
        return new pvb(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, 4);
    }

    public static pre a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        qdu.b(obj, obj2);
        qdu.b(obj3, obj4);
        qdu.b(obj5, obj6);
        qdu.b(obj7, obj8);
        qdu.b(obj9, obj10);
        return new pvb(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, 5);
    }

    @Override // defpackage.prx
    public final /* bridge */ /* synthetic */ prg d() {
        return k();
    }

    private final psl k() {
        return b().j();
    }

    @Override // defpackage.prx, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return k();
    }

    @Override // defpackage.prx
    Object writeReplace() {
        return new prd(this);
    }
}