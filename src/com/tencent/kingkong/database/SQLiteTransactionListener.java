package com.tencent.kingkong.database;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();

  public abstract void onCommit();

  public abstract void onRollback();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteTransactionListener
 * JD-Core Version:    0.6.2
 */