package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: gz  reason: default package */
/* loaded from: classes.dex */
final class gz implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ gy b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    public gz(Context context, gy gyVar, int i, String str) {
        this.a = context;
        this.b = gyVar;
        this.c = i;
        this.d = str;
    }

    public final hf a() {
        hf a = hg.a(this.a, this.b, this.c);
        if (a.a != null) {
            hg.a.a(this.d, a.a);
        }
        return a;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return a();
    }
}