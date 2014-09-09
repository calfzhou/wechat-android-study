package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class ad extends Binder
  implements ac
{
  public ad()
  {
    attachInterface(this, "com.tencent.mm.network.IOnGYNetEnd_AIDL");
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
      paramParcel2.writeString("com.tencent.mm.network.IOnGYNetEnd_AIDL");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
    a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), al.g(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ad
 * JD-Core Version:    0.6.2
 */