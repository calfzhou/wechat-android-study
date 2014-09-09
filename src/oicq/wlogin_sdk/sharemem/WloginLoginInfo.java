package oicq.wlogin_sdk.sharemem;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class WloginLoginInfo
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator CREATOR = new a();
  public static int kkj = 1;
  public static int kkk = 2;
  public long gjM;
  public long kkl;
  public long kkm;
  public String mAccount;
  public int mType;

  private WloginLoginInfo(Parcel paramParcel)
  {
    this.mAccount = paramParcel.readString();
    this.kkl = paramParcel.readLong();
    this.kkm = paramParcel.readLong();
    this.gjM = paramParcel.readLong();
    this.mType = paramParcel.readInt();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mAccount);
    paramParcel.writeLong(this.kkl);
    paramParcel.writeLong(this.kkm);
    paramParcel.writeLong(this.gjM);
    paramParcel.writeInt(this.mType);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.sharemem.WloginLoginInfo
 * JD-Core Version:    0.6.2
 */