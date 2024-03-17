package defpackage;

/* compiled from: PG */
/* renamed from: orq  reason: default package */
/* loaded from: classes.dex */
public final class orq extends Exception {
    public final int a;

    private orq(int i, String str) {
        super(str);
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static orq a(int i, String str, Object... objArr) {
        String str2;
        Object[] objArr2 = new Object[2];
        if (i == 1) {
            str2 = "SSID_LENGTH_INVALID";
        } else if (i != 2) {
            str2 = i != 3 ? "PASSWORD_LENGTH_INVALID" : "SECURE_NETWORK_BUT_MISSING_PASSWORD";
        } else {
            str2 = "OPEN_NETWORK_HAS_PASSWORD";
        }
        objArr2[0] = str2;
        objArr2[1] = String.format(str, objArr);
        return new orq(i, String.format("Reason: %s. Additional details: %s", objArr2));
    }
}