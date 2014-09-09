package com.tencent.mm.modelgeo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.ch;

public class Addr
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new a();
  public String duW;
  public String duX;
  public String duY;
  public String duZ;
  public String dva;
  public String dvb;
  public String dvc;
  public String dvd;
  public String dve;
  public float dvf;
  public float dvg;
  public Object dvh = "";

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "administrative_area_level_1: " + this.duX + " locality:" + this.duZ + " sublocality: " + this.dva + " neighborhood: " + this.dvb + " route: " + this.dvc;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(ch.Y(this.duW, ""));
    paramParcel.writeString(ch.Y(this.duX, ""));
    paramParcel.writeString(ch.Y(this.duY, ""));
    paramParcel.writeString(ch.Y(this.duZ, ""));
    paramParcel.writeString(ch.Y(this.dva, ""));
    paramParcel.writeString(ch.Y(this.dvb, ""));
    paramParcel.writeString(ch.Y(this.dvc, ""));
    paramParcel.writeString(ch.Y(this.dvd, ""));
    paramParcel.writeString(ch.Y(this.dve, ""));
    paramParcel.writeFloat(this.dvf);
    paramParcel.writeFloat(this.dvg);
  }

  public final String xi()
  {
    return ch.Y(this.duZ, "") + ch.Y(this.dva, "") + ch.Y(this.dvb, "") + ch.Y(this.dvc, "") + ch.Y(this.dvd, "");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.Addr
 * JD-Core Version:    0.6.2
 */