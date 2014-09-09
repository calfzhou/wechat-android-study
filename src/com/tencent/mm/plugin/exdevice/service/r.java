package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class r extends Binder
  implements q
{
  public r()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
  }

  public static q i(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof q)))
      return (q)localIInterface;
    return new s(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool8 = a(paramParcel1.readInt(), x.k(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (bool8);
      for (int i4 = 1; ; i4 = 0)
      {
        paramParcel2.writeInt(i4);
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool7 = b(paramParcel1.readInt(), x.k(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int i3 = 0;
      if (bool7)
        i3 = 1;
      paramParcel2.writeInt(i3);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      long[] arrayOfLong = PF();
      paramParcel2.writeNoException();
      paramParcel2.writeLongArray(arrayOfLong);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      long l2 = paramParcel1.readLong();
      int i1 = paramParcel1.readInt();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null)
        localObject = null;
      while (true)
      {
        boolean bool6 = a(l2, i1, (z)localObject);
        paramParcel2.writeNoException();
        int i2 = 0;
        if (bool6)
          i2 = 1;
        paramParcel2.writeInt(i2);
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof z)))
          localObject = (z)localIInterface;
        else
          localObject = new ab(localIBinder);
      }
    case 5:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool5 = au(paramParcel1.readLong());
      paramParcel2.writeNoException();
      int n = 0;
      if (bool5)
        n = 1;
      paramParcel2.writeInt(n);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool4 = aK(paramParcel1.readLong());
      paramParcel2.writeNoException();
      int m = 0;
      if (bool4)
        m = 1;
      paramParcel2.writeInt(m);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      long l1 = a(ak.n(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l1);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool3 = aL(paramParcel1.readLong());
      paramParcel2.writeNoException();
      int k = 0;
      if (bool3)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool2 = a(u.j(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      boolean bool1 = b(u.j(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int i = 0;
      if (bool1)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    case 11:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
    setChannelSessionKey(paramParcel1.readLong(), paramParcel1.createByteArray());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.r
 * JD-Core Version:    0.6.2
 */