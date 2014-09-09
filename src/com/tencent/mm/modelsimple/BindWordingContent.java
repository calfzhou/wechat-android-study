package com.tencent.mm.modelsimple;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BindWordingContent
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new a();
  public String content = "";
  public Integer dBZ = Integer.valueOf(0);
  public String title = "";

  public BindWordingContent(Parcel paramParcel)
  {
    String[] arrayOfString = new String[2];
    paramParcel.readStringArray(arrayOfString);
    this.title = arrayOfString[0];
    this.content = arrayOfString[1];
    this.dBZ = Integer.valueOf(paramParcel.readInt());
  }

  public BindWordingContent(String paramString1, String paramString2)
  {
    this.title = paramString1;
    this.content = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = this.title;
    arrayOfString[1] = this.content;
    paramParcel.writeStringArray(arrayOfString);
    paramParcel.writeInt(this.dBZ.intValue());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.BindWordingContent
 * JD-Core Version:    0.6.2
 */