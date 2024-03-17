package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class rgk {
    public static int a(byte b) {
        return b & 255;
    }

    public static int a(int i, int i2, int i3) {
        qdu.a(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Executor a(Executor executor, qnx qnxVar) {
        qdu.d(executor);
        qdu.d(qnxVar);
        return executor != qot.INSTANCE ? new qpv(executor, qnxVar) : executor;
    }

    public static void a(qpp qppVar, qpe qpeVar, Executor executor) {
        qdu.d(qpeVar);
        qppVar.a(new qpg(qppVar, qpeVar), executor);
    }

    public static <T> T a(T obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static qps a() {
        return new qpw((byte) 0);
    }

    public static qpp a(Throwable th) {
        qdu.d(th);
        return new qpl(th);
    }

    public static List a(int i) {
        if (i != 0) {
            return new ArrayList(i);
        }
        return Collections.emptyList();
    }

    public static qpp a(qok qokVar, Executor executor) {
        qqo a = qqo.a(qokVar);
        executor.execute(a);
        return a;
    }

    public static qpp a(Iterable iterable) {
        return new qoo(prr.a(iterable), true);
    }

    @SafeVarargs
    public static qpp a(qpp... qppVarArr) {
        return new qoo(prr.a((Object[]) qppVarArr), true);
    }

    public static qpp b(Object obj) {
        return obj != null ? new qpm(obj) : qpm.a;
    }

    public static Object a(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object b(Future future) throws ExecutionException {
        qdu.b(future.isDone(), "Future was expected to be done: %s", future);
        return a(future);
    }

    public static int c(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
