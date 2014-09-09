package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bf extends Binder
  implements be
{
  public bf()
  {
    attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
  }

  public static be x(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof be)))
      return (be)localIInterface;
    return new bg(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
      byte[] arrayOfByte2 = ri();
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte2);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
      byte[] arrayOfByte1 = rj();
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(arrayOfByte1);
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
    int i = n(paramParcel1.createByteArray());
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.bf
 * JD-Core Version:    0.6.2
 */