package com.tencent.kingkong;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CursorWindow$1
  implements Parcelable.Creator
{
  public CursorWindow createFromParcel(Parcel paramParcel)
  {
    return new CursorWindow(paramParcel, null);
  }

  public CursorWindow[] newArray(int paramInt)
  {
    return new CursorWindow[paramInt];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorWindow.1
 * JD-Core Version:    0.6.2
 */