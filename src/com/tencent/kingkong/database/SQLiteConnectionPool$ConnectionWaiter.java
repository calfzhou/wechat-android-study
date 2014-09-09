package com.tencent.kingkong.database;

final class SQLiteConnectionPool$ConnectionWaiter
{
  public SQLiteConnection mAssignedConnection;
  public int mConnectionFlags;
  public RuntimeException mException;
  public ConnectionWaiter mNext;
  public int mNonce;
  public int mPriority;
  public String mSql;
  public long mStartTime;
  public Thread mThread;
  public boolean mWantPrimaryConnection;
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnectionPool.ConnectionWaiter
 * JD-Core Version:    0.6.2
 */