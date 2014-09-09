package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class w extends Binder
  implements v
{
  public w()
  {
    attachInterface(this, "com.tencent.mm.network.INetworkEvent_AIDL");
  }

  public static v d(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof v)))
      return (v)localIInterface;
    return new x(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.network.INetworkEvent_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      int k = CX();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      boolean bool2 = c(ah.f(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      boolean bool1 = d(ah.f(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int i = 0;
      if (bool1)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      CY();
      paramParcel2.writeNoException();
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
    long l = CZ();
    paramParcel2.writeNoException();
    paramParcel2.writeLong(l);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.w
 * JD-Core Version:    0.6.2
 */