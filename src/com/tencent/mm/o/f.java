package com.tencent.mm.o;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;

public final class f
{
  private static aw dkL;
  private static e dop;

  public static void a(e parame, aw paramaw)
  {
    dop = parame;
    dkL = paramaw;
  }

  public static Object c(int paramInt, Object paramObject)
  {
    if (dop == null);
    Object localObject;
    do
    {
      return paramObject;
      localObject = dop.cE(paramInt);
    }
    while (localObject == null);
    return localObject;
  }

  public static e sX()
  {
    if (dop == null)
    {
      z.e("!56@/B4Tb64lLpKyppBhnKh+ppco7qnnzSFIJoM7XscQacHtXhGW7xMnQg==", "account storage not initialized");
      dop = bg.qW();
    }
    return dop;
  }

  public static aw sY()
  {
    return dkL;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.f
 * JD-Core Version:    0.6.2
 */