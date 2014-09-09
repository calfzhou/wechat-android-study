package com.tencent.kingkong.database;

public enum SQLiteDatabase$Arithmetic
{
  private final int value;

  static
  {
    AES256CBC = new Arithmetic("AES256CBC", 1, 1);
    XXTEA = new Arithmetic("XXTEA", 2, 2);
    OTHER = new Arithmetic("OTHER", 3, 3);
    UNKNOWN = new Arithmetic("UNKNOWN", 4, -1);
    Arithmetic[] arrayOfArithmetic = new Arithmetic[5];
    arrayOfArithmetic[0] = DEFAULT;
    arrayOfArithmetic[1] = AES256CBC;
    arrayOfArithmetic[2] = XXTEA;
    arrayOfArithmetic[3] = OTHER;
    arrayOfArithmetic[4] = UNKNOWN;
  }

  private SQLiteDatabase$Arithmetic(int arg3)
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
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabase.Arithmetic
 * JD-Core Version:    0.6.2
 */