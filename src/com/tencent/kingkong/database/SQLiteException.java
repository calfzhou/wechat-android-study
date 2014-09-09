package com.tencent.kingkong.database;

import com.tencent.kingkong.SQLException;

public class SQLiteException extends SQLException
{
  public SQLiteException()
  {
  }

  public SQLiteException(String paramString)
  {
    super(paramString);
  }

  public SQLiteException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteException
 * JD-Core Version:    0.6.2
 */