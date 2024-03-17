package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: mkb  reason: default package */
/* loaded from: classes.dex */
public final class mkb implements mkg, mkf {
    private final String a;
    private final mka b;

    public mkb(String str, mka mkaVar) {
        this.a = str;
        this.b = mkaVar;
    }

    @Override // defpackage.mkg
    public final mkg a(String str) {
        mka mkaVar = this.b;
        String valueOf = String.valueOf(mkaVar.a);
        String valueOf2 = String.valueOf(str);
        String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        int length = str.length();
        int i = mkaVar.b;
        if (length > i) {
            mkb a = mkaVar.a(str2.substring(0, i + mkaVar.a.length()));
            int length2 = str.length();
            int i2 = mkaVar.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
            sb.append("Tag ");
            sb.append(str);
            sb.append(" is ");
            sb.append(length2 - i2);
            sb.append(" chars longer than limit.");
            a.f(sb.toString());
            return a;
        }
        return mkaVar.a(str2);
    }

    @Override // defpackage.mkg
    public final void b(String str) {
        this.b.a(this.a, 3);
    }

    @Override // defpackage.mkg
    public final void a(String str, Throwable th) {
        this.b.a(this.a, 3);
    }

    @Override // defpackage.mkg
    public final void c(String str) {
        if (this.b.a(this.a, 6)) {
            Log.e(this.a, str);
        }
    }

    @Override // defpackage.mkg
    public final void b(String str, Throwable th) {
        if (this.b.a(this.a, 6)) {
            Log.e(this.a, str, th);
        }
    }

    @Override // defpackage.mkg
    public final void d(String str) {
        this.b.a(this.a, 4);
    }

    @Override // defpackage.mkg
    public final void e(String str) {
        this.b.a(this.a, 2);
    }

    @Override // defpackage.mkg
    public final void f(String str) {
        if (this.b.a(this.a, 5)) {
            Log.w(this.a, str);
        }
    }

    @Override // defpackage.mkg
    public final void c(String str, Throwable th) {
        if (this.b.a(this.a, 5)) {
            Log.w(this.a, str, th);
        }
    }
}