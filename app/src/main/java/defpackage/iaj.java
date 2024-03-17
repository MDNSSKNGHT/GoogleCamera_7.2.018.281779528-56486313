package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* renamed from: iaj  reason: default package */
/* loaded from: classes.dex */
public abstract class iaj implements iah {
    public final iaf a;
    public final Object b;

    public iaj() {
        qdu.c(true);
        this.b = new Object();
        this.a = new iaf();
    }

    protected abstract Object a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.iah
    public final iag c(Object obj) {
        Object obj2;
        synchronized (this.b) {
            iaf iafVar = this.a;
            qdu.d(obj);
            synchronized (iafVar.a) {
                if (iafVar.b.removeLastOccurrence(obj)) {
                    obj2 = ((Queue) qdu.d((Object) ((Queue) iafVar.c.get(obj)))).remove();
                    int i = iafVar.d;
                    iaf.a();
                    iafVar.d = i - 1;
                } else {
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            obj2 = a(obj);
        }
        return new iai(this, obj, obj2);
    }
}