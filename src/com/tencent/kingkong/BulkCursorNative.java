package com.tencent.kingkong;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class BulkCursorNative extends Binder
  implements IBulkCursor
{
  public BulkCursorNative()
  {
    attachInterface(this, "android.content.IBulkCursor");
  }

  public static IBulkCursor asInterface(IBinder paramIBinder)
  {
    IBulkCursor localIBulkCursor;
    if (paramIBinder == null)
      localIBulkCursor = null;
    do
    {
      return localIBulkCursor;
      localIBulkCursor = (IBulkCursor)paramIBinder.queryLocalInterface("android.content.IBulkCursor");
    }
    while (localIBulkCursor != null);
    return new BulkCursorProxy(paramIBinder);
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
    case 1:
      CursorWindow localCursorWindow;
      try
      {
        paramParcel1.enforceInterface("android.content.IBulkCursor");
        localCursorWindow = getWindow(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (localCursorWindow == null)
        {
          paramParcel2.writeInt(0);
          return true;
        }
      }
      catch (Exception localException)
      {
        DatabaseUtils.writeExceptionToParcel(paramParcel2, localException);
        return true;
      }
      paramParcel2.writeInt(1);
      localCursorWindow.writeToParcel(paramParcel2, 1);
      return true;
    case 2:
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      deactivate();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      close();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      int i = requery(IContentObserver.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      paramParcel2.writeBundle(getExtras());
      return true;
    case 4:
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      onMove(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      Bundle localBundle2 = getExtras();
      paramParcel2.writeNoException();
      paramParcel2.writeBundle(localBundle2);
      return true;
    case 6:
    }
    paramParcel1.enforceInterface("android.content.IBulkCursor");
    Bundle localBundle1 = respond(paramParcel1.readBundle());
    paramParcel2.writeNoException();
    paramParcel2.writeBundle(localBundle1);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.BulkCursorNative
 * JD-Core Version:    0.6.2
 */