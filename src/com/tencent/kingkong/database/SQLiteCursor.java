package com.tencent.kingkong.database;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import com.tencent.kingkong.AbstractWindowedCursor;
import com.tencent.kingkong.CursorWindow;
import com.tencent.kingkong.DatabaseUtils;
import com.tencent.kingkong.support.Log;
import java.util.HashMap;
import java.util.Map;

public class SQLiteCursor extends AbstractWindowedCursor
{
  static final int NO_COUNT = -1;
  static final String TAG = "MicroMsg.kkdb.SQLiteCursor";
  private Map mColumnNameMap;
  private final String[] mColumns;
  private int mCount = -1;
  private int mCursorWindowCapacity;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final SQLiteQuery mQuery;
  private final Throwable mStackTrace;

  public SQLiteCursor(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    if (paramSQLiteQuery == null)
      throw new IllegalArgumentException("query object cannot be null");
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.mQuery = paramSQLiteQuery;
    this.mColumns = paramSQLiteQuery.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
  }

  @Deprecated
  public SQLiteCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    this(paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }

  private void fillWindow(int paramInt)
  {
    clearOrCreateWindow(getDatabase().getPath());
    try
    {
      if (this.mCount == -1)
      {
        int j = DatabaseUtils.cursorPickFillWindowStartPosition(paramInt, 0);
        this.mCount = this.mQuery.fillWindow(this.mWindow, j, paramInt, true);
        this.mCursorWindowCapacity = this.mWindow.getNumRows();
        return;
      }
      int i = DatabaseUtils.cursorPickFillWindowStartPosition(paramInt, this.mCursorWindowCapacity);
      this.mQuery.fillWindow(this.mWindow, i, paramInt, false);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      closeWindow();
      throw localRuntimeException;
    }
  }

  public void close()
  {
    super.close();
    try
    {
      this.mQuery.close();
      this.mDriver.cursorClosed();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public void deactivate()
  {
    super.deactivate();
    this.mDriver.cursorDeactivated();
  }

  protected void finalize()
  {
    try
    {
      if (this.mWindow != null)
        close();
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public int getColumnIndex(String paramString)
  {
    String[] arrayOfString;
    int j;
    HashMap localHashMap;
    if (this.mColumnNameMap == null)
    {
      arrayOfString = this.mColumns;
      j = arrayOfString.length;
      localHashMap = new HashMap(j, 1.0F);
    }
    for (int k = 0; ; k++)
    {
      if (k >= j)
      {
        this.mColumnNameMap = localHashMap;
        int i = paramString.lastIndexOf('.');
        if (i != -1)
        {
          Exception localException = new Exception();
          Log.e("MicroMsg.kkdb.SQLiteCursor", "requesting column name with table name -- " + paramString, new Object[] { localException });
          paramString = paramString.substring(i + 1);
        }
        Integer localInteger = (Integer)this.mColumnNameMap.get(paramString);
        if (localInteger == null)
          break;
        return localInteger.intValue();
      }
      localHashMap.put(arrayOfString[k], Integer.valueOf(k));
    }
    return -1;
  }

  public String[] getColumnNames()
  {
    return this.mColumns;
  }

  public int getCount()
  {
    if (this.mCount == -1)
      fillWindow(0);
    return this.mCount;
  }

  public SQLiteDatabase getDatabase()
  {
    return this.mQuery.getDatabase();
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    if ((this.mWindow == null) || (paramInt2 < this.mWindow.getStartPosition()) || (paramInt2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()))
      fillWindow(paramInt2);
    return true;
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public boolean requery()
  {
    if (isClosed())
      return false;
    try
    {
      if (!this.mQuery.getDatabase().isOpen())
        return false;
    }
    finally
    {
    }
    if (this.mWindow != null)
      this.mWindow.clear();
    this.mPos = -1;
    this.mCount = -1;
    this.mDriver.cursorRequeried(this);
    try
    {
      boolean bool = super.requery();
      return bool;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.w("MicroMsg.kkdb.SQLiteCursor", "requery() failed " + localIllegalStateException.getMessage(), new Object[] { localIllegalStateException });
    }
    return false;
  }

  public void setSelectionArguments(String[] paramArrayOfString)
  {
    this.mDriver.setBindArguments(paramArrayOfString);
  }

  public void setWindow(CursorWindow paramCursorWindow)
  {
    super.setWindow(paramCursorWindow);
    this.mCount = -1;
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteCursor
 * JD-Core Version:    0.6.2
 */