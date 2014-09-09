package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.mm.network.a.d;
import com.tencent.mm.protocal.bf;
import java.util.ArrayList;

public abstract class t extends Binder
  implements s
{
  public t()
  {
    attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
  }

  public static s c(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof s)))
      return (s)localIInterface;
    return new u(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      ak localak = al.g(paramParcel1.readStrongBinder());
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject = null;
      if (localIBinder3 == null);
      while (true)
      {
        int i1 = a(localak, (ac)localObject);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i1);
        return true;
        IInterface localIInterface = localIBinder3.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof ac)))
          localObject = (ac)localIInterface;
        else
          localObject = new ae(localIBinder3);
      }
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      cancel(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      o localo = CU();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localo != null)
        localIBinder2 = localo.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      reset();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      a(bf.x(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      int n = paramParcel1.readInt();
      boolean bool4 = false;
      if (n != 0)
        bool4 = true;
      a(bool4, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      int m = paramParcel1.readInt();
      boolean bool3 = false;
      if (m != 0)
        bool3 = true;
      String[] arrayOfString = getIPsString(bool3);
      paramParcel2.writeNoException();
      paramParcel2.writeStringArray(arrayOfString);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      String str3 = getNetworkServerIp();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      int k = paramParcel1.readInt();
      boolean bool2 = false;
      if (k != 0)
        bool2 = true;
      Y(bool2);
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      c(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      setNewDnsDebugHost(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      CV();
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      boolean bool1 = tx();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 14:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      a(d.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      fl(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      v localv = CW();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localv != null)
        localIBinder1 = localv.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 17:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      String str2 = paramParcel1.readString();
      ArrayList localArrayList = new ArrayList();
      int i = c(str2, localArrayList);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      paramParcel2.writeStringList(localArrayList);
      return true;
    case 18:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      setHostInfo(paramParcel1.createStringArray(), paramParcel1.createStringArray(), paramParcel1.createIntArray());
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      String str1 = getIspId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 20:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      setSignallingStrategy(paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      keepSignalling();
      paramParcel2.writeNoException();
      return true;
    case 22:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
    stopSignalling();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t
 * JD-Core Version:    0.6.2
 */