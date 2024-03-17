package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: hh  reason: default package */
/* loaded from: classes.dex */
final class hh implements Handler.Callback {
    private final /* synthetic */ hm a;

    public hh(hm hmVar) {
        this.a = hmVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            hm hmVar = this.a;
            synchronized (hmVar.a) {
                if (!hmVar.c.hasMessages(1)) {
                    hmVar.b.quit();
                    hmVar.b = null;
                    hmVar.c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            hm hmVar2 = this.a;
            ((Runnable) message.obj).run();
            synchronized (hmVar2.a) {
                hmVar2.c.removeMessages(0);
                Handler handler = hmVar2.c;
                handler.sendMessageDelayed(handler.obtainMessage(0), hmVar2.d);
            }
            return true;
        }
    }
}