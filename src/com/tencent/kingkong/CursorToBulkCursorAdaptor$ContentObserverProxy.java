package com.tencent.kingkong;

import android.net.Uri;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;

final class CursorToBulkCursorAdaptor$ContentObserverProxy extends ContentObserver
{
  protected IContentObserver mRemote;

  public CursorToBulkCursorAdaptor$ContentObserverProxy(IContentObserver paramIContentObserver, IBinder.DeathRecipient paramDeathRecipient)
  {
    super(null);
    this.mRemote = paramIContentObserver;
    try
    {
      paramIContentObserver.asBinder().linkToDeath(paramDeathRecipient, 0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final boolean deliverSelfNotifications()
  {
    return false;
  }

  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    try
    {
      this.mRemote.onChange(paramBoolean, paramUri);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final boolean unlinkToDeath(IBinder.DeathRecipient paramDeathRecipient)
  {
    return this.mRemote.asBinder().unlinkToDeath(paramDeathRecipient, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorToBulkCursorAdaptor.ContentObserverProxy
 * JD-Core Version:    0.6.2
 */