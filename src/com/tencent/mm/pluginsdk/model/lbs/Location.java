package com.tencent.mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.z;

public class Location
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new a();
  public int accuracy;
  public int cLo;
  public String cLq;
  public float dvf;
  public float dvg;
  public String mac;

  public Location()
  {
  }

  public Location(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this.dvf = paramFloat1;
    this.dvg = paramFloat2;
    this.accuracy = paramInt1;
    this.cLo = paramInt2;
    this.mac = paramString1;
    this.cLq = paramString2;
  }

  public final boolean azr()
  {
    if ((this.dvf == -1000.0F) || (this.dvg == -1000.0F))
    {
      z.d("!32@/B4Tb64lLpJgSt8Yezr5cT1sn628jl3w", "mac and cellId is null");
      return true;
    }
    return false;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.dvf);
    paramParcel.writeFloat(this.dvg);
    paramParcel.writeInt(this.accuracy);
    paramParcel.writeInt(this.cLo);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.cLq);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.lbs.Location
 * JD-Core Version:    0.6.2
 */