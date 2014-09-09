package com.android.internal.telephony;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SmsRawData
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new SmsRawData.1();
  byte[] data;

  public SmsRawData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }

  public int describeContents()
  {
    return 0;
  }

  public byte[] getBytes()
  {
    return this.data;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.data.length);
    paramParcel.writeByteArray(this.data);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.SmsRawData
 * JD-Core Version:    0.6.2
 */