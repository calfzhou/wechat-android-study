package com.tencent.mm.network;

import android.os.IBinder;
import android.os.Parcel;

final class ai
  implements ag
{
  private IBinder mRemote;

  ai(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void aW(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnNetworkChange_AIDL");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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
 * Qualified Name:     com.tencent.mm.network.ai
 * JD-Core Version:    0.6.2
 */