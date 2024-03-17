package defpackage;

/* compiled from: PG */
/* renamed from: kod  reason: default package */
/* loaded from: classes.dex */
public final class kod implements Comparable {
    private final int[] a;

    public kod(String str) {
        int length;
        String[] split = str.split("\\.");
        if (split != null && (length = split.length) >= 2) {
            this.a = new int[length];
            for (int i = 0; i < split.length; i++) {
                try {
                    this.a[i] = Integer.parseInt(split[i]);
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unrecognized version name is found: ") : "Unrecognized version name is found: ".concat(valueOf));
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unrecognized version name is found: ") : "Unrecognized version name is found: ".concat(valueOf2));
    }

    public final int a(kod kodVar) {
        int length;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            int[] iArr2 = kodVar.a;
            if (i >= iArr2.length) {
                break;
            }
            int i2 = iArr[i];
            int i3 = iArr2[i];
            if (i2 > i3) {
                return 1;
            }
            if (i2 < i3) {
                return -1;
            }
            i++;
        }
        int length2 = kodVar.a.length;
        if (length < length2) {
            while (true) {
                int[] iArr3 = kodVar.a;
                if (length >= iArr3.length) {
                    break;
                }
                int i4 = iArr3[length];
                if (i4 > 0) {
                    return 1;
                }
                if (i4 < 0) {
                    return -1;
                }
                length++;
            }
        } else {
            while (true) {
                int[] iArr4 = this.a;
                if (length2 >= iArr4.length) {
                    break;
                }
                int i5 = iArr4[length2];
                if (i5 > 0) {
                    return 1;
                }
                if (i5 < 0) {
                    return -1;
                }
                length2++;
            }
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((kod) obj);
    }
}
