package com.tencent.kingkong.database;

import com.tencent.kingkong.Cursor;
import com.tencent.kingkong.support.CancellationSignal;

public final class SQLiteDirectCursorDriver
  implements SQLiteCursorDriver
{
  private final CancellationSignal mCancellationSignal;
  private final SQLiteDatabase mDatabase;
  private final String mEditTable;
  private SQLiteQuery mQuery;
  private final String mSql;

  public SQLiteDirectCursorDriver(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    this.mEditTable = paramString2;
    this.mSql = paramString1;
    this.mCancellationSignal = paramCancellationSignal;
  }

  public final void cursorClosed()
  {
  }

  public final void cursorDeactivated()
  {
  }

  public final void cursorRequeried(Cursor paramCursor)
  {
  }

  public final Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString)
  {
    SQLiteQuery localSQLiteQuery = new SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
    try
    {
      localSQLiteQuery.bindAllArgsAsStrings(paramArrayOfString);
      if (paramCursorFactory == null);
      Cursor localCursor;
      for (Object localObject = new SQLiteCursor(this, this.mEditTable, localSQLiteQuery); ; localObject = localCursor)
      {
        this.mQuery = localSQLiteQuery;
        return localObject;
        localCursor = paramCursorFactory.newCursor(this.mDatabase, this, this.mEditTable, localSQLiteQuery);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      localSQLiteQuery.close();
      throw localRuntimeException;
    }
  }

  public final void setBindArguments(String[] paramArrayOfString)
  {
    this.mQuery.bindAllArgsAsStrings(paramArrayOfString);
  }

  public final String toString()
  {
    return "SQLiteDirectCursorDriver: " + this.mSql;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDirectCursorDriver
 * JD-Core Version:    0.6.2
 */