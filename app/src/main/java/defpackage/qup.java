package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: qup  reason: default package */
/* loaded from: classes2.dex */
abstract class qup {
    private static final Logger a = Logger.getLogger(que.class.getName());
    private static final String b = "qti";

    protected abstract quj a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static quj a(Class cls) {
        String str;
        ClassLoader classLoader = qup.class.getClassLoader();
        if (!cls.equals(quj.class)) {
            if (!cls.getPackage().equals(qup.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = b;
        }
        try {
            try {
                try {
                    try {
                        return (quj) cls.cast(((qup) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException e5) {
            Iterator it = ServiceLoader.load(qup.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((qup) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() == 0 ? new String("Unable to load ") : "Unable to load ".concat(valueOf), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (quj) arrayList.get(0);
            }
            if (arrayList.size() != 0) {
                try {
                    return (quj) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            }
            return null;
        }
    }
}