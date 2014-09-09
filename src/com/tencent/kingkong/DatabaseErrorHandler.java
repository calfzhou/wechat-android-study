package com.tencent.kingkong;

import com.tencent.kingkong.database.SQLiteDatabase;

public abstract interface DatabaseErrorHandler
{
  public abstract void onCorruption(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.DatabaseErrorHandler
 * JD-Core Version:    0.6.2
 */