package com.tencent.kingkong;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.kingkong.support.Log;
import java.util.HashMap;

public abstract class AbstractCursor
  implements CrossProcessCursor
{
  private static final String TAG = "Cursor";
  protected boolean mClosed;
  private final ContentObservable mContentObservable = new ContentObservable();
  protected ContentResolver mContentResolver;

  @Deprecated
  protected Long mCurrentRowID = null;
  private final DataSetObservable mDataSetObservable = new DataSetObservable();
  private Bundle mExtras = Bundle.EMPTY;
  private Uri mNotifyUri;
  protected int mPos = -1;

  @Deprecated
  protected int mRowIdColumnIndex = -1;
  private ContentObserver mSelfObserver;
  private final Object mSelfObserverLock = new Object();
  private boolean mSelfObserverRegistered;

  @Deprecated
  protected HashMap mUpdatedRows = new HashMap();

  protected void checkPosition()
  {
    if ((-1 == this.mPos) || (getCount() == this.mPos))
      throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
  }

  public void close()
  {
    this.mClosed = true;
    this.mContentObservable.unregisterAll();
    onDeactivateOrClose();
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    String str = getString(paramInt);
    if (str != null)
    {
      char[] arrayOfChar = paramCharArrayBuffer.data;
      if ((arrayOfChar == null) || (arrayOfChar.length < str.length()))
        paramCharArrayBuffer.data = str.toCharArray();
      while (true)
      {
        paramCharArrayBuffer.sizeCopied = str.length();
        return;
        str.getChars(0, str.length(), arrayOfChar, 0);
      }
    }
    paramCharArrayBuffer.sizeCopied = 0;
  }

  public void deactivate()
  {
    onDeactivateOrClose();
  }

  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    DatabaseUtils.cursorFillWindow(this, paramInt, paramCursorWindow);
  }

  protected void finalize()
  {
    if ((this.mSelfObserver != null) && (this.mSelfObserverRegistered))
      this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
    try
    {
      if (!this.mClosed)
        close();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public byte[] getBlob(int paramInt)
  {
    throw new UnsupportedOperationException("getBlob is not supported");
  }

  public int getColumnCount()
  {
    return getColumnNames().length;
  }

  public int getColumnIndex(String paramString)
  {
    int i = 0;
    int j = paramString.lastIndexOf('.');
    if (j != -1)
    {
      Exception localException = new Exception();
      Log.e("Cursor", "requesting column name with table name -- " + paramString, new Object[] { localException });
      paramString = paramString.substring(j + 1);
    }
    String[] arrayOfString = getColumnNames();
    int k = arrayOfString.length;
    while (true)
    {
      if (i >= k)
        i = -1;
      while (arrayOfString[i].equalsIgnoreCase(paramString))
        return i;
      i++;
    }
  }

  public int getColumnIndexOrThrow(String paramString)
  {
    int i = getColumnIndex(paramString);
    if (i < 0)
      throw new IllegalArgumentException("column '" + paramString + "' does not exist");
    return i;
  }

  public String getColumnName(int paramInt)
  {
    return getColumnNames()[paramInt];
  }

  public abstract String[] getColumnNames();

  public abstract int getCount();

  public abstract double getDouble(int paramInt);

  public Bundle getExtras()
  {
    return this.mExtras;
  }

  public abstract float getFloat(int paramInt);

  public abstract int getInt(int paramInt);

  public abstract long getLong(int paramInt);

  public Uri getNotificationUri()
  {
    return this.mNotifyUri;
  }

  public final int getPosition()
  {
    return this.mPos;
  }

  public abstract short getShort(int paramInt);

  public abstract String getString(int paramInt);

  public int getType(int paramInt)
  {
    return 3;
  }

  @Deprecated
  protected Object getUpdatedField(int paramInt)
  {
    return null;
  }

  public boolean getWantsAllOnMoveCalls()
  {
    return false;
  }

  public CursorWindow getWindow()
  {
    return null;
  }

  public final boolean isAfterLast()
  {
    if (getCount() == 0);
    while (this.mPos == getCount())
      return true;
    return false;
  }

  public final boolean isBeforeFirst()
  {
    if (getCount() == 0);
    while (this.mPos == -1)
      return true;
    return false;
  }

  public boolean isClosed()
  {
    return this.mClosed;
  }

  @Deprecated
  protected boolean isFieldUpdated(int paramInt)
  {
    return false;
  }

  public final boolean isFirst()
  {
    return (this.mPos == 0) && (getCount() != 0);
  }

  public final boolean isLast()
  {
    int i = getCount();
    return (this.mPos == i - 1) && (i != 0);
  }

  public abstract boolean isNull(int paramInt);

  public final boolean move(int paramInt)
  {
    return moveToPosition(paramInt + this.mPos);
  }

  public final boolean moveToFirst()
  {
    return moveToPosition(0);
  }

  public final boolean moveToLast()
  {
    return moveToPosition(-1 + getCount());
  }

  public final boolean moveToNext()
  {
    return moveToPosition(1 + this.mPos);
  }

  public final boolean moveToPosition(int paramInt)
  {
    boolean bool = false;
    int i = getCount();
    if (paramInt >= i)
      this.mPos = i;
    do
    {
      return bool;
      if (paramInt < 0)
      {
        this.mPos = -1;
        return false;
      }
      if (paramInt == this.mPos)
        return true;
      bool = onMove(this.mPos, paramInt);
      if (!bool)
      {
        this.mPos = -1;
        return bool;
      }
      this.mPos = paramInt;
    }
    while (this.mRowIdColumnIndex == -1);
    this.mCurrentRowID = Long.valueOf(getLong(this.mRowIdColumnIndex));
    return bool;
  }

  public final boolean moveToPrevious()
  {
    return moveToPosition(-1 + this.mPos);
  }

  protected void onChange(boolean paramBoolean)
  {
    synchronized (this.mSelfObserverLock)
    {
      this.mContentObservable.dispatchChange(paramBoolean, null);
      if ((this.mNotifyUri != null) && (paramBoolean))
        this.mContentResolver.notifyChange(this.mNotifyUri, this.mSelfObserver);
      return;
    }
  }

  protected void onDeactivateOrClose()
  {
    if (this.mSelfObserver != null)
    {
      this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
      this.mSelfObserverRegistered = false;
    }
    this.mDataSetObservable.notifyInvalidated();
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    return true;
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
    this.mContentObservable.registerObserver(paramContentObserver);
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mDataSetObservable.registerObserver(paramDataSetObserver);
  }

  public boolean requery()
  {
    if ((this.mSelfObserver != null) && (!this.mSelfObserverRegistered))
    {
      this.mContentResolver.registerContentObserver(this.mNotifyUri, true, this.mSelfObserver);
      this.mSelfObserverRegistered = true;
    }
    this.mDataSetObservable.notifyChanged();
    return true;
  }

  public Bundle respond(Bundle paramBundle)
  {
    return Bundle.EMPTY;
  }

  public void setExtras(Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = Bundle.EMPTY;
    this.mExtras = paramBundle;
  }

  public void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
    synchronized (this.mSelfObserverLock)
    {
      this.mNotifyUri = paramUri;
      this.mContentResolver = paramContentResolver;
      if (this.mSelfObserver != null)
        this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
      this.mSelfObserver = new AbstractCursor.SelfContentObserver(this);
      this.mContentResolver.registerContentObserver(this.mNotifyUri, true, this.mSelfObserver);
      this.mSelfObserverRegistered = true;
      return;
    }
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    if (!this.mClosed)
      this.mContentObservable.unregisterObserver(paramContentObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mDataSetObservable.unregisterObserver(paramDataSetObserver);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.AbstractCursor
 * JD-Core Version:    0.6.2
 */