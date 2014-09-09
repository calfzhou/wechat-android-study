package com.tencent.mm.compatible.loader;

public final class a
{
  private static Object[] dNQ = new Object[0];
  private static Object[] dNR = new Object[73];

  public static int cg(int paramInt)
  {
    int i = paramInt * 4;
    for (int j = 4; ; j++)
      if (j < 32)
      {
        if (i <= -12 + (1 << j))
          i = -12 + (1 << j);
      }
      else
        return i / 4;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.a
 * JD-Core Version:    0.6.2
 */