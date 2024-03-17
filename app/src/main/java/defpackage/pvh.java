package defpackage;

/* compiled from: PG */
/* renamed from: pvh  reason: default package */
/* loaded from: classes.dex */
public final class pvh extends prx {
    public static final prx a = new pvh(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient int b;
    private final transient Object c;
    private final transient Object[] d;

    @Override // defpackage.prx
    public final boolean e() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.b;
    }

    private pvh(Object obj, Object[] objArr, int i) {
        this.c = obj;
        this.d = objArr;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pvh a(int i, Object[] objArr) {
        if (i == 0) {
            return (pvh) a;
        }
        if (i != 1) {
            qdu.c(i, objArr.length >> 1);
            return new pvh(a(objArr, i, psl.b(i), 0), objArr, i);
        }
        qdu.b(objArr[0], objArr[1]);
        return new pvh(null, objArr, 1);
    }

    @Override // defpackage.prx
    public final psl g() {
        return new pve(this, this.d, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 == r0) goto Lbb
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L45
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L10:
            if (r2 >= r10) goto L44
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.qdu.b(r3, r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.qdu.c(r5)
        L26:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L34
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L10
        L34:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L3f
            int r5 = r5 + 1
            goto L26
        L3f:
            java.lang.IllegalArgumentException r9 = a(r3, r4, r9, r6)
            throw r9
        L44:
            return r11
        L45:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 <= r1) goto L80
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L4f:
            if (r2 >= r10) goto L7f
            int r1 = r2 + r2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            defpackage.qdu.b(r4, r5)
            int r6 = r4.hashCode()
            int r6 = defpackage.qdu.c(r6)
        L65:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 == r3) goto L7a
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L75
            int r6 = r6 + 1
            goto L65
        L75:
            java.lang.IllegalArgumentException r9 = a(r4, r5, r9, r7)
            throw r9
        L7a:
            r11[r6] = r1
            int r2 = r2 + 1
            goto L4f
        L7f:
            return r11
        L80:
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L85:
            if (r2 >= r10) goto Lba
            int r1 = r2 + r2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            defpackage.qdu.b(r3, r4)
            int r5 = r3.hashCode()
            int r5 = defpackage.qdu.c(r5)
        L9b:
            r5 = r5 & r0
            short r6 = r11[r5]
            char r6 = (char) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 != r7) goto Laa
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L85
        Laa:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto Lb5
            int r5 = r5 + 1
            goto L9b
        Lb5:
            java.lang.IllegalArgumentException r9 = a(r3, r4, r9, r6)
            throw r9
        Lba:
            return r11
        Lbb:
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            defpackage.qdu.b(r10, r9)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvh.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // defpackage.prx
    public final psl f() {
        return new pvf(this, new pvg(this.d, 0, this.b));
    }

    @Override // defpackage.prx
    public final prg c() {
        return new pvg(this.d, 1, this.b);
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.prx, java.util.Map
    public final Object get(Object obj) {
        return a(this.c, this.d, this.b, 0, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                if (objArr[i2].equals(obj2)) {
                    return objArr[i2 ^ 1];
                }
                return null;
            } else if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int c = qdu.c(obj2.hashCode());
                    while (true) {
                        int i3 = c & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 == 255) {
                            return null;
                        }
                        if (objArr[i4].equals(obj2)) {
                            return objArr[i4 ^ 1];
                        }
                        c = i3 + 1;
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int c2 = qdu.c(obj2.hashCode());
                    while (true) {
                        int i5 = c2 & length2;
                        char c3 = (char) sArr[i5];
                        if (c3 == 65535) {
                            return null;
                        }
                        if (objArr[c3].equals(obj2)) {
                            return objArr[c3 ^ 1];
                        }
                        c2 = i5 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int c4 = qdu.c(obj2.hashCode());
                    while (true) {
                        int i6 = c4 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        } else if (objArr[i7].equals(obj2)) {
                            return objArr[i7 ^ 1];
                        } else {
                            c4 = i6 + 1;
                        }
                    }
                }
            }
        }
        return null;
    }
}