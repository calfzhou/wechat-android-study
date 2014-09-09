package com.tencent.kingkong.database;

import com.tencent.mm.dbsupport.newcursor.j;

public class SQLiteDatabaseCorruptException extends SQLiteException
{
  public SQLiteDatabaseCorruptException()
  {
    j.Ce();
  }

  public SQLiteDatabaseCorruptException(String paramString)
  {
    super(paramString);
    j.Ce();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabaseCorruptException
 * JD-Core Version:    0.6.2
 */