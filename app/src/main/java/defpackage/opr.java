package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: opr  reason: default package */
/* loaded from: classes.dex */
public final class opr {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public opr(Uri uri) {
        this(null, uri, "", "", false, false, false, false);
    }

    public opr(String str) {
        this(str, null, "", "", false, false, false, false);
    }

    public opr(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final opr b() {
        return new opr(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h);
    }

    public final opr c() {
        Uri uri = this.b;
        if (uri == null) {
            throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new opr(this.a, uri, this.c, this.d, this.e, this.f, this.g, true);
    }

    public final opr a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new opr(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h);
    }

    public final opr a(String str) {
        if (this.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new opr(this.a, this.b, str, this.d, false, this.f, this.g, this.h);
    }

    public final opr b(String str) {
        return new opr(this.a, this.b, this.c, str, this.e, this.f, this.g, this.h);
    }
}