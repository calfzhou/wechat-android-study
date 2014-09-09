package com.tencent.kingkong.database;

 enum SQLiteConnectionPool$AcquiredConnectionStatus
{
  static
  {
    DISCARD = new AcquiredConnectionStatus("DISCARD", 2);
    AcquiredConnectionStatus[] arrayOfAcquiredConnectionStatus = new AcquiredConnectionStatus[3];
    arrayOfAcquiredConnectionStatus[0] = NORMAL;
    arrayOfAcquiredConnectionStatus[1] = RECONFIGURE;
    arrayOfAcquiredConnectionStatus[2] = DISCARD;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnectionPool.AcquiredConnectionStatus
 * JD-Core Version:    0.6.2
 */