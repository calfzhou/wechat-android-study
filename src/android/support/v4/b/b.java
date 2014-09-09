package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator
{
  final c dn;

  public b(c paramc)
  {
    this.dn = paramc;
  }

  public final Object createFromParcel(Parcel paramParcel)
  {
    return this.dn.createFromParcel(paramParcel, null);
  }

  public final Object[] newArray(int paramInt)
  {
    return this.dn.newArray(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.b.b
 * JD-Core Version:    0.6.2
 */