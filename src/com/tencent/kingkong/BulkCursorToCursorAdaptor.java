package com.tencent.kingkong;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.kingkong.support.Log;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor
{
  private static final String TAG = "BulkCursor";
  private IBulkCursor mBulkCursor;
  private String[] mColumns;
  private int mCount;
  private AbstractCursor.SelfContentObserver mObserverBridge = new AbstractCursor.SelfContentObserver(this);
  private boolean mWantsAllOnMoveCalls;

  private void throwIfCursorIsClosed()
  {
    if (this.mBulkCursor == null)
      throw new StaleDataException("Attempted to access a cursor after it has been closed.");
  }

  public final void close()
  {
    super.close();
    if (this.mBulkCursor != null);
    try
    {
      this.mBulkCursor.close();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("BulkCursor", "Remote process exception when closing");
      return;
    }
    finally
    {
      this.mBulkCursor = null;
    }
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void deactivate()
  {
    super.deactivate();
    if (this.mBulkCursor != null);
    try
    {
      this.mBulkCursor.deactivate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("BulkCursor", "Remote process exception when deactivating");
    }
  }

  public final String[] getColumnNames()
  {
    throwIfCursorIsClosed();
    return this.mColumns;
  }

  public final int getCount()
  {
    throwIfCursorIsClosed();
    return this.mCount;
  }

  public final Bundle getExtras()
  {
    throwIfCursorIsClosed();
    try
    {
      Bundle localBundle = this.mBulkCursor.getExtras();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }

  public final IContentObserver getObserver()
  {
    return this.mObserverBridge.getContentObserver();
  }

  public final void initialize(BulkCursorDescriptor paramBulkCursorDescriptor)
  {
    this.mBulkCursor = paramBulkCursorDescriptor.cursor;
    this.mColumns = paramBulkCursorDescriptor.columnNames;
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
    this.mWantsAllOnMoveCalls = paramBulkCursorDescriptor.wantsAllOnMoveCalls;
    this.mCount = paramBulkCursorDescriptor.count;
    if (paramBulkCursorDescriptor.window != null)
      setWindow(paramBulkCursorDescriptor.window);
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    throwIfCursorIsClosed();
    try
    {
      if ((this.mWindow == null) || (paramInt2 < this.mWindow.getStartPosition()) || (paramInt2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()))
        setWindow(this.mBulkCursor.getWindow(paramInt2));
      while (this.mWindow == null)
      {
        return false;
        if (this.mWantsAllOnMoveCalls)
          this.mBulkCursor.onMove(paramInt2);
      }
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("BulkCursor", "Unable to get window because the remote process is dead");
      return false;
    }
    return true;
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final boolean requery()
  {
    throwIfCursorIsClosed();
    try
    {
      this.mCount = this.mBulkCursor.requery(getObserver());
      if (this.mCount != -1)
      {
        this.mPos = -1;
        closeWindow();
        super.requery();
        return true;
      }
      deactivate();
      return false;
    }
    catch (Exception localException)
    {
      Log.e("BulkCursor", "Unable to requery because the remote process exception " + localException.getMessage());
      deactivate();
    }
    return false;
  }

  public final Bundle respond(Bundle paramBundle)
  {
    throwIfCursorIsClosed();
    try
    {
      Bundle localBundle = this.mBulkCursor.respond(paramBundle);
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("BulkCursor", "respond() threw RemoteException, returning an empty bundle.", new Object[] { localRemoteException });
    }
    return Bundle.EMPTY;
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.BulkCursorToCursorAdaptor
 * JD-Core Version:    0.6.2
 */