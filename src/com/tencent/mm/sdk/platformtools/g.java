package com.tencent.mm.sdk.platformtools;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class g
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new j();
  public float cGl;
  public float idT;

  public g()
  {
    this.cGl = 0.0F;
    this.idT = 0.0F;
  }

  public g(float paramFloat1, float paramFloat2)
  {
    this.cGl = paramFloat1;
    this.idT = paramFloat2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g));
    g localg;
    do
    {
      return false;
      localg = (g)paramObject;
    }
    while ((Math.abs(this.cGl - localg.cGl) >= 1.0E-06F) || (Math.abs(this.idT - localg.idT) >= 1.0E-06F));
    return true;
  }

  public int hashCode()
  {
    return (int)(10000.0F * this.cGl) + (int)(10000.0F * this.idT);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.cGl);
    paramParcel.writeFloat(this.idT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.g
 * JD-Core Version:    0.6.2
 */