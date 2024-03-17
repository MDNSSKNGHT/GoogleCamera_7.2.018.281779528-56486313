package defpackage;

/* compiled from: PG */
/* renamed from: mka  reason: default package */
/* loaded from: classes.dex */
public abstract class mka {
    public final String a;
    public final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public mka() {
        this("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract mkb a(String str);

    public boolean a(String str, int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mka(String str) {
        this.a = str;
        this.b = 23 - str.length();
    }
}