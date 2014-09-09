package com.tencent.mm.o;

import junit.framework.Assert;

public final class i
{
  private static h doq;

  public static void a(h paramh)
  {
    doq = paramh;
  }

  public static h sZ()
  {
    Assert.assertNotNull("IMMCore.Factory not initialized", doq);
    return doq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.i
 * JD-Core Version:    0.6.2
 */