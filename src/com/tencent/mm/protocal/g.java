package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class g extends Binder
  implements f
{
  public g()
  {
    attachInterface(this, "com.tencent.mm.protocal.IMMBaseResp_AIDL");
  }

  public static f w(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof f)))
      return (f)localIInterface;
    return new h(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      boolean bool = a(paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      if (bool);
      for (int n = 1; ; n = 0)
      {
        paramParcel2.writeInt(n);
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      byte[] arrayOfByte = tC();
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      dj(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      int m = tQ();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(m);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str6 = tP();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str6);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      fq(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str5 = qL();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str4 = tR();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      int k = oD();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(k);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str3 = tV();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      int j = getCmdId();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 12:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str2 = tS();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      String str1 = tT();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 14:
    }
    paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
    int i = tU();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.g
 * JD-Core Version:    0.6.2
 */