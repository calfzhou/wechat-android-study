package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d
  implements Parcelable.ClassLoaderCreator
{
  private final c dn;

  public d(c paramc)
  {
    this.dn = paramc;
  }

  public final Object createFromParcel(Parcel paramParcel)
  {
    return this.dn.createFromParcel(paramParcel, null);
  }

  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.dn.createFromParcel(paramParcel, paramClassLoader);
  }

  public final Object[] newArray(int paramInt)
  {
    return this.dn.newArray(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.b.d
 * JD-Core Version:    0.6.2
 */