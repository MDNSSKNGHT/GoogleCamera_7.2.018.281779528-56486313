package defpackage;

/* compiled from: PG */
/* renamed from: jfa  reason: default package */
/* loaded from: classes.dex */
public enum jfa {
    NORMAL(1),
    HEAT_LIGHT(7),
    HEAT_MODERATE(8),
    HEAT_SEVERE(2),
    HEAT_CRITICAL(3),
    HEAT_EMERGENCY(4),
    HEAT_SHUTDOWN(9),
    UNKNOWN(5),
    COLD(6);
    
    public final int j;

    jfa(int i) {
        this.j = i;
    }
}