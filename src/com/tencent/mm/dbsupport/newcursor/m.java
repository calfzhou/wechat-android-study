package com.tencent.mm.dbsupport.newcursor;

import com.tencent.kingkong.Cursor;
import com.tencent.kingkong.database.SQLiteCursorDriver;
import com.tencent.kingkong.database.SQLiteDatabase;
import com.tencent.kingkong.database.SQLiteDatabase.CursorFactory;
import com.tencent.kingkong.support.CancellationSignal;

public final class m
  implements SQLiteCursorDriver
{
  private s dPQ;
  private final CancellationSignal mCancellationSignal;
  private final SQLiteDatabase mDatabase;
  private final String mEditTable;
  private final String mSql;

  public m(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, CancellationSignal paramCancellationSignal)
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
    s locals = new s(this.mDatabase, this.mSql, this.mCancellationSignal);
    try
    {
      locals.bindAllArgsAsStrings(paramArrayOfString);
      n localn = new n(this, this.mEditTable, locals);
      this.dPQ = locals;
      return localn;
    }
    catch (RuntimeException localRuntimeException)
    {
      locals.close();
      throw localRuntimeException;
    }
  }

  public final void setBindArguments(String[] paramArrayOfString)
  {
    this.dPQ.bindAllArgsAsStrings(paramArrayOfString);
  }

  public final String toString()
  {
    return "SQLiteDirectCursorDriver: " + this.mSql;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.m
 * JD-Core Version:    0.6.2
 */