package com.tencent.kingkong.database;

class SQLiteDatabase$1 extends ThreadLocal
{
  SQLiteDatabase$1(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  protected SQLiteSession initialValue()
  {
    return this.this$0.createSession();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabase.1
 * JD-Core Version:    0.6.2
 */