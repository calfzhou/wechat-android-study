package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p extends Binder
  implements o
{
  public p()
  {
    attachInterface(this, "com.tencent.mm.network.IAccInfo_AIDL");
  }

  public static o b(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof o)))
      return (o)localIInterface;
    return new q(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.network.IAccInfo_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      reset();
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      l(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      e(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      y(paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      String str4 = getUsername();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      String str3 = getPassword();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      String str2 = tL();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      String str1 = qL();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      byte[] arrayOfByte2 = tC();
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte2);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      int j = oD();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      boolean bool = CS();
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 12:
      paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
      g(paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 13:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
    byte[] arrayOfByte1 = jl(paramParcel1.readString());
    paramParcel2.writeNoException();
    paramParcel2.writeByteArray(arrayOfByte1);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.p
 * JD-Core Version:    0.6.2
 */