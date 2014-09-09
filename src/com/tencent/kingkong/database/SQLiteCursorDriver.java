package com.tencent.kingkong.database;

import com.tencent.kingkong.Cursor;

public abstract interface SQLiteCursorDriver
{
  public abstract void cursorClosed();

  public abstract void cursorDeactivated();

  public abstract void cursorRequeried(Cursor paramCursor);

  public abstract Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString);

  public abstract void setBindArguments(String[] paramArrayOfString);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteCursorDriver
 * JD-Core Version:    0.6.2
 */