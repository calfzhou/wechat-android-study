package com.android.internal.telephony;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class SmsRawData$1
  implements Parcelable.Creator
{
  public SmsRawData createFromParcel(Parcel paramParcel)
  {
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(arrayOfByte);
    return new SmsRawData(arrayOfByte);
  }

  public SmsRawData[] newArray(int paramInt)
  {
    return new SmsRawData[paramInt];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.SmsRawData.1
 * JD-Core Version:    0.6.2
 */