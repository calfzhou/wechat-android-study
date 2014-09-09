package com.tencent.kingkong;

import android.os.Bundle;
import android.os.IBinder.DeathRecipient;

public final class CursorToBulkCursorAdaptor extends BulkCursorNative
  implements IBinder.DeathRecipient
{
  private static final String TAG = "Cursor";
  private CrossProcessCursor mCursor;
  private CursorWindow mFilledWindow;
  private final Object mLock = new Object();
  private CursorToBulkCursorAdaptor.ContentObserverProxy mObserver;
  private final String mProviderName;

  public CursorToBulkCursorAdaptor(Cursor paramCursor, IContentObserver paramIContentObserver, String paramString)
  {
    if ((paramCursor instanceof CrossProcessCursor))
      this.mCursor = ((CrossProcessCursor)paramCursor);
    while (true)
    {
      this.mProviderName = paramString;
      synchronized (this.mLock)
      {
        createAndRegisterObserverProxyLocked(paramIContentObserver);
        return;
        this.mCursor = new CrossProcessCursorWrapper(paramCursor);
      }
    }
  }

  private void closeFilledWindowLocked()
  {
    if (this.mFilledWindow != null)
    {
      this.mFilledWindow.close();
      this.mFilledWindow = null;
    }
  }

  private void createAndRegisterObserverProxyLocked(IContentObserver paramIContentObserver)
  {
    if (this.mObserver != null)
      throw new IllegalStateException("an observer is already registered");
    this.mObserver = new CursorToBulkCursorAdaptor.ContentObserverProxy(paramIContentObserver, this);
    this.mCursor.registerContentObserver(this.mObserver);
  }

  private void disposeLocked()
  {
    if (this.mCursor != null)
    {
      unregisterObserverProxyLocked();
      this.mCursor.close();
      this.mCursor = null;
    }
    closeFilledWindowLocked();
  }

  private void throwIfCursorIsClosed()
  {
    if (this.mCursor == null)
      throw new StaleDataException("Attempted to access a cursor after it has been closed.");
  }

  private void unregisterObserverProxyLocked()
  {
    if (this.mObserver != null)
    {
      this.mCursor.unregisterContentObserver(this.mObserver);
      this.mObserver.unlinkToDeath(this);
      this.mObserver = null;
    }
  }

  public final void binderDied()
  {
    synchronized (this.mLock)
    {
      disposeLocked();
      return;
    }
  }

  public final void close()
  {
    synchronized (this.mLock)
    {
      disposeLocked();
      return;
    }
  }

  public final void deactivate()
  {
    synchronized (this.mLock)
    {
      if (this.mCursor != null)
      {
        unregisterObserverProxyLocked();
        this.mCursor.deactivate();
      }
      closeFilledWindowLocked();
      return;
    }
  }

  public final BulkCursorDescriptor getBulkCursorDescriptor()
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      BulkCursorDescriptor localBulkCursorDescriptor = new BulkCursorDescriptor();
      localBulkCursorDescriptor.cursor = this;
      localBulkCursorDescriptor.columnNames = this.mCursor.getColumnNames();
      localBulkCursorDescriptor.wantsAllOnMoveCalls = this.mCursor.getWantsAllOnMoveCalls();
      localBulkCursorDescriptor.count = this.mCursor.getCount();
      localBulkCursorDescriptor.window = this.mCursor.getWindow();
      if (localBulkCursorDescriptor.window != null)
        localBulkCursorDescriptor.window.acquireReference();
      return localBulkCursorDescriptor;
    }
  }

  public final Bundle getExtras()
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      Bundle localBundle = this.mCursor.getExtras();
      return localBundle;
    }
  }

  public final CursorWindow getWindow(int paramInt)
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      if (!this.mCursor.moveToPosition(paramInt))
      {
        closeFilledWindowLocked();
        return null;
      }
      localCursorWindow = this.mCursor.getWindow();
      if (localCursorWindow != null)
      {
        closeFilledWindowLocked();
        if (localCursorWindow != null)
          localCursorWindow.acquireReference();
        return localCursorWindow;
      }
    }
    CursorWindow localCursorWindow = this.mFilledWindow;
    if (localCursorWindow == null)
    {
      this.mFilledWindow = new CursorWindow(this.mProviderName);
      localCursorWindow = this.mFilledWindow;
    }
    while (true)
    {
      this.mCursor.fillWindow(paramInt, localCursorWindow);
      break;
      if ((paramInt < localCursorWindow.getStartPosition()) || (paramInt >= localCursorWindow.getStartPosition() + localCursorWindow.getNumRows()))
        localCursorWindow.clear();
    }
  }

  public final void onMove(int paramInt)
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      this.mCursor.onMove(this.mCursor.getPosition(), paramInt);
      return;
    }
  }

  public final int requery(IContentObserver paramIContentObserver)
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      closeFilledWindowLocked();
      try
      {
        boolean bool = this.mCursor.requery();
        if (!bool)
          return -1;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        throw new IllegalStateException(this.mProviderName + " Requery misuse db, mCursor isClosed:" + this.mCursor.isClosed(), localIllegalStateException);
      }
    }
    unregisterObserverProxyLocked();
    createAndRegisterObserverProxyLocked(paramIContentObserver);
    int i = this.mCursor.getCount();
    return i;
  }

  public final Bundle respond(Bundle paramBundle)
  {
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      Bundle localBundle = this.mCursor.respond(paramBundle);
      return localBundle;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorToBulkCursorAdaptor
 * JD-Core Version:    0.6.2
 */