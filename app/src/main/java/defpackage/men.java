package defpackage;

/* compiled from: PG */
/* renamed from: men  reason: default package */
/* loaded from: classes.dex */
public enum men {
    AAC("audio/mp4a-latm"),
    AMR_NB("audio/amr-wb"),
    AMR_WB("audio/3gpp"),
    VORBIS("audio/vorbis");
    
    public final String e;

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }

    men(String str) {
        this.e = str;
    }
}