package com.tencent.mm.modelgeo;

import android.content.Context;
import com.tencent.map.a.a.a;
import com.tencent.map.a.a.b;

public final class p
{
  private static String appName = "wechat";
  private static p dvL = null;
  private static String dvM = "JJ6PX-JSUOG-AKHCD-GGVNH-LXP4N";

  public static void a(b paramb, Context paramContext)
  {
    a.gP();
    if (a.g(appName, dvM))
    {
      a.gP();
      a.a(paramContext, paramb);
      a.gP();
      a.gR();
      return;
    }
    throw new q();
  }

  public static p xp()
  {
    if (dvL == null)
      dvL = new p();
    return dvL;
  }

  public static void xq()
  {
    a.gP();
    a.gQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.p
 * JD-Core Version:    0.6.2
 */