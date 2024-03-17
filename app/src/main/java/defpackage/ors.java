package defpackage;

import android.net.wifi.WifiConfiguration;

/* compiled from: PG */
/* renamed from: ors  reason: default package */
/* loaded from: classes.dex */
final class ors implements orr {
    private String a = "";
    private String b = "";
    private orp c = orp.OPEN;
    private Boolean d = false;

    @Override // defpackage.orr
    public final WifiConfiguration a() throws orq {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        String str = this.a;
        if (a(str, 1, 32)) {
            wifiConfiguration.SSID = c(str);
            orp orpVar = orp.OPEN;
            int ordinal = this.c.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    String[] strArr = wifiConfiguration.wepKeys;
                    String str2 = this.b;
                    int length = str2.length();
                    if (length != 0) {
                        if (length != 5) {
                            if (length != 10) {
                                if (length != 13 && length != 16) {
                                    if (length != 26) {
                                        if (length != 29) {
                                            if (length != 32 && length != 58) {
                                                throw orq.a(4, "Invalid WEP password %s. %s", str2, "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.");
                                            }
                                        }
                                    }
                                }
                            }
                            if (!d(str2)) {
                                throw orq.a(4, "WEP password %s is not a hex string, but has a length such that it must be one. %s", str2, "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.");
                            }
                            strArr[0] = str2;
                            wifiConfiguration.allowedKeyManagement.set(0);
                            wifiConfiguration.allowedProtocols.set(1);
                            wifiConfiguration.allowedProtocols.set(0);
                            wifiConfiguration.allowedAuthAlgorithms.set(0);
                            wifiConfiguration.allowedAuthAlgorithms.set(1);
                            wifiConfiguration.allowedPairwiseCiphers.set(2);
                            wifiConfiguration.allowedPairwiseCiphers.set(1);
                            wifiConfiguration.allowedGroupCiphers.set(0);
                            wifiConfiguration.allowedGroupCiphers.set(1);
                            wifiConfiguration.wepTxKeyIndex = 0;
                        }
                        str2 = c(str2);
                        strArr[0] = str2;
                        wifiConfiguration.allowedKeyManagement.set(0);
                        wifiConfiguration.allowedProtocols.set(1);
                        wifiConfiguration.allowedProtocols.set(0);
                        wifiConfiguration.allowedAuthAlgorithms.set(0);
                        wifiConfiguration.allowedAuthAlgorithms.set(1);
                        wifiConfiguration.allowedPairwiseCiphers.set(2);
                        wifiConfiguration.allowedPairwiseCiphers.set(1);
                        wifiConfiguration.allowedGroupCiphers.set(0);
                        wifiConfiguration.allowedGroupCiphers.set(1);
                        wifiConfiguration.wepTxKeyIndex = 0;
                    } else {
                        throw orq.a(3, "No WEP password was specified", new Object[0]);
                    }
                } else if (ordinal == 2) {
                    String str3 = this.b;
                    if (str3.isEmpty()) {
                        throw orq.a(3, "No WPA PSK was specified", new Object[0]);
                    }
                    if (a(str3, 8, 63)) {
                        str3 = c(str3);
                    } else if (str3.length() == 64) {
                        if (!d(str3)) {
                            throw orq.a(4, "WPA PSK %s is 64 chars, which means it must be hex; but it was not", str3);
                        }
                    } else {
                        throw orq.a(4, "WPA PSK %s has an invalid length. %s", str3, "WPA PSKs must be 8-63 ASCII characters, or exactly 64 hex characters");
                    }
                    wifiConfiguration.preSharedKey = str3;
                    wifiConfiguration.allowedProtocols.set(1);
                    wifiConfiguration.allowedProtocols.set(0);
                    wifiConfiguration.allowedKeyManagement.set(1);
                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                    wifiConfiguration.allowedGroupCiphers.set(0);
                    wifiConfiguration.allowedGroupCiphers.set(1);
                    wifiConfiguration.allowedGroupCiphers.set(3);
                    wifiConfiguration.allowedGroupCiphers.set(2);
                }
            } else if (!this.b.isEmpty()) {
                throw orq.a(2, "Open WiFi network should not have a password specified", new Object[0]);
            } else {
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedAuthAlgorithms.clear();
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedGroupCiphers.set(2);
            }
            wifiConfiguration.hiddenSSID = this.d.booleanValue();
            return wifiConfiguration;
        }
        throw orq.a(1, "SSID must have a length of 1-32 chars. SSID is: %s", str);
    }

    private static boolean d(String str) {
        char[] charArray;
        for (char c : str.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    private static String c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }

    private static boolean a(String str, int i, int i2) {
        return str.length() >= i && str.length() <= i2;
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a("ssid", this.a);
        e.a("password", this.b);
        e.a("encryption", this.c);
        return e.toString();
    }

    @Override // defpackage.orr
    public final orr a(orp orpVar) {
        this.c = orpVar;
        return this;
    }

    @Override // defpackage.orr
    public final orr a(Boolean bool) {
        this.d = bool;
        return this;
    }

    @Override // defpackage.orr
    public final orr b(String str) {
        this.b = pkb.b(str);
        return this;
    }

    @Override // defpackage.orr
    public final orr a(String str) {
        this.a = pkb.b(str);
        return this;
    }
}