package com.tencent.kingkong.database;

import com.tencent.kingkong.support.CancellationSignal.OnCancelListener;

class SQLiteConnectionPool$1
  implements CancellationSignal.OnCancelListener
{
  SQLiteConnectionPool$1(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter, int paramInt)
  {
  }

  public void onCancel()
  {
    synchronized (SQLiteConnectionPool.access$0(this.this$0))
    {
      if (this.val$waiter.mNonce == this.val$nonce)
        SQLiteConnectionPool.access$1(this.this$0, this.val$waiter);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnectionPool.1
 * JD-Core Version:    0.6.2
 */