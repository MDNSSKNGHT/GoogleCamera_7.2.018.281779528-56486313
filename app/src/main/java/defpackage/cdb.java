package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: cdb  reason: default package */
/* loaded from: classes.dex */
public final class cdb {
    private final jcv a;

    public cdb(jcv jcvVar) {
        this.a = jcvVar;
    }

    public final void a() {
        File[] listFiles = this.a.a().listFiles(new cda());
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.length() == 0) {
                    file.delete();
                }
            }
        }
    }
}