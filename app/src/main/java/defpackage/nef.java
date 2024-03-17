package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: nef  reason: default package */
/* loaded from: classes.dex */
public enum nef {
    DNG("image/x-adobe-dng", ".dng"),
    GIF("image/gif", ".gif"),
    JPEG("image/jpeg", ".jpg"),
    PHOTOSPHERE("application/vnd.google.panorama360+jpg", ".jpg"),
    MPEG4("video/mp4", ".mp4"),
    THREE_GPP("video/3gpp", ".3gp"),
    WEBM("video/webm", ".webm"),
    OTHER;
    
    public static final Set h = psl.a(DNG, GIF, JPEG, PHOTOSPHERE);
    public static final Set i = psl.b(MPEG4, THREE_GPP);
    private static final Map m;
    public final String j;
    public final String k;

    static {
        prt prtVar = new prt();
        for (nef nefVar : values()) {
            prtVar.a(nefVar.j, nefVar);
        }
        m = prtVar.a();
    }

    nef() {
        this.j = "";
        this.k = "";
    }

    nef(String str, String str2) {
        this.j = str;
        this.k = str2;
    }

    public static nef a(String str) {
        return m.containsKey(str) ? (nef) m.get(str) : OTHER;
    }
}