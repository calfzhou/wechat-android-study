package com.tencent.mm.n;

import com.tencent.mm.model.bg;
import java.util.List;

public final class ac
{
  private static List dnU = null;
  private static int dnV = 0;
  private static ad dnW = new ad(new ae());

  public static void b(Runnable paramRunnable)
  {
    if (!bg.oE());
    List localList;
    do
    {
      return;
      localList = af.sJ().sy();
      dnU = localList;
    }
    while ((localList == null) || (dnU.size() <= 0));
    dnW.c(paramRunnable);
    dnW.cP(10L);
  }

  public static void sD()
  {
    dnV = 0;
    dnW.aNu();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.ac
 * JD-Core Version:    0.6.2
 */