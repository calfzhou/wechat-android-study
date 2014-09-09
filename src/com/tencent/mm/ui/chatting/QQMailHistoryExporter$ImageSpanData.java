package com.tencent.mm.ui.chatting;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class QQMailHistoryExporter$ImageSpanData
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new mx();
  int dnz;
  int jvm;
  String path;
  private int thumbnail = 0;

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.dnz);
    paramParcel.writeInt(this.jvm);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.thumbnail);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.QQMailHistoryExporter.ImageSpanData
 * JD-Core Version:    0.6.2
 */