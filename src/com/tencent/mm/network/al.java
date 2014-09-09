package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.f;

public abstract class al extends Binder
  implements ak
{
  public al()
  {
    attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
  }

  public static ak g(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof ak)))
      return (ak)localIInterface;
    return new am(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.network.IReqResp_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      int k = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      String str = getUri();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      f localf = tO();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localf != null)
        localIBinder2 = localf.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      c localc = tN();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localc != null)
        localIBinder1 = localc.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      a(p.b(paramParcel1.readStrongBinder()), z.e(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      boolean bool = tm();
      paramParcel2.writeNoException();
      if (bool);
      for (int j = 1; ; j = 0)
      {
        paramParcel2.writeInt(j);
        return true;
      }
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      int i = tl();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      fp(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      a(p.b(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
    b(p.b(paramParcel1.readStrongBinder()), z.e(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.al
 * JD-Core Version:    0.6.2
 */