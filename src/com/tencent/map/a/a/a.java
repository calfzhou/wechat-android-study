package com.tencent.map.a.a;

import android.content.Context;
import com.tencent.map.location.s;

public final class a
{
  private static s KA = s.hb();
  private static a KB;

  public static boolean a(Context paramContext, b paramb)
  {
    return KA.b(paramContext, paramb);
  }

  public static boolean g(String paramString1, String paramString2)
  {
    return KA.h(paramString1, paramString2);
  }

  public static a gP()
  {
    try
    {
      if (KB == null)
        KB = new a();
      a locala = KB;
      return locala;
    }
    finally
    {
    }
  }

  public static void gQ()
  {
    KA.a();
  }

  public static void gR()
  {
    KA.f(2000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.a.a.a
 * JD-Core Version:    0.6.2
 */