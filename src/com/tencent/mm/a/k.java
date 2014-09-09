package com.tencent.mm.a;

public final class k extends Number
{
  private int uin = 0;

  public k(int paramInt)
  {
    this.uin = paramInt;
  }

  public k(long paramLong)
  {
    this.uin = ((int)(0xFFFFFFFF & paramLong));
  }

  public static int ai(String paramString)
  {
    try
    {
      int i = new k(Long.valueOf(paramString).longValue()).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static String getString(int paramInt)
  {
    return new k(paramInt).toString();
  }

  public final double doubleValue()
  {
    return 0.0D + (0L | this.uin);
  }

  public final float floatValue()
  {
    return (float)(0.0D + (0L | this.uin));
  }

  public final int intValue()
  {
    return this.uin;
  }

  public final long longValue()
  {
    return 0xFFFFFFFF & this.uin;
  }

  public final String toString()
  {
    return String.valueOf(0xFFFFFFFF & this.uin);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.k
 * JD-Core Version:    0.6.2
 */