package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: jcl  reason: default package */
/* loaded from: classes.dex */
public interface jcl {
    jck a();

    void a(ContentResolver contentResolver, String str, long j, pjz pjzVar, int i, String str2, int i2, int i3, nef nefVar);

    void a(Context context, String str);

    void a(Uri uri);

    void a(Uri uri, Uri uri2);

    void a(Uri uri, avl avlVar);

    void a(avl avlVar, long j, Uri uri);

    void a(mjs mjsVar, long j, Uri uri);

    Uri b();

    pjz b(Uri uri);

    void b(Uri uri, Uri uri2);

    boolean c(Uri uri);

    Point d(Uri uri);

    long e(Uri uri);

    Uri f(Uri uri);

    Uri g(Uri uri);

    boolean h(Uri uri);
}
