package com.tencent.kingkong.database;

public class DatabaseObjectNotClosedException extends RuntimeException
{
  private static final String s = "Application did not close the cursor or database object that was opened here";

  public DatabaseObjectNotClosedException()
  {
    super("Application did not close the cursor or database object that was opened here");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.DatabaseObjectNotClosedException
 * JD-Core Version:    0.6.2
 */