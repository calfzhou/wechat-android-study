package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new r();
  final int aA;
  final String aB;
  final boolean aD;
  final boolean aE;
  Bundle ah;
  final Bundle ak;
  final boolean ar;
  final int az;
  final String bO;
  Fragment bP;
  final int mIndex;

  public FragmentState(Parcel paramParcel)
  {
    this.bO = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    boolean bool2;
    boolean bool3;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.ar = bool2;
      this.az = paramParcel.readInt();
      this.aA = paramParcel.readInt();
      this.aB = paramParcel.readString();
      if (paramParcel.readInt() == 0)
        break label110;
      bool3 = bool1;
      label70: this.aE = bool3;
      if (paramParcel.readInt() == 0)
        break label116;
    }
    while (true)
    {
      this.aD = bool1;
      this.ak = paramParcel.readBundle();
      this.ah = paramParcel.readBundle();
      return;
      bool2 = false;
      break;
      label110: bool3 = false;
      break label70;
      label116: bool1 = false;
    }
  }

  public FragmentState(Fragment paramFragment)
  {
    this.bO = paramFragment.getClass().getName();
    this.mIndex = paramFragment.mIndex;
    this.ar = paramFragment.ar;
    this.az = paramFragment.az;
    this.aA = paramFragment.aA;
    this.aB = paramFragment.aB;
    this.aE = paramFragment.aE;
    this.aD = paramFragment.aD;
    this.ak = paramFragment.ak;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.bO);
    paramParcel.writeInt(this.mIndex);
    int j;
    int k;
    if (this.ar)
    {
      j = i;
      paramParcel.writeInt(j);
      paramParcel.writeInt(this.az);
      paramParcel.writeInt(this.aA);
      paramParcel.writeString(this.aB);
      if (!this.aE)
        break label109;
      k = i;
      label68: paramParcel.writeInt(k);
      if (!this.aD)
        break label115;
    }
    while (true)
    {
      paramParcel.writeInt(i);
      paramParcel.writeBundle(this.ak);
      paramParcel.writeBundle(this.ah);
      return;
      j = 0;
      break;
      label109: k = 0;
      break label68;
      label115: i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentState
 * JD-Core Version:    0.6.2
 */