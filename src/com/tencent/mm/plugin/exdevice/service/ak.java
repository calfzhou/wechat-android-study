package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ak extends Binder
  implements aj
{
  public ak()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
  }

  public static aj n(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof aj)))
      return (aj)localIInterface;
    return new al(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      ag localag = PK();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localag != null)
        localIBinder2 = localag.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
    ac localac = PL();
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (localac != null)
      localIBinder1 = localac.asBinder();
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ak
 * JD-Core Version:    0.6.2
 */