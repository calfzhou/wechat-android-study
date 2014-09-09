package com.tencent.map.location;

public final class ah
{
  public byte[] LH;
  public String Lx = "GBK";

  public final String toString()
  {
    try
    {
      String str = new String(this.LH, this.Lx);
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.ah
 * JD-Core Version:    0.6.2
 */