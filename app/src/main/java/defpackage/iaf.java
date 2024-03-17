package defpackage;

import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: iaf  reason: default package */
/* loaded from: classes.dex */
public final class iaf {
    public final Object a;
    public final LinkedList b;
    public final HashMap c;
    public int d;

    public iaf() {
        qdu.a(true, (Object) "maxSize must be > 0.");
        this.a = new Object();
        this.b = new LinkedList();
        this.c = new HashMap();
    }

    public static final void a() {
        qdu.a(true, (Object) "Size was < 0.");
    }
}