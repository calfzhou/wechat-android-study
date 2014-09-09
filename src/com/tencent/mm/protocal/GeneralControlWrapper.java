package com.tencent.mm.protocal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.a.jk;
import com.tencent.mm.sdk.platformtools.z;

public class GeneralControlWrapper
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new b();
  public static final GeneralControlWrapper hNd = new GeneralControlWrapper(10);
  public static final GeneralControlWrapper hNe = new GeneralControlWrapper(1);
  private int hNf;

  public GeneralControlWrapper(int paramInt)
  {
    this.hNf = paramInt;
    z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "edw <init>, " + this);
  }

  private GeneralControlWrapper(Parcel paramParcel)
  {
    this.hNf = paramParcel.readInt();
  }

  public GeneralControlWrapper(jk paramjk)
  {
    this.hNf = paramjk.iak;
    z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "edw <init>, " + this);
  }

  public final boolean aFu()
  {
    if ((0x1 & this.hNf) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "needShowInputAlertTips, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFv()
  {
    if ((0x8 & this.hNf) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "allowOuterOpenUrl, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFw()
  {
    if ((0x10 & this.hNf) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "allowExpose, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFx()
  {
    if ((0x2 & this.hNf) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpKLtvWkVeLEdBxnptfdvzppfqKdCoJESPk=", "allowInnerOpenUrl, ret = " + bool);
      return bool;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[bitset=0x");
    localStringBuilder.append(Integer.toHexString(this.hNf));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.hNf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.GeneralControlWrapper
 * JD-Core Version:    0.6.2
 */