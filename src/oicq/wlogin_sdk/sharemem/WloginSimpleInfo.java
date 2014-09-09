package oicq.wlogin_sdk.sharemem;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class WloginSimpleInfo
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator CREATOR = new c();
  public long kja;
  public byte[] kkw;
  public byte[] kkx;
  public byte[] kky;
  public byte[] kkz;

  public WloginSimpleInfo()
  {
    this.kja = 0L;
    this.kkw = new byte[0];
    this.kkx = new byte[0];
    this.kky = new byte[0];
    this.kkz = new byte[0];
  }

  public WloginSimpleInfo(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4)
  {
    this.kja = paramLong;
    this.kkw = ((byte[])paramArrayOfByte1.clone());
    this.kkx = ((byte[])paramArrayOfByte2.clone());
    this.kky = ((byte[])paramArrayOfByte3.clone());
    this.kkz = ((byte[])paramArrayOfByte4.clone());
  }

  private WloginSimpleInfo(Parcel paramParcel)
  {
    this.kja = paramParcel.readLong();
    this.kkw = paramParcel.createByteArray();
    this.kkx = paramParcel.createByteArray();
    this.kky = paramParcel.createByteArray();
    this.kkz = paramParcel.createByteArray();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.kja);
    paramParcel.writeByteArray(this.kkw);
    paramParcel.writeByteArray(this.kkx);
    paramParcel.writeByteArray(this.kky);
    paramParcel.writeByteArray(this.kkz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.sharemem.WloginSimpleInfo
 * JD-Core Version:    0.6.2
 */