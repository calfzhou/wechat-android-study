package com.tencent.mm.pluginsdk.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PayInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new a();
  public String appId;
  public String cDa;
  public String cGy;
  public int dIu;
  public String eYr;
  public int hML = -1;
  public int hMM = 0;
  public boolean hMN = false;
  public boolean hMO;
  public String hMP;
  public String hMQ;
  public String hMR;
  public Bundle hMS;
  public String hjf;
  public String hma;

  public PayInfo()
  {
    this.hMO = true;
  }

  public PayInfo(Parcel paramParcel)
  {
    this.hMO = i;
    this.hMM = paramParcel.readInt();
    this.hjf = paramParcel.readString();
    this.eYr = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.hma = paramParcel.readString();
    this.hMP = paramParcel.readString();
    this.hMQ = paramParcel.readString();
    this.cDa = paramParcel.readString();
    this.cGy = paramParcel.readString();
    this.dIu = paramParcel.readInt();
    this.hML = paramParcel.readInt();
    int j;
    if (paramParcel.readInt() == i)
    {
      j = i;
      this.hMN = j;
      if (paramParcel.readInt() != i)
        break label156;
    }
    while (true)
    {
      this.hMO = i;
      this.hMS = paramParcel.readBundle();
      return;
      j = 0;
      break;
      label156: i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Integer.valueOf(this.hMM);
    arrayOfObject[1] = this.hjf;
    arrayOfObject[2] = this.eYr;
    arrayOfObject[3] = this.appId;
    arrayOfObject[4] = this.hma;
    arrayOfObject[5] = this.hMP;
    arrayOfObject[6] = this.hMQ;
    arrayOfObject[7] = this.cDa;
    return String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s ", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.hMM);
    paramParcel.writeString(this.hjf);
    paramParcel.writeString(this.eYr);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hma);
    paramParcel.writeString(this.hMP);
    paramParcel.writeString(this.hMQ);
    paramParcel.writeString(this.cDa);
    paramParcel.writeString(this.cGy);
    paramParcel.writeInt(this.dIu);
    paramParcel.writeInt(this.hML);
    int j;
    if (this.hMN)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.hMO)
        break label133;
    }
    while (true)
    {
      paramParcel.writeInt(i);
      paramParcel.writeBundle(this.hMS);
      return;
      j = 0;
      break;
      label133: i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.PayInfo
 * JD-Core Version:    0.6.2
 */