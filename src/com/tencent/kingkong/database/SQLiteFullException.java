package com.tencent.kingkong.database;

import com.tencent.mm.dbsupport.newcursor.j;

public class SQLiteFullException extends SQLiteException
{
  public SQLiteFullException()
  {
    j.Ce();
  }

  public SQLiteFullException(String paramString)
  {
    super(paramString);
    j.Ce();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteFullException
 * JD-Core Version:    0.6.2
 */