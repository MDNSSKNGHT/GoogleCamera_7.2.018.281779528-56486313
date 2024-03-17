package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: jcw  reason: default package */
/* loaded from: classes.dex */
public final class jcw implements jcv {
    private final File a;

    public jcw(File file) {
        this.a = (File) qdu.d((Object) file);
    }

    @Override // defpackage.jcv
    public final File a() {
        boolean b = b();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("Folder doesn't exist and cannot be created: ");
        sb.append(valueOf);
        qdu.b(b, sb.toString());
        return this.a;
    }

    @Override // defpackage.jcv
    public final String c() {
        return this.a.getAbsolutePath();
    }

    @Override // defpackage.jcv
    public final jcv a(String str) {
        return new jcw(new File(this.a, str));
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.jcv
    public final boolean b() {
        return this.a.mkdirs() || this.a.isDirectory();
    }
}
