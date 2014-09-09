package com.tencent.mm.pluginsdk.model.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ReportUtil$ReportArgs
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new az();
  public String ehE;
  public String ehH;
  public int errCode;
  public String hvw;

  public ReportUtil$ReportArgs()
  {
  }

  private ReportUtil$ReportArgs(Parcel paramParcel)
  {
    this.ehH = paramParcel.readString();
    this.errCode = paramParcel.readInt();
    this.hvw = paramParcel.readString();
    this.ehE = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.ehH);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.hvw);
    paramParcel.writeString(this.ehE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs
 * JD-Core Version:    0.6.2
 */