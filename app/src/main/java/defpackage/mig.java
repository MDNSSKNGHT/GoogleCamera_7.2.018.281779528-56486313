package defpackage;

/* compiled from: PG */
/* renamed from: mig  reason: default package */
/* loaded from: classes.dex */
public final class mig {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CLOSED" : "PAUSED" : "STARTED" : "READY";
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "PAUSED" : "CLOSED" : "STOPPED" : "STARTED" : "READY";
    }

    public static void a(mbe mbeVar, exv exvVar, eyy eyyVar) {
        qdu.d(mbeVar);
        qdu.d(exvVar);
        qdu.d(eyyVar);
        if (mbe.b()) {
            exvVar.a(eyyVar);
        } else {
            mbeVar.execute(new eza(exvVar, eyyVar));
        }
    }

    public static void a(mbe mbeVar, eyj eyjVar, eyy eyyVar) {
        qdu.d(mbeVar);
        qdu.d(eyjVar);
        qdu.d(eyyVar);
        if (mbe.b()) {
            eyjVar.a(eyyVar);
        } else {
            mbeVar.execute(new ezb(eyjVar, eyyVar));
        }
    }
}