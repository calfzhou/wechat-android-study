package com.tencent.kingkong.database;

public enum SQLiteDatabase$LockedDevice
{
  private final int value;

  static
  {
    LockedDevice[] arrayOfLockedDevice = new LockedDevice[3];
    arrayOfLockedDevice[0] = DEFAULT;
    arrayOfLockedDevice[1] = STABLE;
    arrayOfLockedDevice[2] = UNKNOWN;
  }

  private SQLiteDatabase$LockedDevice(int arg3)
  {
    int j;
    this.value = j;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabase.LockedDevice
 * JD-Core Version:    0.6.2
 */