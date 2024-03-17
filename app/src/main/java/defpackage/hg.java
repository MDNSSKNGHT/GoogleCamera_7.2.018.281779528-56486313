package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public final class hg {
    public static final id a = new id(16);
    private static final hm d = new hm("fonts");
    public static final Object b = new Object();
    public static final ip c = new ip();
    private static final Comparator<byte[]> e = new hc();

    static hf a(Context context, gy gyVar, int i) {
        hd hdVar = null;
        Cursor cursor;
        int i2 = 0;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = gyVar.a;
            int i3 = 0;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (!resolveContentProvider.packageName.equals(gyVar.b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + gyVar.b);
            } else {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                for (int i4 = 0; i4 < signatureArr.length; i4++) {
                    arrayList.add(signatureArr[i].toByteArray());
                }
                Collections.sort(arrayList, e);
                List<Collection<byte[]>> list = gyVar.d;
                if (list == null) {
                    list = gf.a(resources, i3);
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList<byte[]> arrayList2 = new ArrayList<>(list.get(i5));
                    Collections.sort(arrayList2, e);
                    if (arrayList.size() == arrayList2.size()) {
                        while (i2 < arrayList.size()) {
                            i2 = Arrays.equals(arrayList.get(i2), arrayList2.get(i2)) ? i2 + 1 : 0;
                        }
                        break;
                    }
                    i5++;
                }
                if (resolveContentProvider != null) {
                    String str2 = resolveContentProvider.authority;
                    ArrayList<he> arrayList3 = new ArrayList<>();
                    Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                    Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                    try {
                        int i6 = Build.VERSION.SDK_INT;
                        cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{gyVar.c}, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.getCount() > 0) {
                                    int columnIndex = cursor.getColumnIndex("result_code");
                                    arrayList3 = new ArrayList<>();
                                    int columnIndex2 = cursor.getColumnIndex("_id");
                                    int columnIndex3 = cursor.getColumnIndex("file_id");
                                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                                    while (cursor.moveToNext()) {
                                        if (columnIndex != -1) {
                                            cursor.getInt(columnIndex);
                                        }
                                        arrayList3.add(new he(columnIndex3 != -1 ? ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)) : ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1));
                                    }
                                }
                            } catch (Throwable th) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        hdVar = new hd(0, arrayList3.toArray(new he[0]));
                    } catch (Throwable th2) {
                        cursor = null;
                    }
                } else {
                    hdVar = new hd(1, null);
                }
                if (hdVar.a == 0) {
                    he[] heVarArr = hdVar.b;
                    id idVar = gm.a;
                    ContentResolver contentResolver = context.getContentResolver();
                    FontFamily.Builder builder = null;
                    for (he heVar : heVarArr) {
                        try {
                            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(heVar.a, "r", null);
                            if (openFileDescriptor != null) {
                                Font build3 = new Font.Builder(openFileDescriptor).setWeight(heVar.c).setSlant(heVar.d ? FontStyle.FONT_SLANT_ITALIC : FontStyle.FONT_SLANT_UPRIGHT).setTtcIndex(heVar.b).build();
                                if (builder != null) {
                                    builder.addFont(build3);
                                } else {
                                    builder = new FontFamily.Builder(build3);
                                }
                                try {
                                    openFileDescriptor.close();
                                } catch (IOException e2) {
                                }
                            }
                        } catch (IOException e3) {
                        }
                    }
                    Typeface build4 = builder != null ? new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) == 0 ? 400 : 700, (i & 2) == 0 ? FontStyle.FONT_SLANT_UPRIGHT : FontStyle.FONT_SLANT_ITALIC)).build() : null;
                    return new hf(build4, build4 != null ? 0 : -3);
                }
                return new hf(null, -2);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            return new hf(null, -1);
        }
    }

    public static Typeface a(Context context, gy gyVar, gi giVar, boolean z, int i, int i2) {
        Object obj;
        String str = gyVar.e + "-" + i2;
        Typeface typeface = (Typeface) a.a(str);
        if (typeface == null) {
            if (!z || i != -1) {
                gz gzVar = new gz(context, gyVar, i2, str);
                if (z) {
                    try {
                        hm hmVar = d;
                        ReentrantLock reentrantLock = new ReentrantLock();
                        Condition newCondition = reentrantLock.newCondition();
                        AtomicReference atomicReference = new AtomicReference();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        hmVar.a(new hk(atomicReference, gzVar, reentrantLock, atomicBoolean, newCondition));
                        reentrantLock.lock();
                        if (atomicBoolean.get()) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                            while (true) {
                                try {
                                    nanos = newCondition.awaitNanos(nanos);
                                } catch (InterruptedException e2) {
                                }
                                if (!atomicBoolean.get()) {
                                    obj = atomicReference.get();
                                    break;
                                } else if (nanos <= 0) {
                                    throw new InterruptedException("timeout");
                                }
                            }
                        } else {
                            obj = atomicReference.get();
                        }
                        reentrantLock.unlock();
                        return ((hf) obj).a;
                    } catch (InterruptedException e3) {
                        return null;
                    }
                }
                ha haVar = giVar != null ? new ha(giVar) : null;
                synchronized (b) {
                    ArrayList arrayList = (ArrayList) c.get(str);
                    if (arrayList != null) {
                        if (haVar != null) {
                            arrayList.add(haVar);
                        }
                        return null;
                    }
                    if (haVar != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(haVar);
                        c.put(str, arrayList2);
                    }
                    d.a(new hj(gzVar, new Handler(), new hb(str)));
                    return null;
                }
            }
            hf a2 = a(context, gyVar, i2);
            if (giVar != null) {
                int i3 = a2.b;
                if (i3 == 0) {
                    giVar.b(a2.a);
                } else {
                    giVar.a(i3);
                }
            }
            return a2.a;
        }
        if (giVar != null) {
            giVar.a(typeface);
        }
        return typeface;
    }
}
