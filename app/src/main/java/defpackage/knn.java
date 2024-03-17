package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: knn  reason: default package */
/* loaded from: classes.dex */
public final class knn {
    public static /* synthetic */ int a;

    static {
        liu.a("FpsChooser");
    }

    public static Range a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Range range = (Range) it.next();
            if (((Integer) range.getUpper()).intValue() <= i) {
                arrayList.add(range);
            }
        }
        Collections.sort(arrayList, knm.a);
        if (arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("No fps range with upper value at or below ");
            sb.append(i);
            sb.append("fps.");
            throw new UnsupportedOperationException(sb.toString());
        }
        return (Range) arrayList.get(0);
    }
}