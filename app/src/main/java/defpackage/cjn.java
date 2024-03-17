package defpackage;

/* compiled from: PG */
/* renamed from: cjn  reason: default package */
/* loaded from: classes.dex */
public enum cjn {
    ENG,
    FISHFOOD,
    DOGFOOD,
    RELEASE;

    public final boolean a(cjn cjnVar) {
        return ordinal() > cjnVar.ordinal();
    }
}