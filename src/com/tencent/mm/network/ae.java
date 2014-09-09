package com.tencent.mm.network;

import android.os.IBinder;
import android.os.Parcel;

final class ae
  implements ac
{
  private IBinder mRemote;

  ae(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, ak paramak, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnGYNetEnd_AIDL");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeInt(paramInt3);
      localParcel1.writeString(paramString);
      if (paramak != null);
      for (IBinder localIBinder = paramak.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeByteArray(paramArrayOfByte);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ae
 * JD-Core Version:    0.6.2
 */