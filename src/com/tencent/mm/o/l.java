package com.tencent.mm.o;

import java.util.HashMap;

public final class l
{
  private static HashMap dos = new HashMap();

  public static void O(Object paramObject)
  {
    dos.remove(paramObject);
  }

  public static j P(Object paramObject)
  {
    return (j)dos.get(paramObject);
  }

  public static void a(Object paramObject, j paramj)
  {
    dos.put(paramObject, paramj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.l
 * JD-Core Version:    0.6.2
 */