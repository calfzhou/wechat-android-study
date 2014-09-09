package com.tencent.mm.network.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class d extends Binder
  implements c
{
  public d()
  {
    attachInterface(this, "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
  }

  public static c h(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof c)))
      return (c)localIInterface;
    return new e(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    String str1 = paramParcel1.readString();
    int k = paramParcel1.readInt();
    String str2 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      a(i, j, str1, k, str2, bool);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.d
 * JD-Core Version:    0.6.2
 */