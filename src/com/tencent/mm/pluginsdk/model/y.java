package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.f.a;
import com.tencent.mm.f.e;
import com.tencent.mm.plugin.f.c.n;

public final class y
{
  private static volatile y hux = null;

  public static y ayB()
  {
    if (hux == null);
    try
    {
      if (hux == null)
        hux = new y();
      return hux;
    }
    finally
    {
    }
  }

  public static x mi(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return new s();
    case 1:
    }
    return new aa();
  }

  public static int mj(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 5;
    case 0:
      return e.os().cK("RecommendCount");
    case 1:
    }
    return e.os().cK("TencentMapRecommendCount");
  }

  public static void mk(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(0);
      localn2.d(10998, arrayOfObject2);
      return;
    case 1:
    }
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(0);
    localn1.d(11091, arrayOfObject1);
  }

  public static void ml(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      localn2.d(10998, arrayOfObject2);
      return;
    case 1:
    }
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(1);
    localn1.d(11091, arrayOfObject1);
  }

  public static void mm(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(3);
      localn2.d(10998, arrayOfObject2);
      return;
    case 1:
    }
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(3);
    localn1.d(11091, arrayOfObject1);
  }

  public static void mn(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(2);
      localn2.d(10998, arrayOfObject2);
      return;
    case 1:
    }
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(2);
    localn1.d(11091, arrayOfObject1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.y
 * JD-Core Version:    0.6.2
 */