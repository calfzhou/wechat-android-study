package com.tencent.mm.compatible.loader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.compatible.g.t;
import java.io.Serializable;

public class PluginDescription
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator CREATOR = new h();
  public final String cHL;
  public final int dOm;
  public final String name;
  public final int size;
  public final String url;
  public final String version;

  protected PluginDescription(Parcel paramParcel)
  {
    this.name = ((String)t.M(paramParcel.readString()));
    this.url = ((String)t.M(paramParcel.readString()));
    this.cHL = ((String)t.M(paramParcel.readString()));
    this.version = ((String)t.M(paramParcel.readString()));
    this.size = paramParcel.readInt();
    this.dOm = paramParcel.readInt();
  }

  private PluginDescription(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    this.name = ((String)t.M(paramString1));
    this.url = ((String)t.M(paramString2));
    this.cHL = ((String)t.M(paramString3));
    this.version = ((String)t.M(paramString4));
    this.size = paramInt1;
    this.dOm = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.name;
    arrayOfObject[1] = this.url;
    arrayOfObject[2] = this.cHL;
    arrayOfObject[3] = this.version;
    arrayOfObject[4] = Integer.valueOf(this.size);
    arrayOfObject[5] = Integer.valueOf(this.dOm);
    return String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.cHL);
    paramParcel.writeString(this.version);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.dOm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.PluginDescription
 * JD-Core Version:    0.6.2
 */