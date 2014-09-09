package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ah extends Binder
  implements ag
{
  public ah()
  {
    attachInterface(this, "com.tencent.mm.network.IOnNetworkChange_AIDL");
  }

  public static ag f(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof ag)))
      return (ag)localIInterface;
    return new ai(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.network.IOnNetworkChange_AIDL");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    aW(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ah
 * JD-Core Version:    0.6.2
 */