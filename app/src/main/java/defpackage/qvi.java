package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: qvi */
/* loaded from: classes2.dex */
public class qvi extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public qvi(String str) {
        super(str);
    }

    public static qvi e() {
        return new qvi("Protocol message end-group tag did not match expected tag.");
    }

    public static qvi d() {
        return new qvi("Protocol message contained an invalid tag (zero).");
    }

    public static qvi i() {
        return new qvi("Protocol message had invalid UTF-8.");
    }

    public static qvh f() {
        return new qvh("Protocol message tag had invalid wire type.");
    }

    public static qvi c() {
        return new qvi("CodedInputStream encountered a malformed varint.");
    }

    public static qvi b() {
        return new qvi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static qvi h() {
        return new qvi("Failed to parse the message.");
    }

    public static qvi g() {
        return new qvi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static qvi a() {
        return new qvi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}