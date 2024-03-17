package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: maw  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public final class maw {
    public static int a(int i, boolean z) {
        int i2 = i - 1;
        if (i2 == 3) {
            return !z ? 2131952102 : 2131952100;
        } else if (i2 == 5) {
            return !z ? 2131952099 : 2131952101;
        } else if (i2 != 7) {
            if (i2 != 9) {
                return i2 != 11 ? -1 : 2131952097;
            }
            return 2131952096;
        } else {
            return 2131952098;
        }
    }

    public static int b(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 3 || i2 == 5) {
                return 3;
            }
            if (i2 != 7) {
                if (i2 != 9) {
                    return i2 != 11 ? 2 : 6;
                }
                return 5;
            }
            return 4;
        }
        return 7;
    }

    public static String a(int i, Context context) {
        int i2 = i - 1;
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 7) {
                    if (i2 != 9) {
                        return i2 != 11 ? "" : context.getString(2131951664);
                    }
                    return context.getString(2131951663);
                }
                return context.getString(2131951665);
            }
            return context.getString(2131951666);
        }
        return context.getString(2131951669);
    }

    public static String a(int i, Context context, boolean z) {
        int a = a(i, z);
        return a == -1 ? "" : context.getString(a);
    }

    public static Status a(int i) {
        String str;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            default:
                str = okq.a(i);
                break;
        }
        return new Status(i, str);
    }

    public static void a(qpp qppVar, miz mizVar) {
        a(qppVar, mizVar, qot.INSTANCE);
    }

    public static void a(qpp qppVar, miz mizVar, Executor executor) {
        rgk.a(qppVar, new mat(mizVar), executor);
    }

    /*public static qpp a(qpp qppVar, qpp qppVar2, mjg mjgVar) {
        mav mavVar = new mav(mjgVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(qppVar);
        arrayList.add(qppVar2);
        return qob.a(rgk.a(arrayList), new maq(mavVar), qot.INSTANCE);
    }*/

    /*public static qpp a(qpp qppVar, qpp qppVar2, mau mauVar, Executor executor) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(qppVar);
        arrayList.add(qppVar2);
        return qob.a(rgk.a(arrayList), new mar(mauVar), executor);
    }*/

    public static Object a(qpp qppVar) {
        Object obj;
        if (!qppVar.isDone() || qppVar.isCancelled()) {
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = qppVar.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (ExecutionException e2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return null;
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
}