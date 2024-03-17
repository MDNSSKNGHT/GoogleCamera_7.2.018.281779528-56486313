package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ord  reason: default package */
/* loaded from: classes.dex */
public final class ord implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new orc();
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.a;
    }

    public /* synthetic */ ord(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    public ord(String str, long j, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareToIgnoreCase(((ord) obj).a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}