package com.tencent.kingkong;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class BulkCursorProxy
  implements IBulkCursor
{
  private Bundle mExtras;
  private IBinder mRemote;

  public BulkCursorProxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
    this.mExtras = null;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void close()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final void deactivate()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final Bundle getExtras()
  {
    Parcel localParcel1;
    Parcel localParcel2;
    if (this.mExtras == null)
    {
      localParcel1 = Parcel.obtain();
      localParcel2 = Parcel.obtain();
    }
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      this.mExtras = localParcel2.readBundle();
      return this.mExtras;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final CursorWindow getWindow(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      int i = localParcel2.readInt();
      Object localObject2 = null;
      if (i == 1)
      {
        CursorWindow localCursorWindow = CursorWindow.newFromParcel(localParcel2);
        localObject2 = localCursorWindow;
      }
      return localObject2;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final void onMove(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final int requery(IContentObserver paramIContentObserver)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeStrongInterface(paramIContentObserver);
      boolean bool = this.mRemote.transact(3, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      int i;
      if (!bool)
        i = -1;
      while (true)
      {
        return i;
        i = localParcel2.readInt();
        this.mExtras = localParcel2.readBundle();
      }
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }

  public final Bundle respond(Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeBundle(paramBundle);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      Bundle localBundle = localParcel2.readBundle();
      return localBundle;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.BulkCursorProxy
 * JD-Core Version:    0.6.2
 */